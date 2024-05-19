/**
 * Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

Note: Two consecutive equal values are considered to be sorted.
Example 1:

Input:
 N = 5, array[] = {1,2,3,4,5}
Output
: True.
Explanation:
 The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True


Input:
 N = 5, array[] = {5,4,6,7,8}
Output
: False.
Explanation:
 The given array is Not sorted i.e Every element in the array is not smaller than or equal to its next values, So the answer is False.

Here element 5 is not smaller than or equal to its future elements
 */
package DSA.Arrays;

import java.util.Scanner;

public class CheckSortedArray {
    public boolean sorted(int arr[]) {
        /*
         * Optimal
         * we traverse through array
         * check if current element is smaller than the next
         * if true for all array means array is sorted
         * TC :- O(N)
         */
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
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
        CheckSortedArray sort = new CheckSortedArray();
        System.out.println("Is array sorted ? " + sort.sorted(arr));
        scanner.close();
    }
}
