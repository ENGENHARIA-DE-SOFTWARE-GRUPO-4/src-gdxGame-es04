package com.gdx.game.profile;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.headless.HeadlessFiles;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Vector2;
import com.gdx.game.GdxRunner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.gdx.game.profile.ProfileManager.DEFAULT_PROFILE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

@ExtendWith(GdxRunner.class)
public class ProfileManagerTest {

    ProfileManager profileManager;

    @BeforeEach
    void init() {
        Gdx.gl = mock(GL20.class);
        Gdx.gl20 = mock(GL20.class);
        this.profileManager = ProfileManager.getInstance();
    }

    @AfterEach
    void end(){
        this.profileManager.clearProfiles();
        FileHandle profileFile = Gdx.files.local(DEFAULT_PROFILE + ".sav");
        if (profileFile.exists()) {
            profileFile.delete();
        }
    }

    @Test
    void testProfileManager_ShouldSucceed() {

        assertThat(profileManager.getProfileList()).isNotNull();

    }

    @Test
    void testGetInstance_ShouldSucceed() {
        ProfileManager localProfileManager = ProfileManager.getInstance();

        assertThat(localProfileManager).isNotNull();
        assertThat(localProfileManager.getProfileList()).isNotNull();
    }

    @Test
    void testWriteProfileToStorage_ShouldSucceed() {
        profileManager.setProperty("toppleMapStartPosition", new Vector2(10,10));

        profileManager.saveProfile();

        assertThat(profileManager.getProfileList()).hasSize(1);
        assertThat(profileManager.getProfileList()).contains(DEFAULT_PROFILE);

        Gdx.files.local(DEFAULT_PROFILE + ".sav").delete();
    }

    @Test
    void testLoadProfile_ShouldSucceedWithNewProfile() {
        profileManager.setIsNewProfile(true);

        profileManager.loadProfile();

        assertThat(profileManager.getIsNewProfile()).isFalse();
        assertThat(profileManager.getProfileList()).hasSize(1);
        assertThat(profileManager.getProfileList()).contains(DEFAULT_PROFILE);

        Gdx.files.local(DEFAULT_PROFILE + ".sav").delete();
    }

    @Test
    void testGetProfileListNotEmpty() {
        profileManager.saveProfile();

        assertFalse(profileManager.getProfileList().isEmpty());

        Gdx.files.local(DEFAULT_PROFILE + ".sav").delete();
    }

    @Test
    void testGetProfileListEmpty() {
        
        assertTrue(profileManager.getProfileList().isEmpty());

    }

    @Test
    void testGetProfileFileExist(){
        profileManager.saveProfile();

        FileHandle fh = Gdx.files.local(DEFAULT_PROFILE + ".sav");
        
        assertEquals(fh,profileManager.getProfileFile(DEFAULT_PROFILE));

    }

    @Test
    void testGetProfileFileNotExist(){

        assertEquals(null,profileManager.getProfileFile("notExist"));

    }

    @Test
    void testDoesProfileExist() {
        profileManager.saveProfile();
        assertTrue(profileManager.doesProfileExist(ProfileManager.DEFAULT_PROFILE));
    }

    @Test
    
    void testDoesProfileNotExist() {
        assertFalse(profileManager.doesProfileExist("nonexistent"));
    }

    @Test
    void testStoreAllProfilesWithExistingProfiles() {
        Gdx.files = new HeadlessFiles();

        FileHandle profile1File = Gdx.files.local("profile1.sav");
        FileHandle profile2File = Gdx.files.local("profile2.sav");
        profile1File.writeString("", false);
        profile2File.writeString("", false);

        profileManager.storeAllProfiles();

        assertTrue(profileManager.getProfileList().contains("profile1", false));
        assertTrue(profileManager.getProfileList().contains("profile2", false));

        profile1File.delete();
        profile2File.delete();
    }

    @Test
    void testStoreAllProfilesWithNoExistingProfiles() {

        profileManager.storeAllProfiles();
        assertEquals(0, profileManager.getProfileList().size);
    }


    @Test
    void testSetPropertyAndGetProperties() {

        String key = "testKey";
        String value = "testValue";

        profileManager.setProperty(key, value);

        String retrievedValue = profileManager.getProperty(key, String.class);
        assertEquals(value, retrievedValue);
    }

    @Test
    void testSaveProfile(){
        profileManager.setProperty("testKey", "testValue");

        profileManager.saveProfile();

        FileHandle profileFile = profileManager.getProfileFile(ProfileManager.DEFAULT_PROFILE);

        String fileContent = profileFile.readString();
        assertNotNull(fileContent);
        assertFalse(fileContent.isEmpty());
    }

    @Test
    void testClearProfilesListNotEmpty(){

        profileManager.saveProfile();
        assertFalse(profileManager.getProfileList().isEmpty());
        profileManager.clearProfiles();
        assertTrue(profileManager.getProfileList().isEmpty());

    }

    @Test
    void testClearProfilesListEmpty(){
        profileManager.clearProfiles();
        assertTrue(profileManager.getProfileList().isEmpty());
    }

    @Test
    void testSetCurrentProfileExists(){
        String profileTest = "teste";
        profileManager.writeProfileToStorage(profileTest, "", false);
        profileManager.setCurrentProfile(profileTest);
        assertEquals(profileTest, profileManager.getCurrentProfile());
        Gdx.files.local(profileTest + ".sav").delete();
    }

    @Test
    void testSetCurrentProfileNotExists(){
        profileManager.setCurrentProfile("notExist");
        assertEquals(DEFAULT_PROFILE, profileManager.getCurrentProfile());
    }

}