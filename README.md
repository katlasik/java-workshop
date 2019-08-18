## Instalacja

1. Otwieramy `File` > `New` > `Project from Version Control` > `Git`.
2. Wklejamy adres `git@github.com:katlasik/java-workshop.git`.
3. Po otwarciu projektu klikamy `Add as Maven Project` w prawy dolnym rogu.
4. Jeżeli pojawi się komunikat `Project's SDK is not defined` to wybieramy wersję Javy.

## Zadania

### Kolekcje

1. Stwórz metodę `isSorted` przyjmującą listę i zwracającą true, gdy jej elementy zachowują rosnącą kolejność.

`[1,2,3,10,15]` -> `true`

`[1,2,3,10,5]` -> `false`

2. Stwórz metodę intercalate, która będzie otrzymywać listę elemntów `int` oraz dodatkowy element typu `int`.
Metoda ta ma zwrócić listę elementów listy przeplataną dodatkowym elementem:

`[1,2,3]` oraz `5` -> `[1,5,2,5,3,5]`

3. Stwórz metodę interleave, która będzie otrzymywać 2 listy elementów `int` i połączy je ze sobą w taki sposób, że
storzy listę zawierającą elementy każdej z nich na zmianę:

`[1,2,3]`, `[11,12,13]` -> `[1,11,2,12,3,13]`

4. Stwórz metodę `boolean allNegative(List<Integer> elements)` zwracającą **true** tylko jeżeli wszystkie elementy listy są ujemne.

5. Stwórz metodę `distinct` przyjmującą jako argument listę intów. Metoda ta powinna zwrócić listę intów, ale ominąć powtarzające się elementy:

`[1,2,3,3] -> [1,2,3]`

`[4,4,4] -> [4]`

Funkcja powinna zachowywać kolejność liczb.

6. Stwórz metodę, `int[] swap(int[] array, int from, int to)`, która zamienia miejscami dwie liczby o indeksach
wskazanych przez `from` i `to`. Stwórz przeładowaną wersję dla listy.

7. Stwórz metodę `showHistogram(String input)`, która będzie otrzymywać łańcuch tekstowy i będzie wyświetlać
wszystkie znaki oraz ile razy występuję. Na przykład `showHistogram("aaabbbc")` powienien zwrócić:

```
a: 3, b: 3, c: 1
```

Wyniki posortuj według liczy wyświetleń, a potem alfabetycznie.

(Dodatkowo) obok liczby występowań wyświetl w nawiasie procentową wartość udziału znaku w łańcuchu.

