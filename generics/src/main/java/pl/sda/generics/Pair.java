package pl.sda.generics;

import java.util.Objects;

/**
 * Stwórz klasę `Pair<X,Y>` przechowującą dwie wartości.
 * Dodaj metodę swap, która zwraca nowy `Pair<Y,X>`.
 */

public class Pair<X, Y> {

    private X x;
    private Y y;

    public Pair(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    public Pair<Y, X> swap() {
        return new Pair<>(y, x);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(x, pair.x) &&
                Objects.equals(y, pair.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}