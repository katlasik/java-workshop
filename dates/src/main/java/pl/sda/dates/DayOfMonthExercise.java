package pl.sda.dates;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

/**
 * Napisz funkcję, która po otrzymaniu roku i miesiąca zwróci listę wszystkich dni danego miesiąca.
 */

public class DayOfMonthExercise {

    static List<LocalDate> daysOfMonth(YearMonth yearMonth) {

        LocalDate start = yearMonth.atDay(1);
        ArrayList<LocalDate> result = new ArrayList<LocalDate>();

        LocalDate end = yearMonth.atEndOfMonth();

        do {
            result.add(start);
            start = start.plusDays(1);
        } while (!start.equals(end));

        result.add(end);

        return result;
    }

}
