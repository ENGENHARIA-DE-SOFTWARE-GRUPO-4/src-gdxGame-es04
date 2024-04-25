package com.gdx.game.inventory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.utils.DelayedRemovalArray;
import org.junit.jupiter.api.Test;

class InventoryItemDiffblueTest {
    /**
     * Method under test: {@link InventoryItem#isStackable()}
     */
    @Test
    void testIsStackable() {
        // Arrange, Act and Assert
        assertFalse((new InventoryItem()).isStackable());
        assertTrue(
                (new InventoryItem(new TextureRegion(), -1, InventoryItem.ItemTypeID.ARMOR01, 42, 42, 42)).isStackable());
    }

    /**
     * Method under test: {@link InventoryItem#isStackable()}
     */
    @Test
    void testIsStackable2() {
        // Arrange
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.addListener(mock(EventListener.class));

        // Act and Assert
        assertFalse(inventoryItem.isStackable());
    }

    /**
     * Method under test: {@link InventoryItem#isConsumable()}
     */
    @Test
    void testIsConsumable() {
        // Arrange, Act and Assert
        assertFalse((new InventoryItem()).isConsumable());
        assertTrue(
                (new InventoryItem(new TextureRegion(), 1, InventoryItem.ItemTypeID.ARMOR01, 42, 42, 42)).isConsumable());
    }

    /**
     * Method under test: {@link InventoryItem#isConsumable()}
     */
    @Test
    void testIsConsumable2() {
        // Arrange
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.addListener(mock(EventListener.class));

        // Act and Assert
        assertFalse(inventoryItem.isConsumable());
    }

    /**
     * Method under test: {@link InventoryItem#isSameItemType(InventoryItem)}
     */
    @Test
    void testIsSameItemType() {
        // Arrange
        InventoryItem inventoryItem = new InventoryItem();

        // Act and Assert
        assertTrue(inventoryItem.isSameItemType(new InventoryItem()));
    }

    /**
     * Method under test: {@link InventoryItem#isSameItemType(InventoryItem)}
     */
    @Test
    void testIsSameItemType2() {
        // Arrange
        InventoryItem inventoryItem = new InventoryItem(new TextureRegion(), 42, InventoryItem.ItemTypeID.ARMOR01, 42, 42,
                42);

        // Act and Assert
        assertFalse(inventoryItem.isSameItemType(new InventoryItem()));
    }

    /**
     * Method under test: {@link InventoryItem#isSameItemType(InventoryItem)}
     */
    @Test
    void testIsSameItemType3() {
        // Arrange
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.addListener(mock(EventListener.class));

        // Act and Assert
        assertTrue(inventoryItem.isSameItemType(new InventoryItem()));
    }

    /**
     * Method under test: {@link InventoryItem#doesRestoreHP(int)}
     */
    @Test
    void testDoesRestoreHP() {
        // Arrange, Act and Assert
        assertFalse(InventoryItem.doesRestoreHP(42));
        assertTrue(InventoryItem.doesRestoreHP(1));
    }

    /**
     * Method under test: {@link InventoryItem#doesRestoreMP(int)}
     */
    @Test
    void testDoesRestoreMP() {
        // Arrange, Act and Assert
        assertTrue(InventoryItem.doesRestoreMP(42));
        assertFalse(InventoryItem.doesRestoreMP(1));
    }

    /**
     * Method under test: {@link InventoryItem#getTradeValue()}
     */
    @Test
    void testGetTradeValue() {
        // Arrange, Act and Assert
        assertEquals(2, (new InventoryItem()).getTradeValue());
    }

    /**
     * Method under test: {@link InventoryItem#getTradeValue()}
     */
    @Test
    void testGetTradeValue2() {
        // Arrange
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.setItemValue(-1);

        // Act and Assert
        assertEquals(0, inventoryItem.getTradeValue());
    }

    /**
     * Method under test: {@link InventoryItem#getTradeValue()}
     */
    @Test
    void testGetTradeValue3() {
        // Arrange
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.addListener(mock(EventListener.class));

        // Act and Assert
        assertEquals(2, inventoryItem.getTradeValue());
    }

    /**
     * Method under test: {@link InventoryItem#isInventoryItemOffensiveWand()}
     */
    @Test
    void testIsInventoryItemOffensiveWand() {
        // Arrange, Act and Assert
        assertFalse((new InventoryItem()).isInventoryItemOffensiveWand());
        assertTrue((new InventoryItem(new TextureRegion(), 42, InventoryItem.ItemTypeID.ARMOR01, 42, 42, 42))
                .isInventoryItemOffensiveWand());
    }

