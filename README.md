## Instalacja

1. Otwieramy `File` > `New` > `Project from Version Control` > `Git`.
2. Wklejamy adres `https://github.com/katlasik/java-workshop.git`.
3. Po otwarciu projektu klikamy `Add as Maven Project` w prawy dolnym rogu.
4. Jeżeli pojawi się komunikat `Project's SDK is not defined` to wybieramy wersję Javy.

## Odpowiedzi

Odpowiedzi do zadań znajdują się pod poniższym [linkiem](https://github.com/katlasik/java-workshop/tree/solutions). 
Aby znaleźć odpowiedź na zadanie należy wejść na odpowiadającą mu sciężkę.

## Zadania

### Programowanie obiektowe

1. * Stwórz klasę `User`, zawierającą pola typu `String` `password`, `username` oraz `secret`. Stwórz dla niej metody dostępowe. Stwórz konstruktor, który ustawia tylko `username` i `password`, a dla `secret` ustawia *"---"* oraz drugi, który ustawia wszystkie pola.
   * Do klasy `User` dodaj metodę `boolean authenticate(String username, String password)`. Metoda powinna zwrócić `true` w przypadku, gdy zostanie wywołana z hasłem i nazwą użytkownika zgadzającą się z tymi przechowywanumi w obiekcie.  Dodaj także drugą metodę `boolean authenticate(String secret)`, która zwróci `true`, gdy podany parametr jest taki sam jak w polu `secret`, ale nigdy gdy pole `secret` zawiera *"---"*.
   * Stwórz klasę `LoginApp`. Dodaj do niej statyczne pole-tablicę zawierającą 5 obiektów `user`.
   * Dodaj metodę `main`, która wyświetli komunikat dla użytkownika by wpisał login i hasło oraz wczyta te dane. Następnie przeszukaj tablicę obiektów szukając użytkownika, którego metoda `authenticate` zwróci `true` dla pary nazwa użytkownika-hasło.
   * Jeżeli znajdziesz pasujący obiekt, to wyświetl komunikat *"Witaj <nazwa użytkownika>!"* i zakończ program. Jeżeli nie uda się znaleźć pasującego obiektu, to poinformuj użytkownika i ponownie wyświetl komunikat z prośbą o wpisanie hasła.
   * *(Opcjonalnie)* Dodaj możliwość wyboru zalogowania się poprzez tajny token.
   * Stwórz klasę `Administrator`, która dziedziczy po po klasie `User`. Dodaj metodę `void confirmWithMFA()` dla klasy `Administrator`,
     która wyświetla na konsolę tekst *"Wysyłam SMS z kodem dostępu..."*. Przesłoń obydwie metody `authenticate` dla klasy `Administrator`, tak by zawsze wywoływały metodę `confirmWithMFA`. Dodaj obiekt klasy `Administrator` do tablicy użytkowników oraz spróuje się na niego zalogować.

2. * Stwórz 4 klasy `Square`, `Rectangle`, `EquilateralTriangle` i `Rhombus`. Każda z tych klas ma przechowywać w sobie informację potrzebne do obliczenia jej pola oraz obwodu. Oznacza to też, że każda z tych klas powinna mieć w sobie metody
     `area` oraz `circuit` obliczające pole i obwód.
     
     | Figura              | Pole      | Obwód     |
     |---------------------|-----------|-----------|
     | Kwadrat             | 4*a       | a*a       |
     | Prostokąt           | a*b       | 2*a + 2*b |
     | Trójkąt równoboczny | 0.433*a*a | 3*a       |
     | Romb                | a*h       | 4*a       |
     
   * Stwórz klasę abstraktycjną `Shape` po której będzie dziedziczyć, każda z tych klas. Klasa abstrakcyjna powinna zawierać abstrakcyjne metody `area` oraz `circuit`. Powinna zawierać też pole `name`, zawierające nazwę figury. Każda z dziedziczących figur powinna ustawiać to pole w konstruktorze.
   * Stwórz metodę `display` w klasie `Shape`, tak by wyświetlała łańcuch zawierający nazwę figury, jej obwód oraz pole. Na przykład: *"Kwadrat, pole = 4, obwód = 8"*.
   * Dodaj klasę `ShapeApp` oraz metodę `main`, w której będzie można zapytać użytkownika jaką figurę chce wpisać, 
     a następnie wczytać potrzebne dane i wywołać `display`.
   * Stwórz interfejs `HasColor`, posiadający pojedyńczą metodę `String color()` i zaimplementuj go w klasie `Square`. Stwórz też klasę
     `Cat`, która rówież implementuje ten interfejs.  Następnie dodaj dodatkową klasę `ColorApp`, która będzie zawierać statyczne pole z tablicą o typie `HasColor[]`, które zawierają instancje klas `Cat` i `Square`. Następnie dodaj metodę `main`, która iteruje po tej tablicy oraz wyświetla kolory obiektów.
     
3. * Stwórz klasę abstakcyjną `Publication`, zawierająca pola `author`, `year` oraz `price` i metody dostępowe do niej.
     Stwórz konstruktor ustawiający te pola. Stwórz konstruktor, który ustawia tylko rok, a nazwę autora ustawia na *"nieznany"*.
   * Stwórz klasy dziedziczące po `Publication`: `BlogEnty`, `Book`, `Ebook`, `Magazine`.
   * Zapewnij dla każdej z klas metody `equals`, `toString` oraz `hashCode`.
   * Dodaj pole `isHardcover`, ale tylko dla `Book`. Jeżeli pole to `true` to przeciąż metodę `getPrice()`, tak by zwracałą cenę pomnożoną razy *2*.
   * Dodaj statyczne finalne pole `DEFAULT_AUTHOR` w `Magazine` przechowujące stałą wartość *"Redaktor Naczelny"*.
     Jeżeli wartość zwrócona przez `getAuthor` klasy nadrzędnej to *"nieznany"* to zamiast niej zwróć wartość `DEFAULT_AUTHOR`.
   * Stwórz niezależną, niedziedziczącą po `Publication` klasę `PublishingHouse`, która będzie miała pole `name`. 
     Dodaj konstruktor pozwalający zainicjalizować pole `name`.
   * Dodaj do klasy `PublishingHouse` pole `publications` jako listę przechowującą obiekty `Publication`.
   * Dodaj do niej metodę `addPublication`, która będzie dodawała publikacje dla wydawnictwa.
   * Dodaj do `PublishingHouse` metodę `getPublications`, która będzie zwracała listę publikacji wydawnictwa.
   * Dodaj klasę `PublishingHouseApp` z metodą `main`. Stwórz w niej obiekt `PublishingHouse`
     i dodaj do niego publikacje. Wyświetl publikacje dodane do wydawnictwa.
   * Dodaj obiekt `Scanner` do `PublishingHouseApp`. Dodaj możliwość dodawania za pomocą klawiatury nowych tytułów wydawnictw.
   * Dodaj nowy obiekt `PublishingHouse`. Zmodyfikuj aplikację tak, aby umożliwiała wybranie wydawnictwa do którego chcemy dodać wydawnictwa.
   * Dodaj do `PublishingHouse` metodę `avgPrice`, która będzie wyznaczała średnią cenę publikacji w wydawnictwie.
   * Stwórz interfejs `Downloadable`, który będzie zawierał metodę `String downloadUrl`. Zmodyfikuj 
     `BlogEntry` oraz `Ebook`, tak by go implementowały. Czy `Magazine` i `Book` powinny implementować `Downloadable`?
   * Stwórz interfejs `Printable`, który będzie zawierał metodę `int pageNumber`. Zmodyfikuj `Book` i `Magazine`, tak by go implementowały.
     Czy pozostałe klasy powinny go impementować?
   * Dodaj do `PublishingHouse` metodę `downloadUrls`, która zwróci wszyskie linki do publikacji online.
   * Zmodyfikuj `getPublications`, tak by zwracałą posortowaną listę publikacji od najstarszej.

4. * Stwórz klasę `Filter`, która w konstruktorze przyjmuje dwie liczby i posiada metodę `filter`,
     która przyjmuje kolekcje liczb. Metoda ta powinna zwrócić nową kolekcję, ale tylko
     z liczbami, które znajdują się między tymi przyjętymi w konstruktorze.
   
     Dla `from` równe `3` i `to` równe `6`:
   
     `[1,2,3,5,10]` -> `[3,5]`

   * Stwórz klasę `FilterAndMultiply`, która dziedziczy po `Filter` i która
     oprócz tego, że filtruje liczby, mnoży tyle razy ile wynosi parametr podany jako trzeci w konstruktorze. Skorzystaj z logiki filtrowania
     zaimplementowanej w `Filter` i nie implementuj jej drugi raz w `FilterAndMultiply`.
    
     Dla `from` równe `3`, `to` równe `6` i `multiply` równe `5`:
    
     `[1,2,3,5,10]` -> `[15,25]`

5. Utwórz klasę o nazwie `MyNumber`, której jedyny konstruktor przyjmuje liczbę. Klasa powinna mieć następujące metody:
   
   * `boolean isOdd()` – `true` jeśli paramentr jest nieparzysty
   * `boolean isEven()` – `true` jeśli paramentr jest parzysty
   * `MyNumber sqrt()` – pierwiastek z paramentru,
   * `MyNumber pow(MyNumber x)` – parametr podniesiony do potęgi `x` (potrzebnej metody poszukaj w javadoc w klasie Math) opakowany `MyNumber`,
   * `MyNumber add(MyNumber x)` – zwraca sumę atrybutu i `x` opakowaną w klasę `MyNumber`,
   * `MyNumber subtract(MyNumber x)` – zwraca różnicę atrybutu i `x` opakowaną w klasę `MyNumber`.
   
   Powyższe metody nie powinny modyfikować oryginalnego obiektu, czyli klasa `MyNumber` musi być niemutowalna.

6. W pakiecie `space` stwórz następujące klasy:

   * Stwórz abstrakcyjną klasę `Stellar`.
   * Stwórz klasy dziedziczące: `Planet`, czy `Moon`.
   * Zdefiniuj pola jak masa i rozmiar. Zastanów się czy powinny być w klasie bazowej.
   * Dodaj możliwość posiadania przez planetę księżyców. W tym celu dodaj pole, które jest kolekcją i dodaj je do konstruktora.
   * Stwórz mutowalną, następnie niemutowalną wersję.
   * Stwórz klasę `StellarSystem`, która powinna mieć możliwość posiadania planet.
   * Dodaj do klasy `StellarSystem` metodę `moons`, która będzie zwracała listę księżyców wszystkich planet.
   * Zaimplementuj interfejs `Comparable` dla `Stellar`, porównujący je według rozmiaru.  
     Następnie posortuj księżyce za pomocą metody `Collections.sort`.

7. Stwórz interfejs `NumberConverter` posiadającą jedna metodę: `String convert(String number)`
   * Stwórz klasę `MorseNumberConverter`, która zamienia liczbę na reprezentację w kodzie Morse'a.
     Rozważ użycie mapy jako słownika. Cyfry w reprezentacji języka Morse'a: 
     * 1:  • — — — —
     * 2:  • • — — —
     * 3:  • • • — —
     * 4:  • • • • —
     * 5:  • • • • •
     * 6:  — • • • •
     * 7:  — — • • •
     * 8:  — — — • •
     * 9:  — — — — •
     * 0:  — — — — —
  
   * Stwórz klasę `HexNumberConverter`, która zmienia arabską liczbę na heksadecymalną. Skorzystaj z metody `Integer.toHexString`.
   * Stwórz klase `NumberConverterFactory`, która posiada statyczną metodę `createConverter`, która jako parametr przyjmuje łańcuch znaków.
   Jeżeli zostanie podany do niej łańcuch *"hex"* powinna wrócić implementację `HexNumberConverter`,
   a jeżeli *"morse"*, to `MorseNumberConverter`. Jeżeli zostanie podany inny łańcuch, to
   powinna zostać zwrócona implementacja `NumberConverter`, która zwraca ten sam łańcuch `("test" -> "test")`.
   
8. * Stwórz metodę `modifyUpperCase`, która będzie otrzymywać listę łańcuchów znaków oraz liczbę (indeks elementu). Gdy indeks nie będzie wskazywał na żaden element, to zgłoś `IllegalArgumentException`. 
     W przypadku gdy zostanie podany poprawny indeks to zmień wszystkie znaki we wskazanym łańcuchu na wielkie litery, a resztę pozostaw niezmienioną. Na przykład:
    `["aaa", "bbb", "ccc", "ddd"]` oraz `2` ->  `["aaa", "bbb", "CCC", "ddd"]`

   * Stwórz analogiczną metody `modifyRepeat`, która powiela łańcuch znaków dwukrotnie.
    `["aaa", "bbb", "ccc", "ddd"]` oraz `2` ->  `["aaa", "bbb", "cccccc", "ddd"]`
   
   * Zastanów się, czy za pomocą interfejsów można stworzyć ogólną wersję metody `modify`.

   * Zastanów się, czy nie można zmienić metody `modify`, tak by można było wyszukiwać element po dowolnej właściwości nie tylko po indeksie.

### Kolekcje

1. Stwórz metodę `boolean isSorted(List <String> ints)` przyjmującą listę i zwracającą `true`, gdy jej elementy zachowują rosnącą kolejność.

   `[1,2,3,10,15]` -> `true`

   `[1,2,3,10,5]` -> `false`

    Stwórz drugą wersję metody `boolean isSorted(List <String> ints, boolean ascending)`. 
    Metoda powinna zwracać `true` jeżeli elementy są posortowane rosnąco i parametr `ascending` to `true`. 
    Jeżeli ascending to `false`, to powinna zwracać `true` gry elementy maleją.

    `[3,2,1], true -> false`

    `[1,2,3], true -> true`

    `[3,2,1], false -> false`

    `[1,2,3], false -> true`

2. Stwórz metodę `intercalate`, która będzie otrzymywać listę elementów `int` oraz dodatkowy element typu `int`.
Metoda ta ma zwrócić listę elementów listy przeplataną dodatkowym elementem:

    `[1,2,3]` oraz `5` -> `[1,5,2,5,3,5]`

3. Stwórz metodę `interleave`, która będzie otrzymywać 2 listy elementów `int` i połączy je ze sobą w taki sposób, że
storzy listę zawierającą elementy każdej z nich na zmianę:

    `[1,2,3]`, `[11,12,13]` -> `[1,11,2,12,3,13]`

4. Stwórz metodę `boolean allNegative(List<Integer> elements)` zwracającą `true` tylko jeżeli wszystkie elementy listy są ujemne.

5. Stwórz metodę `distinct` przyjmującą jako argument listę `int`. Metoda ta powinna zwrócić listę `int`, ale ominąć powtarzające się elementy:

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

*(Dodatkowo)* obok liczby występowań wyświetl w nawiasie procentową wartość udziału znaku w łańcuchu.

8. **(trudne)** Zaimplementuj [sito Erastotenesa](http://rasmus.is/pl/T/u/st23k01.htm). Funkcja obliczająca sito powinna 
otrzymać jako parametr liczbę `limit` i powinna znaleźc wszystkie liczby pierwsze mniejsze od `limit`.

9. **(trudne)** Zaimplementuj algorytm sortowania bąbęlkowego.

### String

1. Stwórz metodę `isPalindrome` sprawdzającą czy słowo jest palindromem:

   `kajak` -> `true`
   `kaja` -> `false`

*(Dodatkowo)* Stwórz drugą wersję metody, która ignoruje spacje oraz wielkość liter podczas sprawdzania tekstu:

   `Kobyła ma mały bok` -> `true`

2. Stwórz metodę `unique` przyjmującą jako argument łańcuch tekstowy. Metoda ta powinna zwrócić również łańcuch tekstowy,
ale powinna pomijać wszystkie wystepujące już znaki. Na przykład:

   `abcabcd` -> `abcd`

   `aaaaaax` -> `ax`

3. Napisz program w klasie `ReadWords` wczytujący linie tekstu ze standardowego wejścia do listy aż do wpisania słowa `koniec`. Następnie program powinien wyświetlić je podzielone przecinkami pomijajac `koniec`. Na przykład: `Wczytano 3 słowa: Jaś, piłka, słowo.`. 
Rozważ użycie metod `String.join` i `String.format`.

4. Stwórz metodę `repeatUntil`, która będzie powtarzać dany string, aż jego długość przekroczy wartość progową.
   Na przykład, dla *"raz"* i *13*:
   
     * 1 iteracja: `size("raz")` < `13` -> `"razraz"`
     * 2 iteracja: `size("razraz")` <  `13` -> `"razrazrazraz"`
     * 3 iteracja: `size("razrazrazraz")` < `13` -> `"razrazrazrazrazrazrazraz"`
     * 4 iteracja: `size("razrazrazrazrazrazrazraz")` > `13` -> koniec

### Varargs

1. Stwórz metodę `int sumAll(int... elements)`, która będzie zwracać sumę wszyskich podanych elementów:

    `1,2,3 -> 6`

2. Stwórz metodę `String join(String... elements)`, która będzie łaczyć wszystkie podane łańcuchy za pomocą łącznika *" i "*:

    `"Ania", "Kasia", "Beata" -> "Ania i Kasia i Beata"`

3. Sprawdź w jaki sposób działają metody tworzące kolekcje:

    * `List.of` oraz `Arrays.asList` dla list.
    * `Map.of` dla map.
    * `Set.of` dla setów

### Random

1. Stwórz metode `pickRandom`, która przyjmuje dowolną ilość liczb i losuje jedną z nich:

   `1,2,3,4,5 ~> 1`
   
2. **(trudne)** Stwórz grę, która będzie losowała wartość od 1 do 100, następnie będzie prosiła użytkownika o podanie liczby.
W przypadku gdy użytkownik trafi, to gra informuje go o zwycięstwie, a jeżeli nie trafi, to informuje go czy 
liczba jest zbyt mała lub zbyt duża.

### Data i czas

1. Napisz fukcję wyświetlającą godzinię na przykład `10:10:15` co 10 sekund.
2. Napisz funkcję, która po otrzymaniu roku i miesiąca zwróci listę wszystkich dni danego miesiąca.
3. Napisz funkcję `isAlmostTime` zwracającą `true`, jeżeli obecny czas jest z zakresie +/- 5 minut od podanego
   w parametrze.
4. Napisz funkcję, która zwraca liczbę dni do następnych urodzin podanych jako parametr.

### Klasy generyczne

1. * Stwórz klasę `Pair<X,Y>` przechowującą dwie wartości.
   * Dodaj metodę `swap`, która zwraca nowy `Pair<Y,X>` z zamienionymi wartościami.
   
2. Stwórz klasę `RandomList<X>`, która ma dwie metody `add(X element)` oraz `X getRandom(boolean returning)`.
Po dodaniu elementów do listy wywołanie metody `getRandom` powinno zwracać losowy element. Jeżeli `returning` to `false`,
to lista powinna usunąć wylosowany element, a jeżeli `true` to powinna go zachować. Jeżeli metoda zostanie wywołana
na pustej liście rzuć wyjątek `IllegalStateException`.

3. Zmodyfikuj metodę `pickRandom`, `intercalate`, `intersperse` tak, by działały na dowolnych typach. 
   Zastanów się czy można zmodyfikować także inne metody by były generyczne.

### Wyjątki

1. * Napisz metodę `checkNull` rzucającą wyjątek `NullPointerException`, gdy argument jest równy `null`.
   * Napisz następnie metodę `checkSize` sprawdzającą czy podany łańcuch znaków ma długość dłuższą lub równą od 2 znaków i krótszą lub równą od 15.
     Jeżeli rozmiar jest nieprawidłowy to zgłoś wyjątek `IllegalArgumentException` z wiadomością 
     *"Tekst musi mieć od 2 do 15 znaków, a ma X znaków"*, gdzie X to rzeczywisty rozmiar tekstu.
   * Dodaj metodę `validate`, przyjmującą łańcuch znaków i zwracającą `boolean`. Ta metoda powinna wywołać metody
     `checkNull` oraz `checkSize`. Jeżeli nie zostanie z nich rzucony żaden wyjątek, to metoda
     powinna zwrócić `true`, jeżeli zostanie rzucony jakikolwiek wyjątek, to powinien zostać wypisany
     za pomocą `System.err.println`, a metoda powinna zwrócić `false`.
   * Napisz metodę `main` w której przetestujesz jak zachowuje się metoda `validate` dla prawidłowych
     wartości, jak *"Test"* oraz nieprawidłowych jak `null` lub *"x"* albo *"xxxxxxxxxxxxxxxxx"*.
       
2. Napisz metodę `tryParse` parsująca liczbę ze łańcucha znaków, używajac `Integer.parse`. W przypadku nieudanej konwersji rzuć wyjątek `IllegalArgumentException` podając stary wyjątek jako parametr oraz przekaż wiadomość "Nieprawidłowa liczba".
3. Napisz własny wyjątek `OddSizeException`. Zdefiniuj dla niego wszystkie konstruktory z klasy bazowej.
Napisz metodę `checkList` wyrzucającą go, jeżeli liczba elementów jest nieparzysta.
4. Stwórz kalkulator bezpiecznie wczytujący liczby i dodającą je listy.
 Po wpisaniu przez użytkownika `=` program powinien wyświetlić listę liczb oraz ich sumę.

   * Jeżeli liczba jest poprawna, np. `123` to powinna zostać dodana do listy.
   * Jeżeli liczba jest niepoprawna, to wyjątek `InputMismatchException` powinien zostać przechwycony i 
     powienien zostać wyświetlony komunikat "Niepoprawna liczba!". Podanie niepoprawnej liczby nie powinno 
     kończyć działania programu.


### Typy wyliczeniowe

1. * Stwórz typ wyliczeniowy `Color`.
   * Dodaj kolory, takie jak `BLACK`, `RED`, `YELLOW`.
   * Dodaj do niego metode `String getHex()` zwracającą heksadecymalną reprezentację koloru.

2. * Stwórz typ wyliczeniowy `DayOfWeek` zawierający nazwy dni tygodnia.
   * Dodaj do enumeracji pole zwracające skróconą nazwę, dnia np, `Tue`.
   * Dodaj do enumeracji metodę `isWeekend` zwracającą `true` dla soboty i niedzieli.
   * Stwórz enumerację `WeekendType` zawierającą dwie wartości `Regular` i `Islamic`.
   * Stwórz przeładowaną metodę `isWeekend`, że gdy otrzyma `weekendType` `Islamic`
    to zwraca `true` dla piątku i soboty.
   * Stwórz klasę `OfficeWorkingHours`  otrzymującą jako wejście `DayOfWeek`.
     Klasa w konstruktorze musi otrzymać listę zawierająca `DayOfWeek` o nazwie `daysWithExtendedWorkingHours`
     i zapisać je jako pole.
   * Stwórz metodę `String getOfficeWorkingHours(DayOfWeek day)` zwracającą czas pracy urzędu:
      * *8-15* jeżeli jest to normalny dzień
      * *8-17* jeżeli jest to dzień z rozszerzonymi godzinami pracy
      * *zamknięte* jeżeli jest to weekend.
      
### Pliki

1. Wczytaj plik wpisujący obecną datę i godzinę do pliku `time`. Kolejne uruchomienia programu
powinny pozostawiać starą zawartość, a tylko dodawać nową linię na końcu pliku.

2. Napisz program, który wczytuje wszystkie linie z pliku `linie`, następnie 
nadpisuje go wpisując linie w odwrotnej kolejności.

*(Dodatkowo)* Napisz program, który nadpisuje linie w losowy sposób (losuje kolejność).

3. Wczytaj plik `osoby` zawierający numery PESEL i nazwiska oraz imiona, podzielone znakiem `;`, a następnie `adresy`
zawierający numery PESEL i adresy zamieszkania podzielone znakiem `;`. Połącz dane z obydwóch plików i wyświetl dla wszystich osób
dane w formacie `PESEL, imię, nazwisko, adres`. Jeżeli dla danej osoby nie istnieje linia w pliku `adresy.txt` to wyświetl `???`. 

### Wątki

1. Stwórz nowy wątek wyświetlający napis `Witaj z innego wątku!` co 10 sekund oraz dodaj pętlę
w głównym wątku wyświetljącą `Witaj z głownego wątku!` co 20 sekund. 

2. Stwórz klasę implementującą interfejs `Runnable`, która jako parametr otrzyma liczbę. Zadaniem obieku tej
klasy będzie wyświetlenie liczby razem z z nazwą watku, a następnie odczekanie 1 sekundy i zmniejszenie wartości
licznika o `1`, a natępnie powtórzenie operacji aż do osiągnięcia `0`. Innymi słowy należe odliczyć od `n` do `0`.

### Wyrażenia regularne

Zaimplementuj wszystkie metody w klasach `Matches`, `Find`, `Replace`, `Split` oraz `FindGroups`, tak by testy kończyły się powodzeniem.

