package com.gdx.game.entities;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class EntityFactoryDiffblueTest {
    /**
     * Method under test: {@link EntityFactory#getInstance()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetInstance() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.internal(String)" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.entities.Entity.getEntityConfigs(Entity.java:201)
        //       at com.gdx.game.entities.EntityFactory.<init>(EntityFactory.java:63)
        //       at com.gdx.game.entities.EntityFactory.getInstance(EntityFactory.java:86)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        EntityFactory.getInstance();
    }

    /**
     * Method under test: {@link EntityFactory#getEntity(EntityFactory.EntityType)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEntity() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.internal(String)" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.entities.Entity.getEntityConfigs(Entity.java:201)
        //       at com.gdx.game.entities.EntityFactory.<init>(EntityFactory.java:63)
        //       at com.gdx.game.entities.EntityFactory.getInstance(EntityFactory.java:86)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        EntityFactory.getInstance().getEntity(EntityFactory.EntityType.WARRIOR);
    }

    /**
     * Method under test:
     * {@link EntityFactory#getEntityByName(EntityFactory.EntityName)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEntityByName() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.internal(String)" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.entities.Entity.getEntityConfigs(Entity.java:201)
        //       at com.gdx.game.entities.EntityFactory.<init>(EntityFactory.java:63)
        //       at com.gdx.game.entities.EntityFactory.getInstance(EntityFactory.java:86)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        EntityFactory.getInstance().getEntityByName(EntityFactory.EntityName.TOWN_GUARD_WALKING);
    }
}
