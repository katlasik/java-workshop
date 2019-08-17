package pl.sda.collections;

import java.util.ArrayList;
import java.util.List;

public class IntercalateExercise {

  /**
   * Stwórz metodę intercalate, która będzie otrzymywać listę elemntów `int`
   * oraz dodatkowy element typu `int`.
   * Metoda ta ma zwrócić listę elementów listy przeplataną dodatkowym elementem:
   *
   * ints: [1,2,3], glue: 5 -> [1,5,2,5,3,5]
   *
   */  public static List<Integer> intercalate(List<Integer> ints, int glue) {

    ArrayList<Integer> result = new ArrayList<>();

    for (int i = 0; i < ints.size(); i++) {
      result.add(ints.get(i));
      if(i < ints.size()) {
        result.add(glue);
      }
    }

    return result;
  }

}