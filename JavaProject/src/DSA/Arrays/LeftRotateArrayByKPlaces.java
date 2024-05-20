package DSA.Arrays;

import java.util.Scanner;

public class LeftRotateArrayByKPlaces {
    public void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void leftRotate(int[] arr, int k) {
        /*
         * BRUTE
         * Copy the last k elements into the temp array.
         * hift n-k elements from the beginning by k position to the left
         * Copy the elements into the main array from the temp array.
         * TC :- O(n+k)
         */
        int[] temp = new int[k];
        int n = arr.length;
        k = k % n;
        for (int i = 0; i < k; i++) {
        temp[i] = arr[i];
        }
        for (int i = k; i < arr.length; i++) {
        arr[i - k] = arr[i];
        }
        for (int i = n - k; i < arr.length; i++) {
        arr[i] = temp[i - (n - k)];
        }
        /**
         * Optimal
         * Reversal algorithm
         * We first take 0-k elements reverse them
         * then we take length-k elements reverse them
         * then we reverse the whole array
         */
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
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
        System.out.println("Enter k : ");
        int k = scanner.nextInt();
        LeftRotateArrayByKPlaces rotate = new LeftRotateArrayByKPlaces();
        rotate.leftRotate(arr, k);
        System.out.println("Rotated array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
