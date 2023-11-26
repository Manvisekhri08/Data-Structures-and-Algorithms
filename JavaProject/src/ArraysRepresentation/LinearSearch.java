package ArraysRepresentation;

import java.util.Scanner;

public class LinearSearch {
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

        boolean found = false;
        for (i = 0; i < A.length; i++) {
            if (key == A[i]) {
                System.out.print("Key found at index: " + i);
                found = true;
                break; // No need to continue searching once the key is found
            }
        }

        if (!found) {
            System.out.print("-1");
        }

        scanner.close();
    }
}
