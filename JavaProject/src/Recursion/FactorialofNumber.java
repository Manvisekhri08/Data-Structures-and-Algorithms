package Recursion;

import java.util.Scanner;

public class FactorialofNumber {
    int factorial(int n) {
        if(n ==0 ) {
            return 1;
        }
        else {
            return factorial(n-1)*n;
        }
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter number");
        Integer userNumber = myObj.nextInt();
        FactorialofNumber rec = new FactorialofNumber();
        System.out.println(rec.factorial(userNumber));
        myObj.close();
    }
}
