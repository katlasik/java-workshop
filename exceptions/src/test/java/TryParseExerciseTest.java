import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TryParseExerciseTest {

    @Test
    void safeParseTest() {
        assertThat(TryParseExercise.tryParse("1234")).isEqualTo(1234);
        IllegalArgumentException nok = assertThrows(IllegalArgumentException.class, () -> TryParseExercise.tryParse("nok"));

        assertThat(nok.getMessage()).isEqualTo("Nieprawidłowa liczba");
    }
}