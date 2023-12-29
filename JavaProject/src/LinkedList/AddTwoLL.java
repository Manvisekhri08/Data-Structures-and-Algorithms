/* You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. 
 Add the two numbers and return the sum as a linked list. 
 I/p :- l1 = [2,4,3], l2 = [5,6,4]
 O/p :- [7,0,8]
 Explanation: 342 + 465 = 807.
*/ 

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

public class AddTwoLL {
    Node sumLL(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        int carry=0;
        while(l1 != null || l2 != null || carry == 1) {
            int sum = carry;
            if(l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum+= l2.data;
                l2 = l2.next;
            }
            temp.next = new Node(sum%10);
            temp = temp.next;
            carry = sum / 10;
        }
        return dummy.next;
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

        // Add two linked lists
        AddTwoLL sumLL = new AddTwoLL();
        Node addLL = sumLL.sumLL(head1, head2);

        // Display the merged linked list
        System.out.println("Sum Linked List:");
        while (addLL != null) {
            System.out.print(addLL.data + " ");
            addLL = addLL.next;
        }

        // Close the scanner
        scanner.close();
    }
}
