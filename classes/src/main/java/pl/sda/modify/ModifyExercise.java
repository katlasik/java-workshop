package pl.sda.modify;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ModifyExercise {

    /**
     * Stwórz metodę modifyUpperCase, która będzie otrzymywać listę stringów oraz liczbę (indeks elementu).
     * Gdy indeks nie będzie wskazywał na żaden element rzuć IllegalArgumentException.
     * W przypadku gdy zostanie podany poprawny indeks to zmień wszystkie znaki
     * we wskazanym stringu na wielkie litery, a resztę pozostaw niezmienioną.
     * Na przykład: ["aaa", "bbb", "ccc", "ddd"] oraz 2 -> ["aaa", "bbb", "CCC", "ddd"]
     */
    public static List<String> modifyUppercase(List<String> strings, int index) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            if (i == index) {
                result.add(strings.get(i).toUpperCase());
            } else {
               result.add(strings.get(i));
            }
        }

        return result;
    }

    /**
     *
     * Stwórz analogiczną metody modifyRepeat, która powiela string dwukrotnie.
     * ["aaa", "bbb", "ccc", "ddd"] oraz 2 -> ["aaa", "bbb", "cccccc", "ddd"]
     *
     */
    public static List<String> modifyRepeat(List<String> strings, int index) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            if (i == index) {
                result.add(strings.get(i)+strings.get(i));
            } else {
                result.add(strings.get(i));
            }
        }

        return result;
    }

    interface Modification {
        String modify(String input);
    }

    /**
     * Zastanów się, czy za pomocą interfejsów można stworzyć ogólną wersję metody modify.
     */
    public static List<String> modify(List<String> strings, int index, Modification modification) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            if (i == index) {
                result.add(modification.modify(strings.get(i)));
            } else {
                result.add(strings.get(i));
            }
        }
        return result;
    }

    /**
     * Zastanów się, czy nie można zmienić metody modify, tak by można było wyszukiwać element po dowolnej właściwości nie tylko po indeksie.
     */
    public static List<String> modifyFind(List<String> strings, Predicate<String> where, Modification modification) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            if (where.test(strings.get(i))) {
                result.add(modification.modify(strings.get(i)));
            } else {
                result.add(strings.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> strings = List.of("raz", "dwa", "trzy", "cztery");

        System.out.println(modifyUppercase(strings, 3));
        System.out.println(modifyRepeat(strings, 2));

        System.out.println(modify(strings, 1, new Modification() {
            @Override
            public String modify(String input) {
                return input.toUpperCase();
            }
        }));

        System.out.println(modify(strings, 0, input -> input.toUpperCase()));

        System.out.println(modifyFind(strings, s -> s.startsWith("c"), s -> s.toUpperCase()));
    }


}
