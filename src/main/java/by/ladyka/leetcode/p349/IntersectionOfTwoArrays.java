package by.ladyka.leetcode.p349;

public class IntersectionOfTwoArrays {

    /**
     * Given two integer arrays nums1 and nums2, return an array of their intersection.
     * Each element in the result must be unique, and you may return the result in any order.
     * intersection - скрыжаванне
     * @param nums1 integer array 1
     * @param nums2 integer array 2
     * @return an array of their intersection
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] numbers = new int[1001];
        for (int num : nums1) {
            numbers[num] = 1;
        }
        int finalCount = 0;
        for (int num : nums2) {
            if (numbers[num] == 1) {
                numbers[num] = 2;
                finalCount++;
            }
        }
        int[] intersection = new int[finalCount];
        int intersectionIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 2) {
                intersection[intersectionIndex] = i;
                intersectionIndex++;
            }
        }
        return intersection;
    }
}
