package com.gdx.game.component;

import com.badlogic.gdx.math.Vector2;
import com.gdx.game.entities.Entity;
import com.gdx.game.entities.npc.NPCGraphicsComponent;
import com.gdx.game.entities.npc.NPCInputComponent;
import com.gdx.game.entities.npc.NPCPhysicsComponent;
import com.gdx.game.map.MapManager;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PhysicsComponentDiffblueTest {
    /**
     * Method under test:
     * {@link PhysicsComponent#isCollisionWithMapEntities(Entity, MapManager)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsCollisionWithMapEntities() {
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
        NPCPhysicsComponent npcPhysicsComponent = new NPCPhysicsComponent();
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();
        Entity entity = new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent());

        // Act
        npcPhysicsComponent.isCollisionWithMapEntities(entity, new MapManager());
    }

    /**
     * Method under test: {@link PhysicsComponent#isCollision(Entity, Entity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsCollision() {
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
        NPCPhysicsComponent npcPhysicsComponent = new NPCPhysicsComponent();
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();
        Entity entitySource = new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent());

        NPCInputComponent inputCpnt2 = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt2 = new NPCPhysicsComponent();

        // Act
        npcPhysicsComponent.isCollision(entitySource, new Entity(inputCpnt2, physicsCpnt2, new NPCGraphicsComponent()));
    }

    /**
     * Method under test:
     * {@link PhysicsComponent#isCollisionWithMapLayer(Entity, MapManager)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsCollisionWithMapLayer() {
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
        NPCPhysicsComponent npcPhysicsComponent = new NPCPhysicsComponent();
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();
        Entity entity = new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent());

        // Act
        npcPhysicsComponent.isCollisionWithMapLayer(entity, new MapManager());
    }

    /**
     * Method under test: {@link PhysicsComponent#setNextPositionToCurrent(Entity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetNextPositionToCurrent() {
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
        NPCPhysicsComponent npcPhysicsComponent = new NPCPhysicsComponent();
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();

        // Act
        npcPhysicsComponent.setNextPositionToCurrent(new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent()));
    }

    /**
     * Method under test: {@link PhysicsComponent#calculateNextPosition(float)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCalculateNextPosition() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PhysicsComponent physicsComponent = null;
        float deltaTime = 0.0f;

        // Act
        physicsComponent.calculateNextPosition(deltaTime);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PhysicsComponent#initBoundingBox(float, float)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testInitBoundingBox() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PhysicsComponent physicsComponent = null;
        float percentageWidthReduced = 0.0f;
        float percentageHeightReduced = 0.0f;

        // Act
        physicsComponent.initBoundingBox(percentageWidthReduced, percentageHeightReduced);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link PhysicsComponent#updateBoundingBoxPosition(Vector2)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateBoundingBoxPosition() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PhysicsComponent physicsComponent = null;
        Vector2 position = null;

        // Act
        physicsComponent.updateBoundingBoxPosition(position);

        // Assert
        // TODO: Add assertions on result
    }
}
