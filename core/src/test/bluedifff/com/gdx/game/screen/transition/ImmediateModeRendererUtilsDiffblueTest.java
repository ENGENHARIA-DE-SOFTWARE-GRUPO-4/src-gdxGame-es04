package com.gdx.game.screen.transition;

import com.badlogic.gdx.graphics.Color;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ImmediateModeRendererUtilsDiffblueTest {
    /**
     * Method under test:
     * {@link ImmediateModeRendererUtils#drawFillArcCircle(float, float, float, Color)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawFillArcCircle() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Static initializer failed.
        //   The static initializer of
        //   com.gdx.game.screen.transition.ImmediateModeRendererUtils
        //   threw java.lang.NullPointerException while trying to load it.
        //   Make sure the static initializer of ImmediateModeRendererUtils
        //   can be executed without throwing exceptions.
        //   Exception: java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.graphics.GL20.glCreateShader(int)" because "gl" is null
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.loadShader(ShaderProgram.java:205)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.compileShaders(ShaderProgram.java:184)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.<init>(ShaderProgram.java:167)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.createDefaultShader(ImmediateModeRenderer20.java:241)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.<init>(ImmediateModeRenderer20.java:50)
        //       at com.gdx.game.screen.transition.ImmediateModeRendererUtils.<clinit>(ImmediateModeRendererUtils.java:13)
        //       at java.base/java.lang.Class.forName0(Native Method)
        //       at java.base/java.lang.Class.forName(Class.java:467)

        // Arrange
        // TODO: Populate arranged inputs
        float x = 0.0f;
        float y = 0.0f;
        float radius = 0.0f;
        Color color = null;

        // Act
        ImmediateModeRendererUtils.drawFillArcCircle(x, y, radius, color);

        // Assert
        // TODO: Add assertions on result
    }
}
