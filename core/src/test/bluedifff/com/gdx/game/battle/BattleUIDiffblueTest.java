package com.gdx.game.battle;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class BattleUIDiffblueTest {
    /**
     * Method under test: {@link BattleUI#BattleUI(BattleState, BattleInventoryUI)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNewBattleUI() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Gdx.app not available.
        //       at com.badlogic.gdx.utils.Timer$Task.<init>(Timer.java:201)
        //       at com.gdx.game.battle.BattleState$3.<init>(BattleState.java:156)
        //       at com.gdx.game.battle.BattleState.getPlayerAttackCalculationTimer(BattleState.java:156)
        //       at com.gdx.game.battle.BattleState.<init>(BattleState.java:31)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BattleState battleState = new BattleState();

        // Act
        new BattleUI(battleState, new BattleInventoryUI());

    }
}
