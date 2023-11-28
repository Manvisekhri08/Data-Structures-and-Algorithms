package ArraysRepresentation;

import java.util.Scanner;

public class CountDuplicates {
    void countDup(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int j;
            if (i< A.length && A[i] == A[i + 1]) {
                j = i + 1;
                while (j < A.length &&A[i] == A[j]) {
                    j++;
                }
                System.out.println("Duplicate elements are: " + A[i] + " Frequency is: " + (j - i));
                i = j - 1;
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
        CountDuplicates count = new CountDuplicates();
        count.countDup(A);
        scanner.close();
    }
}
