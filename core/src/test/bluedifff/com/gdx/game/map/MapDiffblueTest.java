package com.gdx.game.map;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.gdx.game.audio.AudioObserver;
import com.gdx.game.entities.Entity;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MapDiffblueTest {
    /**
     * Method under test: {@link Map#getMusicTheme()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMusicTheme() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;

        // Act
        AudioObserver.AudioTypeEvent actualMusicTheme = map.getMusicTheme();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#getQuestItemSpawnPositions(String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetQuestItemSpawnPositions() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;
        String objectName = "";
        String objectTaskID = "";

        // Act
        Array<Vector2> actualQuestItemSpawnPositions = map.getQuestItemSpawnPositions(objectName, objectTaskID);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#getMapEntities()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMapEntities() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;

        // Act
        Array<Entity> actualMapEntities = map.getMapEntities();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#getMapQuestEntities()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMapQuestEntities() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;

        // Act
        Array<Entity> actualMapQuestEntities = map.getMapQuestEntities();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#addMapQuestEntities(Array)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddMapQuestEntities() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;
        Array<Entity> entities = null;

        // Act
        map.addMapQuestEntities(entities);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#getCurrentMapType()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCurrentMapType() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;

        // Act
        MapFactory.MapType actualCurrentMapType = map.getCurrentMapType();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#getPlayerStart()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPlayerStart() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;

        // Act
        Vector2 actualPlayerStart = map.getPlayerStart();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#setPlayerStart(Vector2)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetPlayerStart() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;
        Vector2 playerStart = null;

        // Act
        map.setPlayerStart(playerStart);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#updateMapEntities(MapManager, Batch, float)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateMapEntities() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;
        MapManager mapMgr = null;
        Batch batch = null;
        float delta = 0.0f;

        // Act
        map.updateMapEntities(mapMgr, batch, delta);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#dispose()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDispose() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;

        // Act
        map.dispose();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#getCollisionLayer()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCollisionLayer() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;

        // Act
        MapLayer actualCollisionLayer = map.getCollisionLayer();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#getPortalLayer()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPortalLayer() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;

        // Act
        MapLayer actualPortalLayer = map.getPortalLayer();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#getQuestItemSpawnLayer()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetQuestItemSpawnLayer() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;

        // Act
        MapLayer actualQuestItemSpawnLayer = map.getQuestItemSpawnLayer();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#getQuestDiscoverLayer()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetQuestDiscoverLayer() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;

        // Act
        MapLayer actualQuestDiscoverLayer = map.getQuestDiscoverLayer();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#getEnemySpawnLayer()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEnemySpawnLayer() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;

        // Act
        MapLayer actualEnemySpawnLayer = map.getEnemySpawnLayer();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#getCurrentTiledMap()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCurrentTiledMap() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;

        // Act
        TiledMap actualCurrentTiledMap = map.getCurrentTiledMap();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#getPlayerStartUnitScaled()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPlayerStartUnitScaled() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;

        // Act
        Vector2 actualPlayerStartUnitScaled = map.getPlayerStartUnitScaled();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link Map#setClosestStartPositionFromScaledUnits(Vector2)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetClosestStartPositionFromScaledUnits() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;
        Vector2 position = null;

        // Act
        map.setClosestStartPositionFromScaledUnits(position);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#addObserver(AudioObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddObserver() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;
        AudioObserver audioObserver = null;

        // Act
        map.addObserver(audioObserver);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#removeObserver(AudioObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveObserver() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;
        AudioObserver audioObserver = null;

        // Act
        map.removeObserver(audioObserver);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Map#removeAllObservers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveAllObservers() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;

        // Act
        map.removeAllObservers();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link Map#notify(AudioObserver.AudioCommand, AudioObserver.AudioTypeEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNotify() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Map map = null;
        AudioObserver.AudioCommand command = AudioObserver.AudioCommand.MUSIC_LOAD;
        AudioObserver.AudioTypeEvent event = AudioObserver.AudioTypeEvent.MENU_THEME;

        // Act
        map.notify(command, event);

        // Assert
        // TODO: Add assertions on result
    }
}
