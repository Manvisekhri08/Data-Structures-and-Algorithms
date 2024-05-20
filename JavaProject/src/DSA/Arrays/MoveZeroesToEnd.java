package DSA.Arrays;

import java.util.*;

public class MoveZeroesToEnd {
    public void zeroesEnd(int arr[]) {
        /**
         * BRUTE
         * we will iterate over array and pick all non zero elements and store them in
         * temp
         * after iteration we will have our non zero numbers
         * take the elements of temp and start putting in array and the remaining
         * positions will be 0's
         * TC ;- O(2N)
         * SC:- O(N) -> using extra list
         */
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }
        for (int i = temp.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
        /**
         * Optimal
         * 2 pointer approach
         * we will find the first zero and point j to it and right next to j we point
         * our i
         * we start from i and check if its non zero if it is then we swap i and j
         * after swap we both move i and j
         * Step 1 is finding the 1st zero element
         * Step 2 is pointing i right next to j
         */
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                j++;
            }
        }
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
        MoveZeroesToEnd move = new MoveZeroesToEnd();
        move.zeroesEnd(arr);
        System.out.println("new array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
