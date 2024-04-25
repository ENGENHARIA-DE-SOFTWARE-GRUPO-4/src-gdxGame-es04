package com.gdx.game.screen;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.gdx.game.GdxGame;
import com.gdx.game.audio.AudioObserver;
import com.gdx.game.manager.ResourceManager;
import com.gdx.game.screen.transition.effects.TransitionEffect;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class BaseScreenDiffblueTest {
    /**
     * Method under test:
     * {@link BaseScreen#setScreenWithTransition(BaseScreen, BaseScreen, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetScreenWithTransition() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        BaseScreen baseScreen = null;
        BaseScreen current = null;
        BaseScreen next = null;
        List<TransitionEffect> transitionEffect = null;

        // Act
        baseScreen.setScreenWithTransition(current, next, transitionEffect);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link BaseScreen#createButton(String, float, float, Table)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateButton() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        BaseScreen baseScreen = null;
        String buttonName = "";
        float posX = 0.0f;
        float posY = 0.0f;
        Table table = null;

        // Act
        baseScreen.createButton(buttonName, posX, posY, table);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link BaseScreen#createTable()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateTable() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        BaseScreen baseScreen = null;

        // Act
        Table actualCreateTableResult = baseScreen.createTable();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link BaseScreen#addObserver(AudioObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddObserver() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        BaseScreen baseScreen = null;
        AudioObserver audioObserver = null;

        // Act
        baseScreen.addObserver(audioObserver);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link BaseScreen#removeObserver(AudioObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveObserver() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        BaseScreen baseScreen = null;
        AudioObserver audioObserver = null;

        // Act
        baseScreen.removeObserver(audioObserver);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link BaseScreen#removeAllObservers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveAllObservers() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        BaseScreen baseScreen = null;

        // Act
        baseScreen.removeAllObservers();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link BaseScreen#notify(AudioObserver.AudioCommand, AudioObserver.AudioTypeEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNotify() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        BaseScreen baseScreen = null;
        AudioObserver.AudioCommand command = AudioObserver.AudioCommand.MUSIC_LOAD;
        AudioObserver.AudioTypeEvent event = AudioObserver.AudioTypeEvent.MENU_THEME;

        // Act
        baseScreen.notify(command, event);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link BaseScreen#render(float)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRender() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        BaseScreen baseScreen = null;
        float delta = 0.0f;

        // Act
        baseScreen.render(delta);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link BaseScreen#dispose()}
     *   <li>{@link BaseScreen#getBattleCam()}
     *   <li>{@link BaseScreen#getGameCam()}
     *   <li>{@link BaseScreen#getMusicTheme()}
     *   <li>{@link BaseScreen#getStage()}
     *   <li>{@link BaseScreen#hide()}
     *   <li>{@link BaseScreen#pause()}
     *   <li>{@link BaseScreen#resize(int, int)}
     *   <li>{@link BaseScreen#resume()}
     *   <li>{@link BaseScreen#show()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGettersAndSetters() {
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

        // Arrange
        // TODO: Populate arranged inputs
        BaseScreen baseScreen = null;

        // Act
        baseScreen.dispose();
        OrthographicCamera actualBattleCam = baseScreen.getBattleCam();
        OrthographicCamera actualGameCam = baseScreen.getGameCam();
        AudioObserver.AudioTypeEvent actualMusicTheme = baseScreen.getMusicTheme();
        Stage actualStage = baseScreen.getStage();
        baseScreen.hide();
        baseScreen.pause();
        int width = 0;
        int height = 0;
        baseScreen.resize(width, height);
        baseScreen.resume();
        baseScreen.show();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link BaseScreen#BaseScreen(GdxGame, ResourceManager)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNewBaseScreen() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GdxGame gdxGame = null;
        ResourceManager resourceManager = null;

        // Act
        BaseScreen actualBaseScreen = new BaseScreen(gdxGame, resourceManager);

        // Assert
        // TODO: Add assertions on result
    }
}
