package by.ladyka.leetcode.p205;

public class IsomorphicStrings {

    /**
     * Given two strings s and t, determine if they are isomorphic.
     * <p>
     * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
     * <p>
     * All occurrences of a character must be replaced with another character while preserving the order of characters.
     * No two characters may map to the same character, but a character may map to itself.
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        char[] s_chars = s.toCharArray();
        char[] t_chars = t.toCharArray();
        int[] indexS = new int[127];
        int[] indexT = new int[127];

        int len = s_chars.length;
        for(int i = 0; i < len; i++) {
            if(indexS[s_chars[i]] != indexT[t_chars[i]]) {
                return false;
            }
            indexS[s_chars[i]] = i + 1;
            indexT[t_chars[i]] = i + 1;
        }
        return true;
    }
}
