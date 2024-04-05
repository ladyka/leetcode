package by.ladyka.leetcode.p1544;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeTheStringGreatTest {
    MakeTheStringGreat solution = new MakeTheStringGreat();

    @Test
    void makeGood() {
      String actual = solution.makeGood("leEeetcode");
      Assertions.assertEquals("leetcode", actual);
    }
    @Test
    void makeGood1() {
      String actual = solution.makeGood("leEeetcodeEe");
      Assertions.assertEquals("leetcode", actual);
    }
    @Test
    void makeGood2() {
      String actual = solution.makeGood("abBAcC");
      Assertions.assertEquals("", actual);
    }
    @Test
    void makeGood3() {
      String actual = solution.makeGood("s");
      Assertions.assertEquals("s", actual);
    }
}