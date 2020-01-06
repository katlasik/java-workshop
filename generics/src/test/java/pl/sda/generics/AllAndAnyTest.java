package pl.sda.generics;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static pl.sda.generics.AllAndAny.*;

class AllAndAnyTest {

    @Test
    void allTest() {
        assertThat(all(Set.of("raz", "dwa", "trzy"), s -> s.length() >= 2)).isEqualTo(true);
        assertThat(all(Set.of("raz", "d", "trzy"), s -> s.length() >= 2)).isEqualTo(false);
        assertThat(all(List.of(5, 3, 1, 27), i -> i % 2 != 0)).isEqualTo(true);
        assertThat(all(List.of(1, 8, 5), i -> i % 2 != 0)).isEqualTo(false);
    }

    @Test
    void anyTest() {
        assertThat(any(List.of(5, 4, 1, 27), i -> i % 2 == 0)).isEqualTo(true);
        assertThat(any(List.of(5, 1, 27), i -> i % 2 == 0)).isEqualTo(false);
        assertThat(any(Set.of("raz", "dwa", "trzy"), s -> s.equals("dwa"))).isEqualTo(true);
        assertThat(any(Set.of("raz", "trzy"), s -> s.equals("dwa"))).isEqualTo(false);
    }
}
