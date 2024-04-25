package com.gdx.game.battle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BattleUtilsDiffblueTest {
    /**
     * Method under test: {@link BattleUtils#escapeChance(double)}
     */
    @Test
    void testEscapeChance() {
        // Arrange, Act and Assert
        assertEquals(1.0d, BattleUtils.escapeChance(10.0d));
    }

    /**
     * Method under test: {@link BattleUtils#criticalChance(double)}
     */
    @Test
    void testCriticalChance() {
        // Arrange, Act and Assert
        assertEquals(0.0579d, BattleUtils.criticalChance(10.0d));
    }

    /**
     * Method under test: {@link BattleUtils#isSuccessful(double)}
     */
    @Test
    void testIsSuccessful() {
        // Arrange, Act and Assert
        assertTrue(BattleUtils.isSuccessful(10.0d));
    }
}
