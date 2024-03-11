package by.ladyka.leetcode.p791;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

class CustomSortStringTest {
    CustomSortString solution = new CustomSortString();

    @Test
    void customSortString1() {
        String actual = solution.customSortString("cba", "abcd");
        System.out.println(actual);
        Set<String> expected = Set.of("dcba", "cdba", "cbda", "cbad");
        Assertions.assertTrue(expected.contains(actual));
    }

    @Test
    void customSortString2() {
        String actual = solution.customSortString("bcafg", "abcd");
        Set<String> expected = Set.of("bacd", "bcda", "bdca", "dbca");
        System.out.println(actual);
        Assertions.assertTrue(expected.contains(actual));
    }
}