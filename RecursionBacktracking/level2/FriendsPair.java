package RecursionBacktracking.level2;

public class FriendsPair {
    static int noOfWays(int n) {

        if (n <= 0) {
            return 0;
        }
        if (n <= 1) {
            return 1;
        }

        int single = noOfWays(n - 1);
        int pair = (n - 1) * noOfWays(n - 2);

        return single + pair;
    }

    public static void main(String[] args) {
        int num = -1;
        System.out.println(noOfWays(num));
    }
}
