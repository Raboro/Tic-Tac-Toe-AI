package org.tictactoeai;

import java.util.Optional;
import java.util.Scanner;

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
    Position move() {
        Optional<Position> position;
        do {
            position = getPosition();
        } while (position.isEmpty());
        return position.get();
    }

    private Optional<Position> getPosition() {
        String[] input = getUserInput();
        return isValidLength(input) ?
                Position.create(Integer.parseInt(input[0]), Integer.parseInt(input[1])) :
                Optional.empty();
    }

    private static String[] getUserInput() {
        System.out.println("Select a valid Position [0-2] by type value for x and y separated with a space:");
        return new Scanner(System.in).nextLine().split(" ");
    }

    private boolean isValidLength(String[] input) {
        return input.length == 2;
    }
}