import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumExerciseTest {

    @Test
    void test() {
        assertThat(SumExercise.sumAll(1,2,3)).isEqualTo(6);
    }

}