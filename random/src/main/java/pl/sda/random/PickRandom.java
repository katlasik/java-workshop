package pl.sda.random;

import java.util.List;
import java.util.Random;

/**
 * Stwórz metode `pickRandom`, która przyjmuje dowolną ilość liczb i losuje jedną z nich:
 *
 *    `[1,2,3,4,5] ~> 1`
 */
public class PickRandom {

    private static Random random = new Random();

    static Integer pickRandom(List<Integer> values) {
        return values.get(random.nextInt(values.size()));
    }

    static <T> T pickRandom(T... values) {
        return values[random.nextInt(values.length)];
    }

    public static void main(String[] args) {
        System.out.println(pickRandom(List.of(1,3,4,5,6)));
        System.out.println(pickRandom(List.of(10, 20, 30, 40)));
        System.out.println(pickRandom("A", "B", "C"));
    }

}
