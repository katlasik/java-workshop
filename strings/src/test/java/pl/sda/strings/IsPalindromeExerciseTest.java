package pl.sda.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IsPalindromeExerciseTest {

    @Test
    void test() {
        assertThat(IsPalindromeExercise.isPalindrome("kajak")).isTrue();
        assertThat(IsPalindromeExercise.isPalindrome("kaja")).isFalse();
    }

}