// N Queen Problem | Backtracking
// The N Queen is the problem of placing N chess queens on an N×N chessboard so that no two queens attack each other.
// https://leetcode.com/problems/n-queens/

package RecursionBacktracking.level3;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public static List<List<String>> solveNQue(int n) {
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoard, 0);

        return allBoard;
    }

    static void helper(char[][] board, List<List<String>> allBoard, int col) {
        if (board.length == 0) {
            saveBoard(board, allBoard);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoard, col + 1);

                board[row][col] = '.';
            }
        }
    }

    static void saveBoard(char[][] board, List<List<String>> allBoard) {
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            row = "";

            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += "Q";
                } else {
                    row += ".";
                }
            }
            newBoard.add(row);
        }

        allBoard.add(newBoard);
    }

    static boolean isSafe(int row, int col, char[][] board) {

        // vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // top left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // top right
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // bottom left
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower right
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solveNQue(4));
    }
}
