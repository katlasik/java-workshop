package pl.sda.shapes;

public class Rectangle implements Shape{

    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double circuit() {
        return 2*a + 2*b;
    }
}
