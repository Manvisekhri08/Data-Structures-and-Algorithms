package DSA.Arrays;

import java.util.*;
import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int arr[], int target) {
        /*
         * BRUTE
         * pick and element and check the sum with all elements
         */
        // for(int i = 0 ; i< arr.length;i++) {
        //     for(int j = i+1 ; j<arr.length;j++) {
        //         if(arr[i] + arr[j] == target) {
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        /*
         * Beetr Approach and approach to think when asked this question
         * HASHMAP
         * we know target and we will iterate over the array and eg i = 0 arr[0]=2
         * we will do target-arr[i] = required
         * we will check the required in the hashmap if exists we return if not then we store the arr[i]
         */
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length;i++) {
            int requiredNum = target - arr[i];
            if(map.containsKey(requiredNum)) {
                return new int[]{map.get(requiredNum), i};
            } else {
                map.put(arr[i],i);
            }
        }
       return new int[]{-1,-1};
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
        System.out.println("Enter target sum : ");
        int k = scanner.nextInt();
        TwoSum sum = new TwoSum();
        int[] result = sum.twoSum(arr,k);
        System.out.println("Indices which return target sum are : " + result);
        scanner.close();
    }
}
