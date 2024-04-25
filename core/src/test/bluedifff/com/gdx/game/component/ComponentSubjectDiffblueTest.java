package com.gdx.game.component;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ComponentSubjectDiffblueTest {
    /**
     * Method under test: {@link ComponentSubject#addObserver(ComponentObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddObserver() {
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
        ComponentSubject componentSubject = null;
        ComponentObserver conversationObserver = null;

        // Act
        componentSubject.addObserver(conversationObserver);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ComponentSubject#removeObserver(ComponentObserver)}
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
        ComponentSubject componentSubject = null;
        ComponentObserver conversationObserver = null;

        // Act
        componentSubject.removeObserver(conversationObserver);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ComponentSubject#removeAllObservers()}
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
        ComponentSubject componentSubject = null;

        // Act
        componentSubject.removeAllObservers();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link ComponentSubject#notify(String, ComponentObserver.ComponentEvent)}
     */
    @Test
    void testNotify() {
        // Arrange
        ComponentObserver conversationObserver = mock(ComponentObserver.class);
        doNothing().when(conversationObserver)
                .onNotify(Mockito.<String>any(), Mockito.<ComponentObserver.ComponentEvent>any());

        ComponentSubject componentSubject = new ComponentSubject();
        componentSubject.addObserver(conversationObserver);

        // Act
        componentSubject.notify("42", ComponentObserver.ComponentEvent.LOAD_CONVERSATION);

        // Assert
        verify(conversationObserver).onNotify(eq("42"), eq(ComponentObserver.ComponentEvent.LOAD_CONVERSATION));
    }

    /**
     * Method under test:
     * {@link ComponentSubject#notify(String, ComponentObserver.ComponentEvent)}
     */
    @Test
    void testNotify2() {
        // Arrange
        ComponentObserver conversationObserver = mock(ComponentObserver.class);
        doNothing().when(conversationObserver)
                .onNotify(Mockito.<String>any(), Mockito.<ComponentObserver.ComponentEvent>any());

        ComponentSubject componentSubject = new ComponentSubject();
        componentSubject.addObserver(conversationObserver);

        // Act
        componentSubject.notify("42", ComponentObserver.ComponentEvent.SHOW_CONVERSATION);

        // Assert
        verify(conversationObserver).onNotify(eq("42"), eq(ComponentObserver.ComponentEvent.SHOW_CONVERSATION));
    }

    /**
     * Method under test:
     * {@link ComponentSubject#notify(String, ComponentObserver.ComponentEvent)}
     */
    @Test
    void testNotify3() {
        // Arrange
        ComponentObserver conversationObserver = mock(ComponentObserver.class);
        doNothing().when(conversationObserver)
                .onNotify(Mockito.<String>any(), Mockito.<ComponentObserver.ComponentEvent>any());

        ComponentSubject componentSubject = new ComponentSubject();
        componentSubject.addObserver(conversationObserver);

        // Act
        componentSubject.notify("42", ComponentObserver.ComponentEvent.HIDE_CONVERSATION);

        // Assert
        verify(conversationObserver).onNotify(eq("42"), eq(ComponentObserver.ComponentEvent.HIDE_CONVERSATION));
    }

    /**
     * Method under test:
     * {@link ComponentSubject#notify(String, ComponentObserver.ComponentEvent)}
     */
    @Test
    void testNotify4() {
        // Arrange
        ComponentObserver conversationObserver = mock(ComponentObserver.class);
        doNothing().when(conversationObserver)
                .onNotify(Mockito.<String>any(), Mockito.<ComponentObserver.ComponentEvent>any());

        ComponentSubject componentSubject = new ComponentSubject();
        componentSubject.addObserver(conversationObserver);

        // Act
        componentSubject.notify("42", ComponentObserver.ComponentEvent.LOAD_RESUME);

        // Assert
        verify(conversationObserver).onNotify(eq("42"), eq(ComponentObserver.ComponentEvent.LOAD_RESUME));
    }

    /**
     * Method under test:
     * {@link ComponentSubject#notify(String, ComponentObserver.ComponentEvent)}
     */
    @Test
    void testNotify5() {
        // Arrange
        ComponentObserver conversationObserver = mock(ComponentObserver.class);
        doNothing().when(conversationObserver)
                .onNotify(Mockito.<String>any(), Mockito.<ComponentObserver.ComponentEvent>any());

        ComponentSubject componentSubject = new ComponentSubject();
        componentSubject.addObserver(conversationObserver);

        // Act
        componentSubject.notify("42", ComponentObserver.ComponentEvent.SHOW_RESUME);

        // Assert
        verify(conversationObserver).onNotify(eq("42"), eq(ComponentObserver.ComponentEvent.SHOW_RESUME));
    }

    /**
     * Method under test:
     * {@link ComponentSubject#notify(String, ComponentObserver.ComponentEvent)}
     */
    @Test
    void testNotify6() {
        // Arrange
        ComponentObserver conversationObserver = mock(ComponentObserver.class);
        doNothing().when(conversationObserver)
                .onNotify(Mockito.<String>any(), Mockito.<ComponentObserver.ComponentEvent>any());

        ComponentSubject componentSubject = new ComponentSubject();
        componentSubject.addObserver(conversationObserver);

        // Act
        componentSubject.notify("42", ComponentObserver.ComponentEvent.QUEST_LOCATION_DISCOVERED);

        // Assert
        verify(conversationObserver).onNotify(eq("42"), eq(ComponentObserver.ComponentEvent.QUEST_LOCATION_DISCOVERED));
    }

    /**
     * Method under test:
     * {@link ComponentSubject#notify(String, ComponentObserver.ComponentEvent)}
     */
    @Test
    void testNotify7() {
        // Arrange
        ComponentObserver conversationObserver = mock(ComponentObserver.class);
        doNothing().when(conversationObserver)
                .onNotify(Mockito.<String>any(), Mockito.<ComponentObserver.ComponentEvent>any());

        ComponentSubject componentSubject = new ComponentSubject();
        componentSubject.addObserver(conversationObserver);

        // Act
        componentSubject.notify("42", ComponentObserver.ComponentEvent.ENEMY_SPAWN_LOCATION_CHANGED);

        // Assert
        verify(conversationObserver).onNotify(eq("42"), eq(ComponentObserver.ComponentEvent.ENEMY_SPAWN_LOCATION_CHANGED));
    }

    /**
     * Method under test:
     * {@link ComponentSubject#notify(String, ComponentObserver.ComponentEvent)}
     */
    @Test
    void testNotify8() {
        // Arrange
        ComponentObserver conversationObserver = mock(ComponentObserver.class);
        doNothing().when(conversationObserver)
                .onNotify(Mockito.<String>any(), Mockito.<ComponentObserver.ComponentEvent>any());

        ComponentSubject componentSubject = new ComponentSubject();
        componentSubject.addObserver(conversationObserver);

        // Act
        componentSubject.notify("42", ComponentObserver.ComponentEvent.START_BATTLE);

        // Assert
        verify(conversationObserver).onNotify(eq("42"), eq(ComponentObserver.ComponentEvent.START_BATTLE));
    }

    /**
     * Method under test:
     * {@link ComponentSubject#notify(String, ComponentObserver.ComponentEvent)}
     */
    @Test
    void testNotify9() {
        // Arrange
        ComponentObserver conversationObserver = mock(ComponentObserver.class);
        doNothing().when(conversationObserver)
                .onNotify(Mockito.<String>any(), Mockito.<ComponentObserver.ComponentEvent>any());

        ComponentSubject componentSubject = new ComponentSubject();
        componentSubject.addObserver(conversationObserver);

        // Act
        componentSubject.notify("42", ComponentObserver.ComponentEvent.OPTION_INPUT);

        // Assert
        verify(conversationObserver).onNotify(eq("42"), eq(ComponentObserver.ComponentEvent.OPTION_INPUT));
    }

    /**
     * Method under test: default or parameterless constructor of
     * {@link ComponentSubject}
     */
    @Test
    void testNewComponentSubject() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ComponentSubject.observers

        // Arrange and Act
        new ComponentSubject();
    }
}
