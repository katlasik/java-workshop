package pl.sda.space;

/**
 * Stwórz abstrakcyjną klasę `Stellar`.
 * Stwórz klasy dziedziczące: `Planet`, czy `Moon`.
 * Zdefiniuj pola jak masa i rozmiar. Zastanów się czy powinny być w klasie nadrzędnej, czy w dzieciach.
 * Dodaj możliwość posiadania przez planetę księżyców. W tym celu dodaj pole, które jest kolekcją i dodaj je do konstruktora.
 * Stwórz mutowalną, następnie niemutowalną wersję.
 * Stwórz klasę `StellarSystem`, która powinna mieć możliwość posiadania planet.
 * Dodaj do klasy `StellarSystem` metodę `moons`, która będzie zwracała listę księżyców wszystkich planet.
 * Zaimplementuj interfejs `Comparable` dla stellar, porównujący je według rozmiaru.
 */

public abstract class Stellar implements Comparable<Stellar>{

    private int mass;
    private int diameter;

    protected Stellar(int mass, int diameter) {
        this.mass = mass;
        this.diameter = diameter;
    }

    public int getMass() {
        return mass;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public int compareTo(Stellar stellar) {
        return Integer.compare(mass, stellar.mass);
    }
}
