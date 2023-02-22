package org.tictactoeai;

/**
 * Class which represents the AI which uses the Minimax algorithm to play against the user
 *
 * @author MariusWoerfel
 * @since 1.0-SNAPSHOT
 */
public class Ai extends Player{

    public Ai(Sign sign) {
        super(sign);
    }

    @Override
    Position move() {
        return Position.create(0, 0).orElse(null);
    }
}