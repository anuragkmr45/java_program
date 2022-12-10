package linkedList;

public class DoubleLL {
    Node head;

    public class Node{
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // add data to first
    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        head.next = newNode;
        newNode.prev = head;
    }

    // add data at end
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node tempNode = head;

        while (tempNode != null) {
            tempNode = tempNode.next;
        }

        newNode.prev = tempNode;
        tempNode.next = newNode;
    }

    // delete from first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list empty");
            return;
        }

        Node tempNode = head;
        head = tempNode.next;
        head.prev = null;
        tempNode.next = null;
    }

    // delete form last
    public void deleteLast() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }

        Node lastNode = head.next;
        Node secLastNode = head;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secLastNode = secLastNode.next;
        }

        secLastNode.next = null;
        lastNode.prev = null;
    }

    // display list
    public void displayLL() {
        if (head == null) {
            System.out.println("empty lsit");
            return;
        }

        Node tempNode = head;

        while (tempNode.next != null) {
            System.out.println("null <--> ");
            System.out.print(tempNode.data + " <--> ");
            tempNode = tempNode.next;
        }

        System.out.println("null");
    }

    // size of list
    public void size() {
        if (head == null) {
            System.out.println("empty lsit");
            return;
        }

        Node tempNode = null;
        int count = 0;

        while(tempNode.next != null) {
            count = count + 1;
            tempNode = tempNode.next;
        }

        System.out.println("size of list -> " + count);
    }
}
