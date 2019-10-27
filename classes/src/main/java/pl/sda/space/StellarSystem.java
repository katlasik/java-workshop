package pl.sda.space;

import java.util.ArrayList;
import java.util.List;

public class StellarSystem {

    private List<Planet> planets = new ArrayList<>();

    void addPlanets(Planet... planets) {
        for(Planet planet: planets) {
            this.planets.add(planet);
        }
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    List<Moon> moons() {
        ArrayList<Moon> result = new ArrayList<>();

        for(Planet p: planets) {
            result.addAll(p.getMoons());
        }

        return result;
    }

}
