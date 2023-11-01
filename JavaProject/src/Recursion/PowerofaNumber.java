package Recursion;

import java.util.Scanner;

public class PowerofaNumber {
    // recursion O(n)
    // int power(int m, int n) {
    //     if(n == 0) {
    //         return 1;
    //     }
    //     else {
    //         return power(m, n-1)*m;
    //     }
    // }
    
    // optimised and faster 
    int powerO(int m, int n) {
        if(n == 0) {
            return 1;
        }
        else if(n%2==0) {
            return powerO(m*m, n/2);
        }
        else {
            return m*powerO(m*m, (n-1)/2);
        }
    }
    public static void main(String[] args) {
        Scanner myObj1 = new Scanner(System.in); 
         Scanner myObj2 = new Scanner(System.in);  
        System.out.println("Enter number");
        Integer userNumber1 = myObj1.nextInt();
        Integer userNumber2 = myObj2.nextInt();
        PowerofaNumber rec = new PowerofaNumber();
        System.out.println(rec.powerO(userNumber1, userNumber2));
        myObj1.close();
        myObj2.close();
    }
}
