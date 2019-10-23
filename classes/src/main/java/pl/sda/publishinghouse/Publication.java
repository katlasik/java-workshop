package pl.sda.publishinghouse;

/**
 * Stwórz klasę abstakcyjną `Publication`, zawierająca pola `author`, `year` oraz `price` i metody dostępowe do niej.
 * Stwórz konstruktor ustawiający te pola. Stwórz konstruktor, który ustawia tylko rok, a nazwę autora ustawia na *"nieznany"*.
 * Stwórz klasy dziedziczące po `Publication`: `BlogEnty`, `Book`, `Ebook`, `Magazine`.
 * Zapewnij dla każdej z klas metody `equals`, `toString` oraz `hashCode`.
 * Dodaj pole `isHardcover`, ale tylko dla `Book`. Jeżeli pole to **true** to przeciąż metodę `getPrice()`, tak by zwracałą cenę pomnożoną razy *2*.
 * Dodaj statyczne finalne pole `DEFAULT_AUTHOR` w `Magazine` przechowujące stałą wartość *"Redaktor Naczelny"*.
 * Jeżeli wartość zwrócona przez `getAuthor` klasy nadrzędnej to *"nieznany"* to zamiast niej zwróć wartość `DEFAULT_AUTHOR`.
 * Stwórz niezależną, niedziedziczącą po `Publication` klasę `PublishingHouse`, która będzie miała pole `name`.
 * Dodaj konstruktor pozwalający zainicjalizować pole `name`.
 * Dodaj do klasy `PublishingHouse` pole `publications` jako listę przechowującą obiekty `Publication`.
 * Dodaj do niej metodę `addPublication`, która będzie dodawała publikacje dla wydawnictwa.
 * Dodaj do `PublishingHouse` metodę `getPublications`, która będzie zwracała listę publikacji wydawnictwa.
 * Dodaj klasę `PublishingHouseApp` z metodą `main`. Stwórz w niej obiekt `PublishingHouse`
 * i dodaj do niego publikacje. Wyświetl publikacje dodane do wydawnictwa.
 * Dodaj obiekt `Scanner` do `PublishingHouseApp`. Dodaj możliwość dodawania za pomocą klawiatury nowych tytułów wydawnictw.
 * Dodaj nowy obiekt `PublishingHouse`. Zmodyfikuj aplikację tak, aby umożliwiała wybranie wydawnictwa do którego chcemy dodać wydawnictwa.
 * Dodaj do `PublishingHouse` metodę `avgPrice`, która będzie wyznaczała średnią cenę publikacji w wydawnictwie.
 * Stwórz interfejs `Downloadable`, który będzie zawierał metodę `String downloadUrl`. Zmodyfikuj
 * `BlogEntry` oraz `Ebook`, tak by go implementowały. Czy `Magazine` i `Book` powinny implementować `Downloadable`?
 * Stwórz interfejs `Printable`, który będzie zawierał metodę `int pageNumber`. Zmodyfikuj `Book` i `Magazine`, tak by go implementowały.
 * Czy pozostałe klasy powinny go impementować?
 * Dodaj do `PublishingHouse` metodę `downloadUrls`, która zwróci wszyskie linki do publikacji online.
 * Zmodyfikuj `getPublications`, tak by zwracałą posortowaną listę publikacji od najstarszej.
 */
public abstract class Publication {

}
