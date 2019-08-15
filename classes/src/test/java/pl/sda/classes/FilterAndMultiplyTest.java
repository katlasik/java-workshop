package pl.sda.classes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FilterAndMultiplyTest {

    @Test
    void process() {

        FilterAndMultiply fe = new FilterAndMultiply(3,5, 5);
        List<Integer> integers = Arrays.asList(1,2,3,5,10);
        Assertions.assertThat(fe.filterAndMultiply(integers)).isEqualTo(Arrays.asList(15, 25));
    }

}
