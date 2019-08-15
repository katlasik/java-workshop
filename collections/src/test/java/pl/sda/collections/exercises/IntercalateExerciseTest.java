package pl.sda.collections.exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class IntercalateExerciseTest {

  @Test
  void intercalate() {
    assertThat(IntercalateExercise.intercalate(Arrays.asList(1,2,3,4),5)).isEqualTo(Arrays.asList(1,5,2,5,3,5,4,5));
  }
}
