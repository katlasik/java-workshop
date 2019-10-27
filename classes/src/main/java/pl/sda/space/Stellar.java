package pl.sda.space;

/**
 * Stwórz abstrakcyjną klasę `Stellar`.
 * Stwórz klasy dziedziczące: `Planet`, czy `Moon`.
 * Zdefiniuj pola jak masa i rozmiar. Zastanów się czy powinny być w klasie nadrzędnej, czy w dzieciach.
 * Dodaj możliwość posiadania przez planetę księżyców. W tym celu dodaj pole, które jest kolekcją i dodaj je do konstruktora.
 * Stwórz mutowalną, następnie niemutowalną wersję.
 * Stwórz klasę `StellarSystem`, która powinna mieć możliwość posiadania planet.
 * Dodaj do klasy `StellarSystem` metodę `moons`, która będzie zwracała listę księżyców wszystkich planet.
 * Zaimplementuj interfejs `Comparable` dla stellar, porównujący je według rozmiaru. Następnie posortuj księżyce za pomocą
 * metody `Collections.sort`.
 */

public abstract class Stellar implements Comparable<Stellar>{

    private String name;
    private int radius;
    private int mass;

    @Override
    public int compareTo(Stellar stellar) {
        return this.mass - stellar.mass;
    }

    public Stellar(String name, int radius, int mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }

    public int getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return "Stellar{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", mass=" + mass +
                '}';
    }
}
