package com.gdx.game.entities.npc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.badlogic.gdx.math.Rectangle;
import com.gdx.game.entities.Entity;
import com.gdx.game.map.MapManager;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class NPCPhysicsComponentDiffblueTest {
    /**
     * Method under test: {@link NPCPhysicsComponent#dispose()}
     */
    @Test
    void testDispose() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     NPCPhysicsComponent.state
        //     PhysicsComponent.boundingBox
        //     PhysicsComponent.boundingBoxLocation
        //     PhysicsComponent.currentDirection
        //     PhysicsComponent.currentEntityPosition
        //     PhysicsComponent.entityEncounteredType
        //     PhysicsComponent.json
        //     PhysicsComponent.nextEntityPosition
        //     PhysicsComponent.selectionRay
        //     PhysicsComponent.tempEntities
        //     PhysicsComponent.velocity
        //     ComponentSubject.observers

        // Arrange and Act
        (new NPCPhysicsComponent()).dispose();
    }

    /**
     * Method under test: {@link NPCPhysicsComponent#receiveMessage(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testReceiveMessage() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        NPCPhysicsComponent npcPhysicsComponent = null;
        String message = "";

        // Act
        npcPhysicsComponent.receiveMessage(message);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link NPCPhysicsComponent#update(Entity, MapManager, float)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdate() {
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
        npcPhysicsComponent.update(entity, new MapManager(), 0.5f);
    }

    /**
     * Method under test: {@link NPCPhysicsComponent#calculateDistance(MapManager)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCalculateDistance() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        NPCPhysicsComponent npcPhysicsComponent = null;
        MapManager mapMgr = null;

        // Act
        float actualCalculateDistanceResult = npcPhysicsComponent.calculateDistance(mapMgr);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: default or parameterless constructor of
     * {@link NPCPhysicsComponent}
     */
    @Test
    void testNewNPCPhysicsComponent() {
        // Arrange, Act and Assert
        Rectangle rectangle = (new NPCPhysicsComponent()).boundingBox;
        assertEquals(1.1999998f, rectangle.getY());
        assertEquals(13.6f, rectangle.getHeight());
        assertEquals(3.1999998f, rectangle.getX());
        assertEquals(9.6f, rectangle.getWidth());
    }
}
