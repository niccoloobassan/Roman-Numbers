////////////////////////////////////////////////////////////////////
// Niccolo' Bassan 2145599
// Giacomo Miola 2145603
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {

    @Test
    public void print_shouldReturnNotNull_for1() {
        // Arrange
        int input = 1;

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void print_shouldReturn6Lines_for1() {
        // Arrange
        int input = 1;

        // Act
        String result = RomanPrinter.print(input);
        String[] lines = result.split("\n");

        // Assert
        assertEquals(6, lines.length);
    }

    @Test
    public void print_shouldReturn6Lines_for5() {
        // Arrange
        int input = 5;

        // Act
        String result = RomanPrinter.print(input);
        String[] lines = result.split("\n");

        // Assert
        assertEquals(6, lines.length);
    }

    @Test
    public void print_shouldReturn6Lines_for10() {
        // Arrange
        int input = 10;

        // Act
        String result = RomanPrinter.print(input);
        String[] lines = result.split("\n");

        // Assert
        assertEquals(6, lines.length);
    }

    @Test
    public void print_shouldReturn6Lines_for1000() {
        // Arrange
        int input = 1000;

        // Act
        String result = RomanPrinter.print(input);
        String[] lines = result.split("\n");

        // Assert
        assertEquals(6, lines.length);
    }

    @Test
    public void print_shouldContainLetters_for4() {
        // Arrange
        int input = 4;

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertTrue(result.contains("|"));
        assertTrue(result.contains("/"));
    }

    @Test
    public void print_shouldThrow_forZero() {
        // Arrange
        int input = 0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(input);
        });
    }

    @Test
    public void print_shouldThrow_forNegative() {
        // Arrange
        int input = -5;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(input);
        });
    }

    @Test
    public void print_shouldThrow_forGreaterThan1000() {
        // Arrange
        int input = 1001;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(input);
        });
    }
}
