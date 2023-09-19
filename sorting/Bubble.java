 package sorting;
//Bubble sort also known as syncing sort or exchange sort or inpalce sorting algo
//Stable Sorting algo oredr is same
// Time complexity
// -best-->O(n) if array is alredy sorted whn j never swaps 
// -worst-->O(n^2) if descending oredr sorted array at every step swaps needed  n-1 swaps
//   0 1 2 3 4 5
// { 3 1 5 4 7 9 } 
// Bubble sort we compare adjacent elemet 0-1,1-2,2-3 like that if found larger then first elemet we swap at end we have largest element
// 1st pass- largest element at end
// Now run for another time - 2nd largest elemt will be at n-2 position ... so on untli last comparison

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int arr[] ={2,5,67,3,45,9,7};
        bublysort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    private static void bublysort(int[] arr) {
        boolean swapped =false;//if alredy sorted then no need to comapre
        //run the steps n-1
        for (int i = 0; i < arr.length-1; i++) {
          //for each steps , max item will come at last repective index  
            for (int j = 1; j < arr.length-i; j++) {
                //swap if he item is smaller than previous item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

}
