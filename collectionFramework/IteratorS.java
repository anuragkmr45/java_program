package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorS {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        // display using iterator
        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            String item = itr.next();
            System.out.println(item + " ");
        }

        // modify using iterator
        ListIterator<String> lsItr = list.listIterator();

        while (lsItr.hasNext()) {
            String item = lsItr.next();
            System.out.println(item + " ");
        }

    }
}