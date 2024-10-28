package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UniformNumbersTest {

    @Test
    void testSingleUniformDigitRange() {
        assertEquals(1, UniformNumbers.countUniformIntegers(1, 1)); // Only one number, which is uniform
        assertEquals(9, UniformNumbers.countUniformIntegers(1, 9)); // All single-digit numbers are uniform
    }

    @Test
    void testSmallRange() {
        assertEquals(1, UniformNumbers.countUniformIntegers(10, 11)); // Only uniform number is 11
        assertEquals(2, UniformNumbers.countUniformIntegers(22, 33)); // Uniform numbers are 22, 33
    }

    @Test
    void testRangeWithNoUniformNumbers() {
        assertEquals(0, UniformNumbers.countUniformIntegers(10, 21)); // No uniform numbers between 10 and 21
        assertEquals(0, UniformNumbers.countUniformIntegers(123, 128)); // No uniform numbers between 123 and 128
    }

    @Test
    void testRangeWithAllUniformNumbers() {
        assertEquals(9, UniformNumbers.countUniformIntegers(1, 9)); 
        assertEquals(18, UniformNumbers.countUniformIntegers(1, 99)); 
    }

    @Test
    void testMultiDigitRangeWithUniformNumbers() {
        assertEquals(1, UniformNumbers.countUniformIntegers(100, 111)); 
        assertEquals(2, UniformNumbers.countUniformIntegers(111, 222)); 
    }

    @Test
    void testExactUniformBoundary() {
        assertEquals(1, UniformNumbers.countUniformIntegers(111, 111));
        assertEquals(2, UniformNumbers.countUniformIntegers(111, 222));
    }

    @Test
    void testLargeRange() {
        assertEquals(27, UniformNumbers.countUniformIntegers(1, 999)); 
        assertEquals(36, UniformNumbers.countUniformIntegers(1, 9999));
    }

    @Test
    void testInvalidRange() {
        assertEquals(0, UniformNumbers.countUniformIntegers(500, 100));
        assertEquals(0, UniformNumbers.countUniformIntegers(-100, -1));
    }
}
