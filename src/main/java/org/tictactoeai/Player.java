package org.tictactoeai;

/**
 * Abstract class defines a player of the game with a move method which selects a move on the board
 *
 * @author MariusWoerfel
 * @since 1.0-SNAPSHOT
 */
public abstract class Player {

    protected final Sign sign;

    public Player(Sign sign) {
        this.sign = sign;
    }

    abstract int[][] move();
}