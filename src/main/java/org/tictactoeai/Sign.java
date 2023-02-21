package org.tictactoeai;

/**
 * Enum representation of the three signs in TicTacToe
 *
 * @author MariusWoerfel
 * @since 1.0.0.SNAPSHOT
 */
public enum Sign {

    NOUGHTS('O'),
    CROSSES('X'),
    BLANK(' ')
    ;

    private final char character;

    Sign(char character) {
        this.character = character;
    }

    public char character() {
        return character;
    }

    @Override
    public String toString() {
        return "Signs: NOUGHTS[O] or CROSSES[X] or BLANK[ ]";
    }
}