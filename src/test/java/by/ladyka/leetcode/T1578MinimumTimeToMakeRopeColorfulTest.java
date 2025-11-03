package by.ladyka.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class T1578MinimumTimeToMakeRopeColorfulTest {
    T1578MinimumTimeToMakeRopeColorful solution = new T1578MinimumTimeToMakeRopeColorful();

    @Test
    void minCost() {
        Assertions.assertEquals(3, solution.minCost("abaac", new int[]{1, 2, 3, 4, 5}));
        Assertions.assertEquals(0, solution.minCost("abc", new int[]{1, 2, 3}));
        Assertions.assertEquals(2, solution.minCost("aabaa", new int[]{1, 2, 3, 4, 1}));

    }
}