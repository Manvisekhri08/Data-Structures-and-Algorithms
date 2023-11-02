package Recursion;

import java.util.Scanner;

public class TaylorSeries {
    static double power = 1;
    static double factorial = 1;

    double series(int x, int n) {
        double result;
        if (n == 0) {
            return 1;
        } else {
            result = series(x, n - 1);
            power = power * x;
            factorial = factorial * n;
            return result + power / factorial;
        }
    }

    public static void main(String[] args) {
        Scanner myObj1 = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter number");
        Integer userNumber1 = myObj1.nextInt();
        Integer userNumber2 = myObj2.nextInt();
        TaylorSeries rec = new TaylorSeries();
        System.out.println(rec.series(userNumber1, userNumber2));
        myObj1.close();
        myObj2.close();
    }
}
