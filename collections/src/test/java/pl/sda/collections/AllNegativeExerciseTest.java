package pl.sda.collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

class AllNegativeExerciseTest {

    @Test
    void test() {
        assertThat(AllNegativeExercise.allNegative(List.of(1, 2, 3))).isFalse();
        assertThat(AllNegativeExercise.allNegative(List.of(1, -2, 3))).isFalse();
        assertThat(AllNegativeExercise.allNegative(List.of(-1, -2, -3))).isTrue();
    }

}
