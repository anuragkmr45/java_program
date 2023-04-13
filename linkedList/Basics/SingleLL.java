package linkedList.Basics;

public class SingleLL {
    public static void main(String[] args) {
        SingleLL data = new SingleLL();
        data.add(10);
        data.add(20);

        System.out.println("After adding 2 datas :");
        data.display();
        
        data.deleteLast(0);
        System.out.println("After deleting 1 datas :");
        data.display();
    }
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data  = data;
            this.next = null;
        }
    }

    // add data at first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }        
        newNode.next = null;
        head = newNode;
    }
    // add data at last (default adding)
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    // delete element at first 
    public void deleteFirst(int data) {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        head = head.next;
    }
    // delete element at last
    public void deleteLast(int data) {
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
    // display list
    public void display(){
        if(head == null) {
            System.out.println("empty list");
        }
        Node currNode = head;
        System.out.print(currNode.data + " --> ");
        while (currNode.next != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    // size of linkedlist
    public void size() {
        Node currNode = head;
        int count = 0;
        while (currNode.next != null) {
            count = count + 1;
        }
        System.out.println("Size of linkedlist => " + count);
    }
    // reverse a LinkedList
    public void reverse() {
        if (head.next == null) {
            System.out.println("only one node present");
        }
        if (head == null) {
            System.out.println("LL is empty");
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode.next != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
}
