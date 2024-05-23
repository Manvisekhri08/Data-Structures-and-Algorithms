package DSA.Arrays;

import java.util.*;

public class MajorityElement {
    public int majorityElement(int arr[]) {
        /*
         * BRUTE
         * We will pck the element and linear search and do count ++
         */
        // for(int i = 0 ; i<arr.length;i++) {
        //     int cnt=0;
        //     for(int j = 0 ; j<arr.length;j++) {
        //         if(arr[i] == arr[j]) {
        //             cnt++;
        //         }
        //     }
        //     if(cnt > (arr.length/2)) {
        //         return arr[i];
        //     }
        // }
        /*
         * BETTER
         * HASHING
         * declare a hashmap with key = element, value = count
         * after completing iteration on array we will iterate over map to find the element ehich has count > n/2;
         */
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i<arr.length; i++) {
        //     int value = map.getOrDefault(arr[i], 0);
        //     map.put(arr[i], value+1);
        // }
        // for(Map.Entry<Integer,Integer> it : map.entrySet()) {
        //     if(it.getValue() > (arr.length/2)) {
        //         return it.getKey();
        //     }
        // }
        /*
         * OPTIMAL
         * MOORE's VOTING ALGORITHM
         * 
         */
        int el=0;
        int cnt = 0;
        for(int i = 0 ; i< arr.length;i++) {
            if(cnt ==0) {
                cnt = 1;
                el = arr[i];
            } else if(arr[i] == el) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int cnt1=0;
        for(int i = 0 ; i<arr.length;i++) {
            if(arr[i] == el) {
                cnt1++;
            }
            if(cnt1 > (arr.length/2)) {
                return el;
            }
        }
        return -1;
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
        MajorityElement majority = new MajorityElement();
        int result = majority.majorityElement(arr);
        System.out.println("Majority Element is : " + result);
        scanner.close();
    }
}
