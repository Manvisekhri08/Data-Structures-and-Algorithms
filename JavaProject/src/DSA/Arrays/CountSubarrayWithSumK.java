package DSA.Arrays;

import java.util.*;
public class CountSubarrayWithSumK {
    public int countSubarrayK(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int preSum = 0, cnt = 0;
        map.put(0, 1);
        for(int i = 0 ; i < arr.length; i++) {
            preSum+=arr[i];
            int remove = preSum-k;
            cnt+=map.getOrDefault(remove, 0);
            map.put(cnt, map.getOrDefault(preSum, 0)+1);
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter target sum ");
        int k = scanner.nextInt();
        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        CountSubarrayWithSumK sumK = new CountSubarrayWithSumK();
        int result = sumK.countSubarrayK(arr, k);
        System.out.println("Subarrays with sum K is  : " + result);
        scanner.close();
    }
}
