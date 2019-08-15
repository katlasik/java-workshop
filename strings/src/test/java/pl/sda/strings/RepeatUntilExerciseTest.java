package pl.sda.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RepeatUntilExerciseTest {

    @Test
    void repeatUntil() {
        assertThat(RepeatUntilExercise.repeatUntil("raz", 13)).isEqualTo("razrazrazrazrazrazrazraz");
    }
}