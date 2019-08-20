package pl.sda.regex;

public class Replace {

  /**
   * Uzupełnij fukcję, tak usunęła wszystkie białe znaki z łancucha.
   *
   * 12   54   3  -> 12543
   * 555 666      -> 555666
   *
   */
  String removeWhitespace(String input) {

    String regex = null;
    String replacement = null;

    return input.replaceAll(regex, replacement);
  }

  /**
   * Uzupełnij fukcję, tak zamienila wszystkie samogłoski na znak podkreślenia.
   *
   * abcdef     -> _bcd_f
   * aaabbbccc  -> ___bbbccc
   *
   */


  String replaceVowels(String input) {

    String regex = null;
    String replacement = null;

    return input.replaceAll(regex, replacement);
  }

  /**
   * Uzupełnij fukcję, tak zamienila wszystkie ciągi znaku '_' na pojedyńczy znak '_'.
   *
   * ___123___123 -> _123_123
   * ________     -> _
   *
   */


  String replaceUnderscore(String input) {

    String regex = null;
    String replacement = null;

    return input.replaceAll(regex, replacement);
  }
}
