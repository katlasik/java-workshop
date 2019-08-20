package pl.sda.regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroups {

  /**
   * Uzupełnij fukcję, tak by znalazła cenę mleka.
   *
   * Mleko kosztuje 5 zł.                              -> Optional(5)
   * Telewizor kosztuje 1000 zł. Mleko kosztuje 2 zł.  -> Optional(2)
   * Chleb kosztuje 2 zł.                              -> Optional()
   *
   */
  Optional<String> findKeyValues(String input) {

    String regex = null;

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);

    if(matcher.find()) {
      return Optional.of(matcher.group(1));
    } else {
      return Optional.empty();
    }
  }

}
