package pl.sda.regex;

import org.junit.jupiter.api.Test;
import pl.sda.regex.Ch3SplitExamples;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class P3SplitExamplesTest {

  Ch3SplitExamples examples = new Ch3SplitExamples();

  @Test
  public void testSplitByPipe() {
    assertThat(examples.splitByPipe("1|2|3"))
            .isEqualTo(Arrays.asList("1", "2", "3"));
    assertThat(examples.splitByPipe("|2|"))
            .isEqualTo(Arrays.asList("", "2", ""));
    assertThat(examples.splitByPipe("xxx"))
            .isEqualTo(Collections.emptyList());

  }

  @Test
  public void testSplitByComaOrSemicolonOrPipe() {

    assertThat(examples.splitByComaOrSemicolonOrPipe("a|b|c"))
            .isEqualTo(Arrays.asList("a", "b", "c"));


    assertThat(examples.splitByComaOrSemicolonOrPipe("a,b;c"))
            .isEqualTo(Arrays.asList("a", "b", "c"));


    assertThat(examples.splitByComaOrSemicolonOrPipe("a||b;.c"))
            .isEqualTo(Arrays.asList("a", "b", "c"));
  }
}
