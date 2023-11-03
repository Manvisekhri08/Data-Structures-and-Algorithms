package Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    // recursion

    int fibR(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibR(n - 2) + fibR(n - 1);
        }
    }

    // loop

    int fibI(int n) {
        int t0 = 0, t1 = 1, sum = 0, i;
        if (n <= 1) {
            return n;
        }
        for (i = 2; i <= n; i++) {
            sum = t0 + t1;
            t0 = t1;
            t1 = sum;
        }
        return sum;
    }

    //memoisation
    int[] F;

    // Constructor to initialize the array
    public FibonacciSeries() {
        F = new int[11]; // Initialize the array size
        for (int i = 0; i < F.length; i++) {
            F[i] = -1; // Initialize all elements to -1
        }
    }

    int fibM(int n) {
        if (n <= 1) {
            F[n] = n;
            return n;
        } else {
            if(F[n-2] == -1) {
                F[n-2] = fibM(n-2);
            }
            if(F[n-1] == -1) {
                F[n-1] = fibM(n-1);
            }
            return F[n-2]+F[n-1];
        }
    }

    public static void main(String[] args) {
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter number");
        Integer userNumber1 = myObj1.nextInt();
        FibonacciSeries rec = new FibonacciSeries();
        // System.out.println(rec.fibR(userNumber1));
        //System.out.println(rec.fibI(userNumber1));
        System.out.println(rec.fibM(userNumber1));
        myObj1.close();
    }
}
