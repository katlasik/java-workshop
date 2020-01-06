package pl.sda.regex;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class FindGroupsTest {

    private FindGroups examples = new FindGroups();

    @Test
    void testFindKeyValues() {
        assertThat(examples.findKeyValues("Mleko kosztuje 5 zł"))
                .contains("5");

        assertThat(examples.findKeyValues("Telewizor kosztuje 1000 zł. Mleko kosztuje 2 zł."))
                .contains("2");


        assertThat(examples.findKeyValues("Chleb kosztuje 2 zł"))
                .isEmpty();

    }

}
