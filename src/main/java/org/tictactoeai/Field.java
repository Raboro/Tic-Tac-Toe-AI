package org.tictactoeai;

/**
 * Class representation of a board field
 * Contains a sign: Blank or one of the player signs
 *
 * @author MariusWoerfel
 * @since 1.0.0.SNAPSHOT
 */
public class Field {

    private Sign sign;

    Field() {
        this.sign = Sign.BLANK;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }

    public boolean isEmpty() {
        return isSign(Sign.BLANK);
    }

    public boolean isSign(Sign sign) {
        return this.sign.equals(sign);
    }

    @Override
    public String toString() {
        return "Field { sign = '" + sign.character() + "' }";
    }
}