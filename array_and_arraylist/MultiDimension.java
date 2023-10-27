package array_and_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println(arr.length);

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }
        }

        for (int row = 0; row < arr.length; row++) {

            // for(int col =0; col < arr[row].length; col++){
            // System.out.println(arr[row][col] +" " );

            // }

            System.out.println(Arrays.toString(arr[row]));
        }

        System.out.println("After Sorting");
        for (int row = 0; row < arr.length; row++) {
            Arrays.sort(arr[row]);

            // for(int col =0; col < arr[row].length; col++){
            // System.out.println(arr[row][col] +" " );

            // }

            System.out.println(Arrays.toString(arr[row]));
        }
        

        in.close();
    }
}
