package com.gdx.game.inventory.slot;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.DragAndDrop;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class InventorySlotTargetDiffblueTest {
    /**
     * Method under test:
     * {@link InventorySlotTarget#drag(DragAndDrop.Source, DragAndDrop.Payload, float, float, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrag() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlotTarget inventorySlotTarget = null;
        DragAndDrop.Source source = null;
        DragAndDrop.Payload payload = null;
        float x = 0.0f;
        float y = 0.0f;
        int pointer = 0;

        // Act
        boolean actualDragResult = inventorySlotTarget.drag(source, payload, x, y, pointer);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link InventorySlotTarget#InventorySlotTarget(InventorySlot)}
     */
    @Test
    void testNewInventorySlotTarget() {
        // Arrange
        InventorySlot actor = mock(InventorySlot.class);
        when(actor.getStage()).thenReturn(null);

        // Act
        InventorySlotTarget actualInventorySlotTarget = new InventorySlotTarget(actor);

        // Assert
        verify(actor).getStage();
        assertSame(actualInventorySlotTarget.getActor(), actualInventorySlotTarget.targetSlot);
    }

    /**
     * Method under test:
     * {@link InventorySlotTarget#InventorySlotTarget(InventorySlot)}
     */
    @Test
    void testNewInventorySlotTarget2() {
        // Arrange
        Stage stage = mock(Stage.class);
        when(stage.getRoot()).thenReturn(new Group());
        InventorySlot actor = mock(InventorySlot.class);
        when(actor.getStage()).thenReturn(stage);

        // Act
        InventorySlotTarget actualInventorySlotTarget = new InventorySlotTarget(actor);

        // Assert
        verify(actor).getStage();
        verify(stage).getRoot();
        assertSame(actualInventorySlotTarget.getActor(), actualInventorySlotTarget.targetSlot);
    }

    /**
     * Method under test:
     * {@link InventorySlotTarget#reset(DragAndDrop.Source, DragAndDrop.Payload)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testReset() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   com.gdx.game.inventory.slot.InventorySlotTarget.reset(Source, Payload).
        //   The arrange section threw
        //   java.lang.NoClassDefFoundError: Could not initialize class com.gdx.game.manager.ResourceManager
        //       at com.gdx.game.inventory.slot.InventorySlot.<init>(InventorySlot.java:32)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlotTarget inventorySlotTarget = null;
        DragAndDrop.Source source = null;
        DragAndDrop.Payload payload = null;

        // Act
        inventorySlotTarget.reset(source, payload);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link InventorySlotTarget#drop(DragAndDrop.Source, DragAndDrop.Payload, float, float, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrop() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlotTarget inventorySlotTarget = null;
        DragAndDrop.Source source = null;
        DragAndDrop.Payload payload = null;
        float x = 0.0f;
        float y = 0.0f;
        int pointer = 0;

        // Act
        inventorySlotTarget.drop(source, payload, x, y, pointer);

        // Assert
        // TODO: Add assertions on result
    }
}
