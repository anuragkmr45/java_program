package collectionFramework;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        System.out.println("linkedList => " + list);

        list.remove("b");
        list.removeLast();
    }
}