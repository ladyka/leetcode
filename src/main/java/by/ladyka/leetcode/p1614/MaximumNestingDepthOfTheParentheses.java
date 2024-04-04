package by.ladyka.leetcode.p1614;

public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int currentDep = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': {
                    currentDep++;
                    if (currentDep > maxDepth) {
                        maxDepth = currentDep;
                    }
                } break;
                case ')': {
                    currentDep--;
                } break;
            }
        }
        return maxDepth;
    }
}
