// Count number of ways to reach destination in a Maze(matrix)

package RecursionBacktracking.level2;

import java.util.ArrayList;
import java.util.List;

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

    static List<String> findPaths(int row, int col) {
        String path = "";

        return helper(row, col, path);
    }

    static List<String> helper(int row, int col, String ans) {

        if (row == 1 && col == 1) {
            List<String> ansList = new ArrayList<>();
            ansList.add(ans);
            return ansList;
        }

        List<String> list = new ArrayList<>();

        if (row > 1) {
            list.addAll(helper(row - 1, col, ans + " Right "));
        }
        if (col > 1) {
            list.addAll(helper(row, col - 1, ans + " Down "));
        }

        return list;
    }

    public static void main(String[] args) {
        // System.out.println(initialCountPAth(3, 3));
        System.out.println(findPaths(3, 3));
    }
}
