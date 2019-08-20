package pl.sda.strings;

public class IsPalindromeExercise {

  /**
   Stwórz metodę `isPalindrome` zwracającą true, jeżeli przekazany string jest palidromem.

   `kajak` -> true
   `kaja` -> false

   */

  public static boolean isPalindrome(String input) {

    char[] chars = input.toCharArray();

    int indexStart = 0, indexEnd = chars.length - 1;

    while(indexStart <= indexEnd) {
      if(chars[indexStart] != chars[indexEnd]) {
        return false;
      }
      indexEnd--;
      indexStart++;
    }

    return true;
  }

  public static boolean isPalindromeIngoringSpaceAndCase(String input) {
    return isPalindrome(input.toLowerCase().replace(" ", ""));
  }

}
