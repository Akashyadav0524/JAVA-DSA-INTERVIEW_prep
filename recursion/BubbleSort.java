package recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        
        int arr[] ={2,5,3,4,8,1};
        bulbulasort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bulbulasort(int[]arr, int r, int c) {
            if(r==0){
                return;
            }
            if(c<r){
                if(arr[c] > arr[c+1]){
                    int temp =arr[c];
                    arr[c] = arr[c+1];
                    arr[c+1] = temp;
                }

                bulbulasort(arr, r, c+1);
            }else{
                bulbulasort(arr, r-1, 0);
            }

    }
}
