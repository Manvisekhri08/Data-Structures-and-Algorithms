package ArraysRepresentation;

import java.util.Scanner;

public class PairSumK {
    void pairSum(int[] A, int k) {
        int i,j;
        for(i=0;i<A.length-1;i++) {
            for(j=i+1;j<A.length;j++) {
                if(A[i]+A[j] == k) {
                    System.out.println("Pair of sum equal to "+ k + "are: " + "{ " + A[i] + "," + A[j] + " }" );
                }
            }
        }
    }
    public static void main(String[] args) {
        int i, size, k;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter values for the array elements:");
        for (i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.print("Enter the sum: ");
        k = scanner.nextInt();
        PairSumK sumK = new PairSumK();
        sumK.pairSum(A, k);
        scanner.close();
    }
}
