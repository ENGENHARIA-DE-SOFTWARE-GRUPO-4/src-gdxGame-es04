package com.gdx.game.dialog;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Hashtable;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ConversationGraphDiffblueTest {
    /**
     * Method under test: {@link ConversationGraph#setConversations(Hashtable)}
     */
    @Test
    void testSetConversations() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        ConversationGraph conversationGraph = new ConversationGraph();

        // Act
        conversationGraph.setConversations(new Hashtable<>());
    }

    /**
     * Method under test: {@link ConversationGraph#getCurrentChoices()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCurrentChoices() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Map.get(Object)" because "that" is null
        //       at com.gdx.game.dialog.ConversationGraph.getCurrentChoices(ConversationGraph.java:33)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new ConversationGraph()).getCurrentChoices();
    }

    /**
     * Method under test: {@link ConversationGraph#getCurrentConversationID()}
     */
    @Test
    void testGetCurrentConversationID() {
        // Arrange, Act and Assert
        assertNull((new ConversationGraph()).getCurrentConversationID());
    }

    /**
     * Method under test: {@link ConversationGraph#setCurrentConversation(String)}
     */
    @Test
    void testSetCurrentConversation() {
        // Arrange
        ConversationGraph conversationGraph = new ConversationGraph(new Hashtable<>(), "Root ID");

        // Act
        conversationGraph.setCurrentConversation("42");

        // Assert that nothing has changed
        assertNull(conversationGraph.getCurrentConversationID());
    }

    /**
     * Method under test: {@link ConversationGraph#setCurrentConversation(String)}
     */
    @Test
    void testSetCurrentConversation2() {
        // Arrange
        Conversation conversation = new Conversation();
        conversation.setDialog("Dialog");
        conversation.setId("42");

        Hashtable<String, Conversation> conversations = new Hashtable<>();
        conversations.put("42", conversation);
        ConversationGraph conversationGraph = new ConversationGraph(conversations, "Root ID");

        // Act
        conversationGraph.setCurrentConversation("42");

        // Assert
        assertEquals("42", conversationGraph.getCurrentConversationID());
    }

    /**
     * Method under test: {@link ConversationGraph#setCurrentConversation(String)}
     */
    @Test
    void testSetCurrentConversation3() {
        // Arrange
        Conversation conversation = new Conversation();
        conversation.setDialog("Dialog");
        conversation.setId("42");

        Hashtable<String, Conversation> conversations = new Hashtable<>();
        conversations.put("42", conversation);
        ConversationGraph conversationGraph = new ConversationGraph(conversations, "42");

        // Act
        conversationGraph.setCurrentConversation("42");

        // Assert
        assertEquals("42", conversationGraph.getCurrentConversationID());
    }

    /**
     * Method under test: {@link ConversationGraph#isValid(String)}
     */
    @Test
    void testIsValid() {
        // Arrange, Act and Assert
        assertFalse((new ConversationGraph(new Hashtable<>(), "Root ID")).isValid("Conversation ID"));
    }

    /**
     * Method under test: {@link ConversationGraph#isReachable(String, String)}
     */
    @Test
    void testIsReachable() {
        // Arrange, Act and Assert
        assertFalse((new ConversationGraph(new Hashtable<>(), "Root ID")).isReachable("Source ID", "Sink ID"));
    }

    /**
     * Method under test: {@link ConversationGraph#getConversationByID(String)}
     */
    @Test
    void testGetConversationByID() {
        // Arrange, Act and Assert
        assertNull((new ConversationGraph(new Hashtable<>(), "Root ID")).getConversationByID("42"));
    }

    /**
     * Method under test: {@link ConversationGraph#getConversationByID(String)}
     */
    @Test
    void testGetConversationByID2() {
        // Arrange
        Conversation conversation = new Conversation();
        conversation.setDialog("Dialog");
        conversation.setId("42");

        Hashtable<String, Conversation> conversations = new Hashtable<>();
        conversations.put("42", conversation);

        // Act and Assert
        assertSame(conversation, (new ConversationGraph(conversations, "Root ID")).getConversationByID("42"));
    }

    /**
     * Method under test: {@link ConversationGraph#displayCurrentConversation()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDisplayCurrentConversation() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Map.get(Object)" because "that" is null
        //       at com.gdx.game.dialog.ConversationGraph.displayCurrentConversation(ConversationGraph.java:87)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new ConversationGraph()).displayCurrentConversation();
    }

    /**
     * Method under test: {@link ConversationGraph#addChoice(ConversationChoice)}
     */
    @Test
    void testAddChoice() {
        // Arrange
        ConversationGraph conversationGraph = new ConversationGraph(new Hashtable<>(), "Root ID");

        ConversationChoice conversationChoice = new ConversationChoice();
        conversationChoice.setChoicePhrase("Choice Phrase");
        conversationChoice
                .setConversationCommandEvent(ConversationGraphObserver.ConversationCommandEvent.LOAD_STORE_INVENTORY);
        conversationChoice.setDestinationId("42");
        conversationChoice.setSourceId("42");

        // Act
        conversationGraph.addChoice(conversationChoice);

        // Assert that nothing has changed
        assertEquals("42", conversationChoice.getDestinationId());
        assertEquals("42", conversationChoice.getSourceId());
        assertEquals("Choice Phrase", conversationChoice.getChoicePhrase());
        assertEquals(ConversationGraphObserver.ConversationCommandEvent.LOAD_STORE_INVENTORY,
                conversationChoice.getConversationCommandEvent());
    }

    /**
     * Method under test: {@link ConversationGraph#toString()}
     */
    @Test
    void testToString() {
        // Arrange, Act and Assert
        assertEquals("Number conversations: 0, Number of choices: 0\n",
                (new ConversationGraph(new Hashtable<>(), "Root ID")).toString());
    }

    /**
     * Method under test: {@link ConversationGraph#toString()}
     */
    @Test
    void testToString2() {
        // Arrange
        Conversation conversation = new Conversation();
        conversation.setDialog("Number conversations: %d");
        conversation.setId("42");

        Hashtable<String, Conversation> conversations = new Hashtable<>();
        conversations.put("Number conversations: %d", conversation);

        // Act and Assert
        assertEquals("[42]: \nNumber conversations: 1, Number of choices: 0\n",
                (new ConversationGraph(conversations, "Root ID")).toString());
    }

    /**
     * Method under test: {@link ConversationGraph#toString()}
     */
    @Test
    void testToString3() {
        // Arrange
        Conversation conversation = new Conversation();
        conversation.setDialog("Number conversations: %d");
        conversation.setId("42");

        Hashtable<String, Conversation> conversations = new Hashtable<>();
        conversations.put("Number conversations: %d", conversation);

        ConversationChoice conversationChoice = new ConversationChoice();
        conversationChoice.setChoicePhrase("[%s]: ");
        conversationChoice
                .setConversationCommandEvent(ConversationGraphObserver.ConversationCommandEvent.LOAD_STORE_INVENTORY);
        conversationChoice.setDestinationId("42");
        conversationChoice.setSourceId("42");

        ConversationGraph conversationGraph = new ConversationGraph(conversations, "Root ID");
        conversationGraph.addChoice(conversationChoice);

        // Act and Assert
        assertEquals("[42]: 42 \nNumber conversations: 1, Number of choices: 1\n", conversationGraph.toString());
    }

    /**
     * Method under test:
     * {@link ConversationGraph#ConversationGraph(Hashtable, String)}
     */
    @Test
    void testNewConversationGraph() {
        // Arrange, Act and Assert
        assertNull((new ConversationGraph(new Hashtable<>(), "Root ID")).getCurrentConversationID());
    }

    /**
     * Method under test:
     * {@link ConversationGraph#ConversationGraph(Hashtable, String)}
     */
    @Test
    void testNewConversationGraph2() {
        // Arrange
        Conversation conversation = new Conversation();
        conversation.setDialog("Dialog");
        conversation.setId("42");

        Hashtable<String, Conversation> conversations = new Hashtable<>();
        conversations.put("foo", conversation);

        // Act and Assert
        assertNull((new ConversationGraph(conversations, "Root ID")).getCurrentConversationID());
    }

    /**
     * Method under test:
     * {@link ConversationGraph#ConversationGraph(Hashtable, String)}
     */
    @Test
    void testNewConversationGraph3() {
        // Arrange
        Conversation conversation = new Conversation();
        conversation.setDialog("Dialog");
        conversation.setId("42");

        Conversation conversation2 = new Conversation();
        conversation2.setDialog("");
        conversation2.setId("Id");

        Hashtable<String, Conversation> conversations = new Hashtable<>();
        conversations.put("42", conversation2);
        conversations.put("foo", conversation);

        // Act
        ConversationGraph actualConversationGraph = new ConversationGraph(conversations, "42");

        // Assert
        assertEquals("42", actualConversationGraph.getCurrentConversationID());
        assertTrue(actualConversationGraph.getCurrentChoices().isEmpty());
    }
}
