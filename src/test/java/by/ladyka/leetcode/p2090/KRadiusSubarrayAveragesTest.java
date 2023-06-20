package by.ladyka.leetcode.p2090;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KRadiusSubarrayAveragesTest {
    KRadiusSubarrayAverages kRadiusSubarrayAverages = new KRadiusSubarrayAverages();

    @Test
    void getAverages1() {
        Assertions.assertArrayEquals(
                new int[]{-1, -1, -1, 5, 4, 4, -1, -1, -1},
                kRadiusSubarrayAverages.getAverages(new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6}, 3)
        );
    }

    @Test
    void getAverages2() {
        Assertions.assertArrayEquals(
                new int[]{100000},
                kRadiusSubarrayAverages.getAverages(new int[]{100000}, 0)
        );
    }

    @Test
    void getAverages3() {
        Assertions.assertArrayEquals(
                new int[]{-1},
                kRadiusSubarrayAverages.getAverages(new int[]{8}, 100000)
        );
    }
}