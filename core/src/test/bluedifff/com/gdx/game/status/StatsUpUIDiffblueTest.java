package com.gdx.game.status;

import com.gdx.game.entities.player.characterClass.ClassObserver;
import com.gdx.game.inventory.InventoryObserver;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StatsUpUIDiffblueTest {
    /**
     * Method under test: {@link StatsUpUI#addObserver(ClassObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddObserver() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StatsUpUI statsUpUI = null;
        ClassObserver classObserver = null;

        // Act
        statsUpUI.addObserver(classObserver);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StatsUpUI#addObserver(InventoryObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddObserver2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StatsUpUI statsUpUI = null;
        InventoryObserver inventoryObserver = null;

        // Act
        statsUpUI.addObserver(inventoryObserver);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StatsUpUI#removeObserver(ClassObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveObserver() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StatsUpUI statsUpUI = null;
        ClassObserver classObserver = null;

        // Act
        statsUpUI.removeObserver(classObserver);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StatsUpUI#removeObserver(InventoryObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveObserver2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StatsUpUI statsUpUI = null;
        InventoryObserver inventoryObserver = null;

        // Act
        statsUpUI.removeObserver(inventoryObserver);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StatsUpUI#removeAllObservers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveAllObservers() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StatsUpUI statsUpUI = null;

        // Act
        statsUpUI.removeAllObservers();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StatsUpUI#notify(String, ClassObserver.ClassEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNotify() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StatsUpUI statsUpUI = null;
        String value = "";
        ClassObserver.ClassEvent event = ClassObserver.ClassEvent.CHECK_UPGRADE_TREE_CLASS;

        // Act
        statsUpUI.notify(value, event);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link StatsUpUI#notify(String, InventoryObserver.InventoryEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNotify2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        StatsUpUI statsUpUI = null;
        String value = "";
        InventoryObserver.InventoryEvent event = InventoryObserver.InventoryEvent.UPDATED_AP;

        // Act
        statsUpUI.notify(value, event);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StatsUpUI#StatsUpUI(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNewStatsUpUI() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Static initializer failed.
        //   The static initializer of
        //   com.gdx.game.manager.ResourceManager
        //   threw java.lang.NullPointerException while trying to load it.
        //   Make sure the static initializer of ResourceManager
        //   can be executed without throwing exceptions.
        //   Exception: java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.internal(String)" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.badlogic.gdx.graphics.g2d.TextureAtlas.<init>(TextureAtlas.java:55)
        //       at com.gdx.game.manager.ResourceManager.<clinit>(ResourceManager.java:37)
        //       at com.gdx.game.status.StatsUpUI.<init>(StatsUpUI.java:41)

        // Arrange
        // TODO: Populate arranged inputs
        int nbrLevelUp = 0;

        // Act
        StatsUpUI actualStatsUpUI = new StatsUpUI(nbrLevelUp);

        // Assert
        // TODO: Add assertions on result
    }
}
