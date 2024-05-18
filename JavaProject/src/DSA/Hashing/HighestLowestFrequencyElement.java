/*
 * Given an array of size N. Find the highest and lowest frequency element.
 * Example 1:
Input: array[] = {10,5,10,15,10,5};
Output: 10 15
Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.

Example 2:

Input: array[] = {2,2,3,4,4,2};
Output: 2 3
Explanation: The frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1 i.e. the lowest.
 */

package DSA.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestLowestFrequencyElement {
    public void frequency(int arr[]) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0 ; i< arr.length;i++) {
            if(mpp.containsKey(arr[i])) {
                mpp.put(arr[i], mpp.get(arr[i])+1);
            } else {
                mpp.put(arr[i], 1);
            }
        }
        int maxEle = 0, minEle = 0;
        int maxFreq = 0, minFreq= arr.length;
        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();
            if(count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if(count < minFreq) {
                minEle = element;
                minFreq = count;
          }
        }
        System.out.println("Element " + maxEle + " has highest frequency of : " + maxFreq);
        System.out.println("Element " + minEle + " has lowest frequency of : " + minFreq);
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
        HighestLowestFrequencyElement freq = new HighestLowestFrequencyElement();
        freq.frequency(arr);
        scanner.close();
    }
}
