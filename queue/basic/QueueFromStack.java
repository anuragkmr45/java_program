// you are given two stacks and using that make a queue

package queue.basic;

import java.util.Stack;

public class QueueFromStack {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public void enqueue(int element) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(element);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int dequeue() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return stack1.pop();
    }

    public int poll() {
        if (stack1.isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }
        return stack1.peek();
    }

    public static void main(String[] args) {
        QueueFromStack queue = new QueueFromStack();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
            queue.dequeue();
        }
    }
}
