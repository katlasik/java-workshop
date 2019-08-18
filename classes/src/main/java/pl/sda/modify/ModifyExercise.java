package pl.sda.modify;

import java.util.List;
public class ModifyExercise {

    /**
     * Stwórz metodę modifyUpperCase, która będzie otrzymywać listę stringów oraz liczbę (indeks elementu).
     * Gdy indeks nie będzie wskazywał na żaden element rzuć IllegalArgumentException.
     * W przypadku gdy zostanie podany poprawny indeks to zmień wszystkie znaki
     * we wskazanym stringu na wielkie litery, a resztę pozostaw niezmienioną.
     * Na przykład: ["aaa", "bbb", "ccc", "ddd"] oraz 2 -> ["aaa", "bbb", "CCC", "ddd"]
     */
    public static List<String> modifyUppercase(List<String> strings, int index) {
        return null;
    }

    /**
     *
     * Stwórz analogiczną metody modifyRepeat, która powiela string dwukrotnie.
     * ["aaa", "bbb", "ccc", "ddd"] oraz 2 -> ["aaa", "bbb", "cccccc", "ddd"]
     *
     */
    public static List<String> modifyRepeat(List<String> strings, int index) {
        return null;
    }

    /**
     * Zastanów się, czy za pomocą interfejsów można stworzyć ogólną wersję metody modify.
     */

    public static List<String> modify(List<String> strings, int index) {
        return null;
    }

    /**
     * Zastanów się, czy nie można zmienić metody modify, tak by można było wyszukiwać element po dowolnej właściwości nie tylko po indeksie.
     */

    public static List<String> modifyFind(List<String> strings) {
        return null;
    }

    public static void main(String[] args) {
        List<String> strings = List.of("raz", "dwa", "trzy", "cztery");

        System.out.println(modifyUppercase(strings, 3));
        System.out.println(modifyRepeat(strings, 2));

    }


}