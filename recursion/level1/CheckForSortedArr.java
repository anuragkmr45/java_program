package recursion.level2;

public class CheckForSortedArr {
    static boolean isSorted(int[] array) {
        int index = 0;

        return helperCheckForSortedArr(array, index);
    }

    static boolean helperCheckForSortedArr(int[] array, int index) {
        if (array.length == 1) {
            return true;
        }

        if (!helperCheckForSortedArr(array, index + 1)) {
            return false;
        }
        return array[index] < array[index + 1];
    }
}
