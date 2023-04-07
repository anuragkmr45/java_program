package array.searching;

public class LinearSearch {

    static int LSearchIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (target == array[i]) {
                return i;
            }
        }
        return -1;
    }

    static boolean LSearchPresent(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (target == array[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(LSearchPresent(arr, 6));
    }
}