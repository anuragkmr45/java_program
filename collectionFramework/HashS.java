package collectionFramework;

import java.util.HashSet;

public class HashS {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        System.out.println(set);
    }
}