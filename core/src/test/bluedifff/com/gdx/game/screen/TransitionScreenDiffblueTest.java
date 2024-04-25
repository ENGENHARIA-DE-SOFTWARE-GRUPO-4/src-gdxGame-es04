package com.gdx.game.screen;

import com.badlogic.gdx.Game;
import com.gdx.game.screen.transition.effects.TransitionEffect;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TransitionScreenDiffblueTest {
    /**
     * Method under test: {@link TransitionScreen#render(float)}
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
        TransitionScreen transitionScreen = null;
        float delta = 0.0f;

        // Act
        transitionScreen.render(delta);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link TransitionScreen#dispose()}
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
        TransitionScreen transitionScreen = null;

        // Act
        transitionScreen.dispose();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link TransitionScreen#hide()}
     *   <li>{@link TransitionScreen#pause()}
     *   <li>{@link TransitionScreen#resize(int, int)}
     *   <li>{@link TransitionScreen#resume()}
     *   <li>{@link TransitionScreen#show()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGettersAndSetters() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        TransitionScreen transitionScreen = null;

        // Act
        transitionScreen.hide();
        transitionScreen.pause();
        int width = 0;
        int height = 0;
        transitionScreen.resize(width, height);
        transitionScreen.resume();
        transitionScreen.show();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link TransitionScreen#TransitionScreen(Game, BaseScreen, BaseScreen, ArrayList)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNewTransitionScreen() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Game game = null;
        BaseScreen current = null;
        BaseScreen next = null;
        ArrayList<TransitionEffect> transitionEffects = null;

        // Act
        TransitionScreen actualTransitionScreen = new TransitionScreen(game, current, next, transitionEffects);

        // Assert
        // TODO: Add assertions on result
    }
}
