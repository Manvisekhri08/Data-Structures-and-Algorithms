package ArraysRepresentation;

import java.util.Scanner;

public class ArrayRotation {
    // Naive Approach rotate by 1
    void rotated_one(int[] A) {
        int temp = A[0];
        for (int i = 1; i < A.length; i++) {
            A[i - 1] = A[i];
        }
        A[A.length - 1] = temp;
    }

    // Naive Approach rotate by k
    void rotated_k(int[] A, int k) {
        k = k % A.length;
        if (k < 0) {
            k += A.length;
        }
        for (int i = 1; i <= k; i++) {
            rotated_one(A);
        }
    }

    // Efficient Aprroach
    void reverseArray(int[] A, int start, int end) {
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }

    void rotated_algo(int[] A, int k) {
        k = k % A.length;
        if (k < 0) {
            k += A.length;
        }
        reverseArray(A, 0, k - 1);
        reverseArray(A, k, A.length -1);
        reverseArray(A, 0, A.length -1 );
    }

    public static void main(String[] args) {
        int i = 0, size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter values for the array  elements:");
        for (i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Enter number of rotation: ");
        int k = scanner.nextInt();
        ArrayRotation arrayRotated = new ArrayRotation();
        arrayRotated.rotated_algo(A, k);
        System.out.print("Rotated Array by is: ");
        for (i = 0; i < size; i++) {
            System.out.print(A[i] + " ");
        }
        scanner.close();
    }
}
