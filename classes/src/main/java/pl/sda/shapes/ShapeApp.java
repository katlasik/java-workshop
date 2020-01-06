package pl.sda.shapes;

import java.util.Scanner;

public class ShapeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj figurę [K,R,T,P]:");

        String choice = scanner.nextLine();

        Shape shape = null;

        while (shape == null) {
            switch (choice) {
                case "P":
                    System.out.println("Wpisz długość boków:");
                    shape = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
                    break;
                case "K":
                    System.out.println("Wpisz długość boku:");
                    shape = new Square(scanner.nextDouble());
                    break;
                case "T":
                    System.out.println("Wpisz długość boku:");
                    shape = new EquilateralTriangle(scanner.nextDouble());
                    break;
                case "R":
                    System.out.println("Wpisz długość boku i wysokość:");
                    shape = new Rhombus(scanner.nextDouble(), scanner.nextDouble());
                    break;
                default:
                    System.out.println("Nieznana figura.");
            }
        }

        shape.display();

    }

}
