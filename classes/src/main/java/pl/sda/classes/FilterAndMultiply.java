package pl.sda.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Stwórz klasę `FilterAndMultiply`, która dziedziczy po `Filter` i która
 * oprócz tego, że filtruje liczby, mnoży je razy parametr podany jako trzeci w konstruktorze. Skorzystaj z logiki filtrowanie
 * zaimplementowanej w `Filter` i nie implementuj jej drugi raz w `Filter`.
 *
 * [1,2,3,5,10] -> [15,25]
 */
public class FilterAndMultiply extends Filter {

    private final int times;

    public FilterAndMultiply(int from, int to, int times) {
        super(from, to);
        this.times = times;
    }

    List<Integer> filterAndMultiply(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        List<Integer> filtered = super.filter(list);
        for (int i : filtered) {
            result.add(i * times);
        }
        return result;
    }

}
