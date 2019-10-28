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
 *
 * Stwórz klasę `HexNumberConverter`, która zmienia arabską liczbę na heksadecymalną. Skorzystaj z metody `Integer.toHexString`.
 * Stwórz klase `NumberConverterFactory`, która posiada statyczną metodę `createConverter`, która jako parametr przyjmuje łańcuch znaków.
 * Jeżeli zostanie podany do niej łańcuch *"hex"* powinna wrócić implementację `HexNumberConverter`,
 * a jeżeli *"morse"*, to `MorseNumberConverter`. Jeżeli zostanie podany inny łańcuch, to
 * powinna zostać zwrócona implementacja `NumberConverter`, która zwraca ten sam łańcuch `("test" -> "test")`.
 */

public interface NumberConverter {
    String ANSI_RESET = "\u001B[0m";
    String ANSI_CYAN = "\u001B[36m";

    default String color(String text) {
        return ANSI_CYAN + text + ANSI_RESET;
    }

    String convert(Integer number);
}
