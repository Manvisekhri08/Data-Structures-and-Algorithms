package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    public  List<Integer> printSpiral(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int n = mat.length; // no. of rows
        int m = mat[0].length; // no. of cols
        int left = 0, top=0;
        int right = m-1;
        int bottom = n-1;
        while(left <= right && top <= bottom) {
            //left to right
            for(int i = left ; i <= right;i++) {
                ans.add(mat[top][i]);
            }
            top++;
            // top to bottom
            for(int i = top ; i <= bottom;i++) {
                ans.add(mat[i][right]);
            }
            right--;
            // right to left
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }
            // bottom to top
            if(left <= right) {
                for(int i = bottom; i>= top;i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read matrix dimensions
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = scanner.nextInt();

        // Initialize the matrix
        int[][] mat = new int[n][m];

        // Read matrix elements
        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        // Create an instance of SpiralMatrix and call printSpiral
        SpiralMatrix sm = new SpiralMatrix();
        List<Integer> spiralOrder = sm.printSpiral(mat);

        // Print the spiral order
        System.out.println("Spiral order of the matrix:");
        for (int num : spiralOrder) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
