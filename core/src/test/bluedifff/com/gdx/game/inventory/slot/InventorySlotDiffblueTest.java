package com.gdx.game.inventory.slot;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Array;
import com.gdx.game.inventory.InventoryItem;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class InventorySlotDiffblueTest {
    /**
     * Method under test: {@link InventorySlot#decrementItemCount(boolean)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDecrementItemCount() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;
        boolean sendRemoveNotification = false;

        // Act
        inventorySlot.decrementItemCount(sendRemoveNotification);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlot#incrementItemCount(boolean)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIncrementItemCount() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;
        boolean sendAddNotification = false;

        // Act
        inventorySlot.incrementItemCount(sendAddNotification);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlot#add(Actor)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAdd() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;
        Actor actor = null;

        // Act
        inventorySlot.add(actor);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlot#add(Array)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAdd2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;
        Array<Actor> array = null;

        // Act
        inventorySlot.add(array);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlot#remove(Actor)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemove() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;
        Actor actor = null;

        // Act
        inventorySlot.remove(actor);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlot#getAllInventoryItems()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllInventoryItems() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;

        // Act
        Array<Actor> actualAllInventoryItems = inventorySlot.getAllInventoryItems();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlot#updateAllInventoryItemNames(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateAllInventoryItemNames() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;
        String name = "";

        // Act
        inventorySlot.updateAllInventoryItemNames(name);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link InventorySlot#removeAllInventoryItemsWithName(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveAllInventoryItemsWithName() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;
        String name = "";

        // Act
        inventorySlot.removeAllInventoryItemsWithName(name);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlot#clearAllInventoryItems(boolean)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testClearAllInventoryItems() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;
        boolean sendRemoveNotifications = false;

        // Act
        inventorySlot.clearAllInventoryItems(sendRemoveNotifications);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlot#hasItem()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testHasItem() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;

        // Act
        boolean actualHasItemResult = inventorySlot.hasItem();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlot#getNumItems()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetNumItems() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;

        // Act
        int actualNumItems = inventorySlot.getNumItems();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlot#getNumItems(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetNumItems2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;
        String name = "";

        // Act
        int actualNumItems = inventorySlot.getNumItems(name);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlot#doesAcceptItemUseType(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDoesAcceptItemUseType() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;
        int itemUseType = 0;

        // Act
        boolean actualDoesAcceptItemUseTypeResult = inventorySlot.doesAcceptItemUseType(itemUseType);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlot#getTopInventoryItem()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTopInventoryItem() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;

        // Act
        InventoryItem actualTopInventoryItem = inventorySlot.getTopInventoryItem();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link InventorySlot#swapSlots(InventorySlot, InventorySlot, InventoryItem)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSwapSlots() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlotSource = null;
        InventorySlot inventorySlotTarget = null;
        InventoryItem dragActor = null;

        // Act
        InventorySlot.swapSlots(inventorySlotSource, inventorySlotTarget, dragActor);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlot#addObserver(InventorySlotObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddObserver() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;
        InventorySlotObserver slotObserver = null;

        // Act
        inventorySlot.addObserver(slotObserver);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link InventorySlot#removeObserver(InventorySlotObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveObserver() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;
        InventorySlotObserver slotObserver = null;

        // Act
        inventorySlot.removeObserver(slotObserver);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlot#removeAllObservers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveAllObservers() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;

        // Act
        inventorySlot.removeAllObservers();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link InventorySlot#notify(InventorySlot, InventorySlotObserver.SlotEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNotify() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        InventorySlot inventorySlot = null;
        InventorySlot slot = null;
        InventorySlotObserver.SlotEvent event = InventorySlotObserver.SlotEvent.ADDED_ITEM;

        // Act
        inventorySlot.notify(slot, event);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlot#InventorySlot()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNewInventorySlot() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        // TODO: Populate arranged inputs
        InventorySlot actualInventorySlot = new InventorySlot();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InventorySlot#InventorySlot(int, Image)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNewInventorySlot2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        int filterItemType = 0;
        Image customBackgroundDecal = null;

        // Act
        InventorySlot actualInventorySlot = new InventorySlot(filterItemType, customBackgroundDecal);

        // Assert
        // TODO: Add assertions on result
    }
}
