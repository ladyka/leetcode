package by.ladyka.leetcode.p1027;

import java.util.HashMap;

/**
 * 1027. Longest Arithmetic Subsequence
 * Given an array nums of integers, return the length of the longest arithmetic subsequence in nums.
 * Note that:
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing
 * the order of the remaining elements.
 * A sequence seq is arithmetic if seq[i + 1] - seq[i] are all the same value (for 0 <= i < seq.length - 1).
 */
public class LongestArithmeticSubsequence {
    public int longestArithSeqLength(int[] nums) {
        int maxLength = 0;
        HashMap<Integer, Integer>[] dp = new HashMap[nums.length];
        for (int right = 0; right < nums.length; ++right) {
            dp[right] = new HashMap<>();
            for (int left = 0; left < right; ++left) {
                int diff = nums[left] - nums[right];
                dp[right].put(diff, dp[left].getOrDefault(diff, 1) + 1);
                maxLength = Math.max(maxLength, dp[right].get(diff));
            }
        }
        return maxLength;
    }
}
