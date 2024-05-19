/*
 * Given an array, we have to find the largest element in the array.
 * Example 1:

Input:
 arr[] = {2,5,1,3,0};
Output:
 5
Explanation:
 5 is the largest element in the array. 

Example2:
 
Input:
 arr[] = {8,10,5,7,9};
Output:
 10
Explanation:
 10 is the largest element in the array.
 */

package DSA.Arrays;

import java.util.*;
import java.util.Scanner;

public class LargestElement {
    public void largest(int arr[]) {
        /*
         * Brute
         * sort the array
         * the last index is our answer
         * TC :- O(NlogN)
         */
        Arrays.sort(arr);
        System.out.println("Largest element in array is : " + arr[arr.length - 1]);

        /*
         * Optimal
         * we will assume 1st lement is the largest
         * now we traverse through array and compare with largest
         * if current elemnt is greater then we update the largest
         * TC:- O(N)
         */
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest element in array is : " + largest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        LargestElement large = new LargestElement();
        large.largest(arr);
        scanner.close();
    }
}
