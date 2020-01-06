package pl.sda.regex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitTest {

    Split examples = new Split();

    @Test
    public void testSplitByPipe() {
        assertThat(examples.splitByPipe("1|2|3"))
                .containsExactly("1", "2", "3");
        assertThat(examples.splitByPipe("|2|"))
                .containsExactly("", "2");
        assertThat(examples.splitByPipe("xxx"))
                .containsExactly("xxx");

    }

    @Test
    public void testSplitByComaOrSemicolonOrPipe() {

        assertThat(examples.splitByComaOrSemicolonOrPipe("a|b|c"))
                .containsExactly("a", "b", "c");


        assertThat(examples.splitByComaOrSemicolonOrPipe("a,b;c"))
                .containsExactly("a", "b", "c");


        assertThat(examples.splitByComaOrSemicolonOrPipe("a||b;,c"))
                .containsExactly("a", "b", "c");
    }
}
