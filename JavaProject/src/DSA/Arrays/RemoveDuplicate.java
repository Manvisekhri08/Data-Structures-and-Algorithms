/**
 * Given an integer array sorted in non-decreasing order, 
 * remove the duplicates in place such that each unique element appears only once.
 *  The relative order of the elements should be kept the same.
 * Example 1:
 

Input:
 arr[1,1,2,2,2,3,3]

Output:
 arr[1,2,3,_,_,_,_]

Explanation:
 Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

Example 2:
 

Input:
 arr[1,1,1,2,2,3,3,3,3,4,4]

Output:
 arr[1,2,3,4,_,_,_,_,_,_,_]

Explanation:
 Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.
 */

package DSA.Arrays;

import java.util.*;

public class RemoveDuplicate {
    public int removeDup(int arr[]) {
        /*
         * we are asked to remove duplicate and return the unique elements
         * when we are asked to remove duplicate think of hashset
         * we are going to iterate over array and insert unique elements in hashset
         * Store size of the set in a variable K.
         * Now put all elements of the set in the array from the starting of the array.
         * return K
         * TC :- O(n*log(n))+O(n)
         * SC : - O(N)
         */
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
        set.add(arr[i]);
        }
        int k = set.size();
        int c = 0;
        for (int x : set) {
        arr[c++] = x;
        }
         return k;

        /*
         * Optimal
         * Apply two pointer approach
         * We can think of using two pointers ‘i’ and ‘j’, we move ‘j’ till we don't get
         * a number arr[j] which is different from arr[i].
         * As we got a unique number we will increase the i pointer and update its value
         * by arr[j].
         * Array is sorted, first element a[0] is unique in itself
         * the next element will be taken by someone which is not equivalent to a[0]
         * we iterate and check which element is not equal to a[i]
         * Take a variable i as 0;
         * Use a for loop by using a variable ‘j’ from 1 to length of the array.
         * If arr[j] != arr[i], increase ‘i’ and update arr[i] == arr[j].
         * After completion of the loop return i+1, i.e size of the array of unique
         * elements.
         * TC :- O(N)
         * SC :- O(1)
         */
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
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
        RemoveDuplicate unique = new RemoveDuplicate();
        int result = unique.removeDup(arr);
        for (int i = 0; i < result; i++) {
            System.out.println("Unique elements in array are : " + arr[i]);
        }
        scanner.close();
    }
}
