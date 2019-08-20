package pl.sda.generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * Stwórz klasę `RandomList<X>`, która ma dwie metody `add(X element)` oraz `X getRandom(boolean returning)`.
 * Po dodaniu elementów do listy wywołanie metody `getRandom` powinno zwracać losowy element. Jeżeli `returning` to **false**,
 * to lista powinna usunąć wylosowany element, a jeżeli **true** to powinna go zachować. Jeżeli metoda zostanie wywołana
 * na pustej liście rzuć wyjątek `IllegalStateException`.
 */

public class RandomList<X> {

    private final ArrayList<X> list = new ArrayList<>();
    private final Random random = new Random();

    public void add(X element) {
        list.add(element);
    }

    X getRandom(boolean returning) {

        if(list.size() == 0) {
            throw new IllegalStateException("Nie można wylosować elementu z pustej listy.");
        }

        int idx = random.nextInt(list.size());

        X element = list.get(idx);

        if(!returning) {
            list.remove(idx);
        }

        return element;
    }

    public static void main(String[] args) {

        RandomList<String> names = new RandomList<>();

        names.add("Krystian");
        names.add("Stefan");
        names.add("Jarosław");

        System.out.println(names.getRandom(true));
        System.out.println(names.getRandom(false));
        System.out.println(names.getRandom(false));
        System.out.println(names.getRandom(false));
        System.out.println(names.getRandom(false));
    }

}
