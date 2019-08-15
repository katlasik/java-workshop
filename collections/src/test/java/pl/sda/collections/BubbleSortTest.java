package pl.sda.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void bubbleSortTest() {

        ArrayList<Integer> a = new ArrayList<>(List.of(8, 8, 9, 3, 1, 3, 2, 4, 5, 8));

        System.out.println(BubbleSort.bubbleSort(a));

    }


}