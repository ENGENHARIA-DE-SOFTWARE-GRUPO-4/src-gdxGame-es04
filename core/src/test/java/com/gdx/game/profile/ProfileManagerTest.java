package com.gdx.game.profile;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.gdx.game.GdxRunner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.gdx.game.profile.ProfileManager.DEFAULT_PROFILE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

@ExtendWith(GdxRunner.class)
public class ProfileManagerTest {

    @BeforeEach
    void init() {
        Gdx.gl = mock(GL20.class);
        Gdx.gl20 = mock(GL20.class);
    }

    @Test
    public void testProfileManager_ShouldSucceed() {
        ProfileManager profileManager = new ProfileManager();

        assertThat(profileManager.getProfileList()).isNotNull();

        Gdx.files.local(DEFAULT_PROFILE + ".sav").delete();
    }

    @Test
    public void testGetInstance_ShouldSucceed() {
        ProfileManager profileManager = ProfileManager.getInstance();

        assertThat(profileManager).isNotNull();
        assertThat(profileManager.getProfileList()).isNotNull();

        Gdx.files.local(DEFAULT_PROFILE + ".sav").delete();
    }

    @Test
    public void testWriteProfileToStorage_ShouldSucceed() {
        ProfileManager profileManager = new ProfileManager();
        profileManager.setProperty("toppleMapStartPosition", new Vector2(10,10));

        profileManager.saveProfile();

        assertThat(profileManager.getProfileList()).hasSize(1);
        assertThat(profileManager.getProfileList()).contains(DEFAULT_PROFILE);

        Gdx.files.local(DEFAULT_PROFILE + ".sav").delete();
    }

    @Test
    public void testLoadProfile_ShouldSucceedWithNewProfile() {
        ProfileManager profileManager = new ProfileManager();
        profileManager.setIsNewProfile(true);

        profileManager.loadProfile();

        assertThat(profileManager.getIsNewProfile()).isFalse();
        assertThat(profileManager.getProfileList()).hasSize(1);
        assertThat(profileManager.getProfileList()).contains(DEFAULT_PROFILE);

        Gdx.files.local(DEFAULT_PROFILE + ".sav").delete();
    }

    @Test
    public void testGetProfileListNotEmpty() {
        ProfileManager profileManager = new ProfileManager();
        profileManager.saveProfile();
        Array<String> profiles = profileManager.getProfileList();

        assertFalse(profiles.isEmpty());

        Gdx.files.local(DEFAULT_PROFILE + ".sav").delete();
    }

    @Test
    public void testGetProfileListEmpty() {
        ProfileManager profileManager = new ProfileManager();
        Array<String> profiles = profileManager.getProfileList();
        
        assertTrue(profiles.isEmpty());
    }

    @Test
    public void testDoesProfileExist() {
        ProfileManager profileManager = new ProfileManager();
        profileManager.saveProfile();
        assertTrue(profileManager.doesProfileExist(ProfileManager.DEFAULT_PROFILE));
    }

    @Test
    public void testDoesProfileNotExist() {
        ProfileManager profileManager = new ProfileManager();
        assertFalse(profileManager.doesProfileExist("nonexistent"));
    }

    @Test
    public void testSetPropertyAndGetProperties() {
        ProfileManager profileManager = new ProfileManager();
        String key = "testKey";
        String value = "testValue";

        profileManager.setProperty(key, value);

        String retrievedValue = profileManager.getProperty(key, String.class);
        assertEquals(value, retrievedValue);
    }

}
