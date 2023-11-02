package Recursion;

import java.util.Scanner;

public class SineSeries {
    double s = 1;
    double sine(int x , int n) {
        if (n == 1) {
            return s * x;
        } else {
            s = 1 - s*((x*x)/((2*n-1)*(2*n-2)));
            return sine(x, n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner myObj1 = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter number");
        Integer userNumber1 = myObj1.nextInt();
        Integer userNumber2 = myObj2.nextInt();
        SineSeries rec = new SineSeries();
        System.out.println(rec.sine(userNumber1, userNumber2));
        myObj1.close();
        myObj2.close();
    }
    
}