    /**
     * Method under test: {@link InventoryItem#isInventoryItemOffensiveWand()}
     */
    @Test
    void testIsInventoryItemOffensiveWand2() {
        // Arrange
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.addListener(mock(EventListener.class));

        // Act and Assert
        assertFalse(inventoryItem.isInventoryItemOffensiveWand());
    }

    /**
     * Method under test: {@link InventoryItem#isInventoryItemOffensive()}
     */
    @Test
    void testIsInventoryItemOffensive() {
        // Arrange, Act and Assert
        assertFalse((new InventoryItem()).isInventoryItemOffensive());
        assertTrue((new InventoryItem(new TextureRegion(), 42, InventoryItem.ItemTypeID.ARMOR01, 42, 42, 42))
                .isInventoryItemOffensive());
    }

    /**
     * Method under test: {@link InventoryItem#isInventoryItemOffensive()}
     */
    @Test
    void testIsInventoryItemOffensive2() {
        // Arrange
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.addListener(mock(EventListener.class));

        // Act and Assert
        assertFalse(inventoryItem.isInventoryItemOffensive());
    }

    /**
     * Method under test: {@link InventoryItem#isInventoryItemDefensive()}
     */
    @Test
    void testIsInventoryItemDefensive() {
        // Arrange, Act and Assert
        assertFalse((new InventoryItem()).isInventoryItemDefensive());
        assertTrue((new InventoryItem(new TextureRegion(), 42, InventoryItem.ItemTypeID.ARMOR01, -1, 42, 42))
                .isInventoryItemDefensive());
    }

