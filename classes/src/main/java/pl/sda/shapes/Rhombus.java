package pl.sda.shapes;

public class Rhombus implements Shape{

    private final double a;
    private final double h;

    public Rhombus(double a, double h) {
        this.a = a;
        this.h = h;
    }


    @Override
    public double area() {
        return a* h;
    }

    @Override
    public double circuit() {
        return 4*a;
    }
}
