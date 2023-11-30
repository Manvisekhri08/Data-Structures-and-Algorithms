package ArraysRepresentation;

import java.util.Scanner;

public class MaxMin {
    void findMaxMin(int[] A) {
        int min = A[0], max = A[0];
        for(int i =1; i< A.length; i++) {
            if(A[i] < min) {
                min = A[i];
            } else if(A [i] > max) {
                max = A[i];
            }
        }
        System.out.println("Maximum is : " + max +" " + "Minimum is : " + min);
    }
    public static void main(String[] args) {
        int i, size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter values for the array elements:");
        for (i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        MaxMin maxmin = new MaxMin();
        maxmin.findMaxMin(A);
        scanner.close();
    }
}
