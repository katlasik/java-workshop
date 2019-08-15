package pl.sda.regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ch5FindGroupsExamples {

  /**
   * Uzupełnij fukcję, tak by znalazła grupy zawierające klucz i wartość przedzielone spacją
   * i zwróciła jako listę.
   *
   * key="100" value="V" -> [100,V]
   * key=""              -> []
   * value=""            -> []
   *
   */
  List<String> findKeyValues(String input) {

    String regex = null;

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);

    return null;
  }

  /**
   * Uzupełnij fukcję, tak by znalazła grupy zawierające liczby i zwróciła listę.
   *
   * 123 to nie jest 5595  -> [123, 5505]
   * Nie ma liczb          -> []
   * 567 i 543 i 998       -> [567, 543, 998]
   *
   */
  List<String> findNumbers(String input) {

    String regex = null;

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);

    return null;
  }


}
