package com.gdx.game.battle;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Cell;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.DragAndDrop;
import com.badlogic.gdx.utils.Array;
import com.gdx.game.GdxRunner;
import com.gdx.game.inventory.InventoryItem;
import com.gdx.game.inventory.InventoryItemFactory;
import com.gdx.game.inventory.InventoryItemLocation;
import com.gdx.game.inventory.slot.InventorySlot;
import com.gdx.game.manager.ResourceManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(GdxRunner.class)
public class BattleInventoryUITest {

    @BeforeEach
    void init() {
        Gdx.gl = mock(GL20.class);
        Gdx.gl20 = mock(GL20.class);
        new ResourceManager();
    }

    @Test
    public void testBattleInventoryUI_ShouldSucceed() {
        BattleInventoryUI battleInventoryUI = new BattleInventoryUI();

        assertThat(battleInventoryUI).isNotNull();
        assertThat(battleInventoryUI.getChildren().size).isEqualTo(2);
        assertThat(Arrays.stream(battleInventoryUI.getChildren().items).count()).isEqualTo(4);
    }

    @Test
    public void testHandleLayoutInventorySlot_ShouldAddCorrectNumberOfSlots() {
        BattleInventoryUI battleInventoryUI = new BattleInventoryUI();

        assertThat(battleInventoryUI.getInventorySlotTable().getChildren().size).isEqualTo(BattleInventoryUI.NUM_SLOTS);
    }

    @Test
    public void testDoesInventoryHaveSpace_WhenInventoryIsEmpty_ShouldReturnTrue() {
        BattleInventoryUI battleInventoryUI = new BattleInventoryUI();

        assertThat(battleInventoryUI.doesInventoryHaveSpace()).isTrue();
    }

    @Test
    public void testAddEntityToInventory_ShouldAddItemToInventory() {
        BattleInventoryUI battleInventoryUI = new BattleInventoryUI();

        battleInventoryUI.addEntityToInventory("WEAPON01", "Sword");


        InventorySlot inventorySlot = (InventorySlot) battleInventoryUI.getInventorySlotTable().getCells().get(0).getActor();
        assertThat(inventorySlot.getNumItems()).isEqualTo(1);
        assertThat(inventorySlot.getTopInventoryItem().getName()).isEqualTo("Sword");
    }

    @Test
    public void testAddEntityToInventory_ShouldAddItemToFirstEmptySlot() {
        BattleInventoryUI battleInventoryUI = new BattleInventoryUI();

        assertThat(battleInventoryUI.doesInventoryHaveSpace()).isTrue();

        battleInventoryUI.addEntityToInventory("WEAPON01", "Sword");

        InventorySlot firstSlot = (InventorySlot) battleInventoryUI.getInventorySlotTable().getCells().get(0).getActor();
        assertThat(firstSlot.getNumItems()).isEqualTo(1);
        assertThat(firstSlot.getTopInventoryItem().getName()).isEqualTo("Sword");
    }

    @Test
    public void testSetInventoryItemNames_ShouldUpdateAllItemNamesInInventory() {
        BattleInventoryUI battleInventoryUI = new BattleInventoryUI();
        Table targetTable = battleInventoryUI.getInventorySlotTable();
        String newName = "NewName";

        for (Cell cell : targetTable.getCells()) {
            InventorySlot inventorySlot = (InventorySlot) cell.getActor();
            if (inventorySlot != null) {
                inventorySlot.add(new InventoryItem());
            }
        }

        BattleInventoryUI.setInventoryItemNames(targetTable, newName);

        for (Cell cell : targetTable.getCells()) {
            InventorySlot inventorySlot = (InventorySlot) cell.getActor();
            if (inventorySlot != null) {
                assertThat(inventorySlot.getTopInventoryItem().getName()).isEqualTo(newName);
            }
        }
    }

    @Test
    public void testClearInventoryItems_ShouldRemoveAllItemsFromInventory() {
        BattleInventoryUI battleInventoryUI = new BattleInventoryUI();
        Table targetTable = battleInventoryUI.getInventorySlotTable();

        for (Cell cell : targetTable.getCells()) {
            InventorySlot inventorySlot = (InventorySlot) cell.getActor();
            if (inventorySlot != null) {
                inventorySlot.add(new InventoryItem());
            }
        }

        BattleInventoryUI.clearInventoryItems(targetTable);

        for (Cell cell : targetTable.getCells()) {
            InventorySlot inventorySlot = (InventorySlot) cell.getActor();
            if (inventorySlot != null) {
                assertThat(inventorySlot.getNumItems()).isZero();
            }
        }
    }
}