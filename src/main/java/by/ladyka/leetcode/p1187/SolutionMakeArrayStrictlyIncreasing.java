package by.ladyka.leetcode.p1187;
/*
 * 1187. Make Array Strictly Increasing
 */

import java.util.Arrays;
import java.util.TreeSet;

public class SolutionMakeArrayStrictlyIncreasing {
    private static final int INF = 2000000000;

    public int makeArrayIncreasing(int[] aArray, int[] bArray) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.stream(bArray).boxed().toList());
        int[] dp = new int[bArray.length + 1];
        dp[0] = -1;
        for (int aV : aArray) {
            for (int j = bArray.length; j >= 0; j--) {
                int a = aV > dp[j] ? aV : INF; // option aArray - don't swap
                int higher = j == 0 ? INF : dp[j - 1];
                Integer b = set.higher(higher); // option bArray - swap
                dp[j] = Math.min(a, b == null ? INF : b); // take the min of aArray and bArray
            }
        }
        for (int i = 0; i <= bArray.length; i++)
            if (dp[i] != INF) {
                return i;
            }
        return -1;
    }
}
