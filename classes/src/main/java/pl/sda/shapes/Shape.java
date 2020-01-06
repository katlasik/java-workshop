package pl.sda.shapes;

/**
 * Stwórz 4 klasy `Square`, `Rectangle`, `EquilateralTriangle` i `Rhombus`. Każda z tych klas ma przechowywać w sobie informację potrzebne do obliczenia jej pola oraz obwodu. Oznacza to też, że każda z tych klas powinna mieć w sobie metody
 * `area` oraz `circuit` obliczające pole i obwód.
 * Stwórz klasę abstraktycjną `Shape` po której będzie dziedziczyć, każda z tych klas. Klasa abstrakcyjna powinna zawierać abstrakcyjne metody `area` oraz `circuit`. Powinna zawierać też pole `name`, zawierające nazwę figury. Każda z dziedziczących figur powinna ustawiać to pole w konstruktorze.
 * Stwórz metodę `display` w klasie `Shape`, tak by wyświetlała łańcuch zawierający nazwę figury, jej obwód oraz pole. Na przykład: *"Kwadrat, pole = 4, obwód = 8"*.
 * Dodaj klasę `ShapeApp` oraz metodę `main`, w której będzie można zapytać użytkownika jaką figurę chce wpisać,
 * a następnie wczytać potrzebne dane i wywołać `display`.
 * Stwórz interfejs `HasColor`, posiadający pojedyńczą metodę `String color()` i zaimplementuj go w klasie `Square`. Stwórz też klasę
 * `Cat`, która rówież implementuje ten interfejs.  Następnie dodaj dodatkową klasę `ColorApp`, która będzie zawierać statyczne pole z tablicą o typie `HasColor[]`, które zawierają instancje klas `Cat` i `Square`. Następnie dodaj metodę `main`, która iteruje po tej tablicy oraz wyświetla kolory obiektów.
 */

public abstract class Shape {

    private String name;

    protected Shape(String name) {
        this.name = name;
    }

    abstract double area();

    abstract double circuit();

    void display() {
        System.out.println(name + ", pole = " + area() + ", obwód = " + circuit() + ".");
    }

}
