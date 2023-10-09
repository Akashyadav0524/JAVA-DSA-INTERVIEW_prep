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
