package pl.sda;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialExercise {

    /**
     * Stwórz aplikację wczytującą liczbę od użytkownika i obliczającą silnie. Aplikacja powinna być odporna na przekraczanie zakresu.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
        }

        System.out.println("Silnia: " + fact);

    }
}
