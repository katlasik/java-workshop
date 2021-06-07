package pl.sda.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find {

    /**
     * Uzupełnij funkcję, tak by znalazła tekst umieszczony pomiędzy pojedyńczymi cudzysłowami.
     * <p>
     * Nazwa to 'test1' -> 'test1'
     * Tekst to ''      -> ''
     */
    String findQuoted(String input) {

        String regex = null;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.find() ? matcher.group() : null;

    }

    /**
     * Uzupełnij fukcję, tak by znalazła tekst zawierający 1 do 3
     * cyfr umieszczonych pomiędzy znakami [ i ].
     * <p>
     * Id to [123]        -> [123]
     * Tekst to [1]       -> [1]
     * Tekst to []        -> null
     * Tekst to [5555]    -> null
     */
    String findInBrackets(String input) {

        String regex = null;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.find() ? matcher.group() : null;

    }


}
