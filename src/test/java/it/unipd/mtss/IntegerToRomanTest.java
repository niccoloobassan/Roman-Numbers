////////////////////////////////////////////////////////////////////
// Niccolo' Bassan 2145599
// Giacomo Miola 2145603
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    public void classExists() {
        // Arrange
        IntegerToRoman converter = new IntegerToRoman();

        // Act & Assert
        assertEquals(true, converter != null);
    }
}
