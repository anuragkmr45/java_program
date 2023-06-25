// in the given list of integer, both +ve and -ve. Write a program to find the three elements such that their sum is closest to zero

package array.Questions;

import java.util.*;

public class ClosestToZero {
    public static List<Integer> findClosestToZero(List<Integer> list) {
        List<Integer> ClosestTrio = new ArrayList<>();

        int closestSum = Integer.MAX_VALUE;

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            int start = 0;
            int end = list.size() - 1;

            while (start < end) {
                int sum = list.get(start) + list.get(i) + list.get(end);

                if (Math.abs(sum) < Math.abs(closestSum)) {
                    closestSum = sum;
                    if (!ClosestTrio.isEmpty()) {
                        ClosestTrio.clear();
                    }

                    ClosestTrio.add(list.get(start));
                    ClosestTrio.add(list.get(i));
                    ClosestTrio.add(list.get(end));
                }

                if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return ClosestTrio;
    }
}
