package pl.sda.regex;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReplaceTest {

    Replace examples = new Replace();

    @Test
    public void testRemoveWhitespace() {
        Assertions.assertThat(examples.removeWhitespace("12   54   3"))
                .isEqualTo("12543");
        Assertions.assertThat(examples.removeWhitespace("555 666"))
                .isEqualTo("555666");
    }

    @Test
    public void testReplaceUnderscore() {
        Assertions.assertThat(examples.replaceUnderscore("___123___123"))
                .isEqualTo("_123_123");
        Assertions.assertThat(examples.replaceUnderscore("________"))
                .isEqualTo("_");
    }

    @Test
    public void testReplaceVowels() {
        Assertions.assertThat(examples.replaceVowels("abcdef"))
                .isEqualTo("_bcd_f");
        Assertions.assertThat(examples.replaceVowels("aaabbbccc"))
                .isEqualTo("___bbbccc");
    }


}
