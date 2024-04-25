package com.gdx.game.entities.player.characterClass.tree;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TreeDiffblueTest {
    /**
     * Method under test: {@link Tree#buildClassTree(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testBuildClassTree() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.internal(String)" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.entities.player.characterClass.tree.Tree.buildClassTree(Tree.java:24)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        Tree.buildClassTree("/directory/foo.txt");
    }

    /**
     * Method under test: {@link Tree#checkForClassUpgrade(String, int, int)}
     */
    @Test
    void testCheckForClassUpgrade() {
        // Arrange, Act and Assert
        assertNull((new Tree()).checkForClassUpgrade("42", 1, 1));
    }

    /**
     * Method under test: {@link Tree#saveNewClass(Node)}
     */
    @Test
    void testSaveNewClass() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        Tree.saveNewClass(null);
    }

    /**
     * Method under test: {@link Tree#saveNewClass(Node)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveNewClass2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.isLocalStorageAvailable()" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.profile.ProfileManager.storeAllProfiles(ProfileManager.java:65)
        //       at com.gdx.game.profile.ProfileManager.<init>(ProfileManager.java:31)
        //       at com.gdx.game.profile.ProfileManager.getInstance(ProfileManager.java:36)
        //       at com.gdx.game.entities.player.characterClass.tree.Tree.saveNewClass(Tree.java:132)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        Tree.saveNewClass(new Node());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>default or parameterless constructor of {@link Tree}
     *   <li>{@link Tree#getRoot()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange, Act and Assert
        assertNull((new Tree()).getRoot());
    }
}
