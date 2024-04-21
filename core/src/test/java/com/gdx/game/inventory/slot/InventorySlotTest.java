package com.gdx.game.inventory.slot;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Stack;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.gdx.game.GdxRunner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;

@ExtendWith(GdxRunner.class)
public class InventorySlotTest {

    @BeforeEach
    void init() {
        Gdx.gl = mock(GL20.class);
        Gdx.gl20 = mock(GL20.class);
    }

    @Test
    public void testInventorySlot_ShouldSucceed() {
        InventorySlot inventorySlot = new InventorySlot();

        assertThat(inventorySlot).isNotNull();
        assertThat(inventorySlot.hasItem()).isFalse();
    }

    @Test
    void testHasItem_SlotWithOneItem() {
        InventorySlot inventorySlot = new InventorySlot();
        Actor actor = new Actor();
        inventorySlot.add(actor);
        
        boolean hasItem = inventorySlot.hasItem();

        assertTrue(hasItem);
    }

    @Test
    void testHasItem_SlotWithItems() {
        InventorySlot inventorySlot = new InventorySlot();
        Actor actor = new Actor();
        Actor anotherActor = new Actor();

        inventorySlot.add(actor);
        inventorySlot.add(anotherActor);

        boolean hasItem = inventorySlot.hasItem();

        assertTrue(hasItem);
    }

    @Test
    void testHasItem_EmptySlot() {
        InventorySlot inventorySlot = new InventorySlot();
        
        boolean hasItem = inventorySlot.hasItem();

        assertFalse(hasItem);
    }

    @Test
    void testAdd_ValidActor() {
        InventorySlot inventorySlot = new InventorySlot();
        int initialItemCount = inventorySlot.getNumItems();

        Actor actor = new Actor();
        inventorySlot.add(actor);
        
        String labelText = inventorySlot.getNumItemsLabel().getText().toString();
        int itemCountAfterAdd = Integer.parseInt(labelText);

        assertEquals(initialItemCount + 1, inventorySlot.getNumItemsVal());
        assertEquals(initialItemCount + 1, itemCountAfterAdd);
    }

    @Test
    void testAdd_DefaultBackground() {
        InventorySlot inventorySlot = new InventorySlot();
        int initialItemCount = inventorySlot.getNumItems();

        Stack defaultBackground = inventorySlot.getDefaultBackground();
        inventorySlot.add(defaultBackground);
        
        String labelText = inventorySlot.getNumItemsLabel().getText().toString();
        int itemCountAfterAdd = Integer.parseInt(labelText);

        assertEquals(initialItemCount, inventorySlot.getNumItemsVal());
        assertEquals(initialItemCount, itemCountAfterAdd);
    }

    @Test
    void testAdd_NumItemsLabel() {
        InventorySlot inventorySlot = new InventorySlot();
        int initialItemCount = inventorySlot.getNumItems();
        
        Label numItemsLabel = inventorySlot.getNumItemsLabel();
        inventorySlot.add(numItemsLabel);

        String labelText = inventorySlot.getNumItemsLabel().getText().toString();
        int itemCountAfterAdd = Integer.parseInt(labelText);

        assertEquals(initialItemCount, inventorySlot.getNumItemsVal());
        assertEquals(initialItemCount, itemCountAfterAdd);
    }

    @Test
    void testAdd_NumItemsLabelNull() {
        InventorySlot inventorySlot = new InventorySlot();
        inventorySlot.setNumItemsLabel(null);

        assertNull(inventorySlot.getNumItemsLabel());

        int initialItemCount = inventorySlot.getNumItems();
        
        Actor actor = new Actor();
        inventorySlot.add(actor);

        assertEquals(initialItemCount, inventorySlot.getNumItemsVal());
    }

    @Test
    void testRemove_ExistingActor() {
        InventorySlot inventorySlot = new InventorySlot();
        Actor actor = new Actor();
        inventorySlot.add(actor);
        int initialItemCount = inventorySlot.getNumItems();

        inventorySlot.remove(actor);
        
        String labelText = inventorySlot.getNumItemsLabel().getText().toString();
        int itemCountAfterRemove = Integer.parseInt(labelText);

        assertEquals(initialItemCount - 1, inventorySlot.getNumItemsVal());
        assertEquals(initialItemCount - 1, itemCountAfterRemove);
    }

