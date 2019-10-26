package pl.sda.shapes;

public class Rectangle extends Shape {
    private double a;
    private double b;

    protected Rectangle(double a, double b) {
        super("Prostokat");
        this.a = a;
        this.b = b;
    }

    @Override
    double area() {
        return a * b;
    }

    @Override
    double circuit() {
        return 2 * a + 2 * b;
    }
}
