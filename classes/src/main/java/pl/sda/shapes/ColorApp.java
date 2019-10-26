package pl.sda.shapes;

public class ColorApp {

    public static void main(String[] args) {

        HasColor[] colorfulThings = {
            new Cat(),
            new Square(5.0, "zielny")
        };

        for(HasColor thing: colorfulThings) {
            System.out.println(thing.color());
        }

    }
}