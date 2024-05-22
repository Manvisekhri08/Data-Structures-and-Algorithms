package DSA.Arrays;

import java.util.Scanner;

public class NumberAppearOnce {
    public int onceNumber(int arr[]) {
        /*
         * BRUTE
         * pick a number and linear search to find out how many times the picked number is coming
         * if the number is more than once we move on
         */
        for(int i = 0; i<arr.length;i++) {
            int num = arr[i];
            int count = 0 ;
            for(int j = 0 ; j< arr.length;j++) {
                if(arr[j] == num) {
                    count ++;
                }
            }
            if(count == 1) return num;
        }
        /*
         * Optimal
         * XOR
         */
        int xor = 0;
        for(int i = 0 ; i< arr.length;i++) {
            xor = xor^arr[i];
        }
        return xor;
        //return -1;
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
        NumberAppearOnce once = new NumberAppearOnce();
        int result = once.onceNumber(arr);
        System.out.println("Number which is appearing once is: " + result);
        scanner.close();
    }
}
