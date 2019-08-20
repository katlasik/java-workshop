package pl.sda.collections;

import java.util.List;

public class IsSortedExercise {

    /**
     * Metoda isSorted powinna zwracać true jeżeli elementy są posortowane rosnąco:
     *
     * ints: [1,2,3] -> true
     * ints: [5,1,3,4] -> true
     */

    public static boolean isSorted(List<Integer> ints) {

        for(int i = 0; i < ints.size() - 1; i ++ ){
            if(ints.get(i) >= ints.get(i + 1)) {
                return false;
            }
        }
        return true;
    }


    /**
     * Stwórz drugą wersję metody isSorted, która przyjmuje drugi parametr. Powinna zwracać true jeżeli elementy są posortowane rosnąco
     * i parametr ascending to true. Jeżeli ascending to false, to powinna zwracać true gry element maleją.
     *
     * ints: [1,2,3] -> true
     * ints: [5,1,3,4] -> true
     */

    public static boolean isSorted(List<Integer> ints, boolean ascending) {

        for(int i = 0; i < ints.size() - 1; i ++ ){
            if(ascending) {
                if(ints.get(i) >= ints.get(i + 1)) {
                    return false;
                }
            } else {
                if(ints.get(i) <= ints.get(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }


}
