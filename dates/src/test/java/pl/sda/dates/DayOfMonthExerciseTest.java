package pl.sda.dates;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DayOfMonthExerciseTest {

    @Test
    void daysOfMonth() {
        var expected = List.of(
                LocalDate.parse("2019-02-01"),
                LocalDate.parse("2019-02-02"),
                LocalDate.parse("2019-02-03"),
                LocalDate.parse("2019-02-04"),
                LocalDate.parse("2019-02-05"),
                LocalDate.parse("2019-02-06"),
                LocalDate.parse("2019-02-07"),
                LocalDate.parse("2019-02-08"),
                LocalDate.parse("2019-02-09"),
                LocalDate.parse("2019-02-10"),
                LocalDate.parse("2019-02-11"),
                LocalDate.parse("2019-02-12"),
                LocalDate.parse("2019-02-13"),
                LocalDate.parse("2019-02-14"),
                LocalDate.parse("2019-02-15"),
                LocalDate.parse("2019-02-16"),
                LocalDate.parse("2019-02-17"),
                LocalDate.parse("2019-02-18"),
                LocalDate.parse("2019-02-19"),
                LocalDate.parse("2019-02-20"),
                LocalDate.parse("2019-02-21"),
                LocalDate.parse("2019-02-22"),
                LocalDate.parse("2019-02-23"),
                LocalDate.parse("2019-02-24"),
                LocalDate.parse("2019-02-25"),
                LocalDate.parse("2019-02-26"),
                LocalDate.parse("2019-02-27"),
                LocalDate.parse("2019-02-28")
        );

        assertThat(DayOfMonthExercise.daysOfMonth(YearMonth.of(2019, 2)))
                .containsAll(expected);

    }
}