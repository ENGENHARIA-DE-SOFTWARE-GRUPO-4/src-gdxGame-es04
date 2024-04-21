package com.gdx.game.inventory.slot;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.gdx.game.GdxRunner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
    public void testHasItem_SlotWithItems() {
        InventorySlot inventorySlot = new InventorySlot();
        Actor mockAtor = new Actor();
        inventorySlot.add(mockAtor);
        
        boolean hasItem = inventorySlot.hasItem();

        assertTrue(hasItem);
    }

    @Test
    public void testHasItem_EmptySlot() {
        InventorySlot inventorySlot = new InventorySlot();
        
        boolean hasItem = inventorySlot.hasItem();

        assertFalse(hasItem);
    }
}
