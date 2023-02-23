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
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fields[i][j] = new Field();
            }
        }
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