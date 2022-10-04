package array.searching;

public class BinarySearch {
    
    static int BSearchIndex(int[] array, int target) {
        int start = 0;
        int end  = array.length - 1;

        while(start <= end) {
            int mid  = (start + end ) / 2;

            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    
    static boolean BSearchPresent(int[] array, int target) {
        int start = 0;
        int end  = array.length - 1;

        while(start <= end) {
            int mid  = (start + end ) / 2;

            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            }else {
                return true;
            }
        }
        return false;
    }


}
