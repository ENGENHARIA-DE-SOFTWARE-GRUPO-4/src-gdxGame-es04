package com.gdx.game.screen.transition.effects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import com.badlogic.gdx.Screen;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TransitionEffectDiffblueTest {
    /**
     * Method under test: {@link TransitionEffect#getAlpha()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAlpha() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        TransitionEffect transitionEffect = null;

        // Act
        float actualAlpha = transitionEffect.getAlpha();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link TransitionEffect#update(float)}
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
        TransitionEffect transitionEffect = null;
        float delta = 0.0f;

        // Act
        transitionEffect.update(delta);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link TransitionEffect#TransitionEffect(float)}
     */
    @Test
    void testNewTransitionEffect() {
        // Arrange and Act
        TransitionEffect actualTransitionEffect = new TransitionEffect(10.0f);

        // Assert
        assertEquals(0.0f, actualTransitionEffect.getAlpha());
        assertFalse(actualTransitionEffect.isFinished());
    }

    /**
     * Method under test: {@link TransitionEffect#render(Screen, Screen)}
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
        TransitionEffect transitionEffect = null;
        Screen current = null;
        Screen next = null;

        // Act
        transitionEffect.render(current, next);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link TransitionEffect#isFinished()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsFinished() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        TransitionEffect transitionEffect = null;

        // Act
        boolean actualIsFinishedResult = transitionEffect.isFinished();

        // Assert
        // TODO: Add assertions on result
    }
}
