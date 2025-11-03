package by.ladyka.leetcode;

import java.util.Arrays;

/**
 * Alice has n balloons arranged on a rope.
 * You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.
 * Alice wants the rope to be colorful.
 * She does not want two consecutive balloons to be of the same color, so she asks Bob for help.
 * Bob can remove some balloons from the rope to make it colorful.
 * You are given a 0-indexed integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove the ith balloon from the rope.
 * <p>
 * Return the minimum time Bob needs to make the rope colorful.
 */
public class T1578MinimumTimeToMakeRopeColorful {
    public int minCost(String colors, int[] neededTime) {
        int result = 0;
        int count = 1;
        int begin = 0;
        char[] charArray = colors.toCharArray();
        char previous = charArray[0];
        for (int ci = 1; ci < charArray.length; ci++) {
            char c = charArray[ci];
            if (c == previous) {
                count++;
            } else {
                if (count > 1) {
                    result += getMinSum(neededTime, begin, ci - 1, count - 1);
                }
                previous = c;
                count = 1;
                begin = ci;
            }
        }
        if (count > 1) {
            result += getMinSum(neededTime, begin, charArray.length - 1, count - 1);
        }
        return result;
    }

    private int getMinSum(int[] neededTime, int start, int end, int k) {
        int[] subArray = Arrays.copyOfRange(neededTime, start, end + 1);
        Arrays.sort(subArray);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += subArray[i];
        }
        return sum;
    }
}
