package com.gdx.game.entities.player.characterClass.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.badlogic.gdx.utils.ObjectMap;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class NodeDiffblueTest {
    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Node#Node(int, String, List, ObjectMap, ObjectMap)}
     *   <li>{@link Node#setLeft(Node)}
     *   <li>{@link Node#setRight(Node)}
     *   <li>{@link Node#getBonus()}
     *   <li>{@link Node#getClassId()}
     *   <li>{@link Node#getClassUpgrade()}
     *   <li>{@link Node#getId()}
     *   <li>{@link Node#getLeft()}
     *   <li>{@link Node#getRequirements()}
     *   <li>{@link Node#getRight()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        ArrayList<Node> classUpgrade = new ArrayList<>();
        ObjectMap<String, String> requirements = new ObjectMap<>();
        ObjectMap<String, String> bonus = new ObjectMap<>();

        // Act
        Node actualNode = new Node(1, "42", classUpgrade, requirements, bonus);
        Node left = new Node();
        actualNode.setLeft(left);
        Node right = new Node();
        actualNode.setRight(right);
        ObjectMap<String, String> actualBonus = actualNode.getBonus();
        String actualClassId = actualNode.getClassId();
        List<Node> actualClassUpgrade = actualNode.getClassUpgrade();
        int actualId = actualNode.getId();
        Node actualLeft = actualNode.getLeft();
        ObjectMap<String, String> actualRequirements = actualNode.getRequirements();

        // Assert that nothing has changed
        assertEquals("42", actualClassId);
        assertEquals(1, actualId);
        assertEquals(requirements, actualBonus);
        assertSame(bonus, actualBonus);
        assertSame(requirements, actualRequirements);
        assertSame(left, actualLeft);
        assertSame(right, actualNode.getRight());
        assertSame(classUpgrade, actualClassUpgrade);
    }

    /**
     * Method under test: {@link Node#Node()}
     */
    @Test
    void testNewNode() {
        // Arrange and Act
        Node actualNode = new Node();

        // Assert
        ObjectMap<String, String> bonus = actualNode.getBonus();
        assertEquals(0, bonus.size);
        ObjectMap<String, String> requirements = actualNode.getRequirements();
        assertEquals(0, requirements.size);
        assertFalse(bonus.iterator().hasNext());
        assertFalse(requirements.iterator().hasNext());
        assertTrue(actualNode.getClassUpgrade().isEmpty());
    }
}
