package org.tictactoeai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class PositionTest {

    @Test
    void testInvalidArguments() {
        assertFalse(Position.create(-1, -1).isPresent());
        assertFalse(Position.create(-1, 0).isPresent());
        assertFalse(Position.create(0, -1).isPresent());
        assertFalse(Position.create(3, 0).isPresent());
        assertFalse(Position.create(0, 3).isPresent());
        assertFalse(Position.create(3, 3).isPresent());
    }

    @Test
    void testValidArguments() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertTrue(Position.create(i, j).isPresent());
            }
        }
    }
}