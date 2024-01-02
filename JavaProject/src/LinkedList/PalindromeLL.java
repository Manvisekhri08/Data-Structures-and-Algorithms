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

public class PalindromeLL {
    Node reverseLL(Node head) {
        Node newHead = null;
        while(head != null && head.next != null){
            Node curr = head.next;
            head.next = newHead;
            newHead = head;
            head = curr;
        }
        return newHead;
    }
    boolean palindromeLL(Node head) {
        if(head == null || head.next == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;
        Node prevSlow = head;
        Node middle = null; // odd length

        // find middle of ll
        while(fast != null && fast.next != null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null) {
            middle = slow;
            slow = slow.next;
        }
       // reverse RHS of LL (make a copy before reversing)
        Node reverseRHS = reverseLL(slow.next);
        Node ogHead = head;
        // compare lhs and rhs
        while(reverseRHS != null) {
            if(ogHead.data != reverseRHS.data) {
                return false;
            } else {
                ogHead = ogHead.next;
                reverseRHS = reverseRHS.next;
            }
        }
         return true;
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

        PalindromeLL palindromeChecker = new PalindromeLL();
        // Check if the linked list is a palindrome
        boolean isPalin = palindromeChecker.palindromeLL(head);

        // Display the result
        if (isPalin) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}
