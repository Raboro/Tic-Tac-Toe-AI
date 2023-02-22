package org.tictactoeai;

/**
 * Represents the board of the game
 *
 * @author MariusWoerfel
 * @since 1.0-SNAPSHOT
 */
public class Board {

    private final Field[][] fields;

    public Board() {
        fields = new Field[3][3];
    }

    public void setField(Sign sign, Position position) {
        fields[position.x][position.y].setSign(sign);
    }

    public boolean isTerminalState() {
        return false;
    }

    public void print() {

    }
}