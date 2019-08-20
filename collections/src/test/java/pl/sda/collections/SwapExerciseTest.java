package pl.sda.collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SwapExerciseTest {

    @Test
    void swap() {

        assertThat(SwapExercise.swap(new int[]{1, 2, 3, 4, 5, 6, 7}, 3, 5)).isEqualTo(
                new int[]{1, 2, 3, 6, 5, 4, 7}
        );

        assertThat(SwapExercise.swap(new int[]{1, 2, 3, 4, 5, 6, 7}, 0, 4)).isEqualTo(
                new int[]{5, 2, 3, 4, 1, 6, 7}
        );

        assertThat(SwapExercise.swap(new int[]{1, 2, 3, 4, 5, 6, 7}, 4, 0)).isEqualTo(
                new int[]{5, 2, 3, 4, 1, 6, 7}
        );

    }

    @Test
    void swapList() {

        assertThat(SwapExercise.swapList(List.of(1, 2, 3, 4, 5, 6, 7), 3, 5)).isEqualTo(
                List.of(1, 2, 3, 6, 5, 4, 7)
        );

        assertThat(SwapExercise.swapList(List.of(1, 2, 3, 4, 5, 6, 7), 0, 4)).isEqualTo(
                List.of(5, 2, 3, 4, 1, 6, 7)
        );

        assertThat(SwapExercise.swapList(List.of(1, 2, 3, 4, 5, 6, 7), 4, 0)).isEqualTo(
                List.of(5, 2, 3, 4, 1, 6, 7)
        );

    }

}
