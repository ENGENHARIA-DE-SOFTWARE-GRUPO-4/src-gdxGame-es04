package com.gdx.game.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AnimationManagerDiffblueTest {
    /**
     * Method under test:
     * {@link AnimationManager#setTextureRegionsDouble(Texture, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetTextureRegionsDouble() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.internal(String)" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.badlogic.gdx.graphics.Texture.<init>(Texture.java:110)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        AnimationManager animationManager = new AnimationManager();

        // Act
        animationManager.setTextureRegionsDouble(new Texture("Internal Path"), 1, 1);
    }

    /**
     * Method under test: {@link AnimationManager#setAnimation(TextureRegion[])}
     */
    @Test
    void testSetAnimation() {
        // Arrange
        AnimationManager animationManager = new AnimationManager();

        // Act
        Animation<TextureRegion> actualSetAnimationResult = animationManager
                .setAnimation(new TextureRegion[]{new TextureRegion()});

        // Assert
        assertEquals(0, (actualSetAnimationResult.getKeyFrames()[0]).getRegionHeight());
        assertEquals(0.1f, actualSetAnimationResult.getAnimationDuration());
        assertEquals(0.1f, actualSetAnimationResult.getFrameDuration());
        assertEquals(Animation.PlayMode.NORMAL, actualSetAnimationResult.getPlayMode());
    }
}
