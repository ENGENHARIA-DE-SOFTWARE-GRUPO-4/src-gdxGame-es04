package com.gdx.game.battle;

import com.gdx.game.entities.Entity;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class BattleConversationDiffblueTest {
    /**
     * Method under test: default or parameterless constructor of
     * {@link BattleConversation}
     */
    @Test
    void testNewBattleConversation() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     BattleConversation.json
        //     ComponentSubject.observers

        // Arrange and Act
        new BattleConversation();
    }

    /**
     * Method under test: {@link BattleConversation#notifBattleResume(Entity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNotifBattleResume() {
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

        // Arrange
        // TODO: Populate arranged inputs
        BattleConversation battleConversation = null;
        Entity entity = null;

        // Act
        battleConversation.notifBattleResume(entity);

        // Assert
        // TODO: Add assertions on result
    }
}