    /**
     * Method under test: {@link InventoryItem#isInventoryItemDefensive()}
     */
    @Test
    void testIsInventoryItemDefensive2() {
        // Arrange
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.addListener(mock(EventListener.class));

        // Act and Assert
        assertFalse(inventoryItem.isInventoryItemDefensive());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link InventoryItem#setItemAttributes(int)}
     *   <li>{@link InventoryItem#setItemShortDescription(String)}
     *   <li>{@link InventoryItem#setItemTypeID(InventoryItem.ItemTypeID)}
     *   <li>{@link InventoryItem#setItemUseType(int)}
     *   <li>{@link InventoryItem#setItemUseTypeValue(int)}
     *   <li>{@link InventoryItem#setItemValue(int)}
     *   <li>{@link InventoryItem#getItemAttributes()}
     *   <li>{@link InventoryItem#getItemShortDescription()}
     *   <li>{@link InventoryItem#getItemTypeID()}
     *   <li>{@link InventoryItem#getItemUseType()}
     *   <li>{@link InventoryItem#getItemUseTypeValue()}
     *   <li>{@link InventoryItem#getItemValue()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        InventoryItem inventoryItem = new InventoryItem();

        // Act
        inventoryItem.setItemAttributes(42);
        inventoryItem.setItemShortDescription("Item Short Description");
        inventoryItem.setItemTypeID(InventoryItem.ItemTypeID.ARMOR01);
        inventoryItem.setItemUseType(42);
        inventoryItem.setItemUseTypeValue(42);
        inventoryItem.setItemValue(42);
        int actualItemAttributes = inventoryItem.getItemAttributes();
        String actualItemShortDescription = inventoryItem.getItemShortDescription();
        InventoryItem.ItemTypeID actualItemTypeID = inventoryItem.getItemTypeID();
        int actualItemUseType = inventoryItem.getItemUseType();
        int actualItemUseTypeValue = inventoryItem.getItemUseTypeValue();

        // Assert that nothing has changed
        assertEquals("Item Short Description", actualItemShortDescription);
        assertEquals(42, actualItemAttributes);
        assertEquals(42, actualItemUseType);
        assertEquals(42, actualItemUseTypeValue);
        assertEquals(42, inventoryItem.getItemValue());
        assertEquals(InventoryItem.ItemTypeID.ARMOR01, actualItemTypeID);
    }

    /**
     * Method under test: {@link InventoryItem.ItemUseType#getValue()}
     */
    @Test
    void testItemUseTypeGetValue() {
        // Arrange, Act and Assert
        assertEquals(1, InventoryItem.ItemUseType.valueOf("ITEM_RESTORE_HEALTH").getValue());
    }

    /**
     * Method under test: {@link InventoryItem#InventoryItem()}
     */
    @Test
    void testNewInventoryItem() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem()).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test:
     * {@link InventoryItem#InventoryItem(TextureRegion, int, InventoryItem.ItemTypeID, int, int, int)}
     */
    @Test
    void testNewInventoryItem2() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(new TextureRegion(), 42,
                InventoryItem.ItemTypeID.ARMOR01, 42, 42, 42)).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test:
     * {@link InventoryItem#InventoryItem(TextureRegion, int, InventoryItem.ItemTypeID, int, int, int)}
     */
    @Test
    void testNewInventoryItem3() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(null, 1, InventoryItem.ItemTypeID.ARMOR01, 1, 1,
                1)).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test:
     * {@link InventoryItem#InventoryItem(TextureRegion, int, InventoryItem.ItemTypeID, int, int, int)}
     */
    @Test
    void testNewInventoryItem4() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(new TextureRegion(), 42,
                InventoryItem.ItemTypeID.ARMOR02, 42, 42, 42)).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test:
     * {@link InventoryItem#InventoryItem(TextureRegion, int, InventoryItem.ItemTypeID, int, int, int)}
     */
    @Test
    void testNewInventoryItem5() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(new TextureRegion(), 42,
                InventoryItem.ItemTypeID.ARMOR03, 42, 42, 42)).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test:
     * {@link InventoryItem#InventoryItem(TextureRegion, int, InventoryItem.ItemTypeID, int, int, int)}
     */
    @Test
    void testNewInventoryItem6() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(new TextureRegion(), 42,
                InventoryItem.ItemTypeID.ARMOR04, 42, 42, 42)).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test:
     * {@link InventoryItem#InventoryItem(TextureRegion, int, InventoryItem.ItemTypeID, int, int, int)}
     */
    @Test
    void testNewInventoryItem7() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(new TextureRegion(), 42,
                InventoryItem.ItemTypeID.ARMOR05, 42, 42, 42)).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test:
     * {@link InventoryItem#InventoryItem(TextureRegion, int, InventoryItem.ItemTypeID, int, int, int)}
     */
    @Test
    void testNewInventoryItem8() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(new TextureRegion(), 42,
                InventoryItem.ItemTypeID.BOOTS01, 42, 42, 42)).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test:
     * {@link InventoryItem#InventoryItem(TextureRegion, int, InventoryItem.ItemTypeID, int, int, int)}
     */
    @Test
    void testNewInventoryItem9() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(new TextureRegion(), 42,
                InventoryItem.ItemTypeID.BOOTS02, 42, 42, 42)).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test:
     * {@link InventoryItem#InventoryItem(TextureRegion, int, InventoryItem.ItemTypeID, int, int, int)}
     */
    @Test
    void testNewInventoryItem10() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(new TextureRegion(), 42,
                InventoryItem.ItemTypeID.BOOTS03, 42, 42, 42)).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test:
     * {@link InventoryItem#InventoryItem(TextureRegion, int, InventoryItem.ItemTypeID, int, int, int)}
     */
    @Test
    void testNewInventoryItem11() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(new TextureRegion(), 42,
                InventoryItem.ItemTypeID.BOOTS04, 42, 42, 42)).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test:
     * {@link InventoryItem#InventoryItem(TextureRegion, int, InventoryItem.ItemTypeID, int, int, int)}
     */
    @Test
    void testNewInventoryItem12() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(new TextureRegion(), 42,
                InventoryItem.ItemTypeID.BOOTS05, 42, 42, 42)).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test:
     * {@link InventoryItem#InventoryItem(TextureRegion, int, InventoryItem.ItemTypeID, int, int, int)}
     */
    @Test
    void testNewInventoryItem13() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(new TextureRegion(), 42,
                InventoryItem.ItemTypeID.HELMET01, 42, 42, 42)).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test:
     * {@link InventoryItem#InventoryItem(TextureRegion, int, InventoryItem.ItemTypeID, int, int, int)}
     */
    @Test
    void testNewInventoryItem14() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(new TextureRegion(), 42,
                InventoryItem.ItemTypeID.HELMET02, 42, 42, 42)).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test:
     * {@link InventoryItem#InventoryItem(TextureRegion, int, InventoryItem.ItemTypeID, int, int, int)}
     */
    @Test
    void testNewInventoryItem15() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(new TextureRegion(), 42,
                InventoryItem.ItemTypeID.HELMET03, 42, 42, 42)).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test:
     * {@link InventoryItem#InventoryItem(TextureRegion, int, InventoryItem.ItemTypeID, int, int, int)}
     */
    @Test
    void testNewInventoryItem16() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(new TextureRegion(), 42,
                InventoryItem.ItemTypeID.HELMET04, 42, 42, 42)).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test: {@link InventoryItem#InventoryItem(InventoryItem)}
     */
    @Test
    void testNewInventoryItem17() {
        // Arrange, Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(new InventoryItem())).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }

    /**
     * Method under test: {@link InventoryItem#InventoryItem(InventoryItem)}
     */
    @Test
    void testNewInventoryItem18() {
        // Arrange
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.addListener(mock(EventListener.class));

        // Act and Assert
        DelayedRemovalArray<EventListener> listeners = (new InventoryItem(inventoryItem)).getListeners();
        assertSame(listeners.shrink(), listeners.items);
    }
}
