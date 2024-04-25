package com.gdx.game.dialog;

import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.Array;
import com.gdx.game.entities.EntityConfig;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ConversationUIDiffblueTest {
    /**
     * Method under test: {@link ConversationUI#setTitle(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetTitle() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        ConversationUI conversationUI = null;
        String title = "";

        // Act
        conversationUI.setTitle(title);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ConversationUI#loadConversation(EntityConfig)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLoadConversation() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        ConversationUI conversationUI = null;
        EntityConfig entityConfig = null;

        // Act
        conversationUI.loadConversation(entityConfig);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ConversationUI#loadResume(EntityConfig, Array)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLoadResume() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        ConversationUI conversationUI = null;
        EntityConfig entityConfig = null;
        Array<String> drops = null;

        // Act
        conversationUI.loadResume(entityConfig, drops);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ConversationUI#loadUpgradeClass(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLoadUpgradeClass() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        ConversationUI conversationUI = null;
        String playerClass = "";

        // Act
        conversationUI.loadUpgradeClass(playerClass);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link ConversationUI#setConversationGraph(ConversationGraph)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetConversationGraph() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        ConversationUI conversationUI = null;
        ConversationGraph graph = null;

        // Act
        conversationUI.setConversationGraph(graph);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link ConversationUI#getCloseButton()}
     *   <li>{@link ConversationUI#getCurrentConversationGraph()}
     *   <li>{@link ConversationUI#getCurrentEntityID()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGettersAndSetters() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   com.gdx.game.dialog.ConversationUI.getCloseButton().
        //   The arrange section threw
        //   java.lang.ExceptionInInitializerError
        //       at com.gdx.game.dialog.ConversationUI.<init>(ConversationUI.java:34)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ConversationUI conversationUI = null;

        // Act
        TextButton actualCloseButton = conversationUI.getCloseButton();
        ConversationGraph actualCurrentConversationGraph = conversationUI.getCurrentConversationGraph();
        String actualCurrentEntityID = conversationUI.getCurrentEntityID();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: default or parameterless constructor of
     * {@link ConversationUI}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNewConversationUI() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        // TODO: Populate arranged inputs
        ConversationUI actualConversationUI = new ConversationUI();

        // Assert
        // TODO: Add assertions on result
    }
}
