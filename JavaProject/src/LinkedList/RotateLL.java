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

public class RotateLL {
    Node rotateLL(Node head, int k) {
        if(head == null || head.next == null || k == 0) {
            return head;
        }
        int len = 1;
        Node curr = head;
        while(curr.next != null) {
            len++;
            curr = curr.next;
        }
        curr.next = head;
        k = len - k%len;
        while(k-- > 0) {
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;
        return head;
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

        System.out.print("Enter k: ");
        int k = scanner.nextInt();
        // Reverse the linked list
        RotateLL rotate = new RotateLL();
        head = rotate.rotateLL(head,k);

        // Display the reversed linked list
        System.out.println("Rotated Linked List:");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        // Close the scanner
        scanner.close();
    }
}
