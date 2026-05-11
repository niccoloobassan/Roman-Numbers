////////////////////////////////////////////////////////////////////
// Niccolo' Bassan 2145599
// Giacomo Miola 2145603
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

/**
 * Classe per la conversione di numeri interi in numeri romani.
 * Supporta la conversione di numeri da 1 a 1000.
 */
public class IntegerToRoman {

    private static final int[] VALUES = {
        1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };
    private static final String[] SYMBOLS = {
        "M", "CM", "D", "CD", "C", "XC", "L", "XL",
        "X", "IX", "V", "IV", "I"
    };

    /**
     * Converte un numero intero nel corrispondente numero romano.
     *
     * @param number il numero da convertire (1-1000)
     * @return la rappresentazione in numeri romani
     * @throws IllegalArgumentException se il numero non e' valido
     */
    public static String convert(int number) {
        if (number < 1) {
            throw new IllegalArgumentException(
                "Il numero deve essere maggiore di 0, "
                + "ricevuto: " + number);
        }
        if (number > 1000) {
            throw new IllegalArgumentException(
                "Il numero deve essere minore o uguale a 1000, "
                + "ricevuto: " + number);
        }
        StringBuilder roman = new StringBuilder();
        int remaining = number;
        for (int i = 0; i < VALUES.length; i++) {
            while (remaining >= VALUES[i]) {
                roman.append(SYMBOLS[i]);
                remaining -= VALUES[i];
            }
        }
        return roman.toString();
    }
}
