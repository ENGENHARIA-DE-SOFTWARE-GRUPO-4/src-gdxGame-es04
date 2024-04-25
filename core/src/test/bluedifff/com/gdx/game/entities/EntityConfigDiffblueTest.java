package com.gdx.game.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import com.badlogic.gdx.math.GridPoint2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.IdentityMap;
import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.OrderedMap;
import com.badlogic.gdx.utils.Predicate;
import com.gdx.game.inventory.InventoryItem;
import org.junit.jupiter.api.Test;

class EntityConfigDiffblueTest {
    /**
     * Methods under test:
     * <ul>
     *   <li>
     * {@link EntityConfig.AnimationConfig#setAnimationType(Entity.AnimationType)}
     *   <li>{@link EntityConfig.AnimationConfig#setFrameDuration(float)}
     *   <li>{@link EntityConfig.AnimationConfig#setGridPoints(Array)}
     *   <li>{@link EntityConfig.AnimationConfig#setTexturePaths(Array)}
     *   <li>{@link EntityConfig.AnimationConfig#getAnimationType()}
     *   <li>{@link EntityConfig.AnimationConfig#getFrameDuration()}
     *   <li>{@link EntityConfig.AnimationConfig#getGridPoints()}
     *   <li>{@link EntityConfig.AnimationConfig#getTexturePaths()}
     * </ul>
     */
    @Test
    void testAnimationConfigGettersAndSetters() {
        // Arrange
        EntityConfig.AnimationConfig animationConfig = new EntityConfig.AnimationConfig();

        // Act
        animationConfig.setAnimationType(Entity.AnimationType.WALK_LEFT);
        animationConfig.setFrameDuration(10.0f);
        Array<GridPoint2> gridPoints = new Array<>();
        animationConfig.setGridPoints(gridPoints);
        Array<String> texturePaths = new Array<>();
        animationConfig.setTexturePaths(texturePaths);
        Entity.AnimationType actualAnimationType = animationConfig.getAnimationType();
        float actualFrameDuration = animationConfig.getFrameDuration();
        Array<GridPoint2> actualGridPoints = animationConfig.getGridPoints();

        // Assert that nothing has changed
        assertEquals(10.0f, actualFrameDuration);
        assertEquals(Entity.AnimationType.WALK_LEFT, actualAnimationType);
        assertSame(gridPoints, actualGridPoints);
        assertSame(texturePaths, animationConfig.getTexturePaths());
    }

