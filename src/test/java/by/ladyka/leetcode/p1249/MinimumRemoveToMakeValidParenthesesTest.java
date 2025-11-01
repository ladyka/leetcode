package by.ladyka.leetcode.p1249;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

class MinimumRemoveToMakeValidParenthesesTest {
    MinimumRemoveToMakeValidParentheses solution = new MinimumRemoveToMakeValidParentheses();

    @Test
    void minRemoveToMakeValid() {
      String actual = solution.minRemoveToMakeValid("lee(t(c)o)de)");
      System.out.println(actual);
      Set<String> expected = Set.of("lee(t(co)de)" , "lee(t(c)ode)", "lee(t(c)o)de");
      Assertions.assertTrue(expected.contains(actual));
    }
    @Test
    void minRemoveToMakeValid2() {
      String actual = solution.minRemoveToMakeValid("a)b(c)d");
      System.out.println(actual);
      Set<String> expected = Set.of("ab(c)d");
      Assertions.assertTrue(expected.contains(actual));
    }
    @Test
    void minRemoveToMakeValid3() {
      String actual = solution.minRemoveToMakeValid("))((");
      System.out.println(actual);
      Set<String> expected = Set.of("");
      Assertions.assertTrue(expected.contains(actual));
    }
}