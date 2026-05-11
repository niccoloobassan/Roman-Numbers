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
    public void print_shouldReturnCorrectOutput_for1() {
        // Arrange
        int input = 1;
        String expected =
            " _______  \n"
            + "|__   __| \n"
            + "   | |    \n"
            + "   | |    \n"
            + " __| |__  \n"
            + "|_______| ";

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void print_shouldReturnCorrectOutput_for5() {
        // Arrange
        int input = 5;
        String expected =
            "__      __\n"
            + "\\ \\    / /\n"
            + " \\ \\  / / \n"
            + "  \\ \\/ /  \n"
            + "   \\  /   \n"
            + "    \\/    ";

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void print_shouldReturnCorrectOutput_for10() {
        // Arrange
        int input = 10;
        String expected =
            " __    __ \n"
            + " \\ \\  / / \n"
            + "  \\ \\/ /  \n"
            + "   >  <   \n"
            + "  / /\\ \\  \n"
            + " /_/  \\_\\ ";

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void print_shouldHaveUniformLineWidth_for4() {
        // Arrange
        int input = 4;

        // Act
        String result = RomanPrinter.print(input);
        String[] lines = result.split("\n");

        // Assert
        int firstLineLength = lines[0].length();
        for (int i = 1; i < lines.length; i++) {
            assertEquals(firstLineLength, lines[i].length(),
                "Riga " + i + " ha lunghezza diversa");
        }
    }

    @Test
    public void print_shouldHaveUniformLineWidth_for999() {
        // Arrange
        int input = 999;

        // Act
        String result = RomanPrinter.print(input);
        String[] lines = result.split("\n");

        // Assert
        int firstLineLength = lines[0].length();
        for (int i = 1; i < lines.length; i++) {
            assertEquals(firstLineLength, lines[i].length(),
                "Riga " + i + " ha lunghezza diversa");
        }
    }

    @Test
    public void print_shouldReturn6Lines_forAllValues() {
        // Arrange & Act & Assert
        for (int i = 1; i <= 1000; i++) {
            String result = RomanPrinter.print(i);
            String[] lines = result.split("\n");
            assertEquals(6, lines.length,
                "Il numero " + i + " non ha 6 righe");
        }
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
