package telran.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static telran.util.RecursionMethods.*;

public class RecursionMethodsTest {
    @Test
    void ftest() {
        f(400);
    }
    @Test
    void factorialTest() {
        assertEquals(6, factorial(3));
        assertEquals(24, factorial(4));
        assertEquals(6, factorial(-3));
    }

    @Test
    void powTest() {
        assertEquals(4, pow(2, 2));
        assertEquals(4, pow(-2, 2));
        assertEquals(-8, pow(-2, 3));
        assertEquals(-32, pow(-2, 5));
        assertEquals(9, pow(3, 2));
        assertEquals(36, pow(6, 2));
        assertEquals(64, pow(4, 3));
        assertEquals(1000, pow(10, 3));
        assertThrowsExactly(IllegalArgumentException.class, () -> pow(10, -3));
    }

    @Test
    void sumTest() {
        int[] ar = {1, 2, 3, 4, 5};
        assertEquals(15, sum(ar));
    }

    @Test 
    void squareTest() {
        assertEquals(4, square(2));
        assertEquals(16, square(4));
        assertEquals(36, square(6));
        assertEquals(9, square(-3));

    }

    @Test 
    void isSubstringTest() {
        assertTrue(isSubstring("Hello World", "World"));
        assertFalse(isSubstring("Hello World", "Worldxx"));
    }
}