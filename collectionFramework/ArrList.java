package collectionFramework;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("size of list => " + list.size());

        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "d");

        System.out.println("size of list after adding => " + list.size());

        System.out.println("list => " + list);
    }
}
