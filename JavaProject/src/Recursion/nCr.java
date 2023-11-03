package Recursion;

import java.util.Scanner;

public class nCr {
    // using formula
    int fact(int n) {
        if(n == 0) {
            return 1;
        } else {
            return fact(n-1)*n;
        }
    }
    int combination(int n , int r) {
        int t1 = fact(n);
        int t2 = fact(r);
        int t3 = fact(n-r);
        return t1/(t2*t3);
    }

    // using pascal triangle
    int cPascal(int n , int r) {
        if(r==n|| r == 0) {
            return 1;
        } else {
            return cPascal(n-1, r-1) + cPascal(n-1, r);
        }
    }
    public static void main(String[] args) {
        Scanner myObj1 = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter number");
        Integer userNumber1 = myObj1.nextInt();
        Integer userNumber2 = myObj2.nextInt();
        nCr rec = new nCr();
        System.out.println(rec.cPascal(userNumber1, userNumber2));
        myObj1.close();
        myObj2.close();
    }
}
