package com.gdx.game.quest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.gdx.game.map.MapManager;

import java.util.Hashtable;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class QuestGraphDiffblueTest {
    /**
     * Method under test: {@link QuestGraph#areAllTasksComplete()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAreAllTasksComplete() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Dictionary.elements()" because "that" is null
        //       at com.gdx.game.quest.QuestGraph.getAllQuestTasks(QuestGraph.java:95)
        //       at com.gdx.game.quest.QuestGraph.areAllTasksComplete(QuestGraph.java:72)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new QuestGraph()).areAllTasksComplete();
    }

    /**
     * Method under test: {@link QuestGraph#setTasks(Hashtable)}
     */
    @Test
    void testSetTasks() {
        // Arrange
        QuestGraph questGraph = new QuestGraph();

        // Act
        questGraph.setTasks(new Hashtable<>());

        // Assert
        assertTrue(questGraph.getAllQuestTasks().isEmpty());
    }

    /**
     * Method under test: {@link QuestGraph#setTasks(Hashtable)}
     */
    @Test
    void testSetTasks2() {
        // Arrange
        QuestGraph questGraph = new QuestGraph();

        QuestTask questTask = new QuestTask();
        questTask.setId("42");

        Hashtable<String, QuestTask> questTasks = new Hashtable<>();
        questTasks.put("foo", questTask);

        // Act
        questGraph.setTasks(questTasks);

        // Assert
        assertEquals(1, questGraph.getAllQuestTasks().size());
    }

    /**
     * Method under test: {@link QuestGraph#getAllQuestTasks()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllQuestTasks() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Dictionary.elements()" because "that" is null
        //       at com.gdx.game.quest.QuestGraph.getAllQuestTasks(QuestGraph.java:95)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new QuestGraph()).getAllQuestTasks();
    }

    /**
     * Method under test: {@link QuestGraph#clear()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testClear() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Map.clear()" because "that" is null
        //       at com.gdx.game.quest.QuestGraph.clear(QuestGraph.java:100)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new QuestGraph()).clear();
    }

    /**
     * Method under test: {@link QuestGraph#isValid(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsValid() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Map.get(Object)" because "that" is null
        //       at com.gdx.game.quest.QuestGraph.isValid(QuestGraph.java:105)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new QuestGraph()).isValid("Task ID");
    }

    /**
     * Method under test: {@link QuestGraph#isReachable(String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsReachable() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Map.get(Object)" because "that" is null
        //       at com.gdx.game.quest.QuestGraph.isValid(QuestGraph.java:105)
        //       at com.gdx.game.quest.QuestGraph.isReachable(QuestGraph.java:110)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new QuestGraph()).isReachable("Source ID", "Sink ID");
    }

    /**
     * Method under test: {@link QuestGraph#getQuestTaskByID(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetQuestTaskByID() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Map.get(Object)" because "that" is null
        //       at com.gdx.game.quest.QuestGraph.isValid(QuestGraph.java:105)
        //       at com.gdx.game.quest.QuestGraph.getQuestTaskByID(QuestGraph.java:130)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new QuestGraph()).getQuestTaskByID("42");
    }

    /**
     * Method under test: {@link QuestGraph#addDependency(QuestTaskDependency)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddDependency() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Map.get(Object)" because "that" is null
        //       at com.gdx.game.quest.QuestGraph.addDependency(QuestGraph.java:138)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        QuestGraph questGraph = new QuestGraph();

        QuestTaskDependency questTaskDependency = new QuestTaskDependency();
        questTaskDependency.setDestinationId("42");
        questTaskDependency.setSourceId("42");

        // Act
        questGraph.addDependency(questTaskDependency);
    }

    /**
     * Method under test: {@link QuestGraph#doesCycleExist(QuestTaskDependency)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDoesCycleExist() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Map.keySet()" because "that" is null
        //       at com.gdx.game.quest.QuestGraph.doesCycleExist(QuestGraph.java:153)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        QuestGraph questGraph = new QuestGraph();

        QuestTaskDependency questTaskDep = new QuestTaskDependency();
        questTaskDep.setDestinationId("42");
        questTaskDep.setSourceId("42");

        // Act
        questGraph.doesCycleExist(questTaskDep);
    }

    /**
     * Method under test: {@link QuestGraph#doesQuestTaskHaveDependencies(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDoesQuestTaskHaveDependencies() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Map.get(Object)" because "that" is null
        //       at com.gdx.game.quest.QuestGraph.isValid(QuestGraph.java:105)
        //       at com.gdx.game.quest.QuestGraph.getQuestTaskByID(QuestGraph.java:130)
        //       at com.gdx.game.quest.QuestGraph.doesQuestTaskHaveDependencies(QuestGraph.java:164)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new QuestGraph()).doesQuestTaskHaveDependencies("42");
    }

    /**
     * Method under test: {@link QuestGraph#updateQuestForReturn()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateQuestForReturn() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Dictionary.elements()" because "that" is null
        //       at com.gdx.game.quest.QuestGraph.getAllQuestTasks(QuestGraph.java:95)
        //       at com.gdx.game.quest.QuestGraph.updateQuestForReturn(QuestGraph.java:174)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new QuestGraph()).updateQuestForReturn();
    }

    /**
     * Method under test: {@link QuestGraph#isQuestTaskAvailable(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsQuestTaskAvailable() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Map.get(Object)" because "that" is null
        //       at com.gdx.game.quest.QuestGraph.isValid(QuestGraph.java:105)
        //       at com.gdx.game.quest.QuestGraph.getQuestTaskByID(QuestGraph.java:130)
        //       at com.gdx.game.quest.QuestGraph.isQuestTaskAvailable(QuestGraph.java:198)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new QuestGraph()).isQuestTaskAvailable("42");
    }

    /**
     * Method under test: {@link QuestGraph#setQuestTaskComplete(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetQuestTaskComplete() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Map.get(Object)" because "that" is null
        //       at com.gdx.game.quest.QuestGraph.isValid(QuestGraph.java:105)
        //       at com.gdx.game.quest.QuestGraph.getQuestTaskByID(QuestGraph.java:130)
        //       at com.gdx.game.quest.QuestGraph.setQuestTaskComplete(QuestGraph.java:217)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new QuestGraph()).setQuestTaskComplete("42");
    }

    /**
     * Method under test: {@link QuestGraph#update(MapManager)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdate() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Dictionary.elements()" because "that" is null
        //       at com.gdx.game.quest.QuestGraph.getAllQuestTasks(QuestGraph.java:95)
        //       at com.gdx.game.quest.QuestGraph.update(QuestGraph.java:225)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        QuestGraph questGraph = new QuestGraph();

        // Act
        questGraph.update(new MapManager());
    }

    /**
     * Method under test: {@link QuestGraph#init(MapManager)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testInit() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Dictionary.elements()" because "that" is null
        //       at com.gdx.game.quest.QuestGraph.getAllQuestTasks(QuestGraph.java:95)
        //       at com.gdx.game.quest.QuestGraph.init(QuestGraph.java:279)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        QuestGraph questGraph = new QuestGraph();

        // Act
        questGraph.init(new MapManager());
    }

    /**
     * Method under test: {@link QuestGraph#toJson()}
     */
    @Test
    void testToJson() {
        // Arrange, Act and Assert
        assertEquals("{}", (new QuestGraph()).toJson());
    }

    /**
     * Method under test: {@link QuestGraph#toJson()}
     */
    @Test
    void testToJson2() {
        // Arrange
        QuestGraph questGraph = new QuestGraph();
        questGraph.setGoldReward(1);

        // Act and Assert
        assertEquals("{\ngoldReward: 1\n}", questGraph.toJson());
    }

    /**
     * Method under test: {@link QuestGraph#toJson()}
     */
    @Test
    void testToJson3() {
        // Arrange
        QuestGraph questGraph = new QuestGraph();
        questGraph.setQuestComplete(true);

        // Act and Assert
        assertEquals("{\nisQuestComplete: true\n}", questGraph.toJson());
    }

    /**
     * Method under test: {@link QuestGraph#toJson()}
     */
    @Test
    void testToJson4() {
        // Arrange
        QuestGraph questGraph = new QuestGraph();
        questGraph.setQuestID("Quest ID");

        // Act and Assert
        assertEquals("{\nquestID: Quest ID\n}", questGraph.toJson());
    }

    /**
     * Method under test: {@link QuestGraph#toJson()}
     */
    @Test
    void testToJson5() {
        // Arrange
        QuestGraph questGraph = new QuestGraph();
        questGraph.setGoldReward(-1);

        // Act and Assert
        assertEquals("{\ngoldReward: -1\n}", questGraph.toJson());
    }

    /**
     * Method under test: {@link QuestGraph#toJson()}
     */
    @Test
    void testToJson6() {
        // Arrange
        QuestGraph questGraph = new QuestGraph();
        questGraph.setGoldReward(Integer.MIN_VALUE);

        // Act and Assert
        assertEquals("{\ngoldReward: -2147483648\n}", questGraph.toJson());
    }

    /**
     * Method under test: {@link QuestGraph#toJson()}
     */
    @Test
    void testToJson7() {
        // Arrange
        QuestGraph questGraph = new QuestGraph();
        questGraph.setQuestID("");

        // Act and Assert
        assertEquals("{\nquestID: \"\"\n}", questGraph.toJson());
    }

    /**
     * Method under test: {@link QuestGraph#toJson()}
     */
    @Test
    void testToJson8() {
        // Arrange
        QuestGraph questGraph = new QuestGraph();
        questGraph.setXpReward(1);
        questGraph.setGoldReward(-1);

        // Act and Assert
        assertEquals("{\ngoldReward: -1\nxpReward: 1\n}", questGraph.toJson());
    }

    /**
     * Method under test: {@link QuestGraph#toJson()}
     */
    @Test
    void testToJson9() {
        // Arrange
        QuestGraph questGraph = new QuestGraph();
        questGraph.setGoldReward(1);
        questGraph.setQuestID("");

        // Act and Assert
        assertEquals("{\nquestID: \"\"\ngoldReward: 1\n}", questGraph.toJson());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link QuestGraph#setGoldReward(int)}
     *   <li>{@link QuestGraph#setQuestComplete(boolean)}
     *   <li>{@link QuestGraph#setQuestID(String)}
     *   <li>{@link QuestGraph#setQuestTitle(String)}
     *   <li>{@link QuestGraph#setXpReward(int)}
     *   <li>{@link QuestGraph#getGoldReward()}
     *   <li>{@link QuestGraph#getQuestID()}
     *   <li>{@link QuestGraph#getQuestTitle()}
     *   <li>{@link QuestGraph#getXpReward()}
     *   <li>{@link QuestGraph#isQuestComplete()}
     *   <li>{@link QuestGraph#toString()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        QuestGraph questGraph = new QuestGraph();

        // Act
        questGraph.setGoldReward(1);
        questGraph.setQuestComplete(true);
        questGraph.setQuestID("Quest ID");
        questGraph.setQuestTitle("Dr");
        questGraph.setXpReward(1);
        int actualGoldReward = questGraph.getGoldReward();
        String actualQuestID = questGraph.getQuestID();
        String actualQuestTitle = questGraph.getQuestTitle();
        int actualXpReward = questGraph.getXpReward();
        boolean actualIsQuestCompleteResult = questGraph.isQuestComplete();

        // Assert that nothing has changed
        assertEquals("Dr", actualQuestTitle);
        assertEquals("Dr", questGraph.toString());
        assertEquals("Quest ID", actualQuestID);
        assertEquals(1, actualGoldReward);
        assertEquals(1, actualXpReward);
        assertTrue(actualIsQuestCompleteResult);
    }
}
