package pl.sda.space;

import java.util.ArrayList;
import java.util.List;

public class StellarSystem {

    private final List<Planet> planets;

    public StellarSystem(List<Planet> planets) {
        this.planets = planets;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public List<Moon> getMoons() {
        ArrayList<Moon> moons = new ArrayList<>();

        for(Planet p: planets) {
            moons.addAll(p.getMoons());
        }

        return moons;

    }
}
