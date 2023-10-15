package accenture;

import java.util.Arrays;
import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m,size;
        m=in.nextInt();
        System.out.print("Enter the size of the array: ");
        size = in.nextInt();

      
        int[] arr = new int[size];

    
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }
        int result=CountTriplet(m,size,arr);
        System.out.println(result);
        in.close();
    }

    private static int CountTriplet(int m, int n, int[] arr) {
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
        int count=0;
        for (int i = 0; i < n-2; i++) {
            int left=i+1;
            int right=n-1;
            while(left<right){
                int product=arr[i]*arr[left]*arr[right];
                if(product==m){
                    count++;
                    left++;
                    right--;
                }
                else if(product<m){
                    left++;
                }
                else{
                    right++;
                }
            }
        }
        return count;
    }
}
