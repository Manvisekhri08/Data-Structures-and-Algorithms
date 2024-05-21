package DSA.Arrays;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public int maxOnes(int arr[]) {
        /*
         * OPTIMAL
         * We maintain a count to keep track of consecutive 1's
         * We will have another variable max which maintain count of max 1's
         * if we counter 1, we increase count and max = count;
         * If we counter 0, then count resets to 0
         */
        int count = 0,  max = 0;
        for(int i = 0 ; i<arr.length;i++) {
            if(arr[i] == 1) {
                count++;
            } else {
                count =0;
            }
            max = Math.max(max,count);
        }
        return max;
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
        MaxConsecutiveOnes max = new MaxConsecutiveOnes();
        int result = max.maxOnes(arr);
        System.out.println("Maximum Consecutive Number of 1's are : " + result);
        scanner.close();
    }
}
