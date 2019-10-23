package pl.sda.shapes;

public class Square implements Shape {

    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a*a;
    }

    @Override
    public double circuit() {
        return 4*a;
    }
}
