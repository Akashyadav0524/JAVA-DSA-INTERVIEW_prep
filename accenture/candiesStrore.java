package accenture;

import java.util.Arrays;
import java.util.Scanner;

public class candiesStrore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strArr = str.split(" ");
        int arr[] = new int[strArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int budget = in.nextInt();
        int ans = MaximumCnadies(arr,budget);
        System.out.println(ans);
        in.close();
    }

    public static int MaximumCnadies(int[] arr , int budget){
        if(arr.length==0 || budget == 0){
            return 0;
        }
        Arrays.sort(arr);
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=budget){
                count++;
                budget=budget-arr[i];
            }
        }
        return count;
    }
}
