package pl.sda.strings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Napisz program w klasie `ReadWords` wczytujący linie tekstu ze standardowego wejścia
 * do listy aż do wpisania słowa *"koniec"*.
 * Następnie program powinien wyświetlić je podzielone przecinkami pomijajac `koniec`.
 * Na przykład: `Wczytano 3 słowa: Jaś, piłka, słowo.`.
 * <p>
 * Rozważ użycie metod `String.join` i `String.format`.
 */
public class ReadWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();

        String next = scanner.next();

        do {
            words.add(next);
            next = scanner.next();
        } while (!next.equals("koniec"));

        String result = String.format("Wczytano %d słowa: %s.", words.size(), String.join(" i ", words));

        System.out.println(result);
    }

}
