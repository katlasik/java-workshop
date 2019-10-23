package pl.sda.shapes;

import java.util.Scanner;

public class ShapeApp {

    static void displayShape(Shape shape) {
        System.out.println("Pole figury to: " + shape.area() + ".");
        System.out.println("Obwód figury to: " + shape.circuit() + ".");
    }

    public static void main(String[] args) {

        Scanner scannner = new Scanner(System.in);

        Shape shape = null;

        while (shape == null) {
            System.out.println("Jaką figurę chcesz wpisać? (R)omb, (T)rójkąt równoboczny, (K)wadrat, (P)rostokąt?");
            String choice = scannner.next();

            switch (choice) {
                case "K":
                    System.out.println("Wpisz długość boku:");
                    shape = new Square(scannner.nextDouble());
                    break;
                case "T":
                    System.out.println("Wpisz długość boku:");
                    shape = new EquilateralTriangle(scannner.nextDouble());
                    break;
                case "P":
                    System.out.println("Wpisz długość boków:");
                    shape = new Rectangle(scannner.nextDouble(), scannner.nextDouble());
                    break;
                case "R":
                    System.out.println("Wpisz długość boku i wysokość:");
                    shape = new Rhombus(scannner.nextDouble(), scannner.nextDouble());
                    break;
                default:
                    System.out.println("Nieznana figura.");
            }
        }

        displayShape(shape);


    }
}
