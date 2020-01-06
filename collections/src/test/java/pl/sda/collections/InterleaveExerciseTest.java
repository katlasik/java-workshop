package pl.sda.collections;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class InterleaveExerciseTest {

    @Test
    void interleave() {

        assertThat(InterleaveExercise.interleave(Arrays.asList(1, 2, 3, 4), Arrays.asList(9, 8, 7, 6)))
                .isEqualTo(Arrays.asList(1, 9, 2, 8, 3, 7, 4, 6));

    }
}
