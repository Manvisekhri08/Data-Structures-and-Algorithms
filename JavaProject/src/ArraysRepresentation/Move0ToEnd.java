package ArraysRepresentation;

import java.util.Scanner;

public class Move0ToEnd {
    void move0(int[] A) {
        if(A.length == 0 || A.length == 1) {
            return;
        }
        int nz = 0;
        int z = 0;
        while(nz < A.length) {
            if(A[nz] != 0) {
                int temp = A[nz];
                A[nz] = A[z];
                A[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
        for(int i  = 0; i<A.length;i++)
        System.out.print(A[i] + " , " );
    }
     public static void main(String[] args) {
        int i = 0, size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter values for the array elements:");
        for (i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        Move0ToEnd move = new Move0ToEnd();
        move.move0(A);
        scanner.close();
    }
}
