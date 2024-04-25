package com.gdx.game.battle;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.gdx.game.component.ComponentObserver;
import com.gdx.game.entities.Entity;
import com.gdx.game.entities.npc.NPCGraphicsComponent;
import com.gdx.game.entities.npc.NPCInputComponent;
import com.gdx.game.entities.npc.NPCPhysicsComponent;
import com.gdx.game.entities.player.characterClass.ClassObserver;
import com.gdx.game.inventory.InventoryObserver;
import com.gdx.game.map.MapManager;
import com.gdx.game.status.StatusObserver;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class BattleHUDDiffblueTest {
    /**
     * Method under test:
     * {@link BattleHUD#onNotify(int, StatusObserver.StatusEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOnNotify() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Graphics.getWidth()" because "com.badlogic.gdx.Gdx.graphics" is null
        //       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MapManager mapManager_ = new MapManager();
        Stage battleStage = new Stage();

        // Act
        (new BattleHUD(mapManager_, battleStage, new BattleState())).onNotify(42, StatusObserver.StatusEvent.UPDATED_GP);
    }

    /**
     * Method under test:
     * {@link BattleHUD#onNotify(Entity, BattleObserver.BattleEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOnNotify2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Graphics.getWidth()" because "com.badlogic.gdx.Gdx.graphics" is null
        //       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MapManager mapManager_ = new MapManager();
        Stage battleStage = new Stage();
        BattleHUD battleHUD = new BattleHUD(mapManager_, battleStage, new BattleState());
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();

        // Act
        battleHUD.onNotify(new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent()),
                BattleObserver.BattleEvent.OPPONENT_ADDED);
    }

    /**
     * Method under test:
     * {@link BattleHUD#onNotify(String, ComponentObserver.ComponentEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOnNotify3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Graphics.getWidth()" because "com.badlogic.gdx.Gdx.graphics" is null
        //       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MapManager mapManager_ = new MapManager();
        Stage battleStage = new Stage();

        // Act
        (new BattleHUD(mapManager_, battleStage, new BattleState())).onNotify("42",
                ComponentObserver.ComponentEvent.LOAD_CONVERSATION);
    }

    /**
     * Method under test:
     * {@link BattleHUD#onNotify(String, ClassObserver.ClassEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOnNotify4() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Graphics.getWidth()" because "com.badlogic.gdx.Gdx.graphics" is null
        //       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MapManager mapManager_ = new MapManager();
        Stage battleStage = new Stage();

        // Act
        (new BattleHUD(mapManager_, battleStage, new BattleState())).onNotify("42",
                ClassObserver.ClassEvent.CHECK_UPGRADE_TREE_CLASS);
    }

    /**
     * Method under test:
     * {@link BattleHUD#onNotify(String, InventoryObserver.InventoryEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOnNotify5() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Graphics.getWidth()" because "com.badlogic.gdx.Gdx.graphics" is null
        //       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MapManager mapManager_ = new MapManager();
        Stage battleStage = new Stage();

        // Act
        (new BattleHUD(mapManager_, battleStage, new BattleState())).onNotify("42",
                InventoryObserver.InventoryEvent.UPDATED_AP);
    }

    /**
     * Method under test: {@link BattleHUD#render(float)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRender() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Graphics.getWidth()" because "com.badlogic.gdx.Gdx.graphics" is null
        //       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MapManager mapManager_ = new MapManager();
        Stage battleStage = new Stage();

        // Act
        (new BattleHUD(mapManager_, battleStage, new BattleState())).render(0.5f);
    }

    /**
     * Method under test: {@link BattleHUD#resize(int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testResize() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Graphics.getWidth()" because "com.badlogic.gdx.Gdx.graphics" is null
        //       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MapManager mapManager_ = new MapManager();
        Stage battleStage = new Stage();

        // Act
        (new BattleHUD(mapManager_, battleStage, new BattleState())).resize(1, 1);
    }

    /**
     * Method under test: {@link BattleHUD#dispose()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDispose() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Graphics.getWidth()" because "com.badlogic.gdx.Gdx.graphics" is null
        //       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MapManager mapManager_ = new MapManager();
        Stage battleStage = new Stage();

        // Act
        (new BattleHUD(mapManager_, battleStage, new BattleState())).dispose();
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link BattleHUD#getBattleHUDStage()}
     *   <li>{@link BattleHUD#getBattleInventoryUI()}
     *   <li>{@link BattleHUD#getBattleStatusUI()}
     *   <li>{@link BattleHUD#getBattleUI()}
     *   <li>{@link BattleHUD#getDmgOpponentValLabel()}
     *   <li>{@link BattleHUD#getDmgPlayerValLabel()}
     *   <li>{@link BattleHUD#hide()}
     *   <li>{@link BattleHUD#pause()}
     *   <li>{@link BattleHUD#resume()}
     *   <li>{@link BattleHUD#show()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGettersAndSetters() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   com.gdx.game.battle.BattleHUD.hide().
        //   The arrange section threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Graphics.getWidth()" because "com.badlogic.gdx.Gdx.graphics" is null
        //       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        BattleHUD battleHUD = null;

        // Act
        Stage actualBattleHUDStage = battleHUD.getBattleHUDStage();
        BattleInventoryUI actualBattleInventoryUI = battleHUD.getBattleInventoryUI();
        BattleStatusUI actualBattleStatusUI = battleHUD.getBattleStatusUI();
        BattleUI actualBattleUI = battleHUD.getBattleUI();
        Label actualDmgOpponentValLabel = battleHUD.getDmgOpponentValLabel();
        Label actualDmgPlayerValLabel = battleHUD.getDmgPlayerValLabel();
        battleHUD.hide();
        battleHUD.pause();
        battleHUD.resume();
        battleHUD.show();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link BattleHUD#BattleHUD(MapManager, Stage, BattleState)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNewBattleHUD() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Graphics.getWidth()" because "com.badlogic.gdx.Gdx.graphics" is null
        //       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MapManager mapManager_ = new MapManager();
        Stage battleStage = new Stage();

        // Act
        new BattleHUD(mapManager_, battleStage, new BattleState());

    }
}
