package pl.sda.space;

public class Moon extends Stellar {
    public Moon(String name, int radius, int mass) {
        super(name, radius, mass);
    }

    @Override
    public String toString() {
        return "Moon{" +
                "name='" + getName() + '\'' +
                ", radius=" + getRadius() +
                ", mass=" + getMass() +
                '}';
    }

}
