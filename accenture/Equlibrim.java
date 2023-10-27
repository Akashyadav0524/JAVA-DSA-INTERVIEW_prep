//you are given an array of integers and equilibrium index of this array is index such that the sum of element that lower indexes is equal to the sum of element at Higher indexes your task is to write a function to find the equilibrium index of the given array

package accenture;

import java.util.Scanner;

public class Equlibrim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int ans = CountEqulibium(arr);
        System.out.println(ans);
        in.close();
    }


    private static int CountEqulibium(int[] arr) {
        if(arr.length==0){
            return -1;
        }
        int sum=0;
        
        int leftSum=0;
       
        for (int i = 0; i < arr.length; ++i) {
           sum+=arr[i];
        }

        for (int i = 0; i < arr.length; ++i) {
           sum-=arr[i];
           if(leftSum==sum)
            return i;
           
           leftSum+=arr[i];
                
        }
        return -1;
       
 }
}
