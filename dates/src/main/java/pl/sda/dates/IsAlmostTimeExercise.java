package pl.sda.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Napisz funkcję `isAlmostTime` zwracającą true, jeżeli obecny czas jest z zakresie +/- 5 minut od podanego
 * w parametrze.
 */
public class IsAlmostTimeExercise {

    static boolean isAlmostTime(LocalTime time) {
        LocalTime now = LocalTime.now();

        return now.isAfter(time.minus(5, ChronoUnit.MINUTES)) &&
                now.isBefore(time.plus(5, ChronoUnit.MINUTES));

    }

    public static void main(String[] args) {
        boolean almost = isAlmostTime(LocalTime.of(12, 0, 0));
        System.out.println("Czy jest prawie dwunasta? " + (almost ? "Tak." : "Nie."));
    }


}
