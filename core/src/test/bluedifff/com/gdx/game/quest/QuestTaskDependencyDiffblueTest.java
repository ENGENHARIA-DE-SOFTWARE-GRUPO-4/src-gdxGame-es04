package com.gdx.game.quest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class QuestTaskDependencyDiffblueTest {
    /**
     * Methods under test:
     * <ul>
     *   <li>default or parameterless constructor of {@link QuestTaskDependency}
     *   <li>{@link QuestTaskDependency#setDestinationId(String)}
     *   <li>{@link QuestTaskDependency#setSourceId(String)}
     *   <li>{@link QuestTaskDependency#getDestinationId()}
     *   <li>{@link QuestTaskDependency#getSourceId()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        QuestTaskDependency actualQuestTaskDependency = new QuestTaskDependency();
        actualQuestTaskDependency.setDestinationId("42");
        actualQuestTaskDependency.setSourceId("42");
        String actualDestinationId = actualQuestTaskDependency.getDestinationId();

        // Assert that nothing has changed
        assertEquals("42", actualDestinationId);
        assertEquals("42", actualQuestTaskDependency.getSourceId());
    }
}
