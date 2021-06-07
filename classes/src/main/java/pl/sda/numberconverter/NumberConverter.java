package pl.sda.numberconverter;

/**
 * Stwórz interfejs `NumberConverter` posiadającą jedna metodę: `String convert(String number)`
 * Stwórz klasę `MorseNumberConverter`, która zamienia liczbę na reprezentację w kodzie Morse'a.
 * Rozważ użycie mapy jako słownika. Cyfry w reprezentacji języka Morse'a:
 * * 1:  • — — — —
 * * 2:  • • — — —
 * * 3:  • • • — —
 * * 4:  • • • • —
 * * 5:  • • • • •
 * * 6:  — • • • •
 * * 7:  — — • • •
 * * 8:  — — — • •
 * * 9:  — — — — •
 * * 0:  — — — — —
 * <p>
 * Stwórz klasę `HexNumberConverter`, która zmienia arabską liczbę na heksadecymalną. Skorzystaj z metody `Integer.toHexString`.
 * Stwórz klasę `NumberConverterFactory`, która posiada statyczną metodę `createConverter`, która jako parametr przyjmuje łańcuch znaków.
 * Jeżeli zostanie podany do niej łańcuch *"hex"* powinna wrócić implementację `HexNumberConverter`,
 * a jeżeli *"morse"*, to `MorseNumberConverter`. Jeżeli zostanie podany inny łańcuch, to
 * powinna zostać zwrócona implementacja `NumberConverter`, która zwraca ten sam łańcuch `("test" -> "test")`.
 */

public interface NumberConverter {
    String convert(Integer number);
}
