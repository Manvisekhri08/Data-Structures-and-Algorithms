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

public class RemoveNFromEnd {
    Node remove(Node head, int N) {
        Node start = new Node(-1);
        start.next = head;
        Node slow = start;
        Node fast = start;
        for(int i = 1 ;i <= N; i++) {
            fast = fast.next;
        }
        while(fast != null & fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
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
         System.out.print("Enter the nth node from the end of the list: ");
        int N = scanner.nextInt();
         RemoveNFromEnd removeN = new  RemoveNFromEnd();
        head = removeN.remove(head, N);

        // Display the reversed linked list
        System.out.println("New Linked List:");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        // Close the scanner
        scanner.close();
    }
}
