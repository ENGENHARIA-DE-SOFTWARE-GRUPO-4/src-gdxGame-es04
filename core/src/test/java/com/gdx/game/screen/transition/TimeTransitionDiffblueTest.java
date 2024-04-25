package com.gdx.game.screen.transition;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TimeTransitionDiffblueTest {
    /**
     * Method under test: {@link TimeTransition#isFinished()}
     */
    @Test
    void testIsFinished() {
        // Arrange, Act and Assert
        assertTrue((new TimeTransition()).isFinished());
    }

    /**
     * Method under test: {@link TimeTransition#get()}
     */
    @Test
    void testGet() {
        // Arrange, Act and Assert
        assertEquals(1.0f, (new TimeTransition()).get());
    }

    /**
     * Method under test: {@link TimeTransition#start(float)}
     */
    @Test
    void testStart() {
        // Arrange
        TimeTransition timeTransition = new TimeTransition();

        // Act
        timeTransition.start(10.0f);

        // Assert
        assertEquals(0.0f, timeTransition.get());
        assertFalse(timeTransition.isFinished());
    }

    /**
     * Method under test: {@link TimeTransition#stop()}
     */
    @Test
    void testStop() {
        // Arrange
        TimeTransition timeTransition = new TimeTransition();

        // Act
        timeTransition.stop();

        // Assert
        assertFalse(timeTransition.isFinished());
    }

    /**
     * Method under test: {@link TimeTransition#update(float)}
     */
    @Test
    void testUpdate() {
        // Arrange
        TimeTransition timeTransition = new TimeTransition();

        // Act
        timeTransition.update(10.0f);

        // Assert that nothing has changed
        assertEquals(1.0f, timeTransition.get());
        assertTrue(timeTransition.isFinished());
    }
}
