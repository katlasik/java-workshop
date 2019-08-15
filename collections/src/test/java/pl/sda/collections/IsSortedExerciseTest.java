package pl.sda.collections;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class IsSortedExerciseTest {

    @Test
    void isSortedTest() {
        List<Integer> liczby = Arrays.asList(3, 4, 5);
        assertThat(IsSortedExercise.isSorted(liczby)).isTrue();

        List<Integer> liczby2 = Arrays.asList(5, 4, 3);
        assertThat(IsSortedExercise.isSorted(liczby2)).isFalse();
    }

    @Test
    void isSortedParametrizedTest() {
        List<Integer> liczby = Arrays.asList(3, 4, 5);
        assertThat(IsSortedExercise.isSorted(liczby, true)).isTrue();

        List<Integer> liczby2 = Arrays.asList(5, 4, 3);
        assertThat(IsSortedExercise.isSorted(liczby2, true)).isFalse();

        List<Integer> liczby3 = Arrays.asList(4, 5, 3);
        assertThat(IsSortedExercise.isSorted(liczby3, true)).isFalse();

        List<Integer> liczby4 = Arrays.asList(3, 4, 5);
        assertThat(IsSortedExercise.isSorted(liczby4, false)).isFalse();

        List<Integer> liczby5 = Arrays.asList(5, 4, 3);
        assertThat(IsSortedExercise.isSorted(liczby5, false)).isTrue();

        List<Integer> liczby6 = Arrays.asList(4, 5, 3);
        assertThat(IsSortedExercise.isSorted(liczby6, false)).isFalse();

    }


}
