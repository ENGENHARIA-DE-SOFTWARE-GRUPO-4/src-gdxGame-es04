package com.gdx.game.battle;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.gdx.game.component.ComponentObserver;
import com.gdx.game.entities.Entity;
import com.gdx.game.entities.npc.NPCInputComponent;
import com.gdx.game.entities.npc.NPCPhysicsComponent;
import com.gdx.game.inventory.InventoryObserver;
import com.gdx.game.map.MapManager;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BattleSubjectDiffblueTest {
    /**
     * Method under test: {@link BattleSubject#addObserver(BattleObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddObserver() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Graphics.getWidth()" because "com.badlogic.gdx.Gdx.graphics" is null
        //       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BattleSubject battleSubject = new BattleSubject();
        MapManager mapManager_ = new MapManager();
        Stage battleStage = new Stage();

        // Act
        battleSubject.addObserver(new BattleHUD(mapManager_, battleStage, new BattleState()));
    }

    /**
     * Method under test: {@link BattleSubject#removeObserver(BattleObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveObserver() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Graphics.getWidth()" because "com.badlogic.gdx.Gdx.graphics" is null
        //       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BattleSubject battleSubject = new BattleSubject();
        MapManager mapManager_ = new MapManager();
        Stage battleStage = new Stage();

        // Act
        battleSubject.removeObserver(new BattleHUD(mapManager_, battleStage, new BattleState()));
    }

    /**
     * Method under test:
     * {@link BattleSubject#notify(Entity, BattleObserver.BattleEvent)}
     */
    @Test
    void testNotify() {
        // Arrange
        BattleSubject battleSubject = new BattleSubject();
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));

        // Act
        battleSubject.notify(new Entity(mock(NPCInputComponent.class), physicsCpnt, null),
                BattleObserver.BattleEvent.OPPONENT_ADDED);

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
    }

    /**
     * Method under test:
     * {@link BattleSubject#notify(Entity, BattleObserver.BattleEvent)}
     */
    @Test
    void testNotify2() {
        // Arrange
        BattleSubject battleSubject = new BattleSubject();
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));

        // Act
        battleSubject.notify(new Entity(mock(NPCInputComponent.class), physicsCpnt, null),
                BattleObserver.BattleEvent.OPPONENT_HIT_DAMAGE);

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
    }

    /**
     * Method under test:
     * {@link BattleSubject#notify(Entity, BattleObserver.BattleEvent)}
     */
    @Test
    void testNotify3() {
        // Arrange
        BattleSubject battleSubject = new BattleSubject();
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));

        // Act
        battleSubject.notify(new Entity(mock(NPCInputComponent.class), physicsCpnt, null),
                BattleObserver.BattleEvent.OPPONENT_DEFEATED);

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
    }

    /**
     * Method under test:
     * {@link BattleSubject#notify(Entity, BattleObserver.BattleEvent)}
     */
    @Test
    void testNotify4() {
        // Arrange
        BattleSubject battleSubject = new BattleSubject();
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));

        // Act
        battleSubject.notify(new Entity(mock(NPCInputComponent.class), physicsCpnt, null),
                BattleObserver.BattleEvent.OPPONENT_TURN_DONE);

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
    }

    /**
     * Method under test:
     * {@link BattleSubject#notify(Entity, BattleObserver.BattleEvent)}
     */
    @Test
    void testNotify5() {
        // Arrange
        BattleSubject battleSubject = new BattleSubject();
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));

        // Act
        battleSubject.notify(new Entity(mock(NPCInputComponent.class), physicsCpnt, null),
                BattleObserver.BattleEvent.PLAYER_ADDED);

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
    }

    /**
     * Method under test:
     * {@link BattleSubject#notify(Entity, BattleObserver.BattleEvent)}
     */
    @Test
    void testNotify6() {
        // Arrange
        BattleSubject battleSubject = new BattleSubject();
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));

        // Act
        battleSubject.notify(new Entity(mock(NPCInputComponent.class), physicsCpnt, null),
                BattleObserver.BattleEvent.PLAYER_HIT_DAMAGE);

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
    }

    /**
     * Method under test:
     * {@link BattleSubject#notify(Entity, BattleObserver.BattleEvent)}
     */
    @Test
    void testNotify7() {
        // Arrange
        BattleSubject battleSubject = new BattleSubject();
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));

        // Act
        battleSubject.notify(new Entity(mock(NPCInputComponent.class), physicsCpnt, null),
                BattleObserver.BattleEvent.PLAYER_RUNNING);

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
    }

    /**
     * Method under test:
     * {@link BattleSubject#notify(Entity, BattleObserver.BattleEvent)}
     */
    @Test
    void testNotify8() {
        // Arrange
        BattleSubject battleSubject = new BattleSubject();
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));

        // Act
        battleSubject.notify(new Entity(mock(NPCInputComponent.class), physicsCpnt, null),
                BattleObserver.BattleEvent.PLAYER_TURN_DONE);

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
    }

    /**
     * Method under test:
     * {@link BattleSubject#notify(Entity, BattleObserver.BattleEvent)}
     */
    @Test
    void testNotify9() {
        // Arrange
        BattleSubject battleSubject = new BattleSubject();
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));

        // Act
        battleSubject.notify(new Entity(mock(NPCInputComponent.class), physicsCpnt, null),
                BattleObserver.BattleEvent.PLAYER_TURN_START);

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
    }

    /**
     * Method under test:
     * {@link BattleSubject#notify(Entity, BattleObserver.BattleEvent)}
     */
    @Test
    void testNotify10() {
        // Arrange
        BattleSubject battleSubject = new BattleSubject();
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));

        // Act
        battleSubject.notify(new Entity(mock(NPCInputComponent.class), physicsCpnt, null),
                BattleObserver.BattleEvent.PLAYER_PHASE_START);

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
    }

    /**
     * Method under test:
     * {@link BattleSubject#notify(Entity, BattleObserver.BattleEvent)}
     */
    @Test
    void testNotify11() {
        // Arrange
        BattleSubject battleSubject = new BattleSubject();
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));

        // Act
        battleSubject.notify(new Entity(mock(NPCInputComponent.class), physicsCpnt, null),
                BattleObserver.BattleEvent.PLAYER_USED_MAGIC);

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
    }

    /**
     * Method under test:
     * {@link BattleSubject#notify(Entity, BattleObserver.BattleEvent)}
     */
    @Test
    void testNotify12() {
        // Arrange
        BattleSubject battleSubject = new BattleSubject();
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));

        // Act
        battleSubject.notify(new Entity(mock(NPCInputComponent.class), physicsCpnt, null),
                BattleObserver.BattleEvent.RESUME_OVER);

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
    }

    /**
     * Method under test:
     * {@link BattleSubject#notify(Entity, BattleObserver.BattleEvent)}
     */
    @Test
    void testNotify13() {
        // Arrange
        BattleSubject battleSubject = new BattleSubject();
        NPCPhysicsComponent physicsCpnt = mock(NPCPhysicsComponent.class);
        doNothing().when(physicsCpnt).addObserver(Mockito.<ComponentObserver>any());
        physicsCpnt.addObserver(mock(ComponentObserver.class));

        // Act
        battleSubject.notify(new Entity(mock(NPCInputComponent.class), physicsCpnt, null), BattleObserver.BattleEvent.NONE);

        // Assert
        verify(physicsCpnt).addObserver(isA(ComponentObserver.class));
    }

    /**
     * Method under test:
     * {@link BattleSubject#notify(String, InventoryObserver.InventoryEvent)}
     */
    @Test
    void testNotify14() {
        // Arrange
        BattleHUD battleObserver = mock(BattleHUD.class);
        doNothing().when(battleObserver).onNotify(Mockito.<String>any(), Mockito.<InventoryObserver.InventoryEvent>any());

        BattleSubject battleSubject = new BattleSubject();
        battleSubject.addObserver(battleObserver);

        // Act
        battleSubject.notify("Drop", InventoryObserver.InventoryEvent.UPDATED_AP);

        // Assert
        verify(battleObserver).onNotify(eq("Drop"), eq(InventoryObserver.InventoryEvent.UPDATED_AP));
    }

    /**
     * Method under test: default or parameterless constructor of
     * {@link BattleSubject}
     */
    @Test
    void testNewBattleSubject() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     BattleSubject.observers

        // Arrange and Act
        new BattleSubject();
    }
}
