package com.gdx.game.dialog;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConversationDiffblueTest {
    /**
     * Methods under test:
     * <ul>
     *   <li>default or parameterless constructor of {@link Conversation}
     *   <li>{@link Conversation#setDialog(String)}
     *   <li>{@link Conversation#setId(String)}
     *   <li>{@link Conversation#getDialog()}
     *   <li>{@link Conversation#getId()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        Conversation actualConversation = new Conversation();
        actualConversation.setDialog("Dialog");
        actualConversation.setId("42");
        String actualDialog = actualConversation.getDialog();

        // Assert that nothing has changed
        assertEquals("42", actualConversation.getId());
        assertEquals("Dialog", actualDialog);
    }
}
