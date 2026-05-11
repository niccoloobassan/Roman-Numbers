////////////////////////////////////////////////////////////////////
// Niccolo' Bassan 2145599
// Giacomo Miola 2145603
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

/**
 * Classe per la conversione di numeri interi in numeri romani.
 */
public class IntegerToRoman {

    private static final int[] VALUES = {1};
    private static final String[] SYMBOLS = {"I"};

    /**
     * Converte un numero intero nel corrispondente numero romano.
     *
     * @param number il numero da convertire (1-3)
     * @return la rappresentazione in numeri romani
     * @throws IllegalArgumentException se il numero non e' valido
     */
    public static String convert(int number) {
        if (number < 1 || number > 3) {
            throw new IllegalArgumentException(
                "Il numero deve essere compreso tra 1 e 3, "
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
