package pl.sda.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Stwórz klasę `pl.sda.classes.Filter`, która w konstruktorze przyjmuje dwie liczby i posiadaj metodę `filter`,
 * która przyjmuje kolekcje liczb. Metoda ta powinna zwrócić nową kolekcję, ale tylko
 * z liczbami, które znajdują się między tymi przyjętymi w konstruktorze.
 */
public class Filter {

    private final int to;
    private final int from;

    public Filter(int from, int to) {
      this.from = from;
      this.to = to;
  }

  List<Integer> filter(List<Integer> list) {
     ArrayList<Integer> result =new ArrayList<>();

     for(int i: list) {
         if(i >= from && i <= to) {
             result.add(i);
         }
     }

     return result;

  }

}
