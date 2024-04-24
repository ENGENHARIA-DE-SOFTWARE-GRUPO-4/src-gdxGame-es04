package com.gdx.game.profile;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Base64Coder;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.ObjectMap;

import java.util.HashMap;
import java.util.Set;

public class ProfileManager extends ProfileSubject {

    private Json json;
    private static ProfileManager profileManager;
    private HashMap<String, FileHandle> profiles;
    private ObjectMap<String, Object> profileProperties = new ObjectMap<>();
    private String profileName;
    private boolean isNewProfile = false;

    private static final String SAVEGAME_SUFFIX = ".sav";
    public static final String DEFAULT_PROFILE = "default";


    public ProfileManager() {
        json = new Json();
        profiles = new HashMap<>();
        profiles.clear();
        profileName = DEFAULT_PROFILE;
        storeAllProfiles();
    }

    public static ProfileManager getInstance() {
        if (profileManager == null) {
            profileManager = new ProfileManager();
        }
        return profileManager;
    }

    public void setIsNewProfile(boolean isNewProfile) {
        this.isNewProfile = isNewProfile;
    }

    public boolean getIsNewProfile() {
        return this.isNewProfile;
    }

    public Array<String> getProfileList() {
        Array<String> profileList = new Array<>();
        Set<String> keys = this.profiles.keySet();
        for (String key : keys) {
            profileList.add(key);
        }
        return profileList;
    }

    public FileHandle getProfileFile(String profile) {
        return doesProfileExist(profile) ? profiles.get(profile) : null;
    }

    public void storeAllProfiles() {
        if (Gdx.files.isLocalStorageAvailable()) {
            FileHandle[] files = Gdx.files.local(".").list(SAVEGAME_SUFFIX);

            for (FileHandle file : files) {
                profiles.put(file.nameWithoutExtension(), file);
            }
        }
    }

    public boolean doesProfileExist(String profileName) {
        return profiles.containsKey(profileName);
    }

    public void writeProfileToStorage(String profileName, String fileData, boolean overwrite) {
        String fullFilename = profileName + SAVEGAME_SUFFIX;
        FileHandle file = Gdx.files.isLocalStorageAvailable() ? Gdx.files.local(fullFilename) : null;

        if (file != null && (!file.exists() || overwrite)) {
            String encodedString = Base64Coder.encodeString(fileData);
            file.writeString(encodedString, !overwrite);
            profiles.put(profileName, file);
        }
    }

    public void setProperty(String key, Object object) {
        profileProperties.put(key, object);
    }

    public <T> T getProperty(String key, Class<T> type) {
        return profileProperties.containsKey(key) ? type.cast(profileProperties.get(key)) : null;
    }

    public void saveProfile() {
        notify(this, ProfileObserver.ProfileEvent.SAVING_PROFILE);
        String text = json.prettyPrint(json.toJson(profileProperties));
        writeProfileToStorage(profileName, text, true);
    }

    public void loadProfile() {
        if (isNewProfile) {
            notify(this, ProfileObserver.ProfileEvent.CLEAR_CURRENT_PROFILE);
            saveProfile();
        }
        FileHandle encodedFile = profiles.get(profileName);

        if (encodedFile != null && encodedFile.exists()) {
            String s = encodedFile.readString();
            String decodedFile = Base64Coder.decodeString(s);
            profileProperties = json.fromJson(ObjectMap.class, decodedFile);
            notify(this, ProfileObserver.ProfileEvent.PROFILE_LOADED);
            isNewProfile = false;
        }
    }

    public void setCurrentProfile(String profileName) {
        this.profileName = doesProfileExist(profileName) ? profileName : DEFAULT_PROFILE;
    }

    public String getCurrentProfile(){
        return this.profileName;
    }

    public void clearProfiles(){
        this.profiles.clear();
    }

}
