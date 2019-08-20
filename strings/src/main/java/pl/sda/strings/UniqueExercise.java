package pl.sda.strings;

import java.util.ArrayList;

public class UniqueExercise {

  /**
   Stwórz metodę unique przyjmującą jako argument string. Metoda ta powinna zwrócić również string ale powinna pomijać wszystkie wystepujące już znaki. Na przykład:

   abcabcd -> abcd

   aaaaaax -> ax
   */

  public static String unique(String input) {

    ArrayList<String> result = new ArrayList<>();

    for(String c: input.split("")) {
      if(!result.contains(c)){
        result.add(c);
      }
    }
    return String.join("", result);
  }

}
