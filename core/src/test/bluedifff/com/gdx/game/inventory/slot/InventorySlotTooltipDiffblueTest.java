package com.gdx.game.inventory.slot;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class InventorySlotTooltipDiffblueTest {
    /**
     * Method under test: {@link InventorySlotTooltip#InventorySlotTooltip(Skin)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNewInventorySlotTooltip() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle registered with name: default
        //       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:162)
        //       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:147)
        //       at com.badlogic.gdx.scenes.scene2d.ui.Window.<init>(Window.java:57)
        //       at com.gdx.game.inventory.slot.InventorySlotTooltip.<init>(InventorySlotTooltip.java:14)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        new InventorySlotTooltip(new Skin());
    }

    /**
     * Method under test:
     * {@link InventorySlotTooltip#setVisible(InventorySlot, boolean)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetVisible() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle registered with name: default
        //       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:162)
        //       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:147)
        //       at com.badlogic.gdx.scenes.scene2d.ui.Window.<init>(Window.java:57)
        //       at com.gdx.game.inventory.slot.InventorySlotTooltip.<init>(InventorySlotTooltip.java:14)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        InventorySlotTooltip inventorySlotTooltip = new InventorySlotTooltip(new Skin());

        // Act
        inventorySlotTooltip.setVisible(new InventorySlot(), true);
    }

    /**
     * Method under test:
     * {@link InventorySlotTooltip#updateDescription(InventorySlot)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateDescription() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle registered with name: default
        //       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:162)
        //       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:147)
        //       at com.badlogic.gdx.scenes.scene2d.ui.Window.<init>(Window.java:57)
        //       at com.gdx.game.inventory.slot.InventorySlotTooltip.<init>(InventorySlotTooltip.java:14)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        InventorySlotTooltip inventorySlotTooltip = new InventorySlotTooltip(new Skin());

        // Act
        inventorySlotTooltip.updateDescription(new InventorySlot());
    }
}
