// Tiling Problem
// Given a 'n * m' floor and several "1 * m" tiles we have to put them in floor and find the no of ways we can fill the floor 

package recursion.level2;

public class PlaceTiles {
    static int countTiles(int row, int col) {

        if (row == col) {
            return 2;
        }
        if (row < col) {
            return 1;
        }

        // verticle 
        int ver = countTiles(row - 1, col);
        // horizontal
        int hor = countTiles(row - col, col);

        return ver + hor;
    }

    public static void main(String[] args) {
        System.out.println(countTiles(4, 2));
    }
}
