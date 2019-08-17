package pl.sda.collections;

import java.util.List;

public class AllNegativeExercise {

    /**
     * Stwórz metodę `boolean allNegative(List<Integer> elements)`
     * zwracającą **true** tylko jeżeli wszystkie elementy listy są ujemne.
     */
    public static boolean allNegative(List<Integer> ints) {
        for(int i: ints) {
            if(i >= 0) {
                return false;
            }
        }
        return true;
    }

}
