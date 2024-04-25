package com.gdx.game.dialog;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ConversationGraphSubjectDiffblueTest {
    /**
     * Method under test:
     * {@link ConversationGraphSubject#addObserver(ConversationGraphObserver)}
     */
    @Test
    void testAddObserver() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ConversationGraphSubject.observers

        // Arrange and Act
        (new ConversationGraphSubject()).addObserver(mock(ConversationGraphObserver.class));
    }

    /**
     * Method under test:
     * {@link ConversationGraphSubject#removeObserver(ConversationGraphObserver)}
     */
    @Test
    void testRemoveObserver() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ConversationGraphSubject.observers

        // Arrange and Act
        (new ConversationGraphSubject()).removeObserver(mock(ConversationGraphObserver.class));
    }

    /**
     * Method under test: {@link ConversationGraphSubject#removeAllObservers()}
     */
    @Test
    void testRemoveAllObservers() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ConversationGraphSubject.observers

        // Arrange and Act
        (new ConversationGraphSubject()).removeAllObservers();
    }

    /**
     * Method under test:
     * {@link ConversationGraphSubject#notify(ConversationGraph, ConversationGraphObserver.ConversationCommandEvent)}
     */
    @Test
    void testNotify() {
        // Arrange
        ConversationGraphObserver graphObserver = mock(ConversationGraphObserver.class);
        doNothing().when(graphObserver)
                .onNotify(Mockito.<ConversationGraph>any(), Mockito.<ConversationGraphObserver.ConversationCommandEvent>any());

        ConversationGraphSubject conversationGraphSubject = new ConversationGraphSubject();
        conversationGraphSubject.addObserver(graphObserver);

        // Act
        conversationGraphSubject.notify(new ConversationGraph(),
                ConversationGraphObserver.ConversationCommandEvent.LOAD_STORE_INVENTORY);

        // Assert
        verify(graphObserver).onNotify(isA(ConversationGraph.class),
                eq(ConversationGraphObserver.ConversationCommandEvent.LOAD_STORE_INVENTORY));
    }

    /**
     * Method under test:
     * {@link ConversationGraphSubject#notify(ConversationGraph, ConversationGraphObserver.ConversationCommandEvent)}
     */
    @Test
    void testNotify2() {
        // Arrange
        ConversationGraphObserver graphObserver = mock(ConversationGraphObserver.class);
        doNothing().when(graphObserver)
                .onNotify(Mockito.<ConversationGraph>any(), Mockito.<ConversationGraphObserver.ConversationCommandEvent>any());

        ConversationGraphSubject conversationGraphSubject = new ConversationGraphSubject();
        conversationGraphSubject.addObserver(graphObserver);

        // Act
        conversationGraphSubject.notify(new ConversationGraph(),
                ConversationGraphObserver.ConversationCommandEvent.EXIT_CONVERSATION);

        // Assert
        verify(graphObserver).onNotify(isA(ConversationGraph.class),
                eq(ConversationGraphObserver.ConversationCommandEvent.EXIT_CONVERSATION));
    }

    /**
     * Method under test:
     * {@link ConversationGraphSubject#notify(ConversationGraph, ConversationGraphObserver.ConversationCommandEvent)}
     */
    @Test
    void testNotify3() {
        // Arrange
        ConversationGraphObserver graphObserver = mock(ConversationGraphObserver.class);
        doNothing().when(graphObserver)
                .onNotify(Mockito.<ConversationGraph>any(), Mockito.<ConversationGraphObserver.ConversationCommandEvent>any());

        ConversationGraphSubject conversationGraphSubject = new ConversationGraphSubject();
        conversationGraphSubject.addObserver(graphObserver);

        // Act
        conversationGraphSubject.notify(new ConversationGraph(),
                ConversationGraphObserver.ConversationCommandEvent.ACCEPT_QUEST);

        // Assert
        verify(graphObserver).onNotify(isA(ConversationGraph.class),
                eq(ConversationGraphObserver.ConversationCommandEvent.ACCEPT_QUEST));
    }

    /**
     * Method under test:
     * {@link ConversationGraphSubject#notify(ConversationGraph, ConversationGraphObserver.ConversationCommandEvent)}
     */
    @Test
    void testNotify4() {
        // Arrange
        ConversationGraphObserver graphObserver = mock(ConversationGraphObserver.class);
        doNothing().when(graphObserver)
                .onNotify(Mockito.<ConversationGraph>any(), Mockito.<ConversationGraphObserver.ConversationCommandEvent>any());

        ConversationGraphSubject conversationGraphSubject = new ConversationGraphSubject();
        conversationGraphSubject.addObserver(graphObserver);

        // Act
        conversationGraphSubject.notify(new ConversationGraph(),
                ConversationGraphObserver.ConversationCommandEvent.ADD_ENTITY_TO_INVENTORY);

        // Assert
        verify(graphObserver).onNotify(isA(ConversationGraph.class),
                eq(ConversationGraphObserver.ConversationCommandEvent.ADD_ENTITY_TO_INVENTORY));
    }

    /**
     * Method under test:
     * {@link ConversationGraphSubject#notify(ConversationGraph, ConversationGraphObserver.ConversationCommandEvent)}
     */
    @Test
    void testNotify5() {
        // Arrange
        ConversationGraphObserver graphObserver = mock(ConversationGraphObserver.class);
        doNothing().when(graphObserver)
                .onNotify(Mockito.<ConversationGraph>any(), Mockito.<ConversationGraphObserver.ConversationCommandEvent>any());

        ConversationGraphSubject conversationGraphSubject = new ConversationGraphSubject();
        conversationGraphSubject.addObserver(graphObserver);

        // Act
        conversationGraphSubject.notify(new ConversationGraph(),
                ConversationGraphObserver.ConversationCommandEvent.RETURN_QUEST);

        // Assert
        verify(graphObserver).onNotify(isA(ConversationGraph.class),
                eq(ConversationGraphObserver.ConversationCommandEvent.RETURN_QUEST));
    }

    /**
     * Method under test:
     * {@link ConversationGraphSubject#notify(ConversationGraph, ConversationGraphObserver.ConversationCommandEvent)}
     */
    @Test
    void testNotify6() {
        // Arrange
        ConversationGraphObserver graphObserver = mock(ConversationGraphObserver.class);
        doNothing().when(graphObserver)
                .onNotify(Mockito.<ConversationGraph>any(), Mockito.<ConversationGraphObserver.ConversationCommandEvent>any());

        ConversationGraphSubject conversationGraphSubject = new ConversationGraphSubject();
        conversationGraphSubject.addObserver(graphObserver);

        // Act
        conversationGraphSubject.notify(new ConversationGraph(), ConversationGraphObserver.ConversationCommandEvent.NONE);

        // Assert
        verify(graphObserver).onNotify(isA(ConversationGraph.class),
                eq(ConversationGraphObserver.ConversationCommandEvent.NONE));
    }

    /**
     * Method under test: default or parameterless constructor of
     * {@link ConversationGraphSubject}
     */
    @Test
    void testNewConversationGraphSubject() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ConversationGraphSubject.observers

        // Arrange and Act
        new ConversationGraphSubject();
    }
}
