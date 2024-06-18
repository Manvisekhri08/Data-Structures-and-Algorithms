package DSA.Arrays;

import java.util.*;

public class LeadersInArray {
    ArrayList<Integer> leader(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = arr.length-1; i>=0;i--) {
            if(arr[i] > max) {
                ans.add(arr[i]);
            }
            max = Math.max(max,arr[i]);
        }
        Collections.reverse(ans);
        return ans;
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
        LeadersInArray leader = new LeadersInArray();
        ArrayList<Integer> result = leader.leader(arr);
        System.out.println("Leaders in  Array are : " + result);
        scanner.close();
    }
}
