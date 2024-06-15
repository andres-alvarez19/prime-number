package prime_numbers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19})
    @DisplayName("Test prime numbers")
    void testIsPrime(int number) {
        assertTrue(PrimeNumber.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20})
    @DisplayName("Test composite numbers")
    void testIsNotPrime(int number) {
        assertFalse(PrimeNumber.isPrime(number));
    }
}