package Recursion;

import java.util.Scanner;

public class TaylorSeriesUsingHornerRule {
    static double result = 1;

    // loop
    
    // double Iseries(int x , int n) {
    // double s = 1;
    // int i;
    // double num = 1;
    // double dem = 1;
    // for(i=1;i<=n;i++) {
    // num*=x;
    // den*=i;
    // s+=num/dem;
    // }
    // return s;
    // }

    // recursion

    double Rseries(int x, int n) {
        if (n == 0) {
            return result;
        } else {
            result = 1 + x * result / n;
            return Rseries(x, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner myObj1 = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter number");
        Integer userNumber1 = myObj1.nextInt();
        Integer userNumber2 = myObj2.nextInt();
        TaylorSeriesUsingHornerRule rec = new TaylorSeriesUsingHornerRule();
        System.out.println(rec.Rseries(userNumber1, userNumber2));
        myObj1.close();
        myObj2.close();
    }
}
