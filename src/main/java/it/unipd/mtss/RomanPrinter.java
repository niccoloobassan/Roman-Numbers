//------------------------------------------------------------------
// Niccolo' Bassan 2145599
// Giacomo Miola 2145603
//------------------------------------------------------------------
package it.unipd.mtss;

/**
 * Classe per la stampa di numeri romani in formato ASCII art.
 * Ogni lettera romana ha una larghezza fissa di 10 caratteri
 * e un'altezza di 6 righe.
 */
public class RomanPrinter {

    private static final int ROWS = 6;

    private static final String[][] ASCII_ART = {
        // I
        {" _______  ",
         "|__   __| ",
         "   | |    ",
         "   | |    ",
         " __| |__  ",
         "|_______| "},
        // V
        {"__      __",
         "\\ \\    / /",
         " \\ \\  / / ",
         "  \\ \\/ /  ",
         "   \\  /   ",
         "    \\/    "},
        // X
        {" __    __ ",
         " \\ \\  / / ",
         "  \\ \\/ /  ",
         "   >  <   ",
         "  / /\\ \\  ",
         " /_/  \\_\\ "},
        // L
        {" _        ",
         "| |       ",
         "| |       ",
         "| |       ",
         "| |____   ",
         "|______|  "},
        // C
        {"  _____   ",
         " / ____|  ",
         "| |       ",
         "| |       ",
         "| |____   ",
         " \\_____|  "},
        // D
        {"  _____   ",
         " |  __ \\  ",
         " | |  | | ",
         " | |  | | ",
         " | |__| | ",
         " |_____/  "},
        // M
        {" __    __ ",
         "|  \\  /  |",
         "|  |\\/|  |",
         "|  |  |  |",
         "|  |  |  |",
         "|__|  |__|"}
    };

    /**
     * Stampa la rappresentazione ASCII art di un numero.
     *
     * @param num il numero da stampare (1-1000)
     * @return la stringa ASCII art su 6 righe
     */
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            throw new IllegalArgumentException(
                "Il numero romano non puo' essere vuoto");
        }
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < ROWS; row++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < romanNumber.length(); j++) {
                int index = getIndex(romanNumber.charAt(j));
                if (j > 0) {
                    line.append(" ");
                }
                line.append(ASCII_ART[index][row]);
            }
            result.append(line.toString());
            if (row < ROWS - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    private static int getIndex(char c) {
        switch (c) {
            case 'I': return 0;
            case 'V': return 1;
            case 'X': return 2;
            case 'L': return 3;
            case 'C': return 4;
            case 'D': return 5;
            case 'M': return 6;
            default:
                throw new IllegalArgumentException(
                    "Carattere non valido: " + c);
        }
    }
}
