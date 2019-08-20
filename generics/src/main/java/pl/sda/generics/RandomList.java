package pl.sda.generics;


/**
 * Stwórz klasę `RandomList<X>`, która ma dwie metody `add(X element)` oraz `X getRandom(boolean returning)`.
 * Po dodaniu elementów do listy wywołanie metody `getRandom` powinno zwracać losowy element. Jeżeli `returning` to **false**,
 * to lista powinna usunąć wylosowany element, a jeżeli **true** to powinna go zachować. Jeżeli metoda zostanie wywołana
 * na pustej liście rzuć wyjątek `IllegalStateException`.
 */

public class RandomList<X> {

    public void add(X element) {
    }

    X getRandom(boolean returning) {
        return null;
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
