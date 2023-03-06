// print all the subset of the given int array 
// eg - arr = {1,2,3} subsets are {{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}} 

package array.GeneralOperationAlgo;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    static List<List<Integer>> allSubset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int nums : arr) {
            int n = outer.size();

            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(nums);
                outer.add(inner);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        
    }
}
