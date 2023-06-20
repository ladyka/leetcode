package by.ladyka.leetcode.p2090;

import java.util.Arrays;

/**
 * 2090. K Radius Subarray Averages
 * You are given a 0-indexed array nums of n integers, and an integer k.
 * The k-radius average for a subarray of nums centered at some index i with the radius k is the average of all elements in nums between the indices i - k and i + k (inclusive). If there are less than k elements before or after the index i, then the k-radius average is -1.
 * Build and return an array avgs of length n where avgs[i] is the k-radius average for the subarray centered at index i.
 * The average of x elements is the sum of the x elements divided by x, using integer division. The integer division truncates toward zero, which means losing its fractional part.
 * For example, the average of four elements 2, 3, 1, and 5 is (2 + 3 + 1 + 5) / 4 = 11 / 4 = 2.75, which truncates to 2.
 */
public class KRadiusSubarrayAverages {
    public int[] getAverages(int[] nums, int k) {
        // When a single element is considered then its average will be the number itself only.
        if (k == 0) {
            return nums;
        }
        int n = nums.length;
        int[] averages = new int[n];
        Arrays.fill(averages, -1);

        // Any index will not have 'k' elements in it's left and right.
        if (2 * k + 1 > n) {
            return averages;
        }
        // Generate 'prefix' array for 'nums'.
        // 'prefix[i + 1]' will be sum of all elements of 'nums' from index '0' to 'i'.
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; ++i) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        // We iterate only on those indices which have at least 'k' elements in their left and right.
        // i.e. indices from 'k' to 'n - k'
        for (int i = k; i < (n - k); ++i) {
            int leftBound = i - k, rightBound = i + k;
            long subArraySum = prefix[rightBound + 1] - prefix[leftBound];
            int average = (int) (subArraySum / (2 * k + 1));
            averages[i] = average;
        }
        return averages;
    }
}
