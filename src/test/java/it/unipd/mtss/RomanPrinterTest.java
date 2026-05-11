////////////////////////////////////////////////////////////////////
// Niccolo' Bassan 2145599
// Giacomo Miola 2145603
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {

    @Test
    public void classExists() {
        // Arrange
        RomanPrinter printer = new RomanPrinter();

        // Act & Assert
        assertEquals(true, printer != null);
    }
}
