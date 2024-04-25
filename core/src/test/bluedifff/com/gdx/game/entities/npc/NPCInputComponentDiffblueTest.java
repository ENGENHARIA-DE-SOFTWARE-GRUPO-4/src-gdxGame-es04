package com.gdx.game.entities.npc;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.gdx.game.entities.Entity;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class NPCInputComponentDiffblueTest {
    /**
     * Method under test: {@link NPCInputComponent#receiveMessage(String)}
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
        NPCInputComponent npcInputComponent = null;
        String message = "";

        // Act
        npcInputComponent.receiveMessage(message);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link NPCInputComponent#dispose()}
     */
    @Test
    void testDispose() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     NPCInputComponent.frameTime
        //     InputComponent.currentDirection
        //     InputComponent.currentState
        //     InputComponent.json
        //     InputComponent.keys
        //     InputComponent.mouseButtons
        //     ComponentSubject.observers

        // Arrange and Act
        (new NPCInputComponent()).dispose();
    }

    /**
     * Method under test: {@link NPCInputComponent#update(Entity, float)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdate() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        NPCInputComponent npcInputComponent = null;
        Entity entity = null;
        float delta = 0.0f;

        // Act
        npcInputComponent.update(entity, delta);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link NPCInputComponent#keyDown(int)}
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
        NPCInputComponent npcInputComponent = null;
        int keycode = 0;

        // Act
        boolean actualKeyDownResult = npcInputComponent.keyDown(keycode);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link NPCInputComponent#keyUp(int)}
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
        NPCInputComponent npcInputComponent = null;
        int keycode = 0;

        // Act
        boolean actualKeyUpResult = npcInputComponent.keyUp(keycode);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link NPCInputComponent#keyTyped(char)}
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
        NPCInputComponent npcInputComponent = null;
        char character = 'a';

        // Act
        boolean actualKeyTypedResult = npcInputComponent.keyTyped(character);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link NPCInputComponent#touchDown(int, int, int, int)}
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
        NPCInputComponent npcInputComponent = null;
        int screenX = 0;
        int screenY = 0;
        int pointer = 0;
        int button = 0;

        // Act
        boolean actualTouchDownResult = npcInputComponent.touchDown(screenX, screenY, pointer, button);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link NPCInputComponent#touchUp(int, int, int, int)}
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
        NPCInputComponent npcInputComponent = null;
        int screenX = 0;
        int screenY = 0;
        int pointer = 0;
        int button = 0;

        // Act
        boolean actualTouchUpResult = npcInputComponent.touchUp(screenX, screenY, pointer, button);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link NPCInputComponent#touchCancelled(int, int, int, int)}
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
        NPCInputComponent npcInputComponent = null;
        int screenX = 0;
        int screenY = 0;
        int pointer = 0;
        int button = 0;

        // Act
        boolean actualTouchCancelledResult = npcInputComponent.touchCancelled(screenX, screenY, pointer, button);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link NPCInputComponent#touchDragged(int, int, int)}
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
        NPCInputComponent npcInputComponent = null;
        int screenX = 0;
        int screenY = 0;
        int pointer = 0;

        // Act
        boolean actualTouchDraggedResult = npcInputComponent.touchDragged(screenX, screenY, pointer);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link NPCInputComponent#mouseMoved(int, int)}
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
        NPCInputComponent npcInputComponent = null;
        int screenX = 0;
        int screenY = 0;

        // Act
        boolean actualMouseMovedResult = npcInputComponent.mouseMoved(screenX, screenY);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: default or parameterless constructor of
     * {@link NPCInputComponent}
     */
    @Test
    void testNewNPCInputComponent() {
        // Arrange and Act
        NPCInputComponent actualNpcInputComponent = new NPCInputComponent();

        // Assert
        assertFalse(actualNpcInputComponent.keyDown(1));
        assertFalse(actualNpcInputComponent.keyTyped('A'));
        assertFalse(actualNpcInputComponent.keyUp(1));
    }
}