8. **(trudne)** Zaimplementuj [sito Erastotenesa](http://rasmus.is/pl/T/u/st23k01.htm). Metoda otrzymawszy liczbę powinna znaleźc wszystkie liczbny pierwsze
mniejsze od niej.

9. **(trudne)** Zaimplementuj algorytm sortowanie bąbęlkowego.

### String

1. Stwórz metodę `isPalindrome` sprawdzającą czy słowo jest palindromem:

`kajak` -> true
`kaja` -> false

2. Stwórz metodę `unique` przyjmującą jako argument string. Metoda ta powinna zwrócić również string ale powinna
pomijać wszystkie wystepujące już znaki. Na przykład:

`abcabcd` -> `abcd`

`aaaaaax` -> `ax`

3. Napisz program w klasie `ReadWords` wczytujący linie tekstu ze standardowego wejścia do listy aż do wpisania słowa *"koniec"*. Następnie program powinien wyświetlić je podzielone przecinkami pomijajac `koniec`. Na przykład: `Wczytano 3 słowa: Jaś, piłka, słowo.`. 
Rozważ użycie metod `String.join` i `String.format`.

4. Stwórz metodę `repeatUntil`, która będzie powtarzać dany string, aż jego długość przekroczy wartość progową.
   Na przykład, dla *"raz"* i *13*:
   
     1 iteracja: size("raz") < 13 -> "razraz"
     2 iteracja: size("razraz") <  13 -> "razrazrazraz"
     3 iteracja: size("razrazrazraz") < 13 -> "razrazrazrazrazrazrazraz"
     4 iteracja size("razrazrazrazrazrazrazraz") > 13 -> koniec

### Programowanie obiektowe

1. * W pakiecie `pl.sda.publishinghouse` stwórz klasę abstakcyjną Publication, zawierająca pola `author`, `year` oraz `price` i metody dostępowe do niej.
     Stwórz konstruktor ustawiający te pola. Stwórz konstruktor, który ustawia tylko rok, a nazwę autora ustawia na "nieznany".
   * Stwórz klasy dziedziczące po niej: BlogEnty, Book, Ebook, Magazine.
   * Dodaj pole `isHardcover` tylko dla `Book`. Jeżeli pole to **true** to przeciąż metodę `getPrice()`, tak by zwracałą cenę pomnożoną razy *2*.
   * Dodaj statyczne finalne pole DEFAULT_AUTHOR w Magazine przechowujące stałą wartość "Redaktor Naczelny".
     Jeżeli wartość zwrócona przez `getAuthor` klasy nadrzędnej to "nieznany" to zamiast niej zwróć wartość DEFAULT_AUTHOR.
   * Stwórz niezależną, nie dziedziczącą po `Publication` klasę `PublishingHouse`, która będzie miała pole name.
   * Dodaj do niej pole `publications` typu lista.
   * Dodaj do niej metodę `addPublication`, która będzie dodawała publikacje dla wydawnictwa.
   * Dodaj do `PublishingHouse` metodę `getPublications`, która będzie zwracała listę publikacji wydawnictwa.
   * Dodaj klasę `PublishingHouseApp` z metodą `main`. Stwórz w niej obiekt `PublishingHouse`
     i dodaj do niego publikacje.
   * Dodaj do `PublishingHouse` metodę `avgPrice`, która będzie wyznaczała średnią cenę publikacji w wydawnictwie.
   * Stwórz interfejs `Downloadable`, który będzie zawierał metodę `String downloadUrl`.
   * Stwórz interfejs `Printable`, który będzie zawierał metodę `int pageNumber`.
   * Dodaj to `PublishingHouse` metodę `downloadUrls`, która zwróci wszyskie linki do zasobów.
   * Zmodyfikuj `getPublications`, tak by zwracałą posortowaną listę publikacji od najstarszej.

2. * Stwórz klasę `Filtering`, która w konstruktorze przyjmuje dwie liczby i posiadaj metodę `filter`,
   która przyjmuje kolekcje liczb. Metoda ta powinna zwrócić nową kolekcję, ale tylko
   z liczbami, które znajdują się między tymi przyjętymi w konstruktorze.

   * Stwórz klasę `DoubleAndDouble`, która dziedziczy po `Filtering` i która
    oprócz tego, że filtruje liczby, mnoży je razy 2. Skorzystaj z logiki filtrowanie
    zaimplementowanej w `Filtering` i nie implementuj jej drugi raz w `Filtering`.

3. Utwórz klasę o nazwie `MyNumber`, której jedyny konstruktor przyjmuje liczbę. Klasa powinna mieć następujące metody
   `MyNumber isOdd()` – true jeśli atrybut jest nieparzysty,
   `MyNumber isEven()` – true jeśli atrybut jest parzysty,
   `MyNumber sqrt()` – pierwiastek z atrybutu,
   `MyNumber pow(MyNumber x)` – atrybut podniesiony do potęgi x (przydatnej metody poszukaj w javadoc do klasy Math),
   `MyNumber add(MyNumber x)` – zwraca sumę atrybutu i x opakowaną w klasę `MyNumber`,
   `MyNumber subtract(MyNumber x)` – zwraca różnicę atrybutu i x opakowaną w klasę `MyNumber`.
   Powyższe metody nie powinny modyfikować oryginalnego obiektu, czyli klasa `MyNumber` musi być niemutowalna.

4. W pakiecie `space` stwórz następujące klasy:

   * Stwórz abstrakcyjną klasę `Stellar`.
   * Stwórz klasy dziedziczące: `Planet`, czy `Moon`.
   * Zdefiniuj pola jak masa i rozmiar. Zastanów się czy powinny być w klasie nadrzędnej, czy w dzieciach.
   * Dodaj możliwość posiadania przez planetę księżyców. W tym celu dodaj pole, które jest kolekcją i dodaj je do konstruktora.
   * Stwórz mutowalną, następnie niemutowalną wersję.
   * Stwórz klasę `StellarSystem`, która powinna mieć możliwość posiadania planet.
   * Dodaj do klasy `StellarSystem` metodę `moons`, która będzie zwracała listę księżyców wszystkich planet.
   * Zaimplementuj interfejs `Comparable` dla planety, porównujący je według rozmiaru.

5. Stwórz interfejs `NumberConverter` posiadającą jedna metodę: `String convert(String number)`
   * Stwórz klasę `MorseNumberConverter`, która zamienia liczbę na reprezentację w kodzie morsa.
   Rozważ użycie mapy jako słownika
   * Stwórz klasę `HexNumberConverter`, która zmienia arabską liczbę na heksadecymalna.
   * Stwórz klase `NumberConverterFactory`, która posiada statyczną metodę `createConverter`, która jako parametr przyjmuje string.
   Jeżeli zostanie podany do niej string *"hex"* powinna wrócić implementację `HexNumberConverter`,
   a jeżeli *"morse"*, to `MorseNumberConverter`. Jeżeli zostanie podany inny string, to
   powinna zostać zwrócona implementacja `NumberConverter`, która zwraca string wejściowy `("test" -> "test")`.
   
6. * Stwórz metodę `modifyUpperCase`, która będzie otrzymywać listę stringów oraz liczbę (indeks elementu). Gdy indeks nie będzie wskazywał na żaden element rzuć `IllegalArgumentException`. W przypadku gdy zostanie podany poprawny indeks to zmień wszystkie znaki we wskazanym stringu na wielkie litery, a resztę pozostaw niezmienioną. Na przykład:
   `["aaa", "bbb", "ccc", "ddd"]` oraz `2` ->  `["aaa", "bbb", "CCC", "ddd"]`

   * Stwórz analogiczną metody `modifyRepeat`, która powiela string dwukrotnie.
   `["aaa", "bbb", "ccc", "ddd"]` oraz `2` ->  `["aaa", "bbb", "cccccc", "ddd"]`
   
   * Zastanów się, czy za pomocą interfejsów można stworzyć ogólną wersję metody `modify`.

   * Zastanów się, czy nie można zmienić metody `modify`, tak by można było wyszukiwać element po dowolnej właściwości nie tylko po indeksie.

### Varargs

1. Stwórz metodę `int sumAll(int... elements)`, która będzie zwracać sumę wszyskich podanych elementów.

    `[1,2,3] -> 6`

2. Stwórz metodę `String join(String... elements)`, która będzie łaczyć wszystkie podane łańcuchy za pomocą łącznika " i ":

    `["Ania", "Kasia", "Beata"] -> "Ania i Kasia i Beata"`

3. Sprawdź w jaki sposób działają metody tworzące kolekcje:

    * `List.of` oraz `Arrays.asList` dla list.
    * `Map.of` dla map.
    * `Set.of` dla setów

### Random

1. Stwórz metode `pickRandom`, która przyjmuje zmienną liczbę liczb, i losuje jedną z nich:

   `[1,2,3,4,5] ~> 1`
   
2. **(trudne)** Stwórz grę, która będzie losowała wartość od 1 do 100, następnie będzie prosiła użytkownika o podanie liczby.
W przypadku gdy użytkownik trafi, to gra informuje go o zwycięstwie, a jeżeli nie trafi, to informuje go czy 
liczba jest zbyt mała lub zbyt duża.

### Data i czas

1. Napisz fukcję wyświetlającą godzinię na przykład `10:10:15` co 10 sekund.
1. Napisz funkcję, która po otrzymaniu roku i miesiąca zwróci listę wszystkich dni danego miesiąca.
2. Napisz funkcję `isAlmostTime` zwracającą true, jeżeli obecny czas jest z zakresie +/- 5 minut od podanego
   w parametrze.
3. Napisz funkcję, która zwraca liczbę dni do następnych urodzin podanych jako parametr.

### Klasy generyczne

1. * Stwórz klasę `Pair<X,Y>` przechowującą dwie wartości.
   * Dodaj metodę swap, która zwraca nowy `Pair<Y,X>`.
   
2. Stwórz klasę `RandomList<X>`, która ma następujące API, która ma dwie metody `add(X element)` oraz `X getRandom()`.
Po dodaniu elementu

3. Zmodyfikuj metodę `pickRandom`, `intercalate`, `intersperse` tak, by działała na dowolnych typach.

### Wyjątki

1. Napisz metodę `checkNull` rzucającą wyjątek `NullPointerException`, gdy argument jest równy **null**.
2. Napisz metodę `tryParse` parsująca liczbę ze łańcucha znaków, używajac `Integer.parse`. W przypadku nieudanej konwersji rzuć wyjątek `IllegalArgumentException`
zawierający stary wyjątek oraz wiadomość "Nieprawidłowa liczba".
3. Napisz własny wyjątek `OddSizeException`. Napisz metodę `checkList` wyrzucającą go,
jeżeli liczba elementów jest nieparzysta. Podczas rzucania wyjątku napisz informację, dlaczego został rzucony.
4. Stwórz kalkulator bezpiecznie wczytujący liczby i dodającą je listy.
 Po wpisaniu przez użytkownika `=` program powinien wyświetlić liczby oraz sumę.

   * Jeżeli liczba jest poprawna, np. *123* to powinna zostać dodana do listy.
   * Jeżeli liczba jest niepoprawna, to wyjątek *InputMismatchException* powinien zostać przechwycony i 
     powienien zostać wyświetlony komunikat "Niepoprawna liczba!". Podanie niepoprawnej liczby nie powinno 
     kończyć działania programu.


### Typy wyliczeniowe

1. * Stwórz typ wyliczeniowy `pl.sda.enums.Color`.
   * Dodaj kolory, takie jak `Black`, `Red`, `Yellow`.
   * Dodaj do niego metode `getHex` zwracającą heksadecymalną reprezentację koloru.

2. * Stwórz typ wyliczeniowy `DayOfWeek` zawierający nazwy dni tygodnia.
   * Dodaj do enumeracji pole zwracające skróconą nazwę, dnia np, `Tue`.
   * Dodaj do enumeracji metodę `isWeekend` zwracającą **true** dla soboty i niedzieli.
   * Stwórz enumerację `WeekendType` zawierającą dwie wartości `Regular` i `Islamic`.
   * Stwórz przeładowaną metodę `isWeekend`, że gdy otrzyma `weekendType` `Islamic`
    to zwraca **true** dla piątku i soboty.
   * Stwórz klasę `OfficeWorkingHours`  otrzymującą jako wejście `DayOfWeek`.
     Klasa w konstruktorze musi otrzymać listę zawierająca `DayOfWeek` o nazwie `daysWithExtendedWorkingHours`
     i zapisać je jako pole.
   * Stwórz metodę `getOfficeWorkingHours` zwracającą czas pracy urzęduL
      * *8-15* jeżeli jest to normalny dzień
      * *8-17* jeżeli jest to dzień z rozszerzonymi godzinami pracy
      * *zamknięte* jeżeli jest to weekend.
      
### Pliki

1. Wczytaj plik wpisujący obecną datę i godzinę do pliku `time`. Kolejne uruchomienia programu
powinny pozostawiać starą zawartość, a tylko dodawać nową linię na końcu pliku.

2. Napisz program, który wczytuje wszystkie linie z pliku `linie`, następnie 
nadpisuje go wpisując linie w odwrotnej kolejności.

3. Wczytaj plik `osoby` zawierający numery PESEL i nazwiska oraz imiona, podzielone znakiem **|**, a następnie `adresy`
zawierający numery PESEl i adresy zamieszkania podzielone znakiem **|**. Połącz dane z obydwóch plików i wyświetl dla wszystich osób
dane w formacie *PESEL, imię, nazwisko, adres*. Jeżeli dla danej osoby nie istnieje linia w pliku `adresy.txt` to wyświetl *???*. 

### Wątki

1. Stwórz nowy wątek wyświetlający napis `Witaj z innego wątku!` co 10 sekund oraz dodaj pętlę
w głownym wątku wyświetljącą `Witaj z głownego wątku!` co 20 sekund. 

2. Stwórz klasę dziedziczącą po `Runnable`, która jako parametr otrzyma liczbę. Zadaniem obieku tej
klasy będzie wyświetlenie liczby razem z z nazwą watku, a następnie odczekanie 1 sekundy i zmniejszenie wartości
o 1, a natępnie powtórzenie operacji aż do osiągnięcia 0. Innymi słowy należe odliczyć od n do 0.
