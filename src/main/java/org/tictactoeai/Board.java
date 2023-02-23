package org.tictactoeai;

import java.util.stream.IntStream;

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
        return isRowTerminalState() || isColumnTerminalState() || isDiagonalTerminalState();
    }

    private boolean isRowTerminalState() {
        return IntStream.range(0, 3).anyMatch(this::isRowTerminalState);
    }

    private boolean isRowTerminalState(int i) {
        return fields[i][0].equals(fields[i][1]) && fields[i][0].equals(fields[i][2]) && !fields[i][0].isBlank();
    }

    private boolean isColumnTerminalState() {
        return IntStream.range(0, 3).anyMatch(this::isColumnTerminalState);
    }

    private boolean isColumnTerminalState(int i) {
        return fields[0][i].equals(fields[1][i]) && fields[0][i].equals(fields[2][i]) && !fields[0][i].isBlank();
    }

    private boolean isDiagonalTerminalState() {
        boolean bottomLeftToTopRight = fields[2][0].equals(fields[1][1]) && fields[2][0].equals(fields[0][2]) &&
                !fields[0][2].isBlank();
        boolean topLeftToBottomRight = fields[0][0].equals(fields[1][1]) && fields[0][0].equals(fields[2][2]) &&
                !fields[2][2].isBlank();
        return bottomLeftToTopRight || topLeftToBottomRight;
    }

    public void print() {
        String splitRow = "---|---|---\n";
        String splitColumn = " | ";
        String board = " " + fields[0][0] + splitColumn + fields[0][1] + splitColumn + fields[0][2] + "\n" + splitRow +
                " " + fields[1][0] + splitColumn + fields[1][1] + splitColumn + fields[1][2] + "\n" + splitRow +
                " " + fields[2][0] + splitColumn + fields[2][1] + splitColumn + fields[2][2] + "\n";
        System.out.println(board);
    }
}