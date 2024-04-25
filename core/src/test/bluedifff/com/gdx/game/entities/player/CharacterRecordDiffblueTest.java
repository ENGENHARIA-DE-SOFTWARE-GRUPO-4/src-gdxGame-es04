package com.gdx.game.entities.player;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CharacterRecordDiffblueTest {
    /**
     * Method under test:
     * {@link CharacterRecord#CharacterRecord(int, int, int, int, int, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNewCharacterRecord() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Static initializer failed.
        //   The static initializer of
        //   com.gdx.game.entities.player.CharacterRecord
        //   threw java.lang.NullPointerException while trying to load it.
        //   Make sure the static initializer of CharacterRecord
        //   can be executed without throwing exceptions.
        //   Exception: java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.internal(String)" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.entities.Entity.getEntityConfigs(Entity.java:201)
        //       at com.gdx.game.entities.EntityFactory.<init>(EntityFactory.java:63)
        //       at com.gdx.game.entities.EntityFactory.getInstance(EntityFactory.java:86)
        //       at com.gdx.game.entities.player.CharacterRecord.loadStats(CharacterRecord.java:71)
        //       at com.gdx.game.entities.player.CharacterRecord.lambda$static$0(CharacterRecord.java:31)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:992)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:575)
        //       at java.base/java.util.stream.AbstractPipeline.evaluateToArrayNode(AbstractPipeline.java:260)
        //       at java.base/java.util.stream.ReferencePipeline.toArray(ReferencePipeline.java:616)
        //       at com.gdx.game.entities.player.CharacterRecord.<clinit>(CharacterRecord.java:35)
        //       at java.base/java.lang.Class.forName0(Native Method)
        //       at java.base/java.lang.Class.forName(Class.java:467)

        // Arrange
        // TODO: Populate arranged inputs
        int baseHP = 0;
        int baseMP = 0;
        int baseAttack = 0;
        int baseDefense = 0;
        int baseSpeed = 0;
        String name = "";

        // Act
        CharacterRecord actualCharacterRecord = new CharacterRecord(baseHP, baseMP, baseAttack, baseDefense, baseSpeed,
                name);

        // Assert
        // TODO: Add assertions on result
    }
}
