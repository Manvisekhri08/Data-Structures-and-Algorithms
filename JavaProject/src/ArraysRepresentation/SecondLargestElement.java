package ArraysRepresentation;

import java.util.Scanner;

public class SecondLargestElement {
    void secondLargest(int[] A) {
        int max1, max2;
        if(A[0] > A[1]) {
            max1 = A[0];
            max2 = A[1];
        } else {
            max1 = A[1];
            max2 = A[0];
        }
        for(int i = 2; i < A.length ; i++) {
            if(A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            } else if(A[i] > max2) {
                max2 = A[i];
            }
        }
        System.out.println("Second Largest Element is: " + max2);
    }
    public static void main(String[] args) {
        int i, size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter values for the array elements:");
        for (i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        SecondLargestElement secondLarge = new SecondLargestElement();
        secondLarge.secondLargest(A);
        scanner.close();
    }
}
