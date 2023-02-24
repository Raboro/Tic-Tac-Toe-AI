package org.tictactoeai;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author MariusWoerfek
 * @since 1.0-SNAPSHOT
 */
class BoardTest {

    @Test
    void testNoTerminalState() {
        Board board = new Board();
        board.setField(Sign.CROSSES, Position.create(0, 0).get());
        assertFalse(board.isTerminalState());
        board.setField(Sign.NOUGHTS, Position.create(1, 0).get());
        assertFalse(board.isTerminalState());
        board.setField(Sign.CROSSES, Position.create(0, 1).get());
        assertFalse(board.isTerminalState());
        board.setField(Sign.NOUGHTS, Position.create(2, 2).get());
        assertFalse(board.isTerminalState());
    }

    @Test
    void testIsTerminalStateRow() {
        Board board = new Board();
        board.setField(Sign.CROSSES, Position.create(0, 0).get());
        board.setField(Sign.CROSSES, Position.create(0, 1).get());
        board.setField(Sign.CROSSES, Position.create(0, 2).get());
        board.setField(Sign.NOUGHTS, Position.create(1, 1).get());
        assertTrue(board.isTerminalState());
    }

    @Test
    void testIsTerminalStateColumn() {
        Board board = new Board();
        board.setField(Sign.NOUGHTS, Position.create(0, 0).get());
        board.setField(Sign.NOUGHTS, Position.create(1, 0).get());
        board.setField(Sign.NOUGHTS, Position.create(2, 0).get());
        board.setField(Sign.CROSSES, Position.create(1, 2).get());
        assertTrue(board.isTerminalState());
    }

    @Test
    void testIsTerminalStateDiagonal() {
        Board board = new Board();
        board.setField(Sign.CROSSES, Position.create(0, 0).get());
        board.setField(Sign.CROSSES, Position.create(1, 1).get());
        board.setField(Sign.CROSSES, Position.create(2, 2).get());
        board.setField(Sign.NOUGHTS, Position.create(0, 2).get());
        assertTrue(board.isTerminalState());
    }
}