package pl.sda.dates;

import java.time.LocalDate;

/**
 * Napisz funkcję, która zwraca liczbę dni do następnych urodzin podanych jako parametr.
 */
public class NextBirthDay {

    static int nextBirthDay(LocalDate birthday) {
        return 0;
    }

    public static void main(String[] args) {

        int days = nextBirthDay(LocalDate.parse("1988-02-04"));

        System.out.println(String.format("Moje następne urodziny są za %d dni", days));

    }

}
