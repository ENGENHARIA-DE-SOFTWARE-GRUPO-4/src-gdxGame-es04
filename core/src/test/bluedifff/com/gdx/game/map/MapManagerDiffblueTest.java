package com.gdx.game.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.gdx.game.component.ComponentObserver;
import com.gdx.game.entities.Entity;
import com.gdx.game.entities.npc.NPCGraphicsComponent;
import com.gdx.game.entities.npc.NPCInputComponent;
import com.gdx.game.entities.npc.NPCPhysicsComponent;
import com.gdx.game.profile.ProfileManager;
import com.gdx.game.profile.ProfileObserver;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MapManagerDiffblueTest {
    /**
     * Method under test:
     * {@link MapManager#onNotify(ProfileManager, ProfileObserver.ProfileEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOnNotify() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.badlogic.gdx.Files.isLocalStorageAvailable()" because "com.badlogic.gdx.Gdx.files" is null
        //       at com.gdx.game.profile.ProfileManager.storeAllProfiles(ProfileManager.java:65)
        //       at com.gdx.game.profile.ProfileManager.<init>(ProfileManager.java:31)
        //       at com.gdx.game.profile.ProfileManager.getInstance(ProfileManager.java:36)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MapManager mapManager = new MapManager();

        // Act
        mapManager.onNotify(ProfileManager.getInstance(), ProfileObserver.ProfileEvent.PROFILE_LOADED);
    }

    /**
     * Method under test: {@link MapManager#loadMap(MapFactory.MapType)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLoadMap() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gdx.game.map.Map.setClosestStartPositionFromScaledUnits(com.badlogic.gdx.math.Vector2)" because "this.currentMap" is null
        //       at com.gdx.game.map.MapManager.setClosestStartPositionFromScaledUnits(MapManager.java:132)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MapManager mapManager = new MapManager();
        mapManager.setClosestStartPositionFromScaledUnits(null);
        mapManager.setCurrentSelectedMapEntity(null);

        // Act
        mapManager.loadMap(MapFactory.MapType.TOPPLE_ROAD_1);
    }

    /**
     * Method under test: {@link MapManager#unregisterCurrentMapEntityObservers()}
     */
    @Test
    void testUnregisterCurrentMapEntityObservers() {
        // Arrange
        MapManager mapManager = new MapManager();

        // Act
        mapManager.unregisterCurrentMapEntityObservers();

        // Assert that nothing has changed
        assertFalse(mapManager.hasMapChanged());
    }

    /**
     * Method under test:
     * {@link MapManager#registerCurrentMapEntityObservers(ComponentObserver)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRegisterCurrentMapEntityObservers() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access 'sun.misc'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        MapManager mapManager = null;
        ComponentObserver observer = null;

        // Act
        mapManager.registerCurrentMapEntityObservers(observer);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test:
     * {@link MapManager#setClosestStartPositionFromScaledUnits(Vector2)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetClosestStartPositionFromScaledUnits() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gdx.game.map.Map.setClosestStartPositionFromScaledUnits(com.badlogic.gdx.math.Vector2)" because "this.currentMap" is null
        //       at com.gdx.game.map.MapManager.setClosestStartPositionFromScaledUnits(MapManager.java:132)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MapManager mapManager = new MapManager();

        // Act
        mapManager.setClosestStartPositionFromScaledUnits(new Vector2(10.0f, 10.0f));
    }

    /**
     * Method under test: {@link MapManager#getCollisionLayer()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCollisionLayer() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gdx.game.map.Map.getCollisionLayer()" because "this.currentMap" is null
        //       at com.gdx.game.map.MapManager.getCollisionLayer(MapManager.java:136)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new MapManager()).getCollisionLayer();
    }

    /**
     * Method under test: {@link MapManager#getPortalLayer()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPortalLayer() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gdx.game.map.Map.getPortalLayer()" because "this.currentMap" is null
        //       at com.gdx.game.map.MapManager.getPortalLayer(MapManager.java:140)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new MapManager()).getPortalLayer();
    }

    /**
     * Method under test:
     * {@link MapManager#getQuestItemSpawnPositions(String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetQuestItemSpawnPositions() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gdx.game.map.Map.getQuestItemSpawnPositions(String, String)" because "this.currentMap" is null
        //       at com.gdx.game.map.MapManager.getQuestItemSpawnPositions(MapManager.java:144)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new MapManager()).getQuestItemSpawnPositions("Object Name", "Object Task ID");
    }

    /**
     * Method under test: {@link MapManager#getQuestDiscoverLayer()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetQuestDiscoverLayer() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gdx.game.map.Map.getQuestDiscoverLayer()" because "this.currentMap" is null
        //       at com.gdx.game.map.MapManager.getQuestDiscoverLayer(MapManager.java:148)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new MapManager()).getQuestDiscoverLayer();
    }

    /**
     * Method under test: {@link MapManager#getEnemySpawnLayer()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEnemySpawnLayer() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gdx.game.map.Map.getEnemySpawnLayer()" because "this.currentMap" is null
        //       at com.gdx.game.map.MapManager.getEnemySpawnLayer(MapManager.java:152)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new MapManager()).getEnemySpawnLayer();
    }

    /**
     * Method under test: {@link MapManager#getCurrentMapType()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCurrentMapType() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gdx.game.map.Map.getCurrentMapType()" because "this.currentMap" is null
        //       at com.gdx.game.map.MapManager.getCurrentMapType(MapManager.java:156)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new MapManager()).getCurrentMapType();
    }

    /**
     * Method under test: {@link MapManager#getPlayerStartUnitScaled()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPlayerStartUnitScaled() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gdx.game.map.Map.getPlayerStartUnitScaled()" because "this.currentMap" is null
        //       at com.gdx.game.map.MapManager.getPlayerStartUnitScaled(MapManager.java:160)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new MapManager()).getPlayerStartUnitScaled();
    }

    /**
     * Method under test: {@link MapManager#getCurrentTiledMap()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCurrentTiledMap() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gdx.game.map.Map.setClosestStartPositionFromScaledUnits(com.badlogic.gdx.math.Vector2)" because "this.currentMap" is null
        //       at com.gdx.game.map.MapManager.setClosestStartPositionFromScaledUnits(MapManager.java:132)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MapManager mapManager = new MapManager();
        mapManager.setClosestStartPositionFromScaledUnits(null);
        mapManager.setCurrentSelectedMapEntity(null);

        // Act
        mapManager.getCurrentTiledMap();
    }

    /**
     * Method under test:
     * {@link MapManager#updateCurrentMapEntities(MapManager, Batch, float)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateCurrentMapEntities() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        MapManager mapManager = null;
        MapManager mapMgr = null;
        Batch batch = null;
        float delta = 0.0f;

        // Act
        mapManager.updateCurrentMapEntities(mapMgr, batch, delta);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MapManager#getCurrentMapEntities()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCurrentMapEntities() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gdx.game.map.Map.getMapEntities()" because "this.currentMap" is null
        //       at com.gdx.game.map.MapManager.getCurrentMapEntities(MapManager.java:175)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new MapManager()).getCurrentMapEntities();
    }

    /**
     * Method under test: {@link MapManager#getCurrentMapQuestEntities()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCurrentMapQuestEntities() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gdx.game.map.Map.getMapQuestEntities()" because "this.currentMap" is null
        //       at com.gdx.game.map.MapManager.getCurrentMapQuestEntities(MapManager.java:179)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new MapManager()).getCurrentMapQuestEntities();
    }

    /**
     * Method under test: {@link MapManager#addMapQuestEntities(Array)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddMapQuestEntities() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gdx.game.map.Map.getMapQuestEntities()" because "this.currentMap" is null
        //       at com.gdx.game.map.MapManager.addMapQuestEntities(MapManager.java:183)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MapManager mapManager = new MapManager();

        // Act
        mapManager.addMapQuestEntities(new Array<>());
    }

    /**
     * Method under test: {@link MapManager#removeMapQuestEntity(Entity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveMapQuestEntity() {
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
        MapManager mapManager = new MapManager();
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();

        // Act
        mapManager.removeMapQuestEntity(new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent()));
    }

    /**
     * Method under test: {@link MapManager#addMapEntity(Entity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddMapEntity() {
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
        MapManager mapManager = new MapManager();
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();

        // Act
        mapManager.addMapEntity(new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent()));
    }

    /**
     * Method under test: {@link MapManager#removeMapEntity(Entity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveMapEntity() {
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
        MapManager mapManager = new MapManager();
        NPCInputComponent inputCpnt = new NPCInputComponent();
        NPCPhysicsComponent physicsCpnt = new NPCPhysicsComponent();

        // Act
        mapManager.removeMapEntity(new Entity(inputCpnt, physicsCpnt, new NPCGraphicsComponent()));
    }

    /**
     * Method under test: {@link MapManager#clearAllMapQuestEntities()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testClearAllMapQuestEntities() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gdx.game.map.Map.getMapQuestEntities()" because "this.currentMap" is null
        //       at com.gdx.game.map.MapManager.clearAllMapQuestEntities(MapManager.java:220)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new MapManager()).clearAllMapQuestEntities();
    }

    /**
     * Method under test: {@link MapManager#clearCurrentSelectedMapEntity()}
     */
    @Test
    void testClearCurrentSelectedMapEntity() {
        // Arrange
        MapManager mapManager = new MapManager();

        // Act
        mapManager.clearCurrentSelectedMapEntity();

        // Assert that nothing has changed
        assertFalse(mapManager.hasMapChanged());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>default or parameterless constructor of {@link MapManager}
     *   <li>{@link MapManager#setCamera(Camera)}
     *   <li>{@link MapManager#setMapChanged(boolean)}
     *   <li>{@link MapManager#getCamera()}
     *   <li>{@link MapManager#getCurrentSelectedMapEntity()}
     *   <li>{@link MapManager#getPlayer()}
     *   <li>{@link MapManager#hasMapChanged()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        MapManager actualMapManager = new MapManager();
        OrthographicCamera camera = new OrthographicCamera();
        actualMapManager.setCamera(camera);
        actualMapManager.setMapChanged(true);
        Camera actualCamera = actualMapManager.getCamera();
        actualMapManager.getCurrentSelectedMapEntity();
        actualMapManager.getPlayer();
        boolean actualHasMapChangedResult = actualMapManager.hasMapChanged();

        // Assert that nothing has changed
        Vector3 vector3 = ((OrthographicCamera) actualCamera).position;
        assertEquals(0.0f, vector3.len());
        assertEquals(0.0f, vector3.len2());
        Matrix4 matrix4 = ((OrthographicCamera) actualCamera).combined;
        assertEquals(1.0f, matrix4.det());
        Matrix4 matrix42 = ((OrthographicCamera) actualCamera).invProjectionView;
        assertEquals(1.0f, matrix42.det());
        Matrix4 matrix43 = ((OrthographicCamera) actualCamera).projection;
        assertEquals(1.0f, matrix43.det());
        Matrix4 matrix44 = ((OrthographicCamera) actualCamera).view;
        assertEquals(1.0f, matrix44.det());
        assertEquals(1.0f, matrix4.det3x3());
        assertEquals(1.0f, matrix42.det3x3());
        assertEquals(1.0f, matrix43.det3x3());
        assertEquals(1.0f, matrix44.det3x3());
        assertEquals(1.0f, matrix4.getScaleX());
        assertEquals(1.0f, matrix42.getScaleX());
        assertEquals(1.0f, matrix43.getScaleX());
        assertEquals(1.0f, matrix44.getScaleX());
        assertEquals(1.0f, matrix4.getScaleXSquared());
        assertEquals(1.0f, matrix42.getScaleXSquared());
        assertEquals(1.0f, matrix43.getScaleXSquared());
        assertEquals(1.0f, matrix44.getScaleXSquared());
        assertEquals(1.0f, matrix4.getScaleY());
        assertEquals(1.0f, matrix42.getScaleY());
        assertEquals(1.0f, matrix43.getScaleY());
        assertEquals(1.0f, matrix44.getScaleY());
        assertEquals(1.0f, matrix4.getScaleYSquared());
        assertEquals(1.0f, matrix42.getScaleYSquared());
        assertEquals(1.0f, matrix43.getScaleYSquared());
        assertEquals(1.0f, matrix44.getScaleYSquared());
        assertEquals(1.0f, matrix4.getScaleZ());
        assertEquals(1.0f, matrix42.getScaleZ());
        assertEquals(1.0f, matrix43.getScaleZ());
        assertEquals(1.0f, matrix44.getScaleZ());
        assertEquals(1.0f, matrix4.getScaleZSquared());
        assertEquals(1.0f, matrix42.getScaleZSquared());
        assertEquals(1.0f, matrix43.getScaleZSquared());
        assertEquals(1.0f, matrix44.getScaleZSquared());
        Vector3 vector32 = ((OrthographicCamera) actualCamera).direction;
        assertEquals(1.0f, vector32.len());
        Vector3 vector33 = ((OrthographicCamera) actualCamera).up;
        assertEquals(1.0f, vector33.len());
        assertEquals(1.0f, vector32.len2());
        assertEquals(1.0f, vector33.len2());
        assertFalse(matrix4.hasRotationOrScaling());
        assertFalse(matrix42.hasRotationOrScaling());
        assertFalse(matrix43.hasRotationOrScaling());
        assertFalse(matrix44.hasRotationOrScaling());
        assertFalse(vector3.isUnit());
        assertFalse(vector32.isZero());
        assertFalse(vector33.isZero());
        assertTrue(vector32.isUnit());
        assertTrue(vector33.isUnit());
        assertTrue(vector3.isZero());
        assertTrue(actualHasMapChangedResult);
        Vector3 vector34 = actualCamera.direction;
        assertEquals(vector34, vector32.cpy());
        Vector3 vector35 = actualCamera.position;
        assertEquals(vector35, vector3.cpy());
        Vector3 vector36 = actualCamera.up;
        assertEquals(vector36, vector33.cpy());
        assertSame(camera, actualCamera);
        Matrix4 matrix45 = actualCamera.combined;
        assertSame(matrix45, matrix4.idt());
        assertSame(matrix45, matrix4.inv());
        assertSame(matrix45, matrix4.toNormalMatrix());
        assertSame(matrix45, matrix4.tra());
        assertSame(vector34, vector32.nor());
        Matrix4 matrix46 = actualCamera.invProjectionView;
        assertSame(matrix46, matrix42.idt());
        assertSame(matrix46, matrix42.inv());
        assertSame(matrix46, matrix42.toNormalMatrix());
        assertSame(matrix46, matrix42.tra());
        assertSame(vector35, vector3.nor());
        Matrix4 matrix47 = actualCamera.projection;
        assertSame(matrix47, matrix43.idt());
        assertSame(matrix47, matrix43.inv());
        assertSame(matrix47, matrix43.toNormalMatrix());
        assertSame(matrix47, matrix43.tra());
        assertSame(vector36, vector33.nor());
        Matrix4 matrix48 = actualCamera.view;
        assertSame(matrix48, matrix44.idt());
        assertSame(matrix48, matrix44.inv());
        assertSame(matrix48, matrix44.toNormalMatrix());
        assertSame(matrix48, matrix44.tra());
    }
}
