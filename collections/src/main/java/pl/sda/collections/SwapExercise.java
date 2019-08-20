package pl.sda.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Stwórz metodę, `int[] swap(int[] array, int from, int to)`, która zamienia miejscami dwie liczby o indeksach
 * wskazanych przez `from` i `to`. Stwórz przeładowaną wersję dla listy.
 */
public class SwapExercise {

    static int[] swap (int[] ints, int from, int to) {

        int[] newInts = new int[ints.length];

        for (int i = 0; i < ints.length; i++) {
            if(i == from) {
                newInts[i] = ints[to];
            } else if(i == to) {
                newInts[i] = ints[from];
            } else {
                newInts[i] = ints[i];
            }
        }

        return newInts;
    }

    static List<Integer> swapList (List<Integer> ints, int from, int to) {
       ArrayList<Integer> newInts = new ArrayList<Integer>();

        for (int i = 0; i < ints.size(); i++) {
            if(i == from) {
                newInts.add(ints.get(to));
            } else if(i == to) {
                newInts.add(ints.get(from));
            } else {
                newInts.add(ints.get(i));
            }
        }

        return newInts;
    }

}
