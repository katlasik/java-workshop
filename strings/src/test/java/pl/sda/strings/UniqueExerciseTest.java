package pl.sda.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UniqueExerciseTest {

  @Test
  void unique() {
    assertThat(UniqueExercise.unique("aaabbbccc")).isEqualTo("abc");
  }
}
