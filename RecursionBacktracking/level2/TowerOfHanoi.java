// Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:

// 1) Only one disk can be moved at a time.
// 2) No disk may be placed on top of a smaller disk.

// Time Complexity: O(2n)
// Space Space: O(n)

package RecursionBacktracking.level2;

public class TowerOfHanoi {
    static void toh(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println(n + "plate transfer form " + src + " to " + dest);
            return;
        }

        toh(n - 1, src, dest, helper);
        System.out.println(n - 1 + " plates transfer form " + src + " to " + helper);

        toh(n - 1, dest, src, dest);
    }
}
