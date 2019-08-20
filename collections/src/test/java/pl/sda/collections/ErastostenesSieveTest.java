package pl.sda.collections;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ErastostenesSieveTest {

    @Test
    void erastostenesSieve() {
        assertThat(ErastostenesSieve.erastostenesSieve(100))
                .contains(
                        2,
                        3,
                        5,
                        7,
                        11,
                        13,
                        17,
                        19,
                        23,
                        29,
                        31,
                        37,
                        41,
                        43,
                        47,
                        53,
                        59,
                        61,
                        67,
                        71,
                        73,
                        79,
                        83,
                        89,
                        97
                );
    }
}