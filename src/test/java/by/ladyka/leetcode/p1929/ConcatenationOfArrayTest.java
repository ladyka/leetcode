package by.ladyka.leetcode.p1929;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationOfArrayTest {
    ConcatenationOfArray solution = new ConcatenationOfArray();

    @Test
    void getConcatenation1() {
        int[] actual = solution.getConcatenation(new int[]{1, 2, 1});
        Assertions.assertArrayEquals(new int[]{1, 2, 1, 1, 2, 1}, actual);
    }
    @Test
    void getConcatenation2() {
        int[] actual = solution.getConcatenation(new int[]{1,3,2,1});
        Assertions.assertArrayEquals(new int[]{1,3,2,1,1,3,2,1}, actual);
    }
}