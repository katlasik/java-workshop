package pl.sda.regex;

public class Split {

  /**
   * Uzupełnij fukcję, tak by podzieliła łańcuch na części według znaku |.
   *
   * a|b|c|d -> [a,b,c,d]
   *
   */
  String[] splitByPipe(String input) {

    String regex = "\\|";

    return input.split(regex);
  }

  /**
   * Uzupełnij fukcję, tak by podzieliła łańcuch na części według znaków , albo ; albo | lub ich wielokrotności.
   *
   * a|b|c|d   -> [a,b,c,d]
   * a,b;c     -> [a,b,c]
   * a||b;,c   -> [a,b,c]
   *
   */


  String[] splitByComaOrSemicolonOrPipe(String input) {

    String regex = "[|;,]+";

    return input.split(regex);
  }

}
