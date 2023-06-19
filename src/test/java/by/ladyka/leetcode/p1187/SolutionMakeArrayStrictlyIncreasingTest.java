package by.ladyka.leetcode.p1187;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionMakeArrayStrictlyIncreasingTest {

    SolutionMakeArrayStrictlyIncreasing s = new SolutionMakeArrayStrictlyIncreasing();

    @Test
    void makeArrayIncreasing() {
        Assertions.assertEquals(1, s.makeArrayIncreasing(new int[]{1, 5, 3, 6, 7}, new int[]{1, 3, 2, 4}));
        Assertions.assertEquals(2, s.makeArrayIncreasing(new int[]{1, 5, 3, 6, 7}, new int[]{4, 3, 1}));
        Assertions.assertEquals(-1, s.makeArrayIncreasing(new int[]{1, 5, 3, 6, 7}, new int[]{1, 6, 3, 3}));
    }
}