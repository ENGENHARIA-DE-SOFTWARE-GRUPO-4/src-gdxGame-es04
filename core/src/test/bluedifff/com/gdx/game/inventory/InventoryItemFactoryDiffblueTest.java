package com.gdx.game.inventory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class InventoryItemFactoryDiffblueTest {
    /**
     * Method under test: {@link InventoryItemFactory#getInstance()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetInstance() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.internal(String)" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.inventory.InventoryItemFactory.<init>(InventoryItemFactory.java:32)
        //       at com.gdx.game.inventory.InventoryItemFactory.getInstance(InventoryItemFactory.java:25)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        InventoryItemFactory.getInstance();
    }

    /**
     * Method under test:
     * {@link InventoryItemFactory#getInventoryItem(InventoryItem.ItemTypeID)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetInventoryItem() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.internal(String)" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.inventory.InventoryItemFactory.<init>(InventoryItemFactory.java:32)
        //       at com.gdx.game.inventory.InventoryItemFactory.getInstance(InventoryItemFactory.java:25)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        InventoryItemFactory.getInstance().getInventoryItem(InventoryItem.ItemTypeID.ARMOR01);
    }
}
