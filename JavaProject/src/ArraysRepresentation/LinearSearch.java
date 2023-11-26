package ArraysRepresentation;

import java.util.Scanner;

public class LinearSearch {
    int linearSearch(int key, int[] A) {
        int i;
        for (i = 0; i < A.length; i++) {
            if (key == A[i]) {
                return i;
            } 
        }
        return -1;
    }

    public static void main(String[] args) {
        int i, key, size;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();

        int[] A = new int[size];

        System.out.println("Enter values for the array elements:");
        for (i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.print("Enter the key to search: ");
        key = scanner.nextInt();
        LinearSearch searcher = new LinearSearch();
        int result = searcher.linearSearch(key, A);
        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }
        scanner.close();
    }
}
