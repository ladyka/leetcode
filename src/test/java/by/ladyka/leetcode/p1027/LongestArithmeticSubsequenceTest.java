package by.ladyka.leetcode.p1027;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestArithmeticSubsequenceTest {
    LongestArithmeticSubsequence task = new LongestArithmeticSubsequence();

    @Test
    void longestArithSeqLength1() {
        Assertions.assertEquals(4, task.longestArithSeqLength(new int[]{3, 6, 9, 12}));
    }

    @Test
    void longestArithSeqLength2() {
        Assertions.assertEquals(3, task.longestArithSeqLength(new int[]{9, 4, 7, 2, 10}));
    }

    @Test
    void longestArithSeqLength3() {
        Assertions.assertEquals(4, task.longestArithSeqLength(new int[]{20, 1, 15, 3, 10, 5, 8}));
    }
}