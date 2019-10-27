package pl.sda.space;

import java.util.Collections;
import java.util.List;

public class SpaceApp {

    public static void main(String[] args) {

        StellarSystem system = new StellarSystem();

        Planet earth = new Planet("Ziemia", 100, 100);
        Planet mars = new Planet("Mars", 80, 75);
        Planet jupiter = new Planet("Jowisz", 800, 750);

        earth.addMoon(new Moon("Księżyc", 10, 10));

        mars.addMoon(new Moon("Phobos", 12, 15));
        mars.addMoon(new Moon("Deimos", 13, 16));

        jupiter.addMoon(new Moon("Ganimedes", 30, 40));

        system.addPlanets(
                earth,
                jupiter,
                mars
        );

        List<Moon> moons = system.moons();

        System.out.println(moons);
        Collections.sort(moons);

    }
}
