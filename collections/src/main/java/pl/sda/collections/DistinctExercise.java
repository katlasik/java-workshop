package pl.sda.collections;

import java.util.*;

public class DistinctExercise {

    /**
     * Stwórz metodę distinct przyjmującą jako argument listę intów.
     * Metoda ta powinna zwrócić również listę intów ale powinna pomijać wszystkie wystepujące już liczby.
     * Na przykład:
     * <p>
     * [1,2,3] -> [1,2,3]
     * [2,2,3] -> [2,3]
     */

    public static List<Integer> distinct(List<Integer> input) {
        Set<Integer> set = new HashSet<>(input);
        return new ArrayList<>(set);
    }

}
