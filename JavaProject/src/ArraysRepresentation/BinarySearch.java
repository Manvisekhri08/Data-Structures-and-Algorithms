package ArraysRepresentation;

import java.util.Scanner;

public class BinarySearch {
    int binarySearchI(int low, int high, int key, int[] A) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == A[mid]) {
                return mid;
            } else if (key < A[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    int binarySearchR(int low, int high, int key, int[] A) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == A[mid]) {
                return mid;
            } else if (key < A[mid]) {
                binarySearchR(low, mid - 1, key, A);
            } else {
                binarySearchR(mid + 1, high, key, A);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int i, key, low, high, size;
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
        low = 0;
        high = A.length - 1;
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearchI(low, high, key, A);
        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }
        scanner.close();
    }
}
