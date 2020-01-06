package pl.sda.regex;

public class Matches {

    /**
     * Uzupełnij fukcję, tak by sprawdzała, czy podany łańcuch zawiera tylko cyfry.
     * <p>
     * 12543 -> true
     * q1231 -> false
     */
    boolean isNumber(String input) {
        String regex = null;
        return input.matches(regex);
    }

    /**
     * Uzupełnij fukcję, tak by sprawdzała, czy podany łańcuch zawiera liczbę w zapisie heksadecymalnym.
     * Liczba w zapisie hex może zawierać liczby od 0 do 9 lub litery od a do f.
     * <p>
     * a5b3      -> true
     * A5B3C4    -> true
     * Z24       -> false
     */
    boolean isHex(String input) {

        String regex = null;

        return input.matches(regex);
    }

    /**
     * Uzupełnij fukcję, tak by sprawdzała, czy podany łańcuch zawiera dzień tygodnia po angielsku.
     * <p>
     * Monday     -> true
     * Tuesday    -> true
     * Czwartek   -> false
     */
    boolean isWeekday(String input) {

        String regex = null;

        return input.matches(regex);
    }

    /**
     * Uzupełnij fukcję, tak by sprawdzała, czy podany łańcuch zawiera parzystą liczbe.
     * <p>
     * 100   -> true
     * 44    -> true
     * 31    -> false
     */
    boolean isEven(String input) {

        String regex = null;

        return input.matches(regex);
    }

    /**
     * Uzupełnij fukcję, tak by sprawdzała, czy podany łańcuch zawiera tekst zawiejący małe litey lub cyfry
     * podzielony myśnikami.
     * <p>
     * blog-post-100  -> true
     * blog_post      -> false
     * blogPost       -> false
     */
    boolean isHyphenized(String input) {

        String regex = null;

        return input.matches(regex);
    }


    /**
     * Uzupełnij fukcję, tak by sprawdzała, czy podany łańcuch zawiera tekst w cudzysłowiu.
     * <p>
     * "tekst"    -> true
     * ""         -> false
     * teks"teks" -> false
     */
    boolean isQuoted(String input) {

        String regex = null;

        return input.matches(regex);
    }

    /**
     * Uzupełnij fukcję, tak by sprawdzała, czy podany łańcuch zaczyna się z dużej litery.
     * <p>
     * Test                     -> true
     * test                     -> false
     * t Test                   -> false
     */
    boolean isCapitalized(String input) {

        String regex = null;

        return input.matches(regex);
    }


    /**
     * Uzupełnij fukcję, tak by sprawdzała, czy podany łańcuch zawiera prośbę o zakup jednego, dwóch
     * albo trzech produktów powiedzelonych przecinkami.
     * <p>
     * Kup mleko.               -> true
     * Kup mleko, banany.       -> true
     * Kup mleko, banany, sok . -> true
     * Kup banany               -> false          // brak kropki
     * Kup                      -> false          // brak produktu
     * banany                   -> false          // tylko produkt
     */
    boolean isRequest(String input) {

        String regex = null;

        return input.matches(regex);
    }

}
