package ArraysRepresentation;

import java.util.Scanner;

public class ReverseArray {
    void reverse(int[] A) {
        int[] B = new int[A.length];
        int i, j;
        for (i = A.length - 1, j = 0; i >= 0; i--, j++) {
            B[j] = A[i];
        }
        for (i = 0; i < A.length; i++) {
            A[i] = B[i];
        }
    }

    void reverse2(int[] A) {
        int i, j, temp;
        for (i = 0, j = A.length - 1; i < j; i++, j--) {
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
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
        ReverseArray reverseA = new ReverseArray();
        reverseA.reverse2(A);
        System.out.println("Reversed array:");
        for (i = 0; i < size; i++) {
            System.out.print(A[i] + " ");
        }
        scanner.close();
    }
}
