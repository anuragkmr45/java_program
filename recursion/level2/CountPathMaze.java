// Count number of ways to reach destination in a Maze(matrix)

package recursion.level2;

public class CountPathMaze {
    static int initialCountPAth(int row, int col) {
        int rowCount = 0;
        int colCount = 0;

        return countPath(row, col, rowCount, colCount);
    }
    
    static int countPath(int row, int col, int rowCount, int colCount) {

        if (rowCount == row - 1 || colCount == col - 1) {
            return 1;
        }

        int right = countPath(row, col, rowCount + 1, colCount);
        int down = countPath(row, col, rowCount, colCount + 1);

        return right + down;
    }
    
    public static void main(String[] args) {
        System.out.println(initialCountPAth(3, 3));
    }
}
