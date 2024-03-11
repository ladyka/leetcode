package by.ladyka.leetcode.p791;

public class CustomSortString {

    /**
     * You are given two strings order and s. All the characters of order are unique and were sorted in some custom order previously.
     * <p>
     * Permute the characters of s so that they match the order that order was sorted.
     * More specifically, if a character x occurs before a character y in order, then x should occur before y in the permuted string.
     * <p>
     * Return any permutation of s that satisfies this property.
     * <p>
     * Permute      - Пераставіць
     * specifically - у прыватнасці
     * occurs       - адбываецца
     * permutation  - перастаноўка
     * satisfies    - задавальняе
     * @param order - All the characters of order are unique and were sorted in some custom order previously
     * @param s - input string
     * @return any permutation of s that satisfies this property
     */
    public String customSortString(String order, String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                if (order.indexOf(chars[i]) >= order.indexOf(chars[j])) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        return String.copyValueOf(chars);
    }
}
