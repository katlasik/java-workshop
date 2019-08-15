package pl.sda.collections.exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HistorgramTest {

    @Test
    void showHistogram() {

        assertThat(Histogram.showHistogram("aaabbbc")).isEqualTo("a:3\nb:3\nc");

    }
}
