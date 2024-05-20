package DSA.Arrays;

import java.util.Scanner;

public class LeftRotateArraybyOne {
    public void rotateLeft(int arr[]) {
        /*
         * Optimal
         * lets store a[0] in temp
         * take a pointer i and point at a[1]. now i want a[1] at a[i-1] position
         * shift all the elements at i-1 position and put temp at last index
         */
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        System.out.println("Rotated array is : ");
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
        LeftRotateArraybyOne rotate = new LeftRotateArraybyOne();
        rotate.rotateLeft(arr);
        scanner.close();
    }
}
