package ArraysRepresentation;

import java.util.HashSet;
import java.util.Scanner;

public class CountDuplicates {
    void countDup(int[] A) {
        // for (int i = 0; i < A.length; i++) {
        //     int j;
        //     if (i< A.length && A[i] == A[i + 1]) {
        //         j = i + 1;
        //         while (j < A.length &&A[i] == A[j]) {
        //             j++;
        //         }
        //         System.out.println("Duplicate elements are: " + A[i] + " Frequency is: " + (j - i));
        //         i = j - 1;
        //     }
        // }
        // using hashset
        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for(int i = 0; i<A.length;i++) {
            if(!unique.add(A[i])) {
                // Element is already present in the set, meaning it's a duplicate
                duplicate.add(A[i]);
            }
        }
        // Iterate through duplicate elements and print their frequencies
        for(int element : duplicate) {
            int frequency = 0 ;
            for(int num : A) {
                if(element == num) {
                    frequency++;
                }
            }
            System.out.println("Duplicate element: " + element + " Frequency is: " + frequency);
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
