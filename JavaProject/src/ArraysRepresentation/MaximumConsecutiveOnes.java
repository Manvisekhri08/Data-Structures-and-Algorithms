package ArraysRepresentation;

import java.util.Scanner;

public class MaximumConsecutiveOnes {
    // Naive Approach
    int maximumOnes(int[] A) {
        int count ;
        int maxCount = 0;
        for(int i = 0; i< A.length; i++) {
             count  = 0;
            for(int j = i; j< A.length; j++) {
                if(A[j] == 1) {
                    count ++;
                } else {
                    break;
                }
            }
            if(count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }

    // Efficient Approach
    int maximumOnesOpt(int[] A) {
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i< A.length; i++) {
            if(A[i] == 0) {
                count  = 0;
            } else {
                count++;
                maxCount = Math.max(count, maxCount);
            }
        }
         return maxCount;
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
       MaximumConsecutiveOnes maxOnes = new MaximumConsecutiveOnes();
       int result =  maxOnes.maximumOnesOpt(A);
       System.out.println("Maximum Consecutives Ones are: " + result);
        scanner.close();
    }
}
