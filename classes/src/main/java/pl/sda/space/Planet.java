package pl.sda.space;

import java.util.List;

public abstract class Planet extends Stellar {

    private final List<Moon> moons;

    public Planet(int mass, int diameter, List<Moon> moons) {
        super(mass, diameter);
        this.moons = moons;
    }

    public List<Moon> getMoons() {
        return moons;
    }
}
