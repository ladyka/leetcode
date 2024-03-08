package by.ladyka.leetcode.p3005;

public class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        int[] frequency = new int[101];
        int maxFrequency = 0;

        for (int num : nums) {
            frequency[num]++;
            if (maxFrequency < frequency[num]) {
                maxFrequency = frequency[num];
            }
        }
        int countFrequency = 0;
        for (int j : frequency) {
            if (maxFrequency == j) {
                countFrequency++;
            }
        }
        return countFrequency * maxFrequency;
    }
}
