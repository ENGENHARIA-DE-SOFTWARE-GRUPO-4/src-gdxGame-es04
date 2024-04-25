package com.gdx.game.quest;

import com.badlogic.gdx.utils.Array;
import com.gdx.game.map.MapManager;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class QuestUIDiffblueTest {
    /**
     * Method under test: {@link QuestUI#questTaskComplete(String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testQuestTaskComplete() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        QuestUI questUI = null;
        String questID = "";
        String questTaskID = "";

        // Act
        questUI.questTaskComplete(questID, questTaskID);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link QuestUI#loadQuest(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLoadQuest() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        QuestUI questUI = null;
        String questConfigPath = "";

        // Act
        QuestGraph actualLoadQuestResult = questUI.loadQuest(questConfigPath);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link QuestUI#removeQuest(QuestGraph)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveQuest() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        QuestUI questUI = null;
        QuestGraph graph = null;

        // Act
        QuestGraph actualRemoveQuestResult = questUI.removeQuest(graph);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link QuestUI#isQuestReadyForReturn(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsQuestReadyForReturn() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        QuestUI questUI = null;
        String questID = "";

        // Act
        boolean actualIsQuestReadyForReturnResult = questUI.isQuestReadyForReturn(questID);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link QuestUI#getQuestByID(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetQuestByID() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        QuestUI questUI = null;
        String questGraphID = "";

        // Act
        QuestGraph actualQuestByID = questUI.getQuestByID(questGraphID);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link QuestUI#doesQuestExist(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDoesQuestExist() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        QuestUI questUI = null;
        String questGraphID = "";

        // Act
        boolean actualDoesQuestExistResult = questUI.doesQuestExist(questGraphID);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link QuestUI#getQuests()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetQuests() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   com.gdx.game.quest.QuestUI.getQuests().
        //   The arrange section threw
        //   java.lang.NoClassDefFoundError: Could not initialize class com.gdx.game.manager.ResourceManager
        //       at com.gdx.game.quest.QuestUI.<init>(QuestUI.java:33)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        QuestUI questUI = null;

        // Act
        Array<QuestGraph> actualQuests = questUI.getQuests();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link QuestUI#setQuests(Array)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetQuests() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        QuestUI questUI = null;
        Array<QuestGraph> quests = null;

        // Act
        questUI.setQuests(quests);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link QuestUI#updateQuestItemList()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateQuestItemList() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        QuestUI questUI = null;

        // Act
        questUI.updateQuestItemList();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link QuestUI#initQuests(MapManager)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testInitQuests() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        QuestUI questUI = null;
        MapManager mapMgr = null;

        // Act
        questUI.initQuests(mapMgr);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link QuestUI#updateQuests(MapManager)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateQuests() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        QuestUI questUI = null;
        MapManager mapMgr = null;

        // Act
        questUI.updateQuests(mapMgr);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: default or parameterless constructor of {@link QuestUI}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNewQuestUI() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        // TODO: Populate arranged inputs
        QuestUI actualQuestUI = new QuestUI();

        // Assert
        // TODO: Add assertions on result
    }
}
