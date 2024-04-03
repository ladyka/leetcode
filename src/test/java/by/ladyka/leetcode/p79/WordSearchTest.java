package by.ladyka.leetcode.p79;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {
    WordSearch solution = new WordSearch();

    @Test
    void exist1() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        boolean actual = solution.exist(board, word);
        Assertions.assertTrue(actual);
    }

    @Test
    void exist2() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "SEE";
        boolean actual = solution.exist(board, word);
        Assertions.assertTrue(actual);
    }

    @Test
    void exist3() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCB";
        boolean actual = solution.exist(board, word);
        Assertions.assertFalse(actual);
    }
    @Test
    void exist4() {
        char[][] board = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        String word = "AAB";
        boolean actual = solution.exist(board, word);
        Assertions.assertTrue(actual);
    }
    @Test
    void exist5() {
        char[][] board = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        String word = "AAA";
        boolean actual = solution.exist(board, word);
        Assertions.assertTrue(actual);
    }
    @Test
    void exist6() {
        char[][] board = {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        String word = "ABCESEEEFS";
        boolean actual = solution.exist(board, word);
        Assertions.assertTrue(actual);
    }
}