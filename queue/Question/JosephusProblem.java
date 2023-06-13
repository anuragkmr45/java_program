// There are N people standing in a circle waiting to be executed. Starting from a given person, you count K people in a clockwise direction and remove that person from the circle. The process is repeated with the remaining people, again counting K people in a clockwise direction and removing the selected person. This continues until only one person remains, and that person is declared the "survivor".

package queue.Question;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class JosephusProblem {
    public static int findLastPersonPosition(int n, int k) {
        // Create a circular linked list with n nodes
        Node head = createCircularList(n);

        // Start eliminating people until only one person remains
        while (head.next != head) {
            // Move k-1 steps to reach the kth person
            for (int i = 0; i < k - 1; i++) {
                head = head.next;
            }

            // Eliminate the kth person
            head.next = head.next.next;
        }

        // Return the position of the last remaining person
        return head.data;
    }

    private static Node createCircularList(int n) {
        Node head = new Node(1);
        Node current = head;

        // Create the circular linked list
        for (int i = 2; i <= n; i++) {
            current.next = new Node(i);
            current = current.next;
        }

        // Connect the last node with the head to make it circular
        current.next = head;

        return head;
    }

    public static void main(String[] args) {
        int n = 7; // Number of people
        int k = 3; // Count to eliminate

        int lastPerson = findLastPersonPosition(n, k);
        System.out.println("Position of the last person: " + lastPerson);
    }
}
