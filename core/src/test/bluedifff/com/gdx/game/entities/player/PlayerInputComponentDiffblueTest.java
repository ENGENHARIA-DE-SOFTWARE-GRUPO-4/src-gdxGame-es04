package com.gdx.game.entities.player;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.gdx.game.entities.Entity;
import com.gdx.game.entities.npc.NPCGraphicsComponent;
import com.gdx.game.entities.npc.NPCInputComponent;
import com.gdx.game.entities.npc.NPCPhysicsComponent;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PlayerInputComponentDiffblueTest {
    /**
     * Method under test: {@link PlayerInputComponent#receiveMessage(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testReceiveMessage() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;
        String message = "";

        // Act
        playerInputComponent.receiveMessage(message);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#dispose()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDispose() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;

        // Act
        playerInputComponent.dispose();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#update(Entity, float)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdate() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.graphics.GL20.glCreateShader(int)" because "gl" is null
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.loadShader(ShaderProgram.java:205)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.compileShaders(ShaderProgram.java:184)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.<init>(ShaderProgram.java:167)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.createDefaultShader(ImmediateModeRenderer20.java:241)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.<init>(ImmediateModeRenderer20.java:55)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:116)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:111)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:107)
        //       at com.gdx.game.component.GraphicsComponent.<init>(GraphicsComponent.java:34)
        //       at com.gdx.game.entities.npc.NPCGraphicsComponent.<init>(NPCGraphicsComponent.java:29)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        PlayerInputComponent playerInputComponent = new PlayerInputComponent();
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();

        // Act
        playerInputComponent.update(new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent()), 0.5f);
    }

    /**
     * Method under test: {@link PlayerInputComponent#keyDown(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testKeyDown() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;
        int keycode = 0;

        // Act
        boolean actualKeyDownResult = playerInputComponent.keyDown(keycode);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#keyUp(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testKeyUp() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;
        int keycode = 0;

        // Act
        boolean actualKeyUpResult = playerInputComponent.keyUp(keycode);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#keyTyped(char)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testKeyTyped() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;
        char character = 'a';

        // Act
        boolean actualKeyTypedResult = playerInputComponent.keyTyped(character);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#touchDown(int, int, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testTouchDown() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;
        int screenX = 0;
        int screenY = 0;
        int pointer = 0;
        int button = 0;

        // Act
        boolean actualTouchDownResult = playerInputComponent.touchDown(screenX, screenY, pointer, button);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#touchUp(int, int, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testTouchUp() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;
        int screenX = 0;
        int screenY = 0;
        int pointer = 0;
        int button = 0;

        // Act
        boolean actualTouchUpResult = playerInputComponent.touchUp(screenX, screenY, pointer, button);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link PlayerInputComponent#touchCancelled(int, int, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testTouchCancelled() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;
        int screenX = 0;
        int screenY = 0;
        int pointer = 0;
        int button = 0;

        // Act
        boolean actualTouchCancelledResult = playerInputComponent.touchCancelled(screenX, screenY, pointer, button);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#touchDragged(int, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testTouchDragged() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;
        int screenX = 0;
        int screenY = 0;
        int pointer = 0;

        // Act
        boolean actualTouchDraggedResult = playerInputComponent.touchDragged(screenX, screenY, pointer);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#mouseMoved(int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMouseMoved() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;
        int screenX = 0;
        int screenY = 0;

        // Act
        boolean actualMouseMovedResult = playerInputComponent.mouseMoved(screenX, screenY);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#leftPressed()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLeftPressed() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;

        // Act
        playerInputComponent.leftPressed();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#rightPressed()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRightPressed() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;

        // Act
        playerInputComponent.rightPressed();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#upPressed()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpPressed() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;

        // Act
        playerInputComponent.upPressed();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#downPressed()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDownPressed() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;

        // Act
        playerInputComponent.downPressed();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#quitPressed()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testQuitPressed() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;

        // Act
        playerInputComponent.quitPressed();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#interactPressed()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testInteractPressed() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;

        // Act
        playerInputComponent.interactPressed();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#optionPressed()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOptionPressed() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;

        // Act
        playerInputComponent.optionPressed();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link PlayerInputComponent#setClickedMouseCoordinates(int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetClickedMouseCoordinates() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;
        int x = 0;
        int y = 0;

        // Act
        playerInputComponent.setClickedMouseCoordinates(x, y);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link PlayerInputComponent#selectMouseButtonPressed(int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSelectMouseButtonPressed() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;
        int x = 0;
        int y = 0;

        // Act
        playerInputComponent.selectMouseButtonPressed(x, y);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link PlayerInputComponent#doActionMouseButtonPressed(int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDoActionMouseButtonPressed() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;
        int x = 0;
        int y = 0;

        // Act
        playerInputComponent.doActionMouseButtonPressed(x, y);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#leftReleased()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLeftReleased() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;

        // Act
        playerInputComponent.leftReleased();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#rightReleased()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRightReleased() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;

        // Act
        playerInputComponent.rightReleased();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#upReleased()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpReleased() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;

        // Act
        playerInputComponent.upReleased();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#downReleased()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDownReleased() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;

        // Act
        playerInputComponent.downReleased();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#quitReleased()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testQuitReleased() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;

        // Act
        playerInputComponent.quitReleased();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#interactReleased()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testInteractReleased() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;

        // Act
        playerInputComponent.interactReleased();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#optionReleased()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOptionReleased() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;

        // Act
        playerInputComponent.optionReleased();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link PlayerInputComponent#selectMouseButtonReleased(int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSelectMouseButtonReleased() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;
        int x = 0;
        int y = 0;

        // Act
        playerInputComponent.selectMouseButtonReleased(x, y);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link PlayerInputComponent#doActionMouseButtonReleased(int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDoActionMouseButtonReleased() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerInputComponent playerInputComponent = null;
        int x = 0;
        int y = 0;

        // Act
        playerInputComponent.doActionMouseButtonReleased(x, y);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerInputComponent#clear()}
     */
    @Test
    void testClear() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        PlayerInputComponent.clear();
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link PlayerInputComponent#setInteract(boolean)}
     *   <li>{@link PlayerInputComponent#isInteract()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        PlayerInputComponent playerInputComponent = new PlayerInputComponent();

        // Act
        playerInputComponent.setInteract(true);

        // Assert that nothing has changed
        assertTrue(playerInputComponent.isInteract());
    }

    /**
     * Method under test: default or parameterless constructor of
     * {@link PlayerInputComponent}
     */
    @Test
    void testNewPlayerInputComponent() {
        // Arrange, Act and Assert
        assertFalse((new PlayerInputComponent()).isInteract());
    }
}
