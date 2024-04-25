package com.gdx.game.status;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LevelTableDiffblueTest {
    /**
     * Method under test: {@link LevelTable#getLevelTables(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetLevelTables() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.internal(String)" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.status.LevelTable.getLevelTables(LevelTable.java:53)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        LevelTable.getLevelTables("/directory/foo.txt");
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link LevelTable#setHpMax(int)}
     *   <li>{@link LevelTable#setLevelID(String)}
     *   <li>{@link LevelTable#setMpMax(int)}
     *   <li>{@link LevelTable#setXpMax(int)}
     *   <li>{@link LevelTable#getHpMax()}
     *   <li>{@link LevelTable#getLevelID()}
     *   <li>{@link LevelTable#getMpMax()}
     *   <li>{@link LevelTable#getXpMax()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        LevelTable levelTable = new LevelTable();

        // Act
        levelTable.setHpMax(1);
        levelTable.setLevelID("Level ID");
        levelTable.setMpMax(1);
        levelTable.setXpMax(1);
        int actualHpMax = levelTable.getHpMax();
        String actualLevelID = levelTable.getLevelID();
        int actualMpMax = levelTable.getMpMax();

        // Assert that nothing has changed
        assertEquals("Level ID", actualLevelID);
        assertEquals(1, actualHpMax);
        assertEquals(1, actualMpMax);
        assertEquals(1, levelTable.getXpMax());
    }
}