    /**
     * Method under test: default or parameterless constructor of
     * {@link EntityConfig.AnimationConfig}
     */
    @Test
    void testAnimationConfigNewAnimationConfig() {
        // Arrange and Act
        EntityConfig.AnimationConfig actualAnimationConfig = new EntityConfig.AnimationConfig();

        // Assert
        Array<GridPoint2> gridPoints = actualAnimationConfig.getGridPoints();
        assertEquals(0, gridPoints.size);
        Array<String> texturePaths = actualAnimationConfig.getTexturePaths();
        assertEquals(0, texturePaths.size);
        assertEquals(1.0f, actualAnimationConfig.getFrameDuration());
        assertEquals(Entity.AnimationType.IDLE, actualAnimationConfig.getAnimationType());
        assertTrue(gridPoints.ordered);
        assertTrue(texturePaths.ordered);
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>default or parameterless constructor of {@link EntityConfig.Drop}
     *   <li>{@link EntityConfig.Drop#setItemTypeID(String)}
     *   <li>{@link EntityConfig.Drop#setProbability(float)}
     *   <li>{@link EntityConfig.Drop#getItemTypeID()}
     *   <li>{@link EntityConfig.Drop#getProbability()}
     * </ul>
     */
    @Test
    void testDropGettersAndSetters() {
        // Arrange and Act
        EntityConfig.Drop actualDrop = new EntityConfig.Drop();
        actualDrop.setItemTypeID("Item Type ID");
        actualDrop.setProbability(0.25f);
        String actualItemTypeID = actualDrop.getItemTypeID();

        // Assert that nothing has changed
        assertEquals("Item Type ID", actualItemTypeID);
        assertEquals(0.25f, actualDrop.getProbability());
    }

    /**
     * Method under test: {@link EntityConfig#setPropertyValue(String, String)}
     */
    @Test
    void testSetPropertyValue() {
        // Arrange
        EntityConfig entityConfig = new EntityConfig();

        // Act
        entityConfig.setPropertyValue("Key", "42");

        // Assert
        ObjectMap<String, String> entityProperties = entityConfig.getEntityProperties();
        assertEquals(1, entityProperties.size);
        assertTrue(entityProperties.iterator().hasNext());
    }

    /**
     * Method under test: {@link EntityConfig#setPropertyValue(String, String)}
     */
    @Test
    void testSetPropertyValue2() {
        // Arrange
        EntityConfig entityConfig = new EntityConfig();
        entityConfig.setEntityProperties(new IdentityMap<>());

        // Act
        entityConfig.setPropertyValue("Key", "42");

        // Assert
        ObjectMap<String, String> entityProperties = entityConfig.getEntityProperties();
        assertEquals(1, ((IdentityMap<String, String>) entityProperties).size);
        assertTrue(entityProperties.iterator().hasNext());
    }

    /**
     * Method under test: {@link EntityConfig#setPropertyValue(String, String)}
     */
    @Test
    void testSetPropertyValue3() {
        // Arrange
        OrderedMap<String, String> entityProperties = new OrderedMap<>();
        entityProperties.put("42", "Value");

        EntityConfig entityConfig = new EntityConfig();
        entityConfig.setEntityProperties(entityProperties);

        // Act
        entityConfig.setPropertyValue("Key", "42");

        // Assert
        assertEquals(2, ((OrderedMap<String, String>) entityConfig.getEntityProperties()).size);
    }

    /**
     * Method under test: {@link EntityConfig#setPropertyValue(String, String)}
     */
    @Test
    void testSetPropertyValue4() {
        // Arrange
        OrderedMap<String, String> entityProperties = new OrderedMap<>(1);
        entityProperties.put("42", "Value");

        EntityConfig entityConfig = new EntityConfig();
        entityConfig.setEntityProperties(entityProperties);

        // Act
        entityConfig.setPropertyValue("Key", "42");

        // Assert
        assertEquals(2, ((OrderedMap<String, String>) entityConfig.getEntityProperties()).size);
    }

    /**
     * Method under test: {@link EntityConfig#setPropertyValue(String, String)}
     */
    @Test
    void testSetPropertyValue5() {
        // Arrange
        OrderedMap<String, String> entityProperties = new OrderedMap<>(1);
        entityProperties.put("", "42");
        entityProperties.put("42", "Value");

        EntityConfig entityConfig = new EntityConfig();
        entityConfig.setEntityProperties(entityProperties);

        // Act
        entityConfig.setPropertyValue("Key", "42");

        // Assert
        assertEquals(3, ((OrderedMap<String, String>) entityConfig.getEntityProperties()).size);
    }

    /**
     * Method under test: {@link EntityConfig#setPropertyValue(String, String)}
     */
    @Test
    void testSetPropertyValue6() {
        // Arrange
        OrderedMap<String, String> entityProperties = new OrderedMap<>(1);
        entityProperties.put("42", "Value");

        EntityConfig entityConfig = new EntityConfig();
        entityConfig.setEntityProperties(entityProperties);

        // Act
        entityConfig.setPropertyValue("", "42");

        // Assert
        assertEquals(2, ((OrderedMap<String, String>) entityConfig.getEntityProperties()).size);
    }

    /**
     * Method under test: {@link EntityConfig#setPropertyValue(String, String)}
     */
    @Test
    void testSetPropertyValue7() {
        // Arrange
        IdentityMap<String, String> entityProperties = new IdentityMap<>(1);
        entityProperties.putAll(new ObjectMap<>());

        EntityConfig entityConfig = new EntityConfig();
        entityConfig.setEntityProperties(entityProperties);

        // Act
        entityConfig.setPropertyValue("Key", "42");

        // Assert
        ObjectMap<String, String> entityProperties2 = entityConfig.getEntityProperties();
        assertEquals(1, ((IdentityMap<String, String>) entityProperties2).size);
        assertTrue(entityProperties2.iterator().hasNext());
    }

    /**
     * Method under test: {@link EntityConfig#getPropertyValue(String)}
     */
    @Test
    void testGetPropertyValue() {
        // Arrange, Act and Assert
        assertEquals("", (new EntityConfig()).getPropertyValue("Key"));
    }

    /**
     * Method under test: {@link EntityConfig#getPropertyValue(String)}
     */
    @Test
    void testGetPropertyValue2() {
        // Arrange
        EntityConfig entityConfig = new EntityConfig();
        entityConfig.setEntityProperties(new IdentityMap<>());

        // Act and Assert
        assertEquals("", entityConfig.getPropertyValue("Key"));
    }

    /**
     * Method under test: {@link EntityConfig#getPropertyValue(String)}
     */
    @Test
    void testGetPropertyValue3() {
        // Arrange
        IdentityMap<String, String> entityProperties = new IdentityMap<>();
        entityProperties.put("Key", "Value");

        EntityConfig entityConfig = new EntityConfig();
        entityConfig.setEntityProperties(entityProperties);

        // Act and Assert
        assertEquals("Value", entityConfig.getPropertyValue("Key"));
    }

    /**
     * Method under test: {@link EntityConfig#getPropertyValue(String)}
     */
    @Test
    void testGetPropertyValue4() {
        // Arrange
        ObjectMap<String, String> entityProperties = new ObjectMap<>();
        entityProperties.put("Key", "Value");

        EntityConfig entityConfig = new EntityConfig();
        entityConfig.setEntityProperties(entityProperties);

        // Act and Assert
        assertEquals("Value", entityConfig.getPropertyValue("Key"));
    }

    /**
     * Method under test:
     * {@link EntityConfig#addAnimationConfig(EntityConfig.AnimationConfig)}
     */
    @Test
    void testAddAnimationConfig() {
        // Arrange
        EntityConfig entityConfig = new EntityConfig();

        EntityConfig.AnimationConfig animationConfig = new EntityConfig.AnimationConfig();
        animationConfig.setAnimationType(Entity.AnimationType.WALK_LEFT);
        animationConfig.setFrameDuration(10.0f);
        animationConfig.setGridPoints(new Array<>());
        animationConfig.setTexturePaths(new Array<>());

        // Act
        entityConfig.addAnimationConfig(animationConfig);

        // Assert
        Array<EntityConfig.AnimationConfig> animationConfig2 = entityConfig.getAnimationConfig();
        assertEquals(1, animationConfig2.size);
        assertSame(animationConfig, animationConfig2.first());
    }

    /**
     * Method under test:
     * {@link EntityConfig#addAnimationConfig(EntityConfig.AnimationConfig)}
     */
    @Test
    void testAddAnimationConfig2() {
        // Arrange
        EntityConfig entityConfig = new EntityConfig();

        Array<GridPoint2> gridPoints = new Array<>();
        gridPoints.select(mock(Predicate.class));

        EntityConfig.AnimationConfig animationConfig = new EntityConfig.AnimationConfig();
        animationConfig.setAnimationType(Entity.AnimationType.WALK_LEFT);
        animationConfig.setFrameDuration(10.0f);
        animationConfig.setGridPoints(gridPoints);
        animationConfig.setTexturePaths(new Array<>());

        // Act
        entityConfig.addAnimationConfig(animationConfig);

        // Assert
        Array<EntityConfig.AnimationConfig> animationConfig2 = entityConfig.getAnimationConfig();
        assertEquals(1, animationConfig2.size);
        assertSame(animationConfig, animationConfig2.first());
    }

    /**
     * Method under test: {@link EntityConfig#addDrop(EntityConfig.Drop)}
     */
    @Test
    void testAddDrop() {
        // Arrange
        EntityConfig entityConfig = new EntityConfig();

        EntityConfig.Drop drop = new EntityConfig.Drop();
        drop.setItemTypeID("Item Type ID");
        drop.setProbability(0.25f);

        // Act
        entityConfig.addDrop(drop);

        // Assert
        Array<EntityConfig.Drop> drops = entityConfig.getDrops();
        assertEquals(1, drops.size);
        assertSame(drop, drops.first());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link EntityConfig#setClassTreePath(String)}
     *   <li>{@link EntityConfig#setConversationConfigPath(String)}
     *   <li>{@link EntityConfig#setCurrentQuestID(String)}
     *   <li>{@link EntityConfig#setDirection(Entity.Direction)}
     *   <li>{@link EntityConfig#setEntityID(String)}
     *   <li>{@link EntityConfig#setEntityProperties(ObjectMap)}
     *   <li>{@link EntityConfig#setEntityStatus(String)}
     *   <li>{@link EntityConfig#setInventory(Array)}
     *   <li>{@link EntityConfig#setItemTypeID(String)}
     *   <li>{@link EntityConfig#setQuestConfigPath(String)}
     *   <li>{@link EntityConfig#setResumeConfigPath(String)}
     *   <li>{@link EntityConfig#setState(Entity.State)}
     *   <li>{@link EntityConfig#getAnimationConfig()}
     *   <li>{@link EntityConfig#getClassTreePath()}
     *   <li>{@link EntityConfig#getConversationConfigPath()}
     *   <li>{@link EntityConfig#getCurrentQuestID()}
     *   <li>{@link EntityConfig#getDirection()}
     *   <li>{@link EntityConfig#getDrops()}
     *   <li>{@link EntityConfig#getEntityID()}
     *   <li>{@link EntityConfig#getEntityProperties()}
     *   <li>{@link EntityConfig#getEntityStatus()}
     *   <li>{@link EntityConfig#getInventory()}
     *   <li>{@link EntityConfig#getItemTypeID()}
     *   <li>{@link EntityConfig#getQuestConfigPath()}
     *   <li>{@link EntityConfig#getResumeConfigPath()}
     *   <li>{@link EntityConfig#getState()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        EntityConfig entityConfig = new EntityConfig();

        // Act
        entityConfig.setClassTreePath("Class Tree Path");
        entityConfig.setConversationConfigPath("Conversation Config Path");
        entityConfig.setCurrentQuestID("Current Quest ID");
        entityConfig.setDirection(Entity.Direction.UP);
        entityConfig.setEntityID("Entity ID");
        ObjectMap<String, String> entityProperties = new ObjectMap<>();
        entityConfig.setEntityProperties(entityProperties);
        entityConfig.setEntityStatus("Entity Status");
        Array<InventoryItem.ItemTypeID> inventory = new Array<>();
        entityConfig.setInventory(inventory);
        entityConfig.setItemTypeID("Item Type ID");
        entityConfig.setQuestConfigPath("Quest Config Path");
        entityConfig.setResumeConfigPath("Resume Config Path");
        entityConfig.setState(Entity.State.IDLE);
        Array<EntityConfig.AnimationConfig> actualAnimationConfig = entityConfig.getAnimationConfig();
        String actualClassTreePath = entityConfig.getClassTreePath();
        String actualConversationConfigPath = entityConfig.getConversationConfigPath();
        String actualCurrentQuestID = entityConfig.getCurrentQuestID();
        Entity.Direction actualDirection = entityConfig.getDirection();
        Array<EntityConfig.Drop> actualDrops = entityConfig.getDrops();
        String actualEntityID = entityConfig.getEntityID();
        ObjectMap<String, String> actualEntityProperties = entityConfig.getEntityProperties();
        String actualEntityStatus = entityConfig.getEntityStatus();
        Array<InventoryItem.ItemTypeID> actualInventory = entityConfig.getInventory();
        String actualItemTypeID = entityConfig.getItemTypeID();
        String actualQuestConfigPath = entityConfig.getQuestConfigPath();
        String actualResumeConfigPath = entityConfig.getResumeConfigPath();

        // Assert that nothing has changed
        assertEquals("Class Tree Path", actualClassTreePath);
        assertEquals("Conversation Config Path", actualConversationConfigPath);
        assertEquals("Current Quest ID", actualCurrentQuestID);
        assertEquals("Entity ID", actualEntityID);
        assertEquals("Entity Status", actualEntityStatus);
        assertEquals("Item Type ID", actualItemTypeID);
        assertEquals("Quest Config Path", actualQuestConfigPath);
        assertEquals("Resume Config Path", actualResumeConfigPath);
        assertEquals(Entity.Direction.UP, actualDirection);
        assertEquals(Entity.State.IDLE, entityConfig.getState());
        assertEquals(inventory, actualAnimationConfig);
        assertEquals(inventory, actualDrops);
        assertSame(inventory, actualInventory);
        assertSame(entityProperties, actualEntityProperties);
    }

    /**
     * Method under test: {@link EntityConfig#EntityConfig()}
     */
    @Test
    void testNewEntityConfig() {
        // Arrange and Act
        EntityConfig actualEntityConfig = new EntityConfig();

        // Assert
        Array<EntityConfig.AnimationConfig> animationConfig = actualEntityConfig.getAnimationConfig();
        assertEquals(0, animationConfig.size);
        Array<EntityConfig.Drop> drops = actualEntityConfig.getDrops();
        assertEquals(0, drops.size);
        Array<InventoryItem.ItemTypeID> inventory = actualEntityConfig.getInventory();
        assertEquals(0, inventory.size);
        ObjectMap<String, String> entityProperties = actualEntityConfig.getEntityProperties();
        assertEquals(0, entityProperties.size);
        assertEquals(Entity.Direction.DOWN, actualEntityConfig.getDirection());
        assertEquals(Entity.State.IDLE, actualEntityConfig.getState());
        assertFalse(entityProperties.iterator().hasNext());
        assertTrue(animationConfig.ordered);
        assertTrue(drops.ordered);
        assertTrue(inventory.ordered);
    }

    /**
     * Method under test: {@link EntityConfig#EntityConfig(EntityConfig)}
     */
    @Test
    void testNewEntityConfig2() {
        // Arrange and Act
        EntityConfig actualEntityConfig = new EntityConfig(new EntityConfig());

        // Assert
        assertNull(actualEntityConfig.getClassTreePath());
        assertNull(actualEntityConfig.getConversationConfigPath());
        assertNull(actualEntityConfig.getCurrentQuestID());
        assertNull(actualEntityConfig.getEntityID());
        assertNull(actualEntityConfig.getEntityStatus());
        assertNull(actualEntityConfig.getItemTypeID());
        assertNull(actualEntityConfig.getQuestConfigPath());
        assertNull(actualEntityConfig.getResumeConfigPath());
        Array<EntityConfig.AnimationConfig> animationConfig = actualEntityConfig.getAnimationConfig();
        assertEquals(0, animationConfig.size);
        Array<EntityConfig.Drop> drops = actualEntityConfig.getDrops();
        assertEquals(0, drops.size);
        Array<InventoryItem.ItemTypeID> inventory = actualEntityConfig.getInventory();
        assertEquals(0, inventory.size);
        ObjectMap<String, String> entityProperties = actualEntityConfig.getEntityProperties();
        assertEquals(0, entityProperties.size);
        assertEquals(Entity.Direction.DOWN, actualEntityConfig.getDirection());
        assertEquals(Entity.State.IDLE, actualEntityConfig.getState());
        assertFalse(entityProperties.iterator().hasNext());
        assertTrue(animationConfig.ordered);
        assertTrue(drops.ordered);
        assertTrue(inventory.ordered);
    }

    /**
     * Method under test: {@link EntityConfig#EntityConfig(EntityConfig)}
     */
    @Test
    void testNewEntityConfig3() {
        // Arrange
        ObjectMap<String, String> entityProperties = new ObjectMap<>();
        entityProperties.put("Key", "42");

        EntityConfig config = new EntityConfig();
        config.setEntityProperties(entityProperties);

        // Act
        EntityConfig actualEntityConfig = new EntityConfig(config);

        // Assert
        assertNull(actualEntityConfig.getClassTreePath());
        assertNull(actualEntityConfig.getConversationConfigPath());
        assertNull(actualEntityConfig.getCurrentQuestID());
        assertNull(actualEntityConfig.getEntityID());
        assertNull(actualEntityConfig.getEntityStatus());
        assertNull(actualEntityConfig.getItemTypeID());
        assertNull(actualEntityConfig.getQuestConfigPath());
        assertNull(actualEntityConfig.getResumeConfigPath());
        Array<EntityConfig.AnimationConfig> animationConfig = actualEntityConfig.getAnimationConfig();
        assertEquals(0, animationConfig.size);
        Array<EntityConfig.Drop> drops = actualEntityConfig.getDrops();
        assertEquals(0, drops.size);
        Array<InventoryItem.ItemTypeID> inventory = actualEntityConfig.getInventory();
        assertEquals(0, inventory.size);
        ObjectMap<String, String> entityProperties2 = actualEntityConfig.getEntityProperties();
        assertEquals(1, entityProperties2.size);
        assertEquals(Entity.Direction.DOWN, actualEntityConfig.getDirection());
        assertEquals(Entity.State.IDLE, actualEntityConfig.getState());
        assertTrue(entityProperties2.iterator().hasNext());
        assertTrue(animationConfig.ordered);
        assertTrue(drops.ordered);
        assertTrue(inventory.ordered);
        assertEquals(entityProperties, entityProperties2);
    }

    /**
     * Method under test: {@link EntityConfig#EntityConfig(EntityConfig)}
     */
    @Test
    void testNewEntityConfig4() {
        // Arrange
        Array<GridPoint2> gridPoints = new Array<>();
        gridPoints.select(mock(Predicate.class));

        EntityConfig.AnimationConfig animationConfig = new EntityConfig.AnimationConfig();
        animationConfig.setAnimationType(Entity.AnimationType.WALK_LEFT);
        animationConfig.setFrameDuration(10.0f);
        animationConfig.setGridPoints(gridPoints);
        animationConfig.setTexturePaths(new Array<>());

        EntityConfig config = new EntityConfig();
        config.addAnimationConfig(animationConfig);

        // Act
        EntityConfig actualEntityConfig = new EntityConfig(config);

        // Assert
        assertNull(actualEntityConfig.getClassTreePath());
        assertNull(actualEntityConfig.getConversationConfigPath());
        assertNull(actualEntityConfig.getCurrentQuestID());
        assertNull(actualEntityConfig.getEntityID());
        assertNull(actualEntityConfig.getEntityStatus());
        assertNull(actualEntityConfig.getItemTypeID());
        assertNull(actualEntityConfig.getQuestConfigPath());
        assertNull(actualEntityConfig.getResumeConfigPath());
        Array<EntityConfig.Drop> drops = actualEntityConfig.getDrops();
        assertEquals(0, drops.size);
        Array<InventoryItem.ItemTypeID> inventory = actualEntityConfig.getInventory();
        assertEquals(0, inventory.size);
        ObjectMap<String, String> entityProperties = actualEntityConfig.getEntityProperties();
        assertEquals(0, entityProperties.size);
        Array<EntityConfig.AnimationConfig> animationConfig2 = actualEntityConfig.getAnimationConfig();
        assertEquals(1, animationConfig2.size);
        assertEquals(Entity.AnimationType.WALK_LEFT, animationConfig2.random().getAnimationType());
        assertEquals(Entity.Direction.DOWN, actualEntityConfig.getDirection());
        assertEquals(Entity.State.IDLE, actualEntityConfig.getState());
        assertFalse(entityProperties.iterator().hasNext());
        assertTrue(animationConfig2.ordered);
        assertTrue(drops.ordered);
        assertTrue(inventory.ordered);
        assertEquals(gridPoints, drops);
        assertEquals(gridPoints, inventory);
    }
}
