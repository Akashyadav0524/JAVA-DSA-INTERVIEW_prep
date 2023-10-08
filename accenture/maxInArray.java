package accenture;

import java.util.Scanner;

public class maxInArray {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <=arr.length-1; i++) {
            arr[i] = in.nextInt();
        }
        findmax(arr);
    }

    public static void findmax(int[] arr){
         int pos=0;
         int max = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
         
          if(arr[i]>max){
            max = arr[i];
            pos=i;
          }
          
        }
        
        System.out.println(max);
        System.out.println(pos);
    }
    
}
