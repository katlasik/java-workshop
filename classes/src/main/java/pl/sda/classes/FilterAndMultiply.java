package pl.sda.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Stwórz klasę `pl.sda.classes.FilterAndMultiply`, która w konstruktorze przyjmuje trzy liczby i posiada metodę `filterAndMultiply`,
 * która przyjmuje kolekcje liczb. Metoda ta powinna zwrócić nową kolekcję, ale tylko
 * z liczbami, które znajdują się między dwoma pierwszymi liczbami przyjętymi w konstruktorze oraz ze wszystkimi elementami
 * pomnożonymi razy trzeci argument konstuktora.
 * <p>
 * Rozważ rozszerenie klasy pl.sda.classes.Filter.
 * <p>
 * new pl.sda.classes.FilterAndMultiply(3,4,5)
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
