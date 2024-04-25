package com.gdx.game.screen;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.gdx.game.GdxGame;
import com.gdx.game.battle.BattleHUD;
import com.gdx.game.battle.BattleObserver;
import com.gdx.game.entities.Entity;
import com.gdx.game.entities.npc.NPCGraphicsComponent;
import com.gdx.game.entities.npc.NPCInputComponent;
import com.gdx.game.entities.npc.NPCPhysicsComponent;
import com.gdx.game.entities.player.PlayerHUD;
import com.gdx.game.inventory.InventoryObserver;
import com.gdx.game.manager.ResourceManager;
import com.gdx.game.map.MapManager;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class BattleScreenDiffblueTest {
    /**
     * Method under test:
     * {@link BattleScreen#onNotify(Entity, BattleObserver.BattleEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOnNotify() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.graphics.GL20.glCreateShader(int)" because "gl" is null
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.loadShader(ShaderProgram.java:205)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.compileShaders(ShaderProgram.java:184)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.<init>(ShaderProgram.java:167)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.createDefaultShader(ImmediateModeRenderer20.java:241)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.<init>(ImmediateModeRenderer20.java:55)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:116)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:111)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:107)
        //       at com.gdx.game.component.GraphicsComponent.<init>(GraphicsComponent.java:34)
        //       at com.gdx.game.entities.npc.NPCGraphicsComponent.<init>(NPCGraphicsComponent.java:29)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        GdxGame gdxGame = new GdxGame();
        OrthographicCamera cameraHUD = new OrthographicCamera();
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();
        Entity entityPlayer = new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent());

        PlayerHUD playerHUD_ = new PlayerHUD(cameraHUD, entityPlayer, new MapManager());

        MapManager mapManager_ = new MapManager();
        BattleScreen battleScreen = new BattleScreen(gdxGame, playerHUD_, mapManager_, new ResourceManager());
        NPCInputComponent inputCpnt2 = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt2 = new NPCPhysicsComponent();

        // Act
        battleScreen.onNotify(new Entity(inputCpnt2, physicsCpnt2, new NPCGraphicsComponent()),
                BattleObserver.BattleEvent.OPPONENT_ADDED);
    }

    /**
     * Method under test: {@link BattleScreen#show()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testShow() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.graphics.GL20.glCreateShader(int)" because "gl" is null
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.loadShader(ShaderProgram.java:205)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.compileShaders(ShaderProgram.java:184)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.<init>(ShaderProgram.java:167)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.createDefaultShader(ImmediateModeRenderer20.java:241)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.<init>(ImmediateModeRenderer20.java:55)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:116)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:111)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:107)
        //       at com.gdx.game.component.GraphicsComponent.<init>(GraphicsComponent.java:34)
        //       at com.gdx.game.entities.npc.NPCGraphicsComponent.<init>(NPCGraphicsComponent.java:29)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        GdxGame gdxGame = new GdxGame();
        OrthographicCamera cameraHUD = new OrthographicCamera();
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();
        Entity entityPlayer = new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent());

        PlayerHUD playerHUD_ = new PlayerHUD(cameraHUD, entityPlayer, new MapManager());

        MapManager mapManager_ = new MapManager();

        // Act
        (new BattleScreen(gdxGame, playerHUD_, mapManager_, new ResourceManager())).show();
    }

    /**
     * Method under test: {@link BattleScreen#render(float)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRender() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.graphics.GL20.glCreateShader(int)" because "gl" is null
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.loadShader(ShaderProgram.java:205)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.compileShaders(ShaderProgram.java:184)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.<init>(ShaderProgram.java:167)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.createDefaultShader(ImmediateModeRenderer20.java:241)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.<init>(ImmediateModeRenderer20.java:55)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:116)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:111)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:107)
        //       at com.gdx.game.component.GraphicsComponent.<init>(GraphicsComponent.java:34)
        //       at com.gdx.game.entities.npc.NPCGraphicsComponent.<init>(NPCGraphicsComponent.java:29)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        GdxGame gdxGame = new GdxGame();
        OrthographicCamera cameraHUD = new OrthographicCamera();
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();
        Entity entityPlayer = new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent());

        PlayerHUD playerHUD_ = new PlayerHUD(cameraHUD, entityPlayer, new MapManager());

        MapManager mapManager_ = new MapManager();

        // Act
        (new BattleScreen(gdxGame, playerHUD_, mapManager_, new ResourceManager())).render(0.5f);
    }

    /**
     * Method under test: {@link BattleScreen#dispose()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDispose() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.graphics.GL20.glCreateShader(int)" because "gl" is null
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.loadShader(ShaderProgram.java:205)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.compileShaders(ShaderProgram.java:184)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.<init>(ShaderProgram.java:167)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.createDefaultShader(ImmediateModeRenderer20.java:241)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.<init>(ImmediateModeRenderer20.java:55)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:116)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:111)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:107)
        //       at com.gdx.game.component.GraphicsComponent.<init>(GraphicsComponent.java:34)
        //       at com.gdx.game.entities.npc.NPCGraphicsComponent.<init>(NPCGraphicsComponent.java:29)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        GdxGame gdxGame = new GdxGame();
        OrthographicCamera cameraHUD = new OrthographicCamera();
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();
        Entity entityPlayer = new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent());

        PlayerHUD playerHUD_ = new PlayerHUD(cameraHUD, entityPlayer, new MapManager());

        MapManager mapManager_ = new MapManager();

        // Act
        (new BattleScreen(gdxGame, playerHUD_, mapManager_, new ResourceManager())).dispose();
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link BattleScreen#getBattleHUD()}
     *   <li>{@link BattleScreen#onNotify(String, InventoryObserver.InventoryEvent)}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGettersAndSetters() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   com.gdx.game.screen.BattleScreen.onNotify(String, InventoryEvent).
        //   The arrange section threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.graphics.GL20.glCreateShader(int)" because "gl" is null
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.loadShader(ShaderProgram.java:205)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.compileShaders(ShaderProgram.java:184)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.<init>(ShaderProgram.java:167)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.createDefaultShader(ImmediateModeRenderer20.java:241)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.<init>(ImmediateModeRenderer20.java:55)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:116)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:111)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:107)
        //       at com.gdx.game.component.GraphicsComponent.<init>(GraphicsComponent.java:34)
        //       at com.gdx.game.entities.npc.NPCGraphicsComponent.<init>(NPCGraphicsComponent.java:29)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        BattleScreen battleScreen = null;

        // Act
        BattleHUD actualBattleHUD = battleScreen.getBattleHUD();
        String drop = "";
        InventoryObserver.InventoryEvent event = InventoryObserver.InventoryEvent.UPDATED_AP;
        battleScreen.onNotify(drop, event);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link BattleScreen#BattleScreen(GdxGame, PlayerHUD, MapManager, ResourceManager)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNewBattleScreen() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.graphics.GL20.glCreateShader(int)" because "gl" is null
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.loadShader(ShaderProgram.java:205)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.compileShaders(ShaderProgram.java:184)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.<init>(ShaderProgram.java:167)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.createDefaultShader(ImmediateModeRenderer20.java:241)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.<init>(ImmediateModeRenderer20.java:55)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:116)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:111)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:107)
        //       at com.gdx.game.component.GraphicsComponent.<init>(GraphicsComponent.java:34)
        //       at com.gdx.game.entities.npc.NPCGraphicsComponent.<init>(NPCGraphicsComponent.java:29)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        GdxGame gdxGame = new GdxGame();
        OrthographicCamera cameraHUD = new OrthographicCamera();
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();
        Entity entityPlayer = new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent());

        PlayerHUD playerHUD_ = new PlayerHUD(cameraHUD, entityPlayer, new MapManager());

        MapManager mapManager_ = new MapManager();

        // Act
        new BattleScreen(gdxGame, playerHUD_, mapManager_, new ResourceManager());

    }
}