    @Test
    void testRemove_DefaultBackground() {
        InventorySlot inventorySlot = new InventorySlot();
        int initialItemCount = inventorySlot.getNumItems();
        
        Stack defaultBackground = inventorySlot.getDefaultBackground();
        inventorySlot.remove(defaultBackground);
        
        String labelText = inventorySlot.getNumItemsLabel().getText().toString();
        int itemCountAfterRemove = Integer.parseInt(labelText);

        assertEquals(initialItemCount, inventorySlot.getNumItemsVal());
        assertEquals(initialItemCount, itemCountAfterRemove);
    }

    @Test
    void testRemove_NumItemsLabel() {
        InventorySlot inventorySlot = new InventorySlot();
        Actor actor = inventorySlot.getNumItemsLabel();
        inventorySlot.add(actor);
        int initialItemCount = inventorySlot.getNumItems();
        
        inventorySlot.remove(actor);

        String labelText = inventorySlot.getNumItemsLabel().getText().toString();
        int itemCountAfterRemove = Integer.parseInt(labelText);

        assertEquals(initialItemCount, inventorySlot.getNumItemsVal());
        assertEquals(initialItemCount, itemCountAfterRemove);
    }

    @Test
    void testRemove_NumItemsLabelNull() {
        InventorySlot inventorySlot = new InventorySlot();
        inventorySlot.setNumItemsLabel(null);
        Actor actor = new Actor();
        int initialItemCount = inventorySlot.getNumItems();

        assertNull(inventorySlot.getNumItemsLabel());

        inventorySlot.remove(actor);

        assertEquals(initialItemCount, inventorySlot.getNumItems());
    }

    @Test
    void testIncrementItemCount_ItemExists() {
        InventorySlot inventorySlot = new InventorySlot();
        int initialItemCount = inventorySlot.getNumItems();

        inventorySlot.incrementItemCount(false);

        String labelText = inventorySlot.getNumItemsLabel().getText().toString();
        int itemCountAfterIncrement = Integer.parseInt(labelText);

        assertEquals(initialItemCount + 1, inventorySlot.getNumItemsVal());
        assertEquals(initialItemCount + 1, itemCountAfterIncrement);
    }

    @Test
    void testIncrementItemCount_NotificationEnabled() {
        InventorySlot inventorySlot = new InventorySlot();
        TestObserver observer = new TestObserver();
        inventorySlot.addObserver(observer);
        
        inventorySlot.incrementItemCount(true);
        
        assertTrue(observer.isNotified());
    }

    @Test
    void testIncrementItemCount_NotificationDisabled() {
        InventorySlot inventorySlot = new InventorySlot();
        TestObserver observer = new TestObserver();
        inventorySlot.addObserver(observer);
        
        inventorySlot.incrementItemCount(false);
        
        assertFalse(observer.isNotified());
    }

    @Test
    void testDecrementItemCount_ItemExists() {
        InventorySlot inventorySlot = new InventorySlot();
        Actor actor = new Actor();
        inventorySlot.add(actor);
        int initialItemCount = inventorySlot.getNumItems();

        inventorySlot.decrementItemCount(false);

        String labelText = inventorySlot.getNumItemsLabel().getText().toString();
        int itemCountAfterDecrement = Integer.parseInt(labelText);

        assertEquals(initialItemCount - 1, inventorySlot.getNumItemsVal());
        assertEquals(initialItemCount - 1, itemCountAfterDecrement);
    }

    @Test
    void testDecrementItemCount_NotificationEnabled() {
        InventorySlot inventorySlot = new InventorySlot();
        TestObserver observer = new TestObserver();
        inventorySlot.addObserver(observer);
        
        inventorySlot.decrementItemCount(true);
        
        assertTrue(observer.isNotified());
    }

    @Test
    void testDecrementItemCount_NotificationDisabled() {
        InventorySlot inventorySlot = new InventorySlot();
        TestObserver observer = new TestObserver();
        inventorySlot.addObserver(observer);
        
        inventorySlot.decrementItemCount(false);
        
        assertFalse(observer.isNotified());
    }
}

class TestObserver implements InventorySlotObserver {
    private boolean notified = false;
    
    @Override
    public void onNotify(final InventorySlot slot, final SlotEvent event) {
        notified = true;
    }

    public boolean isNotified() {
        return notified;
    }
}