////////////////////////////////////////////////////////////////////
// Niccolo' Bassan 2145599
// Giacomo Miola 2145603
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    public void convert_shouldReturn_I_for1() {
        // Arrange
        int input = 1;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("I", result);
    }

    @Test
    public void convert_shouldReturn_II_for2() {
        // Arrange
        int input = 2;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("II", result);
    }

    @Test
    public void convert_shouldReturn_III_for3() {
        // Arrange
        int input = 3;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("III", result);
    }

    @Test
    public void convert_shouldReturn_IV_for4() {
        // Arrange
        int input = 4;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("IV", result);
    }

    @Test
    public void convert_shouldReturn_V_for5() {
        // Arrange
        int input = 5;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("V", result);
    }

    @Test
    public void convert_shouldReturn_VI_for6() {
        // Arrange
        int input = 6;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("VI", result);
    }

    @Test
    public void convert_shouldThrow_forZero() {
        // Arrange
        int input = 0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(input);
        });
    }
}
