package ArraysRepresentation;

import java.util.Scanner;

public class Duplicates {
    void duplicate(int[] A) {
        int lastDuplicate = 0;
        for (int i = 0; i < A.length-1; i++) {
            if (A[i] == A[i + 1] && A[i] != lastDuplicate) {
                System.out.println("Duplicate Elements: " + A[i]);
                lastDuplicate = A[i];
            }
        }
    }

    public static void main(String[] args) {
        int i = 0, size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter values for the array elements:");
        for (i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        Duplicates dup = new Duplicates();
        dup.duplicate(A);
        scanner.close();
    }
}
