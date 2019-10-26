package pl.sda.shapes;

public class Rhombus extends Shape {
    private double a;
    private double h;

    protected Rhombus(double a, double h) {
        super("Romb");
        this.a = a;
        this.h = h;
    }

    @Override
    double area() {
        return a * h;
    }

    @Override
    double circuit() {
        return 4 * a;
    }
}
