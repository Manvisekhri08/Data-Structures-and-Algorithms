package Recursion;

import java.util.Scanner;

public class CosineSeries {
    double c = 1;
    double cos(int x , int n) {
        if (n == 1) {
            return c * x;
        } else {
            c = 1 - c*((x*x)/((2*n-1)*(2*n)));
            return c*cos(x, n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner myObj1 = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter number");
        Integer userNumber1 = myObj1.nextInt();
        Integer userNumber2 = myObj2.nextInt();
        CosineSeries rec = new CosineSeries();
        System.out.println(rec.cos(userNumber1, userNumber2));
        myObj1.close();
        myObj2.close();
    }
}
