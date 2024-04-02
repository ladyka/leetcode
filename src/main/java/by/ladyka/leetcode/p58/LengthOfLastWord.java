package by.ladyka.leetcode.p58;

import java.util.Objects;

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * <p>
 * A word is a maximal substring consisting of non-space characters only.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int currLength = 0;
        for (int i = chars.length-1; i >= 0; i--) {
            char c = chars[i];
            if (Objects.equals(' ', c)) {
                if (0 == currLength) {
                    continue;
                } else {
                    return currLength;
                }
            } else {
                currLength++;
            }
        }
        return currLength;
    }
}
