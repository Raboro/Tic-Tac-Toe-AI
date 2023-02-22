package org.tictactoeai;

import java.util.Optional;

/**
 * Representation of a Board position, which can only statically be created with check if x and y are valid
 *
 * @author MariusWoerfel
 * @since 1.0-SNAPSHOT
 */
public class Position {

    final int x;
    final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Optional<Position> create(int x, int y) {
        return (isValid(x, y)) ? Optional.of(new Position(x, y)) : Optional.empty();
    }

    private static boolean isValid(int x, int y) {
        return x >= 0 && x < 3 && y >= 0 && y < 3;
    }
}