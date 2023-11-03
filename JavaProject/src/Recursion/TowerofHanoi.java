package Recursion;

import java.util.Scanner;

public class TowerofHanoi {
    void TOH(int n, int A, int B, int C) {
        if(n > 0) {
            TOH(n-1, A, B, C);
           System.out.println("from " + A + " to " + C);
            TOH(n-1,B,A,C);
        }
    }
    public static void main(String[] args) {
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter the number of disks:");
        int userNumber1 = myObj1.nextInt();
        TowerofHanoi rec = new TowerofHanoi();
        rec.TOH(userNumber1, 1, 2, 3);
        myObj1.close();
    }
}
