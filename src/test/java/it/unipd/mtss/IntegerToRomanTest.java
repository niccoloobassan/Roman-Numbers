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
    public void convert_shouldReturn_XC_for90() {
        // Arrange
        int input = 90;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("XC", result);
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
    public void convert_shouldReturn_CD_for400() {
        // Arrange
        int input = 400;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("CD", result);
    }

    @Test
    public void convert_shouldReturn_D_for500() {
        // Arrange
        int input = 500;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("D", result);
    }

    @Test
    public void convert_shouldReturn_CM_for900() {
        // Arrange
        int input = 900;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("CM", result);
    }

    @Test
    public void convert_shouldReturn_M_for1000() {
        // Arrange
        int input = 1000;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("M", result);
    }

    @Test
    public void convert_shouldReturn_CDXLIV_for444() {
        // Arrange
        int input = 444;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("CDXLIV", result);
    }

    @Test
    public void convert_shouldReturn_CMXCIX_for999() {
        // Arrange
        int input = 999;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("CMXCIX", result);
    }

    @Test
    public void convert_shouldReturn_DCCLXXVII_for777() {
        // Arrange
        int input = 777;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("DCCLXXVII", result);
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

    @Test
    public void convert_shouldThrow_forNegative() {
        // Arrange
        int input = -1;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(input);
        });
    }

    @Test
    public void convert_shouldThrow_forGreaterThan1000() {
        // Arrange
        int input = 1001;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(input);
        });
    }
}
