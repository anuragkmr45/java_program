package collectionFramework;

import java.util.ArrayList;

public class ArrListToArr {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2, 6);

        int len = list.size();

        Integer[] arr = (Integer[]) list.toArray();

    }
}