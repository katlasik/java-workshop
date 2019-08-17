package pl.sda.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Napisz funkcję, która zwraca liczbę dni do następnych urodzin podanych jako parametr.
 */
public class NextBirthDay {

    static int nextBirthDay(LocalDate birthday) {
        LocalDate now = LocalDate.now();
        LocalDate nextAnniversary = LocalDate.of(now.getYear(), birthday.getMonth(), birthday.getDayOfMonth());

        if(nextAnniversary.isBefore(now)) { //jeżeli  urodziny już minęły w tym roku, musimy dodać 1 rok
            nextAnniversary = nextAnniversary.plusYears(1);
        }

        return (int) ChronoUnit.DAYS.between(now, nextAnniversary);

    }

    public static void main(String[] args) {

        int days = nextBirthDay(LocalDate.parse("1988-02-04"));

        System.out.println(String.format("Moje następne urodziny są za %d dni", days));

    }

}
