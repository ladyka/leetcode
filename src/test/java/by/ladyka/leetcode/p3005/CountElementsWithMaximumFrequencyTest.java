package by.ladyka.leetcode.p3005;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountElementsWithMaximumFrequencyTest {
    CountElementsWithMaximumFrequency solution = new CountElementsWithMaximumFrequency();

    @Test
    void maxFrequencyElementsTest1() {
        int result = solution.maxFrequencyElements(new int[]{1, 2, 2, 3, 1, 4});
        Assertions.assertEquals(4, result);
    }

    @Test
    void maxFrequencyElementsTest2() {
        int result = solution.maxFrequencyElements(new int[]{1, 2, 3, 4, 5});
        Assertions.assertEquals(5, result);
    }

    @Test
    void maxFrequencyElementsTest3() {
        int result = solution.maxFrequencyElements(new int[]{81, 81, 81, 81, 81, 81, 81, 17, 28, 81, 81, 56, 81, 54, 81, 81, 81, 81, 81, 60, 81, 28, 81, 81, 81, 81, 81, 54, 81, 81, 81, 81, 100, 28});
        Assertions.assertEquals(25, result);
    }

}