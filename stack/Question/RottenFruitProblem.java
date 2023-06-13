package stack.Question;

import java.util.*;

class Point {
    int x;
    int y;
    int time;

    public Point(int x, int y, int time) {
        this.x = x;
        this.y = y;
        this.time = time;
    }
}

public class RottenFruitProblem {
    public static int getMinTime(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Define the directions to explore adjacent cells
        int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        // Create a queue to store the rotten fruits
        Queue<Point> queue = new LinkedList<>();

        // Initialize the queue with the initial rotten fruits
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    queue.add(new Point(i, j, 0));
                }
            }
        }

        int minTime = 0;

        // Perform BFS to rot adjacent fresh fruits
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int x = point.x;
            int y = point.y;
            int time = point.time;

            minTime = Math.max(minTime, time);

            for (int[] direction : directions) {
                int newX = x + direction[0];
                int newY = y + direction[1];

                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && grid[newX][newY] == 0) {
                    grid[newX][newY] = 1;
                    queue.add(new Point(newX, newY, time + 1));
                }
            }
        }

        // Check if there are any fresh fruits left
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    return -1; // There are fresh fruits left
                }
            }
        }

        return minTime;
    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 0, 1, 1, 0 }, { 0, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 1 } };

        int minTime = getMinTime(grid);
        if (minTime != -1) {
            System.out.println("Minimum time to rot all fruits: " + minTime);
        } else {
            System.out.println("Unable to rot all fruits");
        }
    }
}
