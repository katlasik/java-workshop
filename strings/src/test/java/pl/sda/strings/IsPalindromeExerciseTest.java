package pl.sda.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IsPalindromeExerciseTest {

    @Test
    void isPalindrome() {
        assertThat(IsPalindromeExercise.isPalindrome("kajak")).isTrue();
        assertThat(IsPalindromeExercise.isPalindrome("kaja")).isFalse();
    }

    @Test
    void isPalindromeIngoringSpaceAndCase() {
        assertThat(IsPalindromeExercise.isPalindromeIngoringSpaceAndCase("Kobyła ma mały bok")).isTrue();
        assertThat(IsPalindromeExercise.isPalindromeIngoringSpaceAndCase("Kobyła ma duży bok")).isFalse();
    }

}
