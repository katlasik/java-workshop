import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OddSizeExerciseTest {

    @Test
    void checkList() {
        Exception exception = assertThrows(Exception.class, () -> OddSizeExercise.checkList(List.of(1)));

        assertThat(exception.getClass().toString().contains("OddSizeException")).isTrue();

        OddSizeExercise.checkList(List.of(1,2));
    }
}