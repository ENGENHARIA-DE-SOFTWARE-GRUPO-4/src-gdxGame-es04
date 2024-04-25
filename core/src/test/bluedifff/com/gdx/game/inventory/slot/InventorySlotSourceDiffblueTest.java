package com.gdx.game.inventory.slot;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.DragAndDrop;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class InventorySlotSourceDiffblueTest {
    /**
     * Method under test:
     * {@link InventorySlotSource#dragStart(InputEvent, float, float, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDragStart() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlotSource inventorySlotSource = null;
        InputEvent event = null;
        float x = 0.0f;
        float y = 0.0f;
        int pointer = 0;

        // Act
        DragAndDrop.Payload actualDragStartResult = inventorySlotSource.dragStart(event, x, y, pointer);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link InventorySlotSource#dragStop(InputEvent, float, float, int, DragAndDrop.Payload, DragAndDrop.Target)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDragStop() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlotSource inventorySlotSource = null;
        InputEvent event = null;
        float x = 0.0f;
        float y = 0.0f;
        int pointer = 0;
        DragAndDrop.Payload payload = null;
        DragAndDrop.Target target = null;

        // Act
        inventorySlotSource.dragStop(event, x, y, pointer, payload, target);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlotSource#getSourceSlot()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSourceSlot() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   com.gdx.game.inventory.slot.InventorySlotSource.getSourceSlot().
        //   The arrange section threw
        //   java.lang.NoClassDefFoundError: Could not initialize class com.gdx.game.manager.ResourceManager
        //       at com.gdx.game.inventory.slot.InventorySlot.<init>(InventorySlot.java:32)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlotSource inventorySlotSource = null;

        // Act
        InventorySlot actualSourceSlot = inventorySlotSource.getSourceSlot();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link InventorySlotSource#InventorySlotSource(InventorySlot, DragAndDrop)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNewInventorySlotSource() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot sourceSlot = null;
        DragAndDrop dragAndDrop = null;

        // Act
        InventorySlotSource actualInventorySlotSource = new InventorySlotSource(sourceSlot, dragAndDrop);

        // Assert
        // TODO: Add assertions on result
    }
}
