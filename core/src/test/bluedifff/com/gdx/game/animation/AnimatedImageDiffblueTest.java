package com.gdx.game.animation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.actions.AddAction;
import com.badlogic.gdx.scenes.scene2d.actions.AlphaAction;
import com.badlogic.gdx.scenes.scene2d.actions.CountdownEventAction;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.badlogic.gdx.utils.ReflectionPool;
import com.gdx.game.entities.Entity;
import com.gdx.game.entities.npc.NPCGraphicsComponent;
import com.gdx.game.entities.npc.NPCInputComponent;
import com.gdx.game.entities.npc.NPCPhysicsComponent;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AnimatedImageDiffblueTest {
    /**
     * Method under test: {@link AnimatedImage#setEntity(Entity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetEntity() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.graphics.GL20.glCreateShader(int)" because "gl" is null
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.loadShader(ShaderProgram.java:205)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.compileShaders(ShaderProgram.java:184)
        //       at com.badlogic.gdx.graphics.glutils.ShaderProgram.<init>(ShaderProgram.java:167)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.createDefaultShader(ImmediateModeRenderer20.java:241)
        //       at com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20.<init>(ImmediateModeRenderer20.java:55)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:116)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:111)
        //       at com.badlogic.gdx.graphics.glutils.ShapeRenderer.<init>(ShapeRenderer.java:107)
        //       at com.gdx.game.component.GraphicsComponent.<init>(GraphicsComponent.java:34)
        //       at com.gdx.game.entities.npc.NPCGraphicsComponent.<init>(NPCGraphicsComponent.java:29)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        AnimatedImage animatedImage = new AnimatedImage();
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();

        // Act
        animatedImage.setEntity(new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent()));
    }

    /**
     * Method under test:
     * {@link AnimatedImage#setCurrentAnimation(Entity.AnimationType)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetCurrentAnimation() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gdx.game.entities.Entity.getAnimation(com.gdx.game.entities.Entity$AnimationType)" because "this.entity" is null
        //       at com.gdx.game.animation.AnimatedImage.setCurrentAnimation(AnimatedImage.java:41)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new AnimatedImage()).setCurrentAnimation(Entity.AnimationType.WALK_LEFT);
    }

    /**
     * Method under test: {@link AnimatedImage#act(float)}
     */
    @Test
    void testAct() {
        // Arrange
        AnimatedImage animatedImage = new AnimatedImage();

        // Act
        animatedImage.act(0.5f);

        // Assert that nothing has changed
        assertEquals(0.0f, animatedImage.getHeight());
        assertEquals(0.0f, animatedImage.getOriginX());
        assertEquals(0.0f, animatedImage.getOriginY());
        assertEquals(0.0f, animatedImage.getRotation());
        assertEquals(0.0f, animatedImage.getWidth());
        assertEquals(0.0f, animatedImage.getX());
        assertEquals(0.0f, animatedImage.getY());
        assertEquals(0.0f, animatedImage.getImageHeight());
        assertEquals(0.0f, animatedImage.getImageWidth());
        assertEquals(0.0f, animatedImage.getImageX());
        assertEquals(0.0f, animatedImage.getImageY());
        assertEquals(1, animatedImage.getAlign());
        assertEquals(1.0f, animatedImage.getScaleX());
        assertEquals(1.0f, animatedImage.getScaleY());
        assertEquals(Touchable.enabled, animatedImage.getTouchable());
        assertEquals(Entity.AnimationType.IDLE, animatedImage.getCurrentAnimationType());
        assertFalse(animatedImage.getDebug());
        assertTrue(animatedImage.isVisible());
        assertTrue(animatedImage.needsLayout());
    }

    /**
     * Method under test: {@link AnimatedImage#act(float)}
     */
    @Test
    void testAct2() {
        // Arrange
        AnimatedImage animatedImage = new AnimatedImage();
        animatedImage.addListener(mock(EventListener.class));

        // Act
        animatedImage.act(0.5f);

        // Assert that nothing has changed
        assertEquals(0.0f, animatedImage.getHeight());
        assertEquals(0.0f, animatedImage.getOriginX());
        assertEquals(0.0f, animatedImage.getOriginY());
        assertEquals(0.0f, animatedImage.getRotation());
        assertEquals(0.0f, animatedImage.getWidth());
        assertEquals(0.0f, animatedImage.getX());
        assertEquals(0.0f, animatedImage.getY());
        assertEquals(0.0f, animatedImage.getImageHeight());
        assertEquals(0.0f, animatedImage.getImageWidth());
        assertEquals(0.0f, animatedImage.getImageX());
        assertEquals(0.0f, animatedImage.getImageY());
        assertEquals(1, animatedImage.getAlign());
        assertEquals(1.0f, animatedImage.getScaleX());
        assertEquals(1.0f, animatedImage.getScaleY());
        assertEquals(Touchable.enabled, animatedImage.getTouchable());
        assertEquals(Entity.AnimationType.IDLE, animatedImage.getCurrentAnimationType());
        assertFalse(animatedImage.getDebug());
        assertTrue(animatedImage.isVisible());
        assertTrue(animatedImage.needsLayout());
    }

    /**
     * Method under test: {@link AnimatedImage#act(float)}
     */
    @Test
    void testAct3() {
        // Arrange
        AnimatedImage animatedImage = new AnimatedImage();
        animatedImage.addAction(new AlphaAction());
        animatedImage.addListener(mock(EventListener.class));

        // Act
        animatedImage.act(0.5f);

        // Assert
        assertEquals(0.0f, animatedImage.getColor().a);
        assertFalse(animatedImage.hasActions());
    }

    /**
     * Method under test: {@link AnimatedImage#act(float)}
     */
    @Test
    void testAct4() {
        // Arrange
        AddAction action = new AddAction();
        Class<Event> eventClass = Event.class;
        CountdownEventAction<Event> action2 = new CountdownEventAction<>(eventClass, 3);

        action.setAction(action2);

        AnimatedImage animatedImage = new AnimatedImage();
        animatedImage.addAction(action);
        animatedImage.addListener(mock(EventListener.class));

        // Act
        animatedImage.act(0.5f);

        // Assert
        assertEquals(2, animatedImage.getListeners().size);
        assertTrue(animatedImage.hasActions());
        Action randomResult = animatedImage.getActions().random();
        assertTrue(((CountdownEventAction<Event>) randomResult).isActive());
        assertSame(action2, randomResult);
        assertSame(animatedImage, randomResult.getActor());
        assertSame(animatedImage, randomResult.getTarget());
    }

    /**
     * Method under test: {@link AnimatedImage#act(float)}
     */
    @Test
    void testAct5() {
        // Arrange
        AlphaAction action = new AlphaAction();
        Class<Object> type = Object.class;
        action.setPool(new ReflectionPool(type));

        AnimatedImage animatedImage = new AnimatedImage();
        animatedImage.addAction(action);
        animatedImage.addListener(mock(EventListener.class));

        // Act
        animatedImage.act(0.5f);

        // Assert
        assertEquals(0.0f, animatedImage.getColor().a);
        assertFalse(animatedImage.hasActions());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link AnimatedImage#getCurrentAnimationType()}
     *   <li>{@link AnimatedImage#getEntity()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        AnimatedImage animatedImage = new AnimatedImage();

        // Act
        Entity.AnimationType actualCurrentAnimationType = animatedImage.getCurrentAnimationType();

        // Assert
        assertNull(animatedImage.getEntity());
        assertEquals(Entity.AnimationType.IDLE, actualCurrentAnimationType);
    }

    /**
     * Method under test: default or parameterless constructor of
     * {@link AnimatedImage}
     */
    @Test
    void testNewAnimatedImage() {
        // Arrange and Act
        AnimatedImage actualAnimatedImage = new AnimatedImage();

        // Assert
        DelayedRemovalArray<EventListener> captureListeners = actualAnimatedImage.getCaptureListeners();
        assertEquals(0, captureListeners.size);
        DelayedRemovalArray<EventListener> listeners = actualAnimatedImage.getListeners();
        assertEquals(0, listeners.size);
        assertEquals(1, actualAnimatedImage.getAlign());
        assertEquals(1.0f, actualAnimatedImage.getScaleX());
        assertEquals(1.0f, actualAnimatedImage.getScaleY());
        Color color = actualAnimatedImage.getColor();
        assertEquals(1.0f, color.a);
        assertEquals(1.0f, color.b);
        assertEquals(1.0f, color.g);
        assertEquals(1.0f, color.r);
        assertEquals(Touchable.enabled, actualAnimatedImage.getTouchable());
        assertEquals(Entity.AnimationType.IDLE, actualAnimatedImage.getCurrentAnimationType());
        assertFalse(actualAnimatedImage.hasActions());
        assertTrue(actualAnimatedImage.isVisible());
        assertTrue(actualAnimatedImage.needsLayout());
        Array<Action> actions = actualAnimatedImage.getActions();
        assertTrue(actions.ordered);
        assertTrue(captureListeners.ordered);
        assertTrue(listeners.ordered);
        Action[] expectedShrinkResult = actions.items;
        assertSame(expectedShrinkResult, actions.shrink());
        EventListener[] expectedShrinkResult2 = captureListeners.items;
        assertSame(expectedShrinkResult2, captureListeners.shrink());
        EventListener[] expectedShrinkResult3 = listeners.items;
        assertSame(expectedShrinkResult3, listeners.shrink());
    }
}
