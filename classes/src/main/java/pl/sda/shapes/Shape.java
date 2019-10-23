package pl.sda.shapes;

/**
 * Stwórz 4 klasy `Square`, `Rectangle`, `EquilateralTriangleSh` i `Rhombus`. Każda z tych klas ma przechowywać w sobie informację potrzebne do obliczenia jej pola oraz obwodu. Oznacza to też, że każda z tych klas powinna mieć w sobie metody
 * `area` oraz `circuit` obliczające pole i obwód.
 * Stwórz wspólny interfejs `Shape` dla tych klas.
 * Dodaj klasę `ShapeApp`i stwórz w niej metodę `displayShape` otwrzymującą jako parametr `Shape` i wyświetlający pole i obwód.
 * Dodaj do klasy `ShapeApp` metodę `main`, w której będzie można zapytać użytkownika jaką figurę chce wpisać,
 * a następnie wczytać potrzebne dane i wywołać `displayShape`.
 */

public interface Shape {

    double area();
    double circuit();

}
