package by.ladyka.leetcode.p57;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {
    InsertInterval solution = new InsertInterval();

    @Test
    void insert() {
        int[][] actual = solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5});
        Assertions.assertArrayEquals(new int[][]{{1, 5}, {6, 9}}, actual);
    }

    @Test
    void insert2() {
        int[][] actual = solution.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8});
        assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}}, actual);
    }
}