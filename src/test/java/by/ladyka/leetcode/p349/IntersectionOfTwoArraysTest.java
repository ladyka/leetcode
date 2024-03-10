package by.ladyka.leetcode.p349;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class IntersectionOfTwoArraysTest {

    IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();

    @Test
    void intersection1() {
        int[] result = solution.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        Assertions.assertEquals(1, result.length);
        Assertions.assertEquals(2, result[0]);
    }

    @Test
    void intersection2() {
        int[] result = solution.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        Assertions.assertEquals(2, result.length);
        Arrays.sort(result);
        Assertions.assertEquals(4, result[0]);
        Assertions.assertEquals(9, result[1]);
    }
}