package com.gdx.game.screen.transition.effects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import com.badlogic.gdx.Screen;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FadeInTransitionEffectDiffblueTest {
    /**
     * Method under test:
     * {@link FadeInTransitionEffect#FadeInTransitionEffect(float)}
     */
    @Test
    void testNewFadeInTransitionEffect() {
        // Arrange and Act
        FadeInTransitionEffect actualFadeInTransitionEffect = new FadeInTransitionEffect(10.0f);

        // Assert
        assertEquals(0.0f, actualFadeInTransitionEffect.getAlpha());
        assertFalse(actualFadeInTransitionEffect.isFinished());
    }

    /**
     * Method under test: {@link FadeInTransitionEffect#render(Screen, Screen)}
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
        FadeInTransitionEffect fadeInTransitionEffect = null;
        Screen current = null;
        Screen next = null;

        // Act
        fadeInTransitionEffect.render(current, next);

        // Assert
        // TODO: Add assertions on result
    }
}
