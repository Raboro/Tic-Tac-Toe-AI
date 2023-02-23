package org.tictactoeai;

/**
 * Class representation of a board field
 * Contains a sign: Blank or one of the player signs
 *
 * @author MariusWoerfel
 * @since 1.0-SNAPSHOT
 */
public class Field {

    private Sign sign;

    Field() {
        this.sign = Sign.BLANK;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }

    public boolean isBlank() {
        return isSign(Sign.BLANK);
    }

    public boolean isSign(Sign sign) {
        return this.sign.equals(sign);
    }

    @Override
    public boolean equals(Object o) {
        Field compare = (Field) o;
        return compare.isSign(sign);
    }

    @Override
    public String toString() {
        return String.valueOf(sign.character());
    }
}