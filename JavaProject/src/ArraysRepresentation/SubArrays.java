package ArraysRepresentation;

import java.util.Scanner;

public class SubArrays {
    void subArrays(int[] A) {
        int i, j, k;
        for (i = 0; i < A.length; i++) {
            for (j = i; j < A.length; j++) {
                for (k = i; k <= j; k++) {
                    System.out.print(A[k] + " ");
                }
                System.out.println(" ");
            }
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
        SubArrays subarray = new SubArrays();
        System.out.println("All SubArrays are : ");
        subarray.subArrays(A);
        scanner.close();
    }
}
