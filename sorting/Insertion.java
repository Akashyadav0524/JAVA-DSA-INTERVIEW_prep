package sorting;
// Insertion sort is like sorting the array partially
// Adaptive no of swap reduce
// Stable 
// Works good when array  is partially sorted
// used in Hybrid sorting Algo
// example-
//  5 3 4 1 2
// [_]sort till indx 0
// [__]..1
// [3 4 5]..2....
// put the index element at the correct index of LHS
// when elemet J is not smaller then i then breakup the loop beacuse further allredy sorted
// i = N-2 , beacuse if i n-1 then j will indx out of bound 
// worst case--(n^2) --  decs sorted
// Best case--(n) --  allredy sorted

import java.util.Arrays;


public class Insertion {
      public static void main(String[] args) {
        int arr[] ={2,5,67,3,45,9,7};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    private static void insertionsort(int[] arr) {
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                   
                }else{
                    break;
                }
            }
        }
    }
}
