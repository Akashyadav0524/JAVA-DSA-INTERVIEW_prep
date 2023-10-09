package accenture;

import java.util.Arrays;
import java.util.Scanner;

public class FrequentElementArray {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = in.nextInt();
        }

        countmax(arr);
        sortingApp(arr);
        in.close();

    }

    private static void sortingApp(int[] arr) {
        Arrays.sort(arr);
        int maxCount=1;
        int currentMAx=1;
        int res=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1]){
                currentMAx++;
            }else{
                currentMAx=1;
            }
            if(currentMAx>maxCount){
                
                maxCount=currentMAx;
                res=arr[i-1];
            }
        }
        System.out.println("most Fre elemt is "+res);

    }

    private static void countmax(int[] arr) {
        if(arr.length<=0){
            System.out.println(0);
        }
    
        int maxCount=0;
        int elment_having_maxFreq=Integer.MIN_VALUE;
       elment_having_maxFreq=0;
        for (int i = 0; i < arr.length; i++) {
                int count=0;
            for (int j = 0; j <arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>=maxCount){
                maxCount = count;
                elment_having_maxFreq = arr[i];
            }
        }
        System.out.println(" ");
        System.out.println(elment_having_maxFreq);
    }
}
