package ArraysRepresentation;

import java.util.Scanner;

public class MergedArrays {

    int[] merge(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        while (i < A.length) {
            C[k++] = A[i++];
        }
        while (j < B.length) {
            C[k++] = B[j++];
        }
        return C;
    }

    int[] merge2(int[] A, int m, int[] B, int n) {
        int i = m-1, j = n-1, k = (m+n)-1;
        while(j >= 0) {
            if(i>=0 && A[i] > B[j]) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int i = 0, j = 0, k = 0, size, size2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array 1: ");
        size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter values for the array 1 elements:");
        for (i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.print("Enter the size of the array 2: ");
        size2 = scanner.nextInt();
        int[] B = new int[size2];
        System.out.println("Enter values for the array 2 elements:");
        for (j = 0; j < size2; j++) {
            B[j] = scanner.nextInt();
        }
        MergedArrays mergeArrays = new MergedArrays();
        int[] C = mergeArrays.merge2(A,size, B,size2);
        for (k = 0; k < C.length; k++) {
            System.out.println(C[k]);
        }
        scanner.close();
    }
}
