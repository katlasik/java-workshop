package pl.sda;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ScaleExercise {

    /**
     * Stwórz aplikację wczytującą dowolną liczbę ułamkową oraz liczbę całkowitą, następnie zaookrągl liczbę ułamkową do precyzji przekazanej
     * jako drugi argument i wyświetl.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        int scale = scanner.nextInt();

        System.out.println(new BigDecimal(number).setScale(scale, RoundingMode.HALF_DOWN).toString());
    }

}
