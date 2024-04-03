package by.ladyka.leetcode.p79;

import java.util.ArrayList;
import java.util.Objects;

public class WordSearch {
    /**
     * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
     * <p>
     * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
     *
     * @param board
     * @param word
     * @return
     */
    public boolean exist(char[][] board, String word) {
        try {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    snakeWordSearch(board, i, board.length, j, board[i].length, 0, word, new ArrayList<>());
                }
            }
        } catch (FoundSolution ex) {
            return true;
        }
        return false;
    }

    private void snakeWordSearch(char[][] board, int i, int iLength, int j, int jLength, int w, String word, ArrayList<Pair> pairs) {
        if (pairs.contains(new Pair(i, j))) {
            return;
        }
        char c = word.charAt(w);
        if (i < 0 || j < 0 || i >= iLength || j >= jLength) {
            return;
        }
        if (Objects.equals(c, board[i][j])) {
            System.out.printf("%d , %d, %s, %d%n", i, j, c, w);
            int nextWLetter = w + 1;
            Pair currentStep = new Pair(i, j);
            pairs.add(currentStep);
            if (word.length() == nextWLetter) {
                throw new FoundSolution();
            }
            snakeWordSearch(board, i + 1, iLength, j, jLength, nextWLetter, word, pairs);
            snakeWordSearch(board, i - 1, iLength, j, jLength, nextWLetter, word, pairs);
            snakeWordSearch(board, i, iLength, j + 1, jLength, nextWLetter, word, pairs);
            snakeWordSearch(board, i, iLength, j - 1, jLength, nextWLetter, word, pairs);
            pairs.remove(currentStep);
        }

    }

    private static class FoundSolution extends RuntimeException {
    }

    private static class Pair {
        public int i;
        public int j;

        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return i == pair.i && j == pair.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }
}
