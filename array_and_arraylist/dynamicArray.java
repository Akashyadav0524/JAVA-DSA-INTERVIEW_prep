package array_and_arraylist;

import java.util.Arrays;

public class dynamicArray {
    public static void main(String[] args) {
        int row;
        int[][] arr ={
            {1,2,3,4},
            {5,6},
            {7,8,9}
        };

        for(row =0; row < arr.length; row++)
        {
            // for(int col = 0; col<arr[row].length;col++ ){
            //     System.out.println(arr[row][col] + " ");
            // }
            // System.out.println();
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
