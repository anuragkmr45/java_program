package queue.basic;

public class QueueFromLL {
    Node head;
    public class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // enqueue element in queue
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = null;
        head = newNode;
    }
    // dequeue element in queue
    public void dequeue(int data) {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        head = head.next;
    }
    // display queue
    public void display() {
        if (head == null) {
            System.out.println("empty list");
        }
        Node currNode = head;
        while (currNode.next != null) {
            System.out.print(currNode + " --> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    // size of queue
    public void size() {
        Node currNode = head;
        int count = 0;
        while (currNode.next != null) {
            count = count + 1;
        }
        System.out.println("Size of linkedlist => " + count);
    }
}