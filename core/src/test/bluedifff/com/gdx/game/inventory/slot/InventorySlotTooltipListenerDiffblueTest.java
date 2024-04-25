package com.gdx.game.inventory.slot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.anyBoolean;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class InventorySlotTooltipListenerDiffblueTest {
    /**
     * Method under test:
     * {@link InventorySlotTooltipListener#mouseMoved(InputEvent, float, float)}
     */
    @Test
    void testMouseMoved() {
        // Arrange
        InventorySlotTooltipListener inventorySlotTooltipListener = new InventorySlotTooltipListener(null);

        // Act and Assert
        assertFalse(inventorySlotTooltipListener.mouseMoved(new InputEvent(), 10.0f, 10.0f));
    }

    /**
     * Method under test:
     * {@link InventorySlotTooltipListener#touchDragged(InputEvent, float, float, int)}
     */
    @Test
    void testTouchDragged() {
        // Arrange
        InventorySlotTooltip toolTip = mock(InventorySlotTooltip.class);
        doNothing().when(toolTip).setVisible(Mockito.<InventorySlot>any(), anyBoolean());
        InventorySlotTooltipListener inventorySlotTooltipListener = new InventorySlotTooltipListener(toolTip);
        InputEvent event = new InputEvent();

        // Act
        inventorySlotTooltipListener.touchDragged(event, 10.0f, 10.0f, 1);

        // Assert that nothing has changed
        verify(toolTip).setVisible(isNull(), eq(false));
        assertEquals('\u0000', event.getCharacter());
        assertEquals(0, event.getButton());
        assertEquals(0, event.getKeyCode());
        assertEquals(0, event.getPointer());
        assertEquals(0.0f, event.getScrollAmountX());
        assertEquals(0.0f, event.getScrollAmountY());
        assertEquals(0.0f, event.getStageX());
        assertEquals(0.0f, event.getStageY());
        assertFalse(event.isCancelled());
        assertFalse(event.isCapture());
        assertFalse(event.isHandled());
        assertFalse(event.isStopped());
        assertTrue(event.getBubbles());
        assertTrue(event.getTouchFocus());
    }

    /**
     * Method under test:
     * {@link InventorySlotTooltipListener#touchDown(InputEvent, float, float, int, int)}
     */
    @Test
    void testTouchDown() {
        // Arrange
        InventorySlotTooltipListener inventorySlotTooltipListener = new InventorySlotTooltipListener(null);

        // Act and Assert
        assertTrue(inventorySlotTooltipListener.touchDown(new InputEvent(), 10.0f, 10.0f, 1, 1));
    }

    /**
     * Method under test:
     * {@link InventorySlotTooltipListener#enter(InputEvent, float, float, int, Actor)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEnter() {
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
        InventorySlotTooltipListener inventorySlotTooltipListener = new InventorySlotTooltipListener(
                new InventorySlotTooltip(new Skin()));
        InputEvent event = new InputEvent();

        // Act
        inventorySlotTooltipListener.enter(event, 10.0f, 10.0f, 1, new Actor());
    }

    /**
     * Method under test:
     * {@link InventorySlotTooltipListener#exit(InputEvent, float, float, int, Actor)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExit() {
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
        InventorySlotTooltipListener inventorySlotTooltipListener = new InventorySlotTooltipListener(
                new InventorySlotTooltip(new Skin()));
        InputEvent event = new InputEvent();

        // Act
        inventorySlotTooltipListener.exit(event, 10.0f, 10.0f, 1, new Actor());
    }

    /**
     * Method under test:
     * {@link InventorySlotTooltipListener#InventorySlotTooltipListener(InventorySlotTooltip)}
     */
    @Test
    void testNewInventorySlotTooltipListener() {
        // Arrange, Act and Assert
        assertFalse((new InventorySlotTooltipListener(null)).handle(null));
    }
}
