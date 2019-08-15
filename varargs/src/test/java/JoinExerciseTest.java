import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JoinExerciseTest {


    @Test
    void test() {
        assertThat(JoinExercise.join("Kasia", "Ania", "Beata"))
                .isEqualTo("Kasia i Ania i Beata");
    }

}