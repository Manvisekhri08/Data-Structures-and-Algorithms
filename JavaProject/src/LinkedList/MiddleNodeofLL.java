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

public class MiddleNodeofLL {
    // using tortoise approach
    Node middle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast !=null && fast.next != null) {
            slow = head.next;
            fast = head.next.next;
        }
        return slow;
    }

    // using traversing
    Node middleTraverse(Node head) {
        int length = 0;
        Node curr = head;
        if(curr != null) {
            length ++;
            curr = curr.next;
        }
        curr = head;
        for(int i = 0; i<length/2;i++) {
            curr = curr.next;
        }
        return curr;
    }
    public static void main(String args[]) {
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

        // Reverse the linked list
        MiddleNodeofLL middleLL = new MiddleNodeofLL();
        head = middleLL.middle(head);

        // Display the reversed linked list
        System.out.println("Middle node of Linked List:");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        // Close the scanner
        scanner.close();
    }
}
