package pl.sda.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UniqueExerciseTest {

    @Test
    void uniqueTest() {
        assertThat(UniqueExercise.unique("aaabbbccc")).isEqualTo("abc");
    }
}
