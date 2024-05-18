/**
 * Given an array, we have found the number of occurrences of each element in the array.
 * Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	 5  2
        15  1
Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array

Example2: 
Input: arr[] = {2,2,3,4,4,2};
Output: 2  3
	3  1
        4  2
Explanation: 2 occurs 3 times in the array
	     3 occurs 1 time in the array
             4 occurs 2 time in the array
 */

package DSA.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {
    public void frequency(int arr[]) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0 ;i < arr.length;i++) {
            if(mpp.containsKey(arr[i])) {
                mpp.put(arr[i], mpp.get(arr[i])+1);
            } else {
                mpp.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()) {
            System.out.println(entry.getKey() + " is occuring : " + entry.getValue());
        }
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
        CountFrequency freq = new CountFrequency();
        freq.frequency(arr);
        scanner.close();
    }
}
