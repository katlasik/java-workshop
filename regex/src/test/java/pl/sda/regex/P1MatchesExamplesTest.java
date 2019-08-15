package pl.sda.regex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class P1MatchesExamplesTest {

  Ch1MatchesExamples examples = new Ch1MatchesExamples();

  @Test
  public void isNumber() {
    assertThat(examples.isNumber("12543")).isTrue();
    assertThat(examples.isNumber("q12543")).isFalse();
  }

  @Test
  public void isHex() {
    assertThat(examples.isHex("a5b3")).isTrue();
    assertThat(examples.isHex("A5B3C4")).isTrue();
    assertThat(examples.isHex("Z24")).isFalse();
  }

  @Test
  public void isWeekday() {
    assertThat(examples.isWeekday("Monday")).isTrue();
    assertThat(examples.isWeekday("Tuesday")).isTrue();
    assertThat(examples.isWeekday("Wednesday")).isTrue();
    assertThat(examples.isWeekday("Thursday")).isTrue();
    assertThat(examples.isWeekday("Friday")).isTrue();
    assertThat(examples.isWeekday("Saturday")).isTrue();
    assertThat(examples.isWeekday("Sunday")).isTrue();
    assertThat(examples.isWeekday("Wtorek")).isFalse();
  }

  @Test
  public void isEven() {
    assertThat(examples.isEven("22")).isTrue();
    assertThat(examples.isEven("34")).isTrue();
    assertThat(examples.isEven("46")).isTrue();
    assertThat(examples.isEven("58")).isTrue();
    assertThat(examples.isEven("70")).isTrue();
    assertThat(examples.isEven("51")).isFalse();
    assertThat(examples.isEven("63")).isFalse();
    assertThat(examples.isEven("75")).isFalse();
    assertThat(examples.isEven("87")).isFalse();
    assertThat(examples.isEven("99")).isFalse();

  }

  @Test
  public void isHyphenized() {
    assertThat(examples.isHyphenized("test-test")).isTrue();
    assertThat(examples.isHyphenized("test-test-test")).isTrue();
    assertThat(examples.isHyphenized("test")).isTrue();
    assertThat(examples.isHyphenized("-test")).isFalse();
    assertThat(examples.isHyphenized("test-")).isFalse();
    assertThat(examples.isHyphenized("test_test")).isFalse();
    assertThat(examples.isHyphenized("testTest")).isFalse();
    assertThat(examples.isHyphenized("test-Test")).isFalse();
  }

  @Test
  public void isQuoted() {
    assertThat(examples.isQuoted("\"tekst\"")).isTrue();
    assertThat(examples.isQuoted("\"\"")).isFalse();
    assertThat(examples.isQuoted("teks\"tekst\"")).isFalse();
  }

  @Test
  public void isCapitalized() {
    assertThat(examples.isQuoted("Tekst")).isTrue();
    assertThat(examples.isQuoted("T")).isTrue();
    assertThat(examples.isQuoted("false")).isFalse();
    assertThat(examples.isQuoted("")).isFalse();
  }

  @Test
  public void isRequest() {

    assertThat(examples.isRequest("Kup mleko.")).isTrue();
    assertThat(examples.isRequest("Kup mleko, banany.")).isTrue();
    assertThat(examples.isRequest("Kup mleko, banany, wodę.")).isTrue();
    assertThat(examples.isRequest("Kup banany")).isFalse();
    assertThat(examples.isRequest("Kup")).isFalse();
    assertThat(examples.isRequest("banany")).isFalse();


  }
}
