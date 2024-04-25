package com.gdx.game.battle;

import com.gdx.game.entities.Entity;
import com.gdx.game.entities.npc.NPCGraphicsComponent;
import com.gdx.game.entities.npc.NPCInputComponent;
import com.gdx.game.entities.npc.NPCPhysicsComponent;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class BattleStateDiffblueTest {
    /**
     * Method under test: {@link BattleState#resetDefaults()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testResetDefaults() {
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

        // Arrange and Act
        (new BattleState()).resetDefaults();
    }

    /**
     * Method under test: {@link BattleState#setCurrentOpponent(Entity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetCurrentOpponent() {
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
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();

        // Act
        battleState.setCurrentOpponent(new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent()));
    }

    /**
     * Method under test: {@link BattleState#setPlayer(Entity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetPlayer() {
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
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();

        // Act
        battleState.setPlayer(new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent()));
    }

    /**
     * Method under test: {@link BattleState#setSpeedRatio(float)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetSpeedRatio() {
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

        // Arrange and Act
        (new BattleState()).setSpeedRatio(10.0f);
    }

    /**
     * Method under test: {@link BattleState#determineTurn()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDetermineTurn() {
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

        // Arrange and Act
        (new BattleState()).determineTurn();
    }

    /**
     * Method under test: {@link BattleState#playerAttacks()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlayerAttacks() {
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

        // Arrange and Act
        (new BattleState()).playerAttacks();
    }

    /**
     * Method under test: {@link BattleState#opponentAttacks()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOpponentAttacks() {
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

        // Arrange and Act
        (new BattleState()).opponentAttacks();
    }

    /**
     * Method under test: {@link BattleState#startPlayerTurn()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testStartPlayerTurn() {
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

        // Arrange and Act
        (new BattleState()).startPlayerTurn();
    }

    /**
     * Method under test: {@link BattleState#resumeOver()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testResumeOver() {
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

        // Arrange and Act
        (new BattleState()).resumeOver();
    }

    /**
     * Method under test: {@link BattleState#getTurnTimer()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTurnTimer() {
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

        // Arrange and Act
        (new BattleState()).getTurnTimer();
    }

    /**
     * Method under test: {@link BattleState#getPlayerAttackCalculationTimer()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPlayerAttackCalculationTimer() {
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

        // Arrange and Act
        (new BattleState()).getPlayerAttackCalculationTimer();
    }

    /**
     * Method under test: {@link BattleState#getOpponentAttackCalculationTimer()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetOpponentAttackCalculationTimer() {
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

        // Arrange and Act
        (new BattleState()).getOpponentAttackCalculationTimer();
    }

    /**
     * Method under test: {@link BattleState#playerRuns()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlayerRuns() {
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

        // Arrange and Act
        (new BattleState()).playerRuns();
    }

    /**
     * Method under test: default or parameterless constructor of
     * {@link BattleState}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNewBattleState() {
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

        // Arrange and Act
        new BattleState();
    }
}
