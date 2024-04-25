package com.gdx.game.inventory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class InventoryItemLocationDiffblueTest {
    /**
     * Methods under test:
     * <ul>
     *   <li>{@link InventoryItemLocation#InventoryItemLocation()}
     *   <li>{@link InventoryItemLocation#setItemNameProperty(String)}
     *   <li>{@link InventoryItemLocation#setItemTypeAtLocation(String)}
     *   <li>{@link InventoryItemLocation#setLocationIndex(int)}
     *   <li>{@link InventoryItemLocation#setNumberItemsAtLocation(int)}
     *   <li>{@link InventoryItemLocation#getItemNameProperty()}
     *   <li>{@link InventoryItemLocation#getItemTypeAtLocation()}
     *   <li>{@link InventoryItemLocation#getLocationIndex()}
     *   <li>{@link InventoryItemLocation#getNumberItemsAtLocation()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        InventoryItemLocation actualInventoryItemLocation = new InventoryItemLocation();
        actualInventoryItemLocation.setItemNameProperty("Item Name Property");
        actualInventoryItemLocation.setItemTypeAtLocation("Item Type At Location");
        actualInventoryItemLocation.setLocationIndex(1);
        actualInventoryItemLocation.setNumberItemsAtLocation(10);
        String actualItemNameProperty = actualInventoryItemLocation.getItemNameProperty();
        String actualItemTypeAtLocation = actualInventoryItemLocation.getItemTypeAtLocation();
        int actualLocationIndex = actualInventoryItemLocation.getLocationIndex();

        // Assert that nothing has changed
        assertEquals("Item Name Property", actualItemNameProperty);
        assertEquals("Item Type At Location", actualItemTypeAtLocation);
        assertEquals(1, actualLocationIndex);
        assertEquals(10, actualInventoryItemLocation.getNumberItemsAtLocation());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>
     * {@link InventoryItemLocation#InventoryItemLocation(int, String, int, String)}
     *   <li>{@link InventoryItemLocation#setItemNameProperty(String)}
     *   <li>{@link InventoryItemLocation#setItemTypeAtLocation(String)}
     *   <li>{@link InventoryItemLocation#setLocationIndex(int)}
     *   <li>{@link InventoryItemLocation#setNumberItemsAtLocation(int)}
     *   <li>{@link InventoryItemLocation#getItemNameProperty()}
     *   <li>{@link InventoryItemLocation#getItemTypeAtLocation()}
     *   <li>{@link InventoryItemLocation#getLocationIndex()}
     *   <li>{@link InventoryItemLocation#getNumberItemsAtLocation()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        InventoryItemLocation actualInventoryItemLocation = new InventoryItemLocation(1, "Item Type At Location", 10,
                "Item Name Property");
        actualInventoryItemLocation.setItemNameProperty("Item Name Property");
        actualInventoryItemLocation.setItemTypeAtLocation("Item Type At Location");
        actualInventoryItemLocation.setLocationIndex(1);
        actualInventoryItemLocation.setNumberItemsAtLocation(10);
        String actualItemNameProperty = actualInventoryItemLocation.getItemNameProperty();
        String actualItemTypeAtLocation = actualInventoryItemLocation.getItemTypeAtLocation();
        int actualLocationIndex = actualInventoryItemLocation.getLocationIndex();

        // Assert that nothing has changed
        assertEquals("Item Name Property", actualItemNameProperty);
        assertEquals("Item Type At Location", actualItemTypeAtLocation);
        assertEquals(1, actualLocationIndex);
        assertEquals(10, actualInventoryItemLocation.getNumberItemsAtLocation());
    }
}
