package ArraysRepresentation;

import java.util.Scanner;

public class MaxSumSubArrayK {
    // Sliding Window Technique
    int maxSubarrayK(int[] A, int k) {
        int wSum = 0;
        int mSum = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            wSum += A[i];
        }
        for (int i = k; i < A.length; i++) {
            wSum = wSum - A[i - k] + A[i];
            if (wSum > mSum) {
                mSum = wSum;
            }
        }
        return mSum;
    }

    // Naive Approach
    int maxSubArray(int[] A, int k) {
        int cSum = 0;
        int mSum = Integer.MIN_VALUE;
        for (int i = 0; i < A.length - k + 1; i++) {
            for (int j = i; j < i + k; j++) {
                cSum += A[j];
            }
            if (cSum > mSum) {
                mSum = cSum;
            }
            cSum = 0;
        }
        return mSum;
    }

    public static void main(String[] args) {
        int i = 0, size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter values for the array elements:");
        for (i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Enter SubArray Size:");
        int k = scanner.nextInt();
        MaxSumSubArrayK maxSubArray = new MaxSumSubArrayK();
        int result = maxSubArray.maxSubarrayK(A, k);
        System.out.println("Maximum sum Subarray of size k is : " + result);
        scanner.close();
    }
}
