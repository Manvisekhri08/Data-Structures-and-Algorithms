package ArraysRepresentation;

import java.util.Scanner;

public class FrequencyElementsSorted {
    void frequency(int[] A) {
        int freq = 1;
        int i = 1;
        while (i < A.length) {
            while (i < A.length && A[i] == A[i - 1]) {
                freq++;
                i++;
            }
            System.out.println("Element" + " " + A[i - 1] + " " + "has frequency: " + freq);
            freq = 1;
            i++;
        }
        if (A.length == 1 || A[i - 1] != A[i - 2]) {
            System.out.println("Element" + " " + A[i - 1] + " " + "has frequency: " + freq);
        }
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
        FrequencyElementsSorted frequencygElement = new FrequencyElementsSorted();
        frequencygElement.frequency(A);
        scanner.close();
    }
}
