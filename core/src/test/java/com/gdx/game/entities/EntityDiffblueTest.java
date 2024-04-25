package com.gdx.game.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyFloat;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.CpuSpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ObjectMap;
import com.gdx.game.component.Component;
import com.gdx.game.component.ComponentObserver;
import com.gdx.game.component.GraphicsComponent;
import com.gdx.game.component.InputComponent;
import com.gdx.game.component.PhysicsComponent;
import com.gdx.game.entities.npc.NPCGraphicsComponent;
import com.gdx.game.entities.npc.NPCInputComponent;
import com.gdx.game.entities.npc.NPCPhysicsComponent;
import com.gdx.game.entities.player.PlayerInputComponent;
import com.gdx.game.inventory.InventoryItem;
import com.gdx.game.map.MapManager;

import java.util.Hashtable;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class EntityDiffblueTest {
    /**
     * Method under test: {@link Entity.Direction#getOpposite()}
     */
    @Test
    void testDirectionGetOpposite() {
        // Arrange, Act and Assert
        assertEquals(Entity.Direction.DOWN, Entity.Direction.UP.getOpposite());
        assertEquals(Entity.Direction.RIGHT, Entity.Direction.LEFT.getOpposite());
        assertEquals(Entity.Direction.LEFT, Entity.Direction.RIGHT.getOpposite());
        assertEquals(Entity.Direction.UP, Entity.Direction.DOWN.getOpposite());
    }

    /**
     * Method under test: {@link Entity#getEntityConfig(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEntityConfig() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.internal(String)" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.entities.Entity.getEntityConfig(Entity.java:194)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        Entity.getEntityConfig("/directory/foo.txt");
    }

    /**
     * Method under test: {@link Entity#sendMessage(Component.MESSAGE, String[])}
     */
    @Test
    void testSendMessage() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).receiveMessage(Mockito.<String>any());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(inputCpnt, physicsCpnt, graphicsCpnt)).sendMessage(Component.MESSAGE.CURRENT_POSITION, "Args");

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(graphicsCpnt).receiveMessage(eq("CURRENT_POSITION:::::Args"));
        verify(inputCpnt).receiveMessage(eq("CURRENT_POSITION:::::Args"));
        verify(physicsCpnt).receiveMessage(eq("CURRENT_POSITION:::::Args"));
    }

    /**
     * Method under test: {@link Entity#sendMessage(Component.MESSAGE, String[])}
     */
    @Test
    void testSendMessage2() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).receiveMessage(Mockito.<String>any());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(inputCpnt, physicsCpnt, graphicsCpnt)).sendMessage(Component.MESSAGE.INIT_START_POSITION, "Args");

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(graphicsCpnt).receiveMessage(eq("INIT_START_POSITION:::::Args"));
        verify(inputCpnt).receiveMessage(eq("INIT_START_POSITION:::::Args"));
        verify(physicsCpnt).receiveMessage(eq("INIT_START_POSITION:::::Args"));
    }

    /**
     * Method under test: {@link Entity#sendMessage(Component.MESSAGE, String[])}
     */
    @Test
    void testSendMessage3() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).receiveMessage(Mockito.<String>any());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(inputCpnt, physicsCpnt, graphicsCpnt)).sendMessage(Component.MESSAGE.RESET_POSITION, "Args");

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(graphicsCpnt).receiveMessage(eq("RESET_POSITION:::::Args"));
        verify(inputCpnt).receiveMessage(eq("RESET_POSITION:::::Args"));
        verify(physicsCpnt).receiveMessage(eq("RESET_POSITION:::::Args"));
    }

    /**
     * Method under test: {@link Entity#sendMessage(Component.MESSAGE, String[])}
     */
    @Test
    void testSendMessage4() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).receiveMessage(Mockito.<String>any());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(inputCpnt, physicsCpnt, graphicsCpnt)).sendMessage(Component.MESSAGE.CURRENT_DIRECTION, "Args");

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(graphicsCpnt).receiveMessage(eq("CURRENT_DIRECTION:::::Args"));
        verify(inputCpnt).receiveMessage(eq("CURRENT_DIRECTION:::::Args"));
        verify(physicsCpnt).receiveMessage(eq("CURRENT_DIRECTION:::::Args"));
    }

    /**
     * Method under test: {@link Entity#sendMessage(Component.MESSAGE, String[])}
     */
    @Test
    void testSendMessage5() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).receiveMessage(Mockito.<String>any());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(inputCpnt, physicsCpnt, graphicsCpnt)).sendMessage(Component.MESSAGE.CURRENT_STATE, "Args");

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(graphicsCpnt).receiveMessage(eq("CURRENT_STATE:::::Args"));
        verify(inputCpnt).receiveMessage(eq("CURRENT_STATE:::::Args"));
        verify(physicsCpnt).receiveMessage(eq("CURRENT_STATE:::::Args"));
    }

    /**
     * Method under test: {@link Entity#sendMessage(Component.MESSAGE, String[])}
     */
    @Test
    void testSendMessage6() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).receiveMessage(Mockito.<String>any());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(inputCpnt, physicsCpnt, graphicsCpnt)).sendMessage(Component.MESSAGE.COLLISION_WITH_MAP, "Args");

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(graphicsCpnt).receiveMessage(eq("COLLISION_WITH_MAP:::::Args"));
        verify(inputCpnt).receiveMessage(eq("COLLISION_WITH_MAP:::::Args"));
        verify(physicsCpnt).receiveMessage(eq("COLLISION_WITH_MAP:::::Args"));
    }

    /**
     * Method under test: {@link Entity#sendMessage(Component.MESSAGE, String[])}
     */
    @Test
    void testSendMessage7() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).receiveMessage(Mockito.<String>any());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(inputCpnt, physicsCpnt, graphicsCpnt)).sendMessage(Component.MESSAGE.COLLISION_WITH_ENTITY, "Args");

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(graphicsCpnt).receiveMessage(eq("COLLISION_WITH_ENTITY:::::Args"));
        verify(inputCpnt).receiveMessage(eq("COLLISION_WITH_ENTITY:::::Args"));
        verify(physicsCpnt).receiveMessage(eq("COLLISION_WITH_ENTITY:::::Args"));
    }

    /**
     * Method under test: {@link Entity#sendMessage(Component.MESSAGE, String[])}
     */
    @Test
    void testSendMessage8() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).receiveMessage(Mockito.<String>any());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(inputCpnt, physicsCpnt, graphicsCpnt)).sendMessage(Component.MESSAGE.COLLISION_WITH_FOE, "Args");

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(graphicsCpnt).receiveMessage(eq("COLLISION_WITH_FOE:::::Args"));
        verify(inputCpnt).receiveMessage(eq("COLLISION_WITH_FOE:::::Args"));
        verify(physicsCpnt).receiveMessage(eq("COLLISION_WITH_FOE:::::Args"));
    }

    /**
     * Method under test: {@link Entity#sendMessage(Component.MESSAGE, String[])}
     */
    @Test
    void testSendMessage9() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).receiveMessage(Mockito.<String>any());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(inputCpnt, physicsCpnt, graphicsCpnt)).sendMessage(Component.MESSAGE.LOAD_ANIMATIONS, "Args");

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(graphicsCpnt).receiveMessage(eq("LOAD_ANIMATIONS:::::Args"));
        verify(inputCpnt).receiveMessage(eq("LOAD_ANIMATIONS:::::Args"));
        verify(physicsCpnt).receiveMessage(eq("LOAD_ANIMATIONS:::::Args"));
    }

    /**
     * Method under test: {@link Entity#sendMessage(Component.MESSAGE, String[])}
     */
    @Test
    void testSendMessage10() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).receiveMessage(Mockito.<String>any());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(inputCpnt, physicsCpnt, graphicsCpnt)).sendMessage(Component.MESSAGE.INIT_DIRECTION, "Args");

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(graphicsCpnt).receiveMessage(eq("INIT_DIRECTION:::::Args"));
        verify(inputCpnt).receiveMessage(eq("INIT_DIRECTION:::::Args"));
        verify(physicsCpnt).receiveMessage(eq("INIT_DIRECTION:::::Args"));
    }

    /**
     * Method under test: {@link Entity#sendMessage(Component.MESSAGE, String[])}
     */
    @Test
    void testSendMessage11() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).receiveMessage(Mockito.<String>any());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(inputCpnt, physicsCpnt, graphicsCpnt)).sendMessage(Component.MESSAGE.INIT_STATE, "Args");

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(graphicsCpnt).receiveMessage(eq("INIT_STATE:::::Args"));
        verify(inputCpnt).receiveMessage(eq("INIT_STATE:::::Args"));
        verify(physicsCpnt).receiveMessage(eq("INIT_STATE:::::Args"));
    }

    /**
     * Method under test: {@link Entity#sendMessage(Component.MESSAGE, String[])}
     */
    @Test
    void testSendMessage12() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).receiveMessage(Mockito.<String>any());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(inputCpnt, physicsCpnt, graphicsCpnt)).sendMessage(Component.MESSAGE.INIT_SELECT_ENTITY, "Args");

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(graphicsCpnt).receiveMessage(eq("INIT_SELECT_ENTITY:::::Args"));
        verify(inputCpnt).receiveMessage(eq("INIT_SELECT_ENTITY:::::Args"));
        verify(physicsCpnt).receiveMessage(eq("INIT_SELECT_ENTITY:::::Args"));
    }

    /**
     * Method under test: {@link Entity#sendMessage(Component.MESSAGE, String[])}
     */
    @Test
    void testSendMessage13() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).receiveMessage(Mockito.<String>any());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(inputCpnt, physicsCpnt, graphicsCpnt)).sendMessage(Component.MESSAGE.ENTITY_SELECTED, "Args");

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(graphicsCpnt).receiveMessage(eq("ENTITY_SELECTED:::::Args"));
        verify(inputCpnt).receiveMessage(eq("ENTITY_SELECTED:::::Args"));
        verify(physicsCpnt).receiveMessage(eq("ENTITY_SELECTED:::::Args"));
    }

    /**
     * Method under test: {@link Entity#sendMessage(Component.MESSAGE, String[])}
     */
    @Test
    void testSendMessage14() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).receiveMessage(Mockito.<String>any());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(inputCpnt, physicsCpnt, graphicsCpnt)).sendMessage(Component.MESSAGE.ENTITY_DESELECTED, "Args");

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(graphicsCpnt).receiveMessage(eq("ENTITY_DESELECTED:::::Args"));
        verify(inputCpnt).receiveMessage(eq("ENTITY_DESELECTED:::::Args"));
        verify(physicsCpnt).receiveMessage(eq("ENTITY_DESELECTED:::::Args"));
    }

    /**
     * Method under test: {@link Entity#sendMessage(Component.MESSAGE, String[])}
     */
    @Test
    void testSendMessage15() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).receiveMessage(Mockito.<String>any());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(inputCpnt, physicsCpnt, graphicsCpnt)).sendMessage(Component.MESSAGE.OPTION_INPUT, "Args");

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(graphicsCpnt).receiveMessage(eq("OPTION_INPUT:::::Args"));
        verify(inputCpnt).receiveMessage(eq("OPTION_INPUT:::::Args"));
        verify(physicsCpnt).receiveMessage(eq("OPTION_INPUT:::::Args"));
    }

    /**
     * Method under test: {@link Entity#registerObserver(ComponentObserver)}
     */
    @Test
    void testRegisterObserver() {
        // Arrange
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        NPCInputComponent inputCpnt = new NPCInputComponent();

        // Act
        (new Entity(inputCpnt, new NPCPhysicsComponent(), graphicsCpnt)).registerObserver(mock(ComponentObserver.class));

        // Assert
        verify(graphicsCpnt).addObserver(isA(ComponentObserver.class));
    }

    /**
     * Method under test: {@link Entity#registerObserver(ComponentObserver)}
     */
    @Test
    void testRegisterObserver2() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).addObserver(Mockito.<ComponentObserver>any());
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).addObserver(Mockito.<ComponentObserver>any());

        // Act
        (new Entity(inputCpnt, new NPCPhysicsComponent(), graphicsCpnt)).registerObserver(mock(ComponentObserver.class));

        // Assert
        verify(graphicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(inputCpnt).addObserver(isA(ComponentObserver.class));
    }

    /**
     * Method under test: {@link Entity#registerObserver(ComponentObserver)}
     */
    @Test
    void testRegisterObserver3() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).addObserver(Mockito.<ComponentObserver>any());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).addObserver(Mockito.<ComponentObserver>any());

        // Act
        (new Entity(inputCpnt, physicsCpnt, graphicsCpnt)).registerObserver(mock(ComponentObserver.class));

        // Assert that nothing has changed
        verify(graphicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(inputCpnt).addObserver(isA(ComponentObserver.class));
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
    }

    /**
     * Method under test: {@link Entity.State#getRandomNext()}
     */
    @Test
    void testStateGetRandomNext() {
        // Arrange, Act and Assert
        assertEquals(Entity.State.IDLE, Entity.State.getRandomNext());
    }

    /**
     * Method under test: {@link Entity#unregisterObservers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUnregisterObservers() {
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
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();

        // Act
        (new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent())).unregisterObservers();
    }

    /**
     * Method under test: {@link Entity#update(MapManager, Batch, float)}
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
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();
        Entity entity = new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent());
        MapManager mapMgr = new MapManager();

        // Act
        entity.update(mapMgr, new CpuSpriteBatch(), 0.5f);
    }

    /**
     * Method under test: {@link Entity#updateInput(float)}
     */
    @Test
    void testUpdateInput() {
        // Arrange
        NPCInputComponent inputCpnt = mock(NPCInputComponent.class);
        doNothing().when(inputCpnt).update(Mockito.<Entity>any(), anyFloat());
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));

        // Act
        (new Entity(inputCpnt, physicsCpnt, null)).updateInput(0.5f);

        // Assert that nothing has changed
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(inputCpnt).update(isA(Entity.class), eq(0.5f));
    }

    /**
     * Method under test: {@link Entity#updateInput(float)}
     */
    @Test
    void testUpdateInput2() {
        // Arrange
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(new Entity(new NPCInputComponent(), physicsCpnt, graphicsCpnt))).updateInput(0.5f);

        // Assert
        verify(graphicsCpnt, atLeast(1)).receiveMessage(Mockito.<String>any());
        verify(physicsCpnt, atLeast(1)).receiveMessage(Mockito.<String>any());
    }

    /**
     * Method under test: {@link Entity#updateInput(float)}
     */
    @Test
    void testUpdateInput3() {
        // Arrange
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(new Entity(new PlayerInputComponent(), physicsCpnt, graphicsCpnt))).updateInput(0.5f);

        // Assert
        verify(graphicsCpnt, atLeast(1)).receiveMessage(Mockito.<String>any());
        verify(physicsCpnt, atLeast(1)).receiveMessage(Mockito.<String>any());
    }

    /**
     * Method under test: {@link Entity#updateInput(float)}
     */
    @Test
    void testUpdateInput4() {
        // Arrange
        NPCInputComponent inputCpnt = new NPCInputComponent();
        inputCpnt.addObserver(mock(ComponentObserver.class));
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(new Entity(inputCpnt, physicsCpnt, graphicsCpnt))).updateInput(0.5f);

        // Assert
        verify(graphicsCpnt, atLeast(1)).receiveMessage(Mockito.<String>any());
        verify(physicsCpnt, atLeast(1)).receiveMessage(Mockito.<String>any());
    }

    /**
     * Method under test: {@link Entity#updateInput(float)}
     */
    @Test
    void testUpdateInput5() {
        // Arrange
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        // Act
        (new Entity(new Entity(new NPCInputComponent(), physicsCpnt, graphicsCpnt))).updateInput(0.0f);

        // Assert
        verify(graphicsCpnt, atLeast(1)).receiveMessage(Mockito.<String>any());
        verify(physicsCpnt, atLeast(1)).receiveMessage(Mockito.<String>any());
    }

    /**
     * Method under test: {@link Entity#updateInput(float)}
     */
    @Test
    void testUpdateInput6() {
        // Arrange
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).receiveMessage(Mockito.<String>any());
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        doNothing().when(graphicsCpnt).receiveMessage(Mockito.<String>any());

        Entity entity = new Entity(new NPCInputComponent(), physicsCpnt, graphicsCpnt);
        entity.setEntityConfig(new EntityConfig());

        // Act
        (new Entity(entity)).updateInput(10.0f);

        // Assert
        verify(graphicsCpnt, atLeast(1)).receiveMessage(Mockito.<String>any());
        verify(physicsCpnt, atLeast(1)).receiveMessage(Mockito.<String>any());
    }

    /**
     * Method under test: {@link Entity#getEntityConfigs(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEntityConfigs() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.internal(String)" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.entities.Entity.getEntityConfigs(Entity.java:201)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        Entity.getEntityConfigs("/directory/foo.txt");
    }

    /**
     * Method under test: {@link Entity#loadEntityConfigByPath(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLoadEntityConfigByPath() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.internal(String)" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.entities.Entity.getEntityConfig(Entity.java:194)
        //       at com.gdx.game.entities.Entity.loadEntityConfigByPath(Entity.java:211)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        Entity.loadEntityConfigByPath("Entity Config Path");
    }

    /**
     * Method under test: {@link Entity#loadEntityConfig(EntityConfig)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLoadEntityConfig() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.isLocalStorageAvailable()" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.profile.ProfileManager.storeAllProfiles(ProfileManager.java:65)
        //       at com.gdx.game.profile.ProfileManager.<init>(ProfileManager.java:31)
        //       at com.gdx.game.profile.ProfileManager.getInstance(ProfileManager.java:36)
        //       at com.gdx.game.entities.Entity.loadEntityConfig(Entity.java:222)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        Entity.loadEntityConfig(new EntityConfig());
    }

    /**
     * Method under test: {@link Entity#initEntity(EntityConfig)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testInitEntity() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.internal(String)" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.entities.Entity.getEntityConfigs(Entity.java:201)
        //       at com.gdx.game.entities.EntityFactory.<init>(EntityFactory.java:63)
        //       at com.gdx.game.entities.EntityFactory.getInstance(EntityFactory.java:86)
        //       at com.gdx.game.entities.Entity.initEntity(Entity.java:268)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        Entity.initEntity(new EntityConfig());
    }

    /**
     * Method under test: {@link Entity#initEntity(EntityConfig, Vector2)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testInitEntity2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.internal(String)" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.entities.Entity.getEntityConfigs(Entity.java:201)
        //       at com.gdx.game.entities.EntityFactory.<init>(EntityFactory.java:63)
        //       at com.gdx.game.entities.EntityFactory.getInstance(EntityFactory.java:86)
        //       at com.gdx.game.entities.Entity.initEntity(Entity.java:233)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        EntityConfig entityConfig = new EntityConfig();

        // Act
        Entity.initEntity(entityConfig, new Vector2(10.0f, 10.0f));
    }

    /**
     * Method under test: {@link Entity#initEntities(Array)}
     */
    @Test
    void testInitEntities() {
        // Arrange and Act
        Hashtable<String, Entity> actualInitEntitiesResult = Entity.initEntities(new Array<>());

        // Assert
        assertTrue(actualInitEntitiesResult.isEmpty());
    }

    /**
     * Method under test: {@link Entity#dispose()}
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
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();

        // Act
        (new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent())).dispose();
    }

    /**
     * Method under test: {@link Entity#getCurrentBoundingBox()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCurrentBoundingBox() {
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
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();

        // Act
        (new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent())).getCurrentBoundingBox();
    }

    /**
     * Method under test: {@link Entity#getEntityEncounteredType()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEntityEncounteredType() {
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
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();

        // Act
        (new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent())).getEntityEncounteredType();
    }

    /**
     * Method under test: {@link Entity#getCurrentPosition()}
     */
    @Test
    void testGetCurrentPosition() {
        // Arrange
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));
        NPCGraphicsComponent graphicsCpnt = mock(NPCGraphicsComponent.class);
        Vector2 vector2 = new Vector2(10.0f, 10.0f);

        when(graphicsCpnt.getCurrentPosition()).thenReturn(vector2);

        // Act
        Vector2 actualCurrentPosition = (new Entity(mock(NPCInputComponent.class), physicsCpnt, graphicsCpnt))
                .getCurrentPosition();

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        verify(graphicsCpnt).getCurrentPosition();
        assertSame(vector2, actualCurrentPosition);
    }

    /**
     * Method under test: {@link Entity#getAnimation(Entity.AnimationType)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAnimation() {
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
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();

        // Act
        (new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent())).getAnimation(Entity.AnimationType.WALK_LEFT);
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Entity#setEntityConfig(EntityConfig)}
     *   <li>{@link Entity#getEntityConfig()}
     *   <li>{@link Entity#getInputProcessor()}
     *   <li>{@link Entity#setEntityEncounteredType(EntityFactory.EntityName)}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGettersAndSetters() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   com.gdx.game.entities.Entity.setEntityConfig(EntityConfig).
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
        Entity entity = null;
        EntityConfig entityConfig = null;

        // Act
        entity.setEntityConfig(entityConfig);
        EntityConfig actualEntityConfig = entity.getEntityConfig();
        InputProcessor actualInputProcessor = entity.getInputProcessor();
        EntityFactory.EntityName entityName = EntityFactory.EntityName.TOWN_GUARD_WALKING;
        entity.setEntityEncounteredType(entityName);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link Entity#Entity(InputComponent, PhysicsComponent, GraphicsComponent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNewEntity() {
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
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();

        // Act
        new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent());

    }

    /**
     * Method under test: {@link Entity#Entity(Entity)}
     */
    @Test
    void testNewEntity2() {
        // Arrange
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));

        // Act
        Entity actualEntity = new Entity(new Entity(mock(NPCInputComponent.class), physicsCpnt, null));

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
        assertNull(actualEntity.getCurrentBoundingBox());
        EntityConfig entityConfig = actualEntity.getEntityConfig();
        assertNull(entityConfig.getClassTreePath());
        assertNull(entityConfig.getConversationConfigPath());
        assertNull(entityConfig.getCurrentQuestID());
        assertNull(entityConfig.getEntityID());
        assertNull(entityConfig.getEntityStatus());
        assertNull(entityConfig.getItemTypeID());
        assertNull(entityConfig.getQuestConfigPath());
        assertNull(entityConfig.getResumeConfigPath());
        Array<EntityConfig.AnimationConfig> animationConfig = entityConfig.getAnimationConfig();
        assertEquals(0, animationConfig.size);
        Array<EntityConfig.Drop> drops = entityConfig.getDrops();
        assertEquals(0, drops.size);
        Array<InventoryItem.ItemTypeID> inventory = entityConfig.getInventory();
        assertEquals(0, inventory.size);
        ObjectMap<String, String> entityProperties = entityConfig.getEntityProperties();
        assertEquals(0, entityProperties.size);
        assertEquals(Entity.Direction.DOWN, entityConfig.getDirection());
        assertEquals(Entity.State.IDLE, entityConfig.getState());
        assertFalse(entityProperties.iterator().hasNext());
        assertTrue(animationConfig.ordered);
        assertTrue(drops.ordered);
        assertTrue(inventory.ordered);
    }
}
