package pl.sda.random;

import java.util.Random;
import java.util.Scanner;

/**
 * Stwórz grę, która będzie losowała wartość od 1 do 100, następnie będzie prosiła użytkownika o podanie liczby.
 * W przypadku gdy użytkownik trafi, to gra informuje go o zwycięstwie, a jeżeli nie trafi, to informuje go czy
 * liczba jest zbyt mała lub zbyt duża.
 */

public class GuessGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1;

        System.out.println("Zgadnij liczbę od 1 do 100.");
        int pick = scanner.nextInt();
        while(target != pick) {
            if(target < pick) {
                System.out.println("Za wysoko!");
            } else {
                System.out.println("Za nisko!");
            }
            pick = scanner.nextInt();
        }
        System.out.println("Brawo zgadleś!");

    }

}
