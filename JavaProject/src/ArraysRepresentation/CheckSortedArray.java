package ArraysRepresentation;

import java.util.Scanner;

public class CheckSortedArray {
    void insert(int[] A, int x, int size) {
        int i = size - 1;

        // Shift elements to the right to make space for x
        while (i >= 0 && A[i] > x) {
            A[i + 1] = A[i];
            i--;
        }

        // Insert x at the correct position
        A[i + 1] = x;
    }

    int isSorted(int[] A) {
        int i;
        for(i=0; i<A.length-1;i++) {
            if(A[i] > A[i+1]) {
                return 0;
            }
        }
        return 1;
    }

    void swap(int[] A) {

    }

    void shift(int[] A) {
        int i =0, j=A.length-1;
        while(i<j) {
            while(A[i] < 0) {
                i++;
            }
            while (A[j] >= 0) {
                j--;
            }
            if(i<j) {
                //swap(A[i], A[j]);
            }
        }
    }

    public static void main(String[] args) {
        int i, size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();
        int[] A = new int[size]; // Increase size to accommodate possible insertion

        System.out.println("Enter values for the array elements (in sorted order):");
        for (i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }

        // System.out.println("Enter element to be inserted:");
        // x = scanner.nextInt();

        CheckSortedArray insertElt = new CheckSortedArray();
       // insertElt.insert(A, x, size + 1); // Pass size + 1 to include the new element
        int result = insertElt.isSorted(A);
        System.out.println("Is the array sorted? " + (result == 1 ? "Yes" : "No"));
       // System.out.println("New array:");
        // for (i = 0; i < size; i++) {
        //    // System.out.print(A[i] + " ");
        //     System.out.print(result);
        // }

        scanner.close();
    }
}
