package pl.sda.collections;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HistogramTest {

    @Test
    void showHistogram() {

        assertThat(HistogramExercise.showHistogram("aaabbbc")).isEqualTo("a:3 42%\nb:3 42%\nc:1 14%\n");

    }
}
