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

public class MergeTwoLL {
    Node mergedLL(Node l1, Node l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.data > l2.data) {          // l1 should always be the smaller one
            Node temp = l1;
            l1= l2;
            l2=l1;
        }
        Node res = l1;
        while(l1 != null && l2 != null) {
            Node dummy = null;
            while(l1 != null && l1.data <= l2.data) {
                dummy = l1;
                l1 = l1.next;
            }
            dummy.next = l2;
            Node temp = l1;
            l1= l2;
            l2=l1;
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the first linked list
        System.out.print("Enter the number of elements in the first linked list: ");
        int n1 = scanner.nextInt();

        Node head1 = null;
        Node tail1 = null;

        // Read elements and create the first linked list
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int data = scanner.nextInt();

            Node newNode = new Node(data);

            if (head1 == null) {
                head1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }

        // Read the size of the second linked list
        System.out.print("Enter the number of elements in the second linked list: ");
        int n2 = scanner.nextInt();

        Node head2 = null;
        Node tail2 = null;

        // Read elements and create the second linked list
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int data = scanner.nextInt();

            Node newNode = new Node(data);

            if (head2 == null) {
                head2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }

        // Merge the two linked lists
        MergeTwoLL mergeLL = new MergeTwoLL();
        Node mergedHead = mergeLL.mergedLL(head1, head2);

        // Display the merged linked list
        System.out.println("Merged Linked List:");
        while (mergedHead != null) {
            System.out.print(mergedHead.data + " ");
            mergedHead = mergedHead.next;
        }

        // Close the scanner
        scanner.close();
    }
}
