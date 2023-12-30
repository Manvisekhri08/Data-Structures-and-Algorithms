package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class DetectLoop {
    boolean detect(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast !=null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the linked list
        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        Node head = null;
        Node tail = null;

        // Read elements and create the linked list
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int data = scanner.nextInt();

            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Create a loop for testing (comment this section for a non-looping list)
        System.out.print("Enter the position to create a loop (0 for no loop): ");
        int loopPosition = scanner.nextInt();
        if (loopPosition > 0) {
            Node loopNode = head;
            for (int i = 1; i < loopPosition; i++) {
                loopNode = loopNode.next;
            }
            tail.next = loopNode;
        }

        // Detect loop
        DetectLoop detectLoop = new DetectLoop();
        boolean hasLoop = detectLoop.detect(head);

        if (hasLoop) {
            System.out.println("The linked list has a loop.");
        } else {
            System.out.println("The linked list does not have a loop.");
        }

        // Close the scanner
        scanner.close();
    }
}
