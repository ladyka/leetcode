package by.ladyka.leetcode.p1249;

import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    /**
     * Given a string s of '(' , ')' and lowercase English characters.
     * <p>
     * Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.
     * <p>
     * Formally, a parentheses string is valid if and only if:
     * <p>
     *     It is the empty string, contains only lowercase characters, or
     *     It can be written as AB (A concatenated with B), where A and B are valid strings, or
     *     It can be written as (A), where A is a valid string.
     *
     *
     * @param s
     * @return
     */
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        boolean[] remove = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    remove[i] = true;
                } else {
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            remove[stack.pop()] = true;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!remove[i]) {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}