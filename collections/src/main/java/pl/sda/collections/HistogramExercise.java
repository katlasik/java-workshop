package pl.sda.collections;

import java.util.HashMap;
import java.util.Map;

public class HistogramExercise {

  /**
   * Stwórz metodę `showHistogram(String input)`, która będzie otrzymywać łańcuch tekstowy i będzie wyświetlać
   * wszystkie znaki oraz ile razy występuję. Na przykład `showHistogram("aaabbbc")` powienien zwrócić:
   */
  public static String showHistogram(String data) {

    char[] chars = data.toCharArray();

    HashMap<Character, Integer> map = new HashMap<>();

    for(int i = 0; i< chars.length; i++) {
      char c = chars[i];
      if(map.containsKey(c)) { //sprawdzamy czy mapa zawiera znak
        int j = map.get(c);
        map.put(c, ++j); //jezeli tak to zwiększamy licznik o 1 i odkładamy
      } else {
        map.put(c, 1); //jeżeli nie to odkładamy z 1
      }
    }

    String result = "";
    for(Map.Entry<Character,Integer> e: map.entrySet()) {
      int percent = Math.round(e.getValue()*100/data.length());
      result += e.getKey() + ":" + e.getValue()+" "+ percent +"%\n";
    }

    return result;

  }

}
