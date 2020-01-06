package pl.sda.shapes;

public class Square extends Shape implements HasColor {

    private double a;
    private String color;

    public Square(double a) {
        super("Kwadrat");
        this.a = a;
    }

    public Square(double a, String color) {
        this(a);
        this.color = color;
    }

    @Override
    double area() {
        return a * a;
    }

    @Override
    double circuit() {
        return 4 * a;
    }

    @Override
    public String color() {
        return color;
    }

}
