package com.gdx.game.quest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.badlogic.gdx.utils.IdentityMap;
import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.OrderedMap;
import org.junit.jupiter.api.Test;

class QuestTaskDiffblueTest {
    /**
     * Method under test: {@link QuestTask#isTaskComplete()}
     */
    @Test
    void testIsTaskComplete() {
        // Arrange
        QuestTask questTask = new QuestTask();

        // Act
        boolean actualIsTaskCompleteResult = questTask.isTaskComplete();

        // Assert
        ObjectMap<String, Object> taskProperties = questTask.getTaskProperties();
        assertEquals(1, taskProperties.size);
        assertFalse(actualIsTaskCompleteResult);
        assertTrue(taskProperties.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#isTaskComplete()}
     */
    @Test
    void testIsTaskComplete2() {
        // Arrange
        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(new IdentityMap<>());

        // Act
        boolean actualIsTaskCompleteResult = questTask.isTaskComplete();

        // Assert
        ObjectMap<String, Object> taskProperties = questTask.getTaskProperties();
        assertEquals(1, ((IdentityMap<String, Object>) taskProperties).size);
        assertFalse(actualIsTaskCompleteResult);
        assertTrue(taskProperties.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#isTaskComplete()}
     */
    @Test
    void testIsTaskComplete3() {
        // Arrange
        OrderedMap<String, Object> taskProperties = new OrderedMap<>();
        taskProperties.put("Key", "Value");

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        boolean actualIsTaskCompleteResult = questTask.isTaskComplete();

        // Assert
        assertEquals(2, ((OrderedMap<String, Object>) questTask.getTaskProperties()).size);
        assertFalse(actualIsTaskCompleteResult);
    }

    /**
     * Method under test: {@link QuestTask#isTaskComplete()}
     */
    @Test
    void testIsTaskComplete4() {
        // Arrange
        IdentityMap<String, Object> taskProperties = new IdentityMap<>(1);
        taskProperties.putAll(new ObjectMap<>());

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        boolean actualIsTaskCompleteResult = questTask.isTaskComplete();

        // Assert
        ObjectMap<String, Object> taskProperties2 = questTask.getTaskProperties();
        assertEquals(1, ((IdentityMap<String, Object>) taskProperties2).size);
        assertFalse(actualIsTaskCompleteResult);
        assertTrue(taskProperties2.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#isTaskComplete()}
     */
    @Test
    void testIsTaskComplete5() {
        // Arrange
        ObjectMap<String, Object> taskProperties = new ObjectMap<>(1);
        taskProperties.putAll(new ObjectMap<>());

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        boolean actualIsTaskCompleteResult = questTask.isTaskComplete();

        // Assert
        ObjectMap<String, Object> taskProperties2 = questTask.getTaskProperties();
        assertEquals(1, taskProperties2.size);
        assertFalse(actualIsTaskCompleteResult);
        assertTrue(taskProperties2.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#isTaskComplete()}
     */
    @Test
    void testIsTaskComplete6() {
        // Arrange
        OrderedMap<String, Object> taskProperties = new OrderedMap<>(1);
        taskProperties.putAll(new ObjectMap<>());

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        boolean actualIsTaskCompleteResult = questTask.isTaskComplete();

        // Assert
        assertEquals(1, ((OrderedMap<String, Object>) questTask.getTaskProperties()).size);
        assertFalse(actualIsTaskCompleteResult);
    }

    /**
     * Method under test: {@link QuestTask#isTaskComplete()}
     */
    @Test
    void testIsTaskComplete7() {
        // Arrange
        ObjectMap<String, Object> taskProperties = new ObjectMap<>(1);
        taskProperties.put("42", "Value");
        taskProperties.put(Boolean.FALSE.toString(), "Value");
        taskProperties.putAll(new ObjectMap<>());

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        boolean actualIsTaskCompleteResult = questTask.isTaskComplete();

        // Assert
        ObjectMap<String, Object> taskProperties2 = questTask.getTaskProperties();
        assertEquals(3, taskProperties2.size);
        assertFalse(actualIsTaskCompleteResult);
        assertTrue(taskProperties2.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#setTaskComplete()}
     */
    @Test
    void testSetTaskComplete() {
        // Arrange
        QuestTask questTask = new QuestTask();

        // Act
        questTask.setTaskComplete();

        // Assert
        ObjectMap<String, Object> taskProperties = questTask.getTaskProperties();
        assertEquals(1, taskProperties.size);
        assertTrue(taskProperties.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#setTaskComplete()}
     */
    @Test
    void testSetTaskComplete2() {
        // Arrange
        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(new IdentityMap<>());

        // Act
        questTask.setTaskComplete();

        // Assert
        ObjectMap<String, Object> taskProperties = questTask.getTaskProperties();
        assertEquals(1, ((IdentityMap<String, Object>) taskProperties).size);
        assertTrue(taskProperties.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#setTaskComplete()}
     */
    @Test
    void testSetTaskComplete3() {
        // Arrange
        OrderedMap<String, Object> taskProperties = new OrderedMap<>();
        taskProperties.put("Key", "Value");

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        questTask.setTaskComplete();

        // Assert
        assertEquals(2, ((OrderedMap<String, Object>) questTask.getTaskProperties()).size);
    }

    /**
     * Method under test: {@link QuestTask#setTaskComplete()}
     */
    @Test
    void testSetTaskComplete4() {
        // Arrange
        IdentityMap<String, Object> taskProperties = new IdentityMap<>(1);
        taskProperties.putAll(new ObjectMap<>());

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        questTask.setTaskComplete();

        // Assert
        ObjectMap<String, Object> taskProperties2 = questTask.getTaskProperties();
        assertEquals(1, ((IdentityMap<String, Object>) taskProperties2).size);
        assertTrue(taskProperties2.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#setTaskComplete()}
     */
    @Test
    void testSetTaskComplete5() {
        // Arrange
        ObjectMap<String, Object> taskProperties = new ObjectMap<>(1);
        taskProperties.putAll(new ObjectMap<>());

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        questTask.setTaskComplete();

        // Assert
        ObjectMap<String, Object> taskProperties2 = questTask.getTaskProperties();
        assertEquals(1, taskProperties2.size);
        assertTrue(taskProperties2.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#setTaskComplete()}
     */
    @Test
    void testSetTaskComplete6() {
        // Arrange
        OrderedMap<String, Object> taskProperties = new OrderedMap<>(1);
        taskProperties.putAll(new ObjectMap<>());

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        questTask.setTaskComplete();

        // Assert
        assertEquals(1, ((OrderedMap<String, Object>) questTask.getTaskProperties()).size);
    }

    /**
     * Method under test: {@link QuestTask#setTaskComplete()}
     */
    @Test
    void testSetTaskComplete7() {
        // Arrange
        ObjectMap<? extends String, ?> map = new ObjectMap<>();
        map.put("Key", "Value");
        map.put(Boolean.TRUE.toString(), "Value");

        IdentityMap<String, Object> taskProperties = new IdentityMap<>(1);
        taskProperties.putAll(map);

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        questTask.setTaskComplete();

        // Assert
        ObjectMap<String, Object> taskProperties2 = questTask.getTaskProperties();
        assertEquals(3, ((IdentityMap<String, Object>) taskProperties2).size);
        assertTrue(taskProperties2.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#setTaskComplete()}
     */
    @Test
    void testSetTaskComplete8() {
        // Arrange
        ObjectMap<? extends String, ?> map = new ObjectMap<>();
        map.put("", "Value");
        map.put("42", "Value");

        OrderedMap<String, Object> taskProperties = new OrderedMap<>(1);
        taskProperties.putAll(map);

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        questTask.setTaskComplete();

        // Assert
        assertEquals(3, ((OrderedMap<String, Object>) questTask.getTaskProperties()).size);
    }

    /**
     * Method under test: {@link QuestTask#resetAllProperties()}
     */
    @Test
    void testResetAllProperties() {
        // Arrange
        QuestTask questTask = new QuestTask();

        // Act
        questTask.resetAllProperties();

        // Assert
        ObjectMap<String, Object> taskProperties = questTask.getTaskProperties();
        assertEquals(1, taskProperties.size);
        assertTrue(taskProperties.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#resetAllProperties()}
     */
    @Test
    void testResetAllProperties2() {
        // Arrange
        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(new IdentityMap<>());

        // Act
        questTask.resetAllProperties();

        // Assert
        ObjectMap<String, Object> taskProperties = questTask.getTaskProperties();
        assertEquals(1, ((IdentityMap<String, Object>) taskProperties).size);
        assertTrue(taskProperties.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#resetAllProperties()}
     */
    @Test
    void testResetAllProperties3() {
        // Arrange
        OrderedMap<String, Object> taskProperties = new OrderedMap<>();
        taskProperties.put("Key", "Value");

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        questTask.resetAllProperties();

        // Assert
        assertEquals(2, ((OrderedMap<String, Object>) questTask.getTaskProperties()).size);
    }

    /**
     * Method under test: {@link QuestTask#resetAllProperties()}
     */
    @Test
    void testResetAllProperties4() {
        // Arrange
        IdentityMap<String, Object> taskProperties = new IdentityMap<>(1);
        taskProperties.putAll(new ObjectMap<>());

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        questTask.resetAllProperties();

        // Assert
        ObjectMap<String, Object> taskProperties2 = questTask.getTaskProperties();
        assertEquals(1, ((IdentityMap<String, Object>) taskProperties2).size);
        assertTrue(taskProperties2.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#resetAllProperties()}
     */
    @Test
    void testResetAllProperties5() {
        // Arrange
        ObjectMap<String, Object> taskProperties = new ObjectMap<>(1);
        taskProperties.putAll(new ObjectMap<>());

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        questTask.resetAllProperties();

        // Assert
        ObjectMap<String, Object> taskProperties2 = questTask.getTaskProperties();
        assertEquals(1, taskProperties2.size);
        assertTrue(taskProperties2.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#resetAllProperties()}
     */
    @Test
    void testResetAllProperties6() {
        // Arrange
        OrderedMap<String, Object> taskProperties = new OrderedMap<>(1);
        taskProperties.putAll(new ObjectMap<>());

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        questTask.resetAllProperties();

        // Assert
        assertEquals(1, ((OrderedMap<String, Object>) questTask.getTaskProperties()).size);
    }

    /**
     * Method under test: {@link QuestTask#resetAllProperties()}
     */
    @Test
    void testResetAllProperties7() {
        // Arrange
        ObjectMap<String, Object> taskProperties = new ObjectMap<>(1);
        taskProperties.put("42", "Value");
        taskProperties.put(Boolean.FALSE.toString(), "Value");
        taskProperties.putAll(new ObjectMap<>());

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        questTask.resetAllProperties();

        // Assert
        ObjectMap<String, Object> taskProperties2 = questTask.getTaskProperties();
        assertEquals(3, taskProperties2.size);
        assertTrue(taskProperties2.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#setPropertyValue(String, String)}
     */
    @Test
    void testSetPropertyValue() {
        // Arrange
        QuestTask questTask = new QuestTask();

        // Act
        questTask.setPropertyValue("Key", "42");

        // Assert
        ObjectMap<String, Object> taskProperties = questTask.getTaskProperties();
        assertEquals(1, taskProperties.size);
        assertTrue(taskProperties.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#setPropertyValue(String, String)}
     */
    @Test
    void testSetPropertyValue2() {
        // Arrange
        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(new IdentityMap<>());

        // Act
        questTask.setPropertyValue("Key", "42");

        // Assert
        ObjectMap<String, Object> taskProperties = questTask.getTaskProperties();
        assertEquals(1, ((IdentityMap<String, Object>) taskProperties).size);
        assertTrue(taskProperties.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#setPropertyValue(String, String)}
     */
    @Test
    void testSetPropertyValue3() {
        // Arrange
        IdentityMap<String, Object> taskProperties = new IdentityMap<>(1);
        taskProperties.putAll(new ObjectMap<>());

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        questTask.setPropertyValue("Key", "42");

        // Assert
        ObjectMap<String, Object> taskProperties2 = questTask.getTaskProperties();
        assertEquals(1, ((IdentityMap<String, Object>) taskProperties2).size);
        assertTrue(taskProperties2.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#setPropertyValue(String, String)}
     */
    @Test
    void testSetPropertyValue4() {
        // Arrange
        ObjectMap<String, Object> taskProperties = new ObjectMap<>(1);
        taskProperties.putAll(new ObjectMap<>());

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        questTask.setPropertyValue("Key", "42");

        // Assert
        ObjectMap<String, Object> taskProperties2 = questTask.getTaskProperties();
        assertEquals(1, taskProperties2.size);
        assertTrue(taskProperties2.iterator().hasNext());
    }

    /**
     * Method under test: {@link QuestTask#setPropertyValue(String, String)}
     */
    @Test
    void testSetPropertyValue5() {
        // Arrange
        OrderedMap<String, Object> taskProperties = new OrderedMap<>(1);
        taskProperties.putAll(new ObjectMap<>());

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act
        questTask.setPropertyValue("Key", "42");

        // Assert
        assertEquals(1, ((OrderedMap<String, Object>) questTask.getTaskProperties()).size);
    }

    /**
     * Method under test: {@link QuestTask#getPropertyValue(String)}
     */
    @Test
    void testGetPropertyValue() {
        // Arrange, Act and Assert
        assertEquals("", (new QuestTask()).getPropertyValue("Key"));
    }

    /**
     * Method under test: {@link QuestTask#getPropertyValue(String)}
     */
    @Test
    void testGetPropertyValue2() {
        // Arrange
        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(new IdentityMap<>());

        // Act and Assert
        assertEquals("", questTask.getPropertyValue("Key"));
    }

    /**
     * Method under test: {@link QuestTask#getPropertyValue(String)}
     */
    @Test
    void testGetPropertyValue3() {
        // Arrange
        IdentityMap<String, Object> taskProperties = new IdentityMap<>();
        taskProperties.put("Key", "Value");

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act and Assert
        assertEquals("Value", questTask.getPropertyValue("Key"));
    }

    /**
     * Method under test: {@link QuestTask#getPropertyValue(String)}
     */
    @Test
    void testGetPropertyValue4() {
        // Arrange
        ObjectMap<String, Object> taskProperties = new ObjectMap<>();
        taskProperties.put("Key", "Value");

        QuestTask questTask = new QuestTask();
        questTask.setTaskProperties(taskProperties);

        // Act and Assert
        assertEquals("Value", questTask.getPropertyValue("Key"));
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link QuestTask#setId(String)}
     *   <li>{@link QuestTask#setQuestType(QuestTask.QuestType)}
     *   <li>{@link QuestTask#setTaskPhrase(String)}
     *   <li>{@link QuestTask#setTaskProperties(ObjectMap)}
     *   <li>{@link QuestTask#getId()}
     *   <li>{@link QuestTask#getQuestType()}
     *   <li>{@link QuestTask#getTaskPhrase()}
     *   <li>{@link QuestTask#getTaskProperties()}
     *   <li>{@link QuestTask#toString()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        QuestTask questTask = new QuestTask();

        // Act
        questTask.setId("42");
        questTask.setQuestType(QuestTask.QuestType.FETCH);
        questTask.setTaskPhrase("Task Phrase");
        ObjectMap<String, Object> taskProperties = new ObjectMap<>();
        questTask.setTaskProperties(taskProperties);
        String actualId = questTask.getId();
        QuestTask.QuestType actualQuestType = questTask.getQuestType();
        String actualTaskPhrase = questTask.getTaskPhrase();
        ObjectMap<String, Object> actualTaskProperties = questTask.getTaskProperties();

        // Assert that nothing has changed
        assertEquals("42", actualId);
        assertEquals("Task Phrase", actualTaskPhrase);
        assertEquals("Task Phrase", questTask.toString());
        assertEquals(QuestTask.QuestType.FETCH, actualQuestType);
        assertSame(taskProperties, actualTaskProperties);
    }

    /**
     * Method under test: default or parameterless constructor of {@link QuestTask}
     */
    @Test
    void testNewQuestTask() {
        // Arrange, Act and Assert
        ObjectMap<String, Object> taskProperties = (new QuestTask()).getTaskProperties();
        assertEquals(0, taskProperties.size);
        assertFalse(taskProperties.iterator().hasNext());
    }
}
