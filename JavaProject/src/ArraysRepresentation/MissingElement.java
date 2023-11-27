package ArraysRepresentation;

import java.util.Scanner;

public class MissingElement {
    void missing(int[] A) {
        int low = A[0];
        int diff = low - 0;
        for(int i =0; i<A.length;i++) {
            // single missing element
            //  if(A[i] - i != diff) {
            //     System.out.println("Missing Element is found which is:" +( diff + i));
            //     break;
            // }
            // multiple missing elements
            while(A[i] - i != diff) {
                System.out.println("Missing Element is found which is:" +( diff + i));
                diff++;
            }
        }
    }
     public static void main(String[] args) {
        int i = 0, size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array 1: ");
        size = scanner.nextInt();
        int[] A = new int[size];
        System.out.println("Enter values for the array 1 elements:");
        for (i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        MissingElement missingElement = new MissingElement();
        missingElement.missing(A);
        scanner.close();
    }
}
