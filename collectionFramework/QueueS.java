package collectionFramework;

import java.util.*;

public class QueueS {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(3);
        queue.add(4);

        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }

        queue.remove();

        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.poll();
        }
    }
}
