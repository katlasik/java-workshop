package pl.sda.collections;

import java.util.Collections;
import java.util.List;

/**
 * Zaimplementuj algorytm sortowania bąbęlkowego.
 */
public class BubbleSort {

    public static List<Integer> bubbleSort(List<Integer> ints) {

        for(int i=0; i<ints.size(); i++) {
            for(int j=i; j<ints.size(); j++) {
                if(ints.get(i) > ints.get(j)) {
                    Collections.swap(ints, i, j);
                }
            }
        }

        return ints;
    }


}
