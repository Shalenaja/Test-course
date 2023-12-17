package lesson3;

import junit.framework.TestCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberTest extends TestCase {
    private Number number;
// task 1
    @Test
    @DisplayName("testEvenOddNumberPositive - positive number")
    void testEvenOddNumberPositive() {
        assertTrue(number.evenOddNumber(2));
    }

    @Test
    @DisplayName("testEvenOddNumberPositive - negative number")
    void testEvenOddNumberNegative() {
        assertFalse(number.evenOddNumber(3));
    }

// task 2
    @ParameterizedTest
    @DisplayName("testNumberInInterval - number in range")
    @ValueSource(ints = {25, 26, 100})
    void testNumberInInterval(int num) {
        assertTrue("Border does not match", number.numberInInterval(num));
    }

    @ParameterizedTest
    @DisplayName("testNumberInIntervalNot - number not in range")
    @ValueSource(ints = {24, 101})
    void testNumberInIntervalNot(int num) {
        assertFalse("Border does not match", number.numberInInterval(num));
    }
}