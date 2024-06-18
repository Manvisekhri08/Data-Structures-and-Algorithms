package DSA.Arrays;

import java.util.Scanner;

public class BestTimeBuySell {
    int buySell(int arr[]) {
        int profit = 0;
        int min = arr[0];
        for(int i = 0 ; i<arr.length;i++) {
            int cost = arr[i] - min;
            profit = Math.max(profit,cost);
            min = Math.min(min,arr[i]);
        }
        return profit;
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        BestTimeBuySell profit = new BestTimeBuySell();
        int result = profit.buySell(arr);
        System.out.println("The maximum profit is  : " + result);
        scanner.close();
    }
}
