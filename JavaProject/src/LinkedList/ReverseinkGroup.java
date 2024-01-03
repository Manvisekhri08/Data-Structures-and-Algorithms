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

public class ReverseinkGroup {
    Node reverseByKGrp(Node head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        Node dummy = new Node(-1);
        dummy.next = head;
        Node prev = dummy;
        Node curr = head;
        Node next = null;

        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        head = dummy;
        while (count >= k) {
            curr = head.next;
            next = curr.next;
            for (int i = 1; i < k; i++) {
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }
            prev = curr;
            head = curr;
            count -= k;
        }
        return dummy.next;
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
        ReverseinkGroup reverseK = new ReverseinkGroup();
        head = reverseK.reverseByKGrp(head, k);

        // Display the reversed linked list
        System.out.println("Reverse Linked List :");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        // Close the scanner
        scanner.close();
    }
}
