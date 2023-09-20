package sorting;
// Selction sort is sorting algorithm which select Largest/Smallest  element in list and placed it in correct order 
// and so on and so forth
//Worst-Best-Avg -- O(n^2)
//Stable
//Perfome Well on Small List

import java.util.Arrays;

public class selecton {
    public static void main(String[] args) {
        int arr[] ={2,5,46,4,7,4,6};
        selectonSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectonSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find max elemt and swap with correct indx
            int last = arr.length-i-1;
            int max = getMax(arr,0,last);
            swap(arr, max, last);
        }
    }

    static void swap(int arr[], int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMax(int[] arr, int start, int end) {
        int max=start;
         for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max =i;
            }
         }

        return max;
    }

    
}
