package pl.sda.collections.exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MyNumberExerciseTest {

  @Test
  void isOdd() {
    assertThat(new MyNumber(3).isOdd()).isTrue();
    assertThat(new MyNumber(4).isOdd()).isFalse();

  }

  @Test
  void isEven() {
    assertThat(new MyNumber(3).isEven()).isFalse();
    assertThat(new MyNumber(4).isEven()).isTrue();
  }

  @Test
  void sqrt() {
    assertThat(new MyNumber(36).sqrt()).isEqualTo(new MyNumber(6));
    assertThat(new MyNumber(25).sqrt()).isEqualTo(new MyNumber(5));
  }

  @Test
  void pow() {
    assertThat(new MyNumber(5).pow(new MyNumber(3))).isEqualTo(new MyNumber(125));
    assertThat(new MyNumber(10).pow(new MyNumber(4))).isEqualTo(new MyNumber(10000));

  }

  @Test
  void add() {
    assertThat(new MyNumber(5).add(new MyNumber(1))).isEqualTo(new MyNumber(6));
  }

  @Test
  void subtract() {
    assertThat(new MyNumber(5).subtract(new MyNumber(5))).isEqualTo(new MyNumber(0));
  }
}