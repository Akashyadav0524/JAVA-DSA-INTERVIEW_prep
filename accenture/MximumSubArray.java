package accenture;

import java.util.Scanner;

public class MximumSubArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size=in.nextInt();
       
        int arr[] =new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
       
        int ans = MaxSub(arr);
        System.out.println(ans);
        in.close();
    }

    private static int MaxSub(int[] arr) {
        int maxSum=arr[0];
        int currentSum=arr[0];
        for (int i = 0; i < arr.length; i++) {
            currentSum=Math.max(arr[i], arr[i]+currentSum);
            maxSum=Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
