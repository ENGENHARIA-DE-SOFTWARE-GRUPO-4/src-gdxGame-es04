package com.gdx.game.inventory.store;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.Array;
import com.gdx.game.inventory.InventoryItemLocation;
import com.gdx.game.inventory.slot.InventorySlot;
import com.gdx.game.inventory.slot.InventorySlotObserver;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StoreInventoryUIDiffblueTest {
    /**
     * Method under test: {@link StoreInventoryUI#loadPlayerInventory(Array)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLoadPlayerInventory() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StoreInventoryUI storeInventoryUI = null;
        Array<InventoryItemLocation> playerInventoryItems = null;

        // Act
        storeInventoryUI.loadPlayerInventory(playerInventoryItems);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreInventoryUI#loadStoreInventory(Array)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLoadStoreInventory() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StoreInventoryUI storeInventoryUI = null;
        Array<InventoryItemLocation> storeInventoryItems = null;

        // Act
        storeInventoryUI.loadStoreInventory(storeInventoryItems);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreInventoryUI#savePlayerInventory()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSavePlayerInventory() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StoreInventoryUI storeInventoryUI = null;

        // Act
        storeInventoryUI.savePlayerInventory();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreInventoryUI#cleanupStoreInventory()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCleanupStoreInventory() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StoreInventoryUI storeInventoryUI = null;

        // Act
        storeInventoryUI.cleanupStoreInventory();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link StoreInventoryUI#onNotify(InventorySlot, InventorySlotObserver.SlotEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOnNotify() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StoreInventoryUI storeInventoryUI = null;
        InventorySlot slot = null;
        InventorySlotObserver.SlotEvent event = InventorySlotObserver.SlotEvent.ADDED_ITEM;

        // Act
        storeInventoryUI.onNotify(slot, event);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreInventoryUI#checkButtonStates()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCheckButtonStates() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StoreInventoryUI storeInventoryUI = null;

        // Act
        storeInventoryUI.checkButtonStates();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreInventoryUI#setPlayerGP(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetPlayerGP() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StoreInventoryUI storeInventoryUI = null;
        int value = 0;

        // Act
        storeInventoryUI.setPlayerGP(value);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link StoreInventoryUI#addObserver(StoreInventoryObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddObserver() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StoreInventoryUI storeInventoryUI = null;
        StoreInventoryObserver storeObserver = null;

        // Act
        storeInventoryUI.addObserver(storeObserver);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link StoreInventoryUI#removeObserver(StoreInventoryObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveObserver() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StoreInventoryUI storeInventoryUI = null;
        StoreInventoryObserver storeObserver = null;

        // Act
        storeInventoryUI.removeObserver(storeObserver);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreInventoryUI#removeAllObservers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveAllObservers() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StoreInventoryUI storeInventoryUI = null;

        // Act
        storeInventoryUI.removeAllObservers();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link StoreInventoryUI#notify(String, StoreInventoryObserver.StoreInventoryEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNotify() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StoreInventoryUI storeInventoryUI = null;
        String value = "";
        StoreInventoryObserver.StoreInventoryEvent event = StoreInventoryObserver.StoreInventoryEvent.PLAYER_GP_TOTAL_UPDATED;

        // Act
        storeInventoryUI.notify(value, event);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link StoreInventoryUI#getCloseButton()}
     *   <li>{@link StoreInventoryUI#getInventoryActors()}
     *   <li>{@link StoreInventoryUI#getInventorySlotTable()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGettersAndSetters() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   com.gdx.game.inventory.store.StoreInventoryUI.getCloseButton().
        //   The arrange section threw
        //   java.lang.NoClassDefFoundError: Could not initialize class com.gdx.game.manager.ResourceManager
        //       at com.gdx.game.inventory.store.StoreInventoryUI.<init>(StoreInventoryUI.java:66)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreInventoryUI storeInventoryUI = null;

        // Act
        TextButton actualCloseButton = storeInventoryUI.getCloseButton();
        Array<Actor> actualInventoryActors = storeInventoryUI.getInventoryActors();
        Table actualInventorySlotTable = storeInventoryUI.getInventorySlotTable();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: default or parameterless constructor of
     * {@link StoreInventoryUI}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNewStoreInventoryUI() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        // TODO: Populate arranged inputs
        StoreInventoryUI actualStoreInventoryUI = new StoreInventoryUI();

        // Assert
        // TODO: Add assertions on result
    }
}
