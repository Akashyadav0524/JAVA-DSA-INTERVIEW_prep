package accenture;

import java.util.Arrays;
import java.util.Scanner;

public class smallestArrmissing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]=new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int ans=findMissing(arr);
        System.out.println(ans);
        in.close();
    }

    private static int findMissing(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
             if(i>0) {
                int a=1;
                if(i!=a){
                    return a;
                }
                a++;
            }
        }
        return -1;
    }
}
