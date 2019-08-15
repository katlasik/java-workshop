package pl.sda.regex;

import org.junit.jupiter.api.Test;
import pl.sda.regex.Ch5FindGroupsExamples;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class P5FindGroupsExamplesTest {

  private Ch5FindGroupsExamples examples = new Ch5FindGroupsExamples();

  @Test
  void testFindKeyValues() {
    assertThat(examples.findKeyValues("key=\"100\" value=\"V\""))
            .isEqualTo(Arrays.asList("100", "V"));

    assertThat(examples.findKeyValues("key=\"100\""))
            .isEqualTo(Collections.emptyList());


    assertThat(examples.findKeyValues("value=\"V\""))
            .isEqualTo(Collections.emptyList());

  }

  @Test
  void testFindNumbers() {
    assertThat(examples.findNumbers("123 to nie jest 5595"))
            .isEqualTo(Arrays.asList("123", "5595"));

    assertThat(examples.findNumbers("Nie ma liczb"))
            .isEqualTo(Collections.emptyList());

  }


}
