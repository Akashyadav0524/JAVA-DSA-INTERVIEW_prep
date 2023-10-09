package accenture;

import java.util.Arrays;
import java.util.Scanner;

public class greatest_Kth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,k;
        System.out.print("enter the size of array  - ");
        n=in.nextInt();
        
        int arr[] = new int[n];
        System.out.println("enter elemet in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.print("enter the value of k  - ");
        k=in.nextInt();
        int result = findGreatest(arr,k);
        System.out.println(result);
        in.close();
    }

    public static int findGreatest(int arr[],int k){
        Arrays.sort(arr);
        return arr[arr.length-(k+1)];
    }
}
// 18. Create web access management to the kth largest number. It will accept an integer k and an array arr as its conditions and has to return the greatest element based on the value of k. That is, if k = 0, return the greatest element. If k = 1, return the second greatest element, and so
// Example

// Suppose the array contains values like {74, 85, 102, 99, 101, 56, 84} and the integer k is 2. The method will return 99, the third greatest element, as there are only two (according to the value of k) values greater than 99 (101 and 102).