package ArraysRepresentation;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();
        int[][] twoDArray = new int[rows][columns];
        System.out.println("Enter values for the 2D array elements:");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                twoDArray[i][j] = scanner.nextInt();
            }
        }
        System.out.println("2D Array elements:");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
