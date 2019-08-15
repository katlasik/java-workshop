package pl.sda.collections.exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UniqueExerciseTest {

  @Test
  void unique() {
    assertThat(UniqueExercise.unique("aaabbbccc")).isEqualTo("abc");
  }
}
