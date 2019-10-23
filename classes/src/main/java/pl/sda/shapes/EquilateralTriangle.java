package pl.sda.shapes;

public class EquilateralTriangle implements Shape{

    private final double a;

    public EquilateralTriangle(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a * 0.433;
    }

    @Override
    public double circuit() {
        return 3*a;
    }
}
