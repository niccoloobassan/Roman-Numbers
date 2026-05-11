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
    public void convert_shouldReturn_VII_for7() {
        // Arrange
        int input = 7;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("VII", result);
    }

    @Test
    public void convert_shouldReturn_VIII_for8() {
        // Arrange
        int input = 8;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("VIII", result);
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
    public void convert_shouldReturn_XXV_for25() {
        // Arrange
        int input = 25;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("XXV", result);
    }

    @Test
    public void convert_shouldReturn_XXIX_for29() {
        // Arrange
        int input = 29;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("XXIX", result);
    }

    @Test
    public void convert_shouldReturn_XXX_for30() {
        // Arrange
        int input = 30;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("XXX", result);
    }

    @Test
    public void convert_shouldReturn_XXXIX_for39() {
        // Arrange
        int input = 39;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("XXXIX", result);
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
    public void convert_shouldReturn_XLIV_for44() {
        // Arrange
        int input = 44;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("XLIV", result);
    }

    @Test
    public void convert_shouldReturn_XLIX_for49() {
        // Arrange
        int input = 49;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("XLIX", result);
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
    public void convert_shouldThrow_forZero() {
        // Arrange
        int input = 0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(input);
        });
    }
}
