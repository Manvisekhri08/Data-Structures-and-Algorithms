package DSA.Arrays;

import java.util.Scanner;

public class Sort0s1s2s {
    public void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]=temp;
    }
    public void sortColors(int[] arr) {
        /*
         * BRUTE
         * Sort using any sorting algorithm
         * Merge sort
         */
        /*
         * BETTER
         * We know for sure array is only containing 0, 1, 2
         * We will do a single iteration where we initialise three count variable cnt0, cnt1, cnt2
         * during iteration we will check which element we are on and increement the count 
         * after iteation we will have count of 0,1,2
         * so we run a loop from 0 to cnt0 and add 0 to arr
         * then cnt0 to cnt0+cnt1 we add 1
         * then cnt0+cnt1 to length we add 2
         * TC:_ TC(2N)
         * SC:- O(1)
         */
        int cnt0=0, cnt1=0, cnt2=0;
        for(int i = 0 ; i< arr.length ; i++) {
            if(arr[i] == 0) cnt0++;
            else if(arr[i] == 1) cnt1++;
            else cnt2++;
        }
        for(int i = 0 ; i< cnt0;i++) {
            arr[i] = 0;
        }
        for(int i = cnt0; i < cnt0+cnt1; i++) {
            arr[i] = 1;
        }
        for(int i = cnt0+cnt1;i<arr.length;i++) {
            arr[i]=2;
        }

        /*
         * OPTIMAL
         * DUTCH NATIONAL FLAG ALGORITHM
         */
       int low=0, mid=0, high = arr.length-1;
       while(mid <= high) {
        if(arr[mid] == 0) {
            swap(arr, low,mid);
            low++;
            mid++;
        } else if(arr[mid] == 1) {
            mid ++;
        } else {
            swap(arr,mid,high);
            high--;
        }
       }
        System.out.println("Sorted array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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
        Sort0s1s2s sort = new Sort0s1s2s();
        sort.sortColors(arr);
        scanner.close();
    }
}
