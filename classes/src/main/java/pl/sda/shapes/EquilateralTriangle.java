package pl.sda.shapes;

public class EquilateralTriangle extends Shape {
    private double a;

    protected EquilateralTriangle(double a) {
        super("Równoboczny trójkąt");
        this.a = a;
    }

    @Override
    double area() {
        return 0.433 * a * a;
    }

    @Override
    double circuit() {
        return 3 * a;
    }
}
