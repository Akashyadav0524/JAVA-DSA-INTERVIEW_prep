package accenture;

import java.util.Arrays;
import java.util.Scanner;

public class MaxiumNoCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size=in.nextInt();
        System.out.println("enter array");
        int arr[] =new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("enter budget");
        int n= in.nextInt();
        int ans = countMaxium(arr,n);
        System.out.println(ans);
        in.close();
    }

    private static int countMaxium(int[] arr, int n) {
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
        int count=0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<n){
                count++;
                n=n-arr[i];
            }
        }
        return count;
    }
}
