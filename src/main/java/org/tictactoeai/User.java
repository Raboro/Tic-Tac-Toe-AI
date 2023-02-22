package org.tictactoeai;

/**
 * Player class for the user, who plays against the AI
 *
 * @author MariusWoerfel
 * @since 1.0-SNAPSHOT
 */
public class User extends Player {

    public User(Sign sign) {
        super(sign);
    }

    @Override
    int[][] move() {
        return new int[0][];
    }
}