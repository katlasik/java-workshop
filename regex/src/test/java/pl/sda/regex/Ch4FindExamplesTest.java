package pl.sda.regex;

import org.junit.jupiter.api.Test;
import pl.sda.regex.Ch4FindExamples;

import static org.assertj.core.api.Assertions.assertThat;

public class Ch4FindExamplesTest {

  private Ch4FindExamples examples = new Ch4FindExamples();

  @Test
  void testFindQuoted() {
    assertThat(examples.findQuoted("Tekst to ''")).isEqualTo("''");
    assertThat(examples.findQuoted("Tekst to 'test'")).isEqualTo("'test'");
    assertThat(examples.findQuoted("Tekst to test")).isNull();
  }

  @Test
  void testFindInBrackets() {
    assertThat(examples.findInBrackets("Id to [123]")).isEqualTo("[123]");
    assertThat(examples.findInBrackets("Tekst to [1]")).isEqualTo("[1]");
    assertThat(examples.findInBrackets("Tekst to []")).isNull();
    assertThat(examples.findInBrackets("Tekst to [5555]")).isNull();
  }

}
