import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckNullExerciseTest {

    @Test
    void checkNullTest() {
        assertThrows(NullPointerException.class, () -> CheckNullExercise.checkNull(null));
        CheckNullExercise.checkNull("ok");
    }
}