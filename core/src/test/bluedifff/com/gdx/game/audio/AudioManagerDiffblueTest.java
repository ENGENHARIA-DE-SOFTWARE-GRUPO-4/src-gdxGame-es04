package com.gdx.game.audio;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.backends.headless.mock.audio.MockMusic;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AudioManagerDiffblueTest {
    /**
     * Method under test: {@link AudioManager#getInstance()}
     */
    @Test
    void testGetInstance() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        AudioManager.getInstance();
    }

    /**
     * Method under test:
     * {@link AudioManager#onNotify(AudioObserver.AudioCommand, AudioObserver.AudioTypeEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOnNotify() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Static initializer failed.
        //   The static initializer of
        //   com.gdx.game.manager.ResourceManager
        //   threw java.lang.NullPointerException while trying to load it.
        //   Make sure the static initializer of ResourceManager
        //   can be executed without throwing exceptions.
        //   Exception: java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.internal(String)" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.badlogic.gdx.graphics.g2d.TextureAtlas.<init>(TextureAtlas.java:55)
        //       at com.gdx.game.manager.ResourceManager.<clinit>(ResourceManager.java:37)
        //       at com.gdx.game.audio.AudioManager.onNotify(AudioManager.java:52)

        // Arrange
        // TODO: Populate arranged inputs
        AudioManager audioManager = null;
        AudioObserver.AudioCommand command = AudioObserver.AudioCommand.MUSIC_LOAD;
        AudioObserver.AudioTypeEvent event = AudioObserver.AudioTypeEvent.MENU_THEME;

        // Act
        audioManager.onNotify(command, event);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link AudioManager#dispose()}
     */
    @Test
    void testDispose() {
        // Arrange
        AudioManager instance = AudioManager.getInstance();

        // Act
        instance.dispose();

        // Assert that nothing has changed
        assertNull(instance.getCurrentMusic());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link AudioManager#setCurrentMusic(Music)}
     *   <li>{@link AudioManager#getCurrentMusic()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        AudioManager instance = AudioManager.getInstance();
        MockMusic currentMusic = new MockMusic();

        // Act
        instance.setCurrentMusic(currentMusic);

        // Assert that nothing has changed
        assertSame(currentMusic, instance.getCurrentMusic());
    }
}
