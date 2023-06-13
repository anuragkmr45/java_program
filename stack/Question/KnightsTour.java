package stack.Question;

public class KnightsTour {
    private static final int BOARD_SIZE = 8;

    private static final int[] MOVE_X = { 2, 1, -1, -2, -2, -1, 1, 2 };
    private static final int[] MOVE_Y = { 1, 2, 2, 1, -1, -2, -2, -1 };

    private static int[][] board;

    public static void main(String[] args) {
        solveKnightsTour();
    }

    public static void solveKnightsTour() {
        board = new int[BOARD_SIZE][BOARD_SIZE];

        // Initialize the board with -1 indicating unvisited squares
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = -1;
            }
        }

        // Start the tour from the top-left corner (0, 0)
        int startX = 0;
        int startY = 0;
        int moveNumber = 0;

        // Perform the tour
        if (solveKnightsTourUtil(startX, startY, moveNumber)) {
            printBoard();
        } else {
            System.out.println("No solution exists.");
        }
    }

    private static boolean solveKnightsTourUtil(int x, int y, int moveNumber) {
        if (moveNumber == BOARD_SIZE * BOARD_SIZE) {
            // All squares have been visited
            return true;
        }

        if (isValidMove(x, y)) {
            board[x][y] = moveNumber;

            for (int i = 0; i < 8; i++) {
                int newX = x + MOVE_X[i];
                int newY = y + MOVE_Y[i];

                if (solveKnightsTourUtil(newX, newY, moveNumber + 1)) {
                    return true;
                }
            }

            // Backtrack
            board[x][y] = -1;
        }

        return false;
    }

    private static boolean isValidMove(int x, int y) {
        return (x >= 0 && x < BOARD_SIZE && y >= 0 && y < BOARD_SIZE && board[x][y] == -1);
    }

    private static void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.printf("%2d ", board[i][j]);
            }
            System.out.println();
        }
    }
}
