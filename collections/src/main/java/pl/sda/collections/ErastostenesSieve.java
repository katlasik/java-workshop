package pl.sda.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Zaimplementuj sito Erastotenesa. Funkcja obliczająca sito powinna
 * otrzymać jako parametr liczbę `limit` i powinna znaleźc wszystkie liczby pierwsze mniejsze od `limit`.
 */
public class ErastostenesSieve {

    public static List<Integer> erastostenesSieve(int limit) {

        ArrayList<Boolean> flags = new ArrayList<>(limit);

        for (int i = 0; i < limit; i++) {
            flags.add(true);
        }

        flags.set(0, false); //ustawiamy 1 na false

        for (int i = 2; i < limit / 2; i++) {
            int multiplier = 2; //zaczynamy od mnożnika 2
            int number = multiplier * i; //mnożnik razy i -> liczb nie jest pierwsza

            while (number <= limit) {
                flags.set(number - 1, false); //ustawiamy liczby które nie są pierwsze
                multiplier++; // zwiększamy mnożnik
                number = multiplier * i;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < flags.size(); i++) { //zamieniamy flagi na konkretne liczby
            if (flags.get(i)) {
                result.add(i + 1);
            }
        }

        return result;
    }

}
