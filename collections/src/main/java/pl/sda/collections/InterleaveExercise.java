package pl.sda.collections;

import java.util.ArrayList;
import java.util.List;

public class InterleaveExercise {

    /**
     * Metoda interleave powinna przyjąć dwie listy i zwrócić jedną, która zawiera
     * na zmianę elementy z jednej i z drugiej:
     * <p>
     * <p>
     * a: [1,2,3], b: [5,6,7] -> [1,5,2,6,3,7]
     */
    public static List<Integer> interleave(List<Integer> a, List<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            result.add(a.get(i));
            result.add(b.get(i));
        }

        return result;
    }

}
