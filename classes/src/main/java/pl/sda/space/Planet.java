package pl.sda.space;

import java.util.ArrayList;
import java.util.List;

public class Planet extends Stellar {

    private List<Moon> moons = new ArrayList<>();

    public Planet(String name, int radius, int mass) {
        super(name, radius, mass);
    }

    void addMoon(Moon ...moons) {
        for (Moon moon :moons) {
            this.moons.add(moon);
        }
    }

    public List<Moon> getMoons() {
        return moons;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + getName() + '\'' +
                ", radius=" + getRadius() +
                ", mass=" + getMass() +
                '}';
    }
}
