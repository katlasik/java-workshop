package pl.sda.collections.exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class DistinctExerciseTest {

    @Test
    void distinct() {

        assertThat(DistinctExercise.distinct(Arrays.asList(1, 2, 2, 4))).hasSameElementsAs(
                Arrays.asList(1, 2, 4)
        );

        assertThat(DistinctExercise.distinct(Arrays.asList(4, 4, 3, 4))).hasSameElementsAs(
                Arrays.asList(3, 4)
        );

    }
}
