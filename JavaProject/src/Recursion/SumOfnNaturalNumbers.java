package Recursion;

import java.util.Scanner;

public class SumOfnNaturalNumbers {

    // USING RECURSION
    // int Rsum(int n) {
    //     if(n == 0) {
    //         return 0;
    //     } else {
    //         return sum(n-1)+n;
    //     }
    // }

    // USING LOOP
    // int Isum(int n) {
    //     int i, s =0;
    //     for(i=1 ; i<=n ; i++) {
    //         s=s+i;
    //     }
    //     return s;
    // }

    //USING FORMULA
    int Fsum(int n) {
        return (n*(n+1))/2;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter number");
        Integer userNumber = myObj.nextInt();
        SumOfnNaturalNumbers rec = new SumOfnNaturalNumbers();
        System.out.println(rec.Fsum(userNumber));
        myObj.close();
    }
}
