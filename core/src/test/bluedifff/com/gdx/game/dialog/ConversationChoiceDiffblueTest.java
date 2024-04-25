package com.gdx.game.dialog;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConversationChoiceDiffblueTest {
    /**
     * Methods under test:
     * <ul>
     *   <li>default or parameterless constructor of {@link ConversationChoice}
     *   <li>{@link ConversationChoice#setChoicePhrase(String)}
     *   <li>
     * {@link ConversationChoice#setConversationCommandEvent(ConversationGraphObserver.ConversationCommandEvent)}
     *   <li>{@link ConversationChoice#setDestinationId(String)}
     *   <li>{@link ConversationChoice#setSourceId(String)}
     *   <li>{@link ConversationChoice#getChoicePhrase()}
     *   <li>{@link ConversationChoice#getConversationCommandEvent()}
     *   <li>{@link ConversationChoice#getDestinationId()}
     *   <li>{@link ConversationChoice#getSourceId()}
     *   <li>{@link ConversationChoice#toString()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        ConversationChoice actualConversationChoice = new ConversationChoice();
        actualConversationChoice.setChoicePhrase("Choice Phrase");
        actualConversationChoice
                .setConversationCommandEvent(ConversationGraphObserver.ConversationCommandEvent.LOAD_STORE_INVENTORY);
        actualConversationChoice.setDestinationId("42");
        actualConversationChoice.setSourceId("42");
        String actualChoicePhrase = actualConversationChoice.getChoicePhrase();
        ConversationGraphObserver.ConversationCommandEvent actualConversationCommandEvent = actualConversationChoice
                .getConversationCommandEvent();
        String actualDestinationId = actualConversationChoice.getDestinationId();
        String actualSourceId = actualConversationChoice.getSourceId();

        // Assert that nothing has changed
        assertEquals("42", actualDestinationId);
        assertEquals("42", actualSourceId);
        assertEquals("Choice Phrase", actualChoicePhrase);
        assertEquals("Choice Phrase", actualConversationChoice.toString());
        assertEquals(ConversationGraphObserver.ConversationCommandEvent.LOAD_STORE_INVENTORY,
                actualConversationCommandEvent);
    }
}
