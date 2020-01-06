package pl.sda.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Stwórz klasę `Filter`, która w konstruktorze przyjmuje dwie liczby i posiada metodę `filter`,
 * która przyjmuje kolekcje liczb. Metoda ta powinna zwrócić nową kolekcję, ale tylko
 * z liczbami, które znajdują się między tymi przyjętymi w konstruktorze.
 * <p>
 * Dla `from` równe *3* i `to` równe *6*:
 * <p>
 * `[1,2,3,5,10]` -> `[3,5]`
 */
public class Filter {

    private final int to;
    private final int from;

    public Filter(int from, int to) {
        this.from = from;
        this.to = to;
    }

    List<Integer> filter(List<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i : list) {
            if (i >= from && i <= to) {
                result.add(i);
            }
        }

        return result;

    }

}
