package by.ladyka.leetcode.p58;

import java.util.Objects;

public class LengthOfHugeWord {
    public int lengthOfHugeWord(String s) {
        char[] chars = s.toCharArray();
        int maxLength = 0;
        int currLength = 0;
        for (char c : chars) {
            if (Objects.equals(' ', c)) {
                if (maxLength < currLength) {
                    maxLength = currLength;
                }
                currLength = 0;
            } else {
                currLength++;
            }
        }
        if (maxLength < currLength) {
            maxLength = currLength;
        }
        return maxLength;
    }
}
