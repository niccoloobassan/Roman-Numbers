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
    public void convert_shouldReturn_IX_for9() {
        // Arrange
        int input = 9;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("IX", result);
    }

    @Test
    public void convert_shouldReturn_X_for10() {
        // Arrange
        int input = 10;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("X", result);
    }

    @Test
    public void convert_shouldReturn_XX_for20() {
        // Arrange
        int input = 20;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("XX", result);
    }

    @Test
    public void convert_shouldReturn_XL_for40() {
        // Arrange
        int input = 40;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("XL", result);
    }

    @Test
    public void convert_shouldReturn_L_for50() {
        // Arrange
        int input = 50;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("L", result);
    }

    @Test
    public void convert_shouldReturn_LX_for60() {
        // Arrange
        int input = 60;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("LX", result);
    }

    @Test
    public void convert_shouldReturn_LXX_for70() {
        // Arrange
        int input = 70;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("LXX", result);
    }

    @Test
    public void convert_shouldReturn_LXXX_for80() {
        // Arrange
        int input = 80;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("LXXX", result);
    }

    @Test
    public void convert_shouldReturn_XC_for90() {
        // Arrange
        int input = 90;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("XC", result);
    }

    @Test
    public void convert_shouldReturn_XCIX_for99() {
        // Arrange
        int input = 99;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("XCIX", result);
    }

    @Test
    public void convert_shouldReturn_C_for100() {
        // Arrange
        int input = 100;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("C", result);
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
