package by.ladyka.leetcode.p1544;

public class MakeTheStringGreat {
    public String makeGood(String s) {
        boolean hasCut = true;
        while (hasCut) {
            hasCut = false;
            if (s.length() <= 1) {
                return s;
            }
            char[] chars = s.toCharArray();
            char[] output = new char[s.length()];
            int j = 0;
            for (int i = 0; i < chars.length; i++) {
                if (i == chars.length-1) {
                    output[j] = chars[i];
                    j++;
                    break;
                }
                if (32 == Math.abs(chars[i] - chars[i+1])) {
                    hasCut = true;
                    i++;
                } else {
                    output[j] = chars[i];
                    j++;
                }
            }
            s = String.valueOf(output, 0, j);
        }
        return s;
    }
}
