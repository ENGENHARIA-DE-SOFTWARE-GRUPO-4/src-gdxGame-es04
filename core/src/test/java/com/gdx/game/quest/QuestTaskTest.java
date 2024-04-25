package com.gdx.game.quest;

import com.badlogic.gdx.utils.ObjectMap;
import com.gdx.game.GdxRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(GdxRunner.class)
public class QuestTaskTest {

    private QuestTask questTask;

    @BeforeEach
    public void setup() {
        questTask = new QuestTask();
    }

    @AfterEach
    public void tearDown() {
        questTask = null;
    }

    @Test
    public void testIsTaskComplete_ShouldSucceed() {
        ObjectMap<String, Object> taskProperties = questTask.getTaskProperties();
        taskProperties.put(QuestTask.QuestTaskPropertyType.IS_TASK_COMPLETE.toString(), true);

        boolean isQuestTaskComplete = questTask.isTaskComplete();

        assertThat(isQuestTaskComplete).isTrue();
    }

    @Test
    public void testIsTaskComplete_ShouldSucceedReturnFalse() {
        boolean isQuestTaskComplete = questTask.isTaskComplete();
        assertThat(isQuestTaskComplete).isFalse();
    }

    @Test
    public void testGetPropertyValue_ShouldSucceed() {
        ObjectMap<String, Object> taskProperties = questTask.getTaskProperties();
        taskProperties.put(QuestTask.QuestTaskPropertyType.IS_TASK_COMPLETE.toString(), true);
        String propertyValue = questTask.getPropertyValue(QuestTask.QuestTaskPropertyType.IS_TASK_COMPLETE.toString());
        assertThat(propertyValue).isEqualTo("true");
    }

    @Test
    public void testGetPropertyValue_ShouldSucceedWhenNullValue() {
        ObjectMap<String, Object> taskProperties = questTask.getTaskProperties();
        taskProperties.put(QuestTask.QuestTaskPropertyType.IS_TASK_COMPLETE.toString(), null);

        String propertyValue = questTask.getPropertyValue(QuestTask.QuestTaskPropertyType.IS_TASK_COMPLETE.toString());

        assertThat(propertyValue).isEmpty();
    }

    @Test
    public void testSetQuestTypeToFetch() {
        // Arrange

        // Act
        questTask.setQuestType(QuestTask.QuestType.FETCH);
        // Assert
        assertEquals(QuestTask.QuestType.FETCH, questTask.getQuestType());
    }

    @Test
    public void testResetAllQuestProperties() {
        // Arrange

        // Act
        questTask.resetAllProperties();
        // Assert
        assertEquals(
                "false",
                questTask.getPropertyValue(QuestTask.QuestTaskPropertyType.IS_TASK_COMPLETE.toString())
        );
    }

}
