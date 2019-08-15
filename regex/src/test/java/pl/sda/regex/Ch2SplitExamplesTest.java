package pl.sda.regex;


import org.junit.jupiter.api.Test;
import pl.sda.regex.Ch2ReplaceExamples;

import static org.assertj.core.api.Assertions.assertThat;

public class Ch2SplitExamplesTest {

  Ch2ReplaceExamples examples = new Ch2ReplaceExamples();

  @Test
  public void testRemoveWhitespace() {
    assertThat(examples.removeWhitespace("12   54   3"))
            .isEqualTo("12543");
    assertThat(examples.removeWhitespace("555 666"))
            .isEqualTo("555666");
  }

  @Test
  public void testReplaceUnderscore() {
    assertThat(examples.replaceUnderscore("___123___123"))
            .isEqualTo("_123_123");
    assertThat(examples.replaceUnderscore("________"))
            .isEqualTo("_");
  }

  @Test
  public void testReplaceVowels() {
    assertThat(examples.replaceVowels("abcdef"))
            .isEqualTo("_bcd_f");
    assertThat(examples.replaceVowels("aaabbbccc"))
            .isEqualTo("___bbbccc");
  }


}
