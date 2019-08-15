import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SafeParseExerciseTest {

    @Test
    void safeParseTest() {
        assertThat(SafeParseExercise.safeParse("1234")).isEqualTo(1234);
        assertThrows(IllegalArgumentException.class, () -> SafeParseExercise.safeParse("nok"));
    }
}