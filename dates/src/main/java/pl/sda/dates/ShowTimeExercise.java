package pl.sda.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Napisz fukcję wyświetlającą godzinię na przykład `10:10:15` co 10 sekund.
 */
public class ShowTimeExercise {


    public static void main(String[] args) throws InterruptedException {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

        while(true) {
            System.out.println(dtf.format(LocalTime.now()));
            Thread.sleep(10_000);
        }

    }


}
