package pl.sda.collections.exercises;

import org.junit.jupiter.api.Test;
import pl.sda.collections.exercises.Filter;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FilterTest {

  @Test
  void process() {
    Filter fe = new Filter(5,10);
    List<Integer> integers = Arrays.asList(1, 8, 100, 9, 11);
    assertThat(fe.filter(integers)).isEqualTo(Arrays.asList(8, 9));
  }

}
