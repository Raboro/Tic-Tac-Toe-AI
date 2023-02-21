package org.tictactoeai;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author MariusWoerfel
 * @since 1.0-SNAPSHOT
 */
class FieldTest {

    @Test
    void testDefaultSignBlank() {
        assertTrue(new Field().isBlank());
    }
}