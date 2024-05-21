package DSA.Arrays;

import java.util.Scanner;

public class MissingNumber {
    public int missingNum(int arr[], int N) {
        /*
         * BRUTE
         * Linear Search
         * We will iterate from 1 to N and check if same number exists in given array
         * we will run another loop to iterate over the array and 
         * consider a flag variable to indicate if the element exists in the array. 
         * Flag = 1 means the element is present and flag = 0 means the element is missing.
         * nitially, the flag value will be set to 0. While iterating the array, 
         * if we find the element, we will set the flag to 1 and break out from the loop.
         * Now, for any number i, if we cannot find it, the flag will remain 0 even after iterating the whole array and we will return the number.
         * TC :- O(N^2)
         * SC:-O(1)
         */
        for(int i = 1 ; i<= N; i++) {
            int flag = 0;
            for(int j = 0; j< arr.length;j++) {
                if(arr[j] == i) {
                    flag=1;
                    break;
                }
            }
            if(flag == 0) 
                return i;
        }
        /*
         * BETTER 
         * Using Hashing
         * Range is from 1 to N so we will be using hash array of size N+1
         * For each element in array we will be storing the frequency in hash array
         * We will check frequency from 1 to N, if any number has frequency 0 that will be our answer
         * TC:- O(N) + O(N) -> worst case
         * SC:- O(N)
         */
        int[] hash = new int[N+1];
        for(int i = 0; i<arr.length;i++) {
            hash[arr[i]] = 1;
        }
        for(int i = 1 ;i<=N;i++) {
            if(hash[i]==0) {
                return i;
            }
        }
        /*
         * OPTIMAL
         * Summation Approach
         * We will sum the first N numbers
         * Then we will sum the array elements
         * the difference of them will give our answer
         * TC:-O(N)
         * SC:-O(1)
         */
        int sum2=0;
        int sum1 = (N*(N+1))/2;
        for(int i = 0 ; i< arr.length;i++) {
            sum2+=arr[i];
        }
        int missingNum = sum1-sum2;
        return missingNum;
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
        System.out.println("Enter N : ");
        int N = scanner.nextInt();
        MissingNumber miss = new MissingNumber();
        int result = miss.missingNum(arr,N);
        System.out.println("Missing Number is: " + result);
        scanner.close();
    }
}
