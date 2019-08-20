package pl.sda.numberconverter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberConverterFactoryTest {

    @Test
    void create() {
        NumberConverter hexConverter = NumberConverterFactory.create("hex");
        NumberConverter morseConverter = NumberConverterFactory.create("morse");
        NumberConverter simple = NumberConverterFactory.create("???");

        assertThat(hexConverter.convert(100)).isEqualTo("64");
        assertThat(morseConverter.convert(100)).isEqualTo("• — — — — — — — — — — — — — — ");
        assertThat(simple.convert(100)).isEqualTo("100");
    }
}
