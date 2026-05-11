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
    public void convert_shouldReturn_XI_for11() {
        // Arrange
        int input = 11;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("XI", result);
    }

    @Test
    public void convert_shouldReturn_XIV_for14() {
        // Arrange
        int input = 14;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("XIV", result);
    }

    @Test
    public void convert_shouldReturn_XV_for15() {
        // Arrange
        int input = 15;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("XV", result);
    }

    @Test
    public void convert_shouldReturn_XVIII_for18() {
        // Arrange
        int input = 18;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("XVIII", result);
    }

    @Test
    public void convert_shouldReturn_XIX_for19() {
        // Arrange
        int input = 19;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("XIX", result);
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
    public void convert_shouldThrow_forZero() {
        // Arrange
        int input = 0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(input);
        });
    }
}
