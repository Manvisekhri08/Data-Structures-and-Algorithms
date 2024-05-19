/*
 * Given an array, 
 * find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
 * Example 1:

Input:
 [1,2,4,7,7,5]
Output:
 Second Smallest : 2
	Second Largest : 5
Explanation:
 The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:

Input:
 [1]
Output:
 Second Smallest : -1
	Second Largest : -1
Explanation:
 Since there is only one element in the array, it is the largest and smallest element present in the array. 
 There is no second largest or second smallest element present.
 */

package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public void secondLarge(int arr[]) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        /*
         * Brute
         * we sort the array
         * the last index is our largest
         * the index before our largest might or not our second largest
         * if a[last] == a[last-1], then we check before it
         * TC :- O(NlogN + N) -> worst case if no second largest element found meaning
         * all elements in array is equal
         * NlogN :- to sort the array
         */

        Arrays.sort(arr);
        if (arr.length < 2) {
            System.out.println("No second largest found: " + -1);
        }
        int large = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != large) {
                secondLargest = arr[i];
                break;
            }
        }

        /*
         * Better
         * We do first pass where we find the largest element
         * Lets keep secondLargest = -1, we now compare current element with
         * secondLargest and check if the curr ele is greater and not equal to largest.
         * TC :- O(2N)
         */

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        /*
         * Optimal
         * assume largest = arr[0], and secondLargest = -1 (assuming all elements are
         * positive), if array has negative elements then take secondLrgest =
         * Integer.INT_MIN
         * we start traversing from arr[1] as arr[0] we assuming is largest
         * we check if arr[1] > largest if yes then we update largest = arr[1] as now
         * arr[0] = second largest as arr[0] was largest now arr[1] is, so arr[0]
         * becomes second largest
         * if arr[i] == largest, dont do anything and move on to next element
         * TC :- O(N)
         */

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest element in array is : " + secondLargest);
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
        SecondLargest large = new SecondLargest();
        large.secondLarge(arr);
        scanner.close();
    }
}
