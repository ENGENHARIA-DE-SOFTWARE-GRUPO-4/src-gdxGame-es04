package com.gdx.game.entities.player;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.badlogic.gdx.math.Rectangle;
import com.gdx.game.entities.Entity;
import com.gdx.game.map.MapManager;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PlayerPhysicsComponentDiffblueTest {
    /**
     * Method under test: {@link PlayerPhysicsComponent#dispose()}
     */
    @Test
    void testDispose() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     PlayerPhysicsComponent.isMouseSelectEnabled
        //     PlayerPhysicsComponent.mouseSelectCoordinates
        //     PlayerPhysicsComponent.previousDiscovery
        //     PlayerPhysicsComponent.previousEnemySpawn
        //     PlayerPhysicsComponent.state
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
        (new PlayerPhysicsComponent()).dispose();
    }

    /**
     * Method under test: {@link PlayerPhysicsComponent#receiveMessage(String)}
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
        PlayerPhysicsComponent playerPhysicsComponent = null;
        String message = "";

        // Act
        playerPhysicsComponent.receiveMessage(message);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link PlayerPhysicsComponent#update(Entity, MapManager, float)}
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
        PlayerPhysicsComponent playerPhysicsComponent = null;
        Entity entity = null;
        MapManager mapMgr = null;
        float delta = 0.0f;

        // Act
        playerPhysicsComponent.update(entity, mapMgr, delta);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link PlayerPhysicsComponent#isCollisionWithMapEntities(Entity, MapManager)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsCollisionWithMapEntities() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PlayerPhysicsComponent playerPhysicsComponent = null;
        Entity entity = null;
        MapManager mapMgr = null;

        // Act
        boolean actualIsCollisionWithMapEntitiesResult = playerPhysicsComponent.isCollisionWithMapEntities(entity, mapMgr);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: default or parameterless constructor of
     * {@link PlayerPhysicsComponent}
     */
    @Test
    void testNewPlayerPhysicsComponent() {
        // Arrange, Act and Assert
        Rectangle rectangle = (new PlayerPhysicsComponent()).boundingBox;
        assertEquals(0.0f, rectangle.getY());
        assertEquals(11.2f, rectangle.getWidth());
        assertEquals(2.4f, rectangle.getX());
        assertEquals(8.0f, rectangle.getHeight());
    }
}
