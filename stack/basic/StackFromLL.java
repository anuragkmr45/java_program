package stack.basic;

import linkedList.Basics.SingleLL;

public class StackFromLL {
    Node head;
    public class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // push element in stack
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = null;
        head = newNode;
    }
    // pop element in stack
    public void pop(int data) {
        Node lastNode = head.next;
        Node seclastNode = head;
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            seclastNode = seclastNode.next;
        }
        seclastNode.next = null;
    }
    // display stack
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
    // size of stack
    public void size() {
        Node currNode = head;
        int count = 0;
        while (currNode.next != null) {
            count = count + 1;
        }
        System.out.println("Size of linkedlist => " + count);
    }

    public static void main(String[] args) {
        SingleLL list = new SingleLL();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("After adding 4 datas : ");

        list.display();

        list.deleteLast(0);

        System.out.println("After deleting 1 data");

        list.display();
    }
}