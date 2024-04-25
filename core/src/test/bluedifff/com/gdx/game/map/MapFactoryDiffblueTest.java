package com.gdx.game.map;

import java.util.Hashtable;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MapFactoryDiffblueTest {
    /**
     * Method under test: {@link MapFactory#getMapTable()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMapTable() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Trivial constructor.
        //   See https://diff.blue/T005

        // Arrange and Act
        // TODO: Populate arranged inputs
        Hashtable<MapFactory.MapType, Map> actualMapTable = MapFactory.getMapTable();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MapFactory#getMap(MapFactory.MapType)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMap() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        MapFactory.MapType mapType = MapFactory.MapType.TOPPLE_ROAD_1;

        // Act
        Map actualMap = MapFactory.getMap(mapType);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MapFactory#clearCache()}
     */
    @Test
    void testClearCache() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        MapFactory.clearCache();
    }
}
