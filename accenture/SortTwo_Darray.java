package accenture;
//Approach: Following are the steps:

// 1.Sort each row of the matrix.
// 2.Get transpose of the matrix.
// 3.Again sort each row of the matrix.
// 4.Again get transpose of the matrix.
import java.util.Arrays;
import java.util.Scanner;

public class SortTwo_Darray {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int arr[][] = new int[3][3];

       for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in .nextInt();
            }
       }
       System.out.println("before sorting\n");
       printMat(arr);
       sortMattrix(arr);
       System.out.println("After sorting\n");
       printMat(arr);
       in.close();
    }

    

    public static void sortMattrix(int[][] arr){
        
      
       RowSort(arr);
       transpose(arr);
       RowSort(arr);
       transpose(arr);
       
    }

    private static void printMat(int[][] arr) {
        System.out.println("@-D Array before Sorting");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }

    private static void RowSort(int[][] arr) {
       for (int row = 0; row < arr.length; row++){
            Arrays.sort(arr[row]);
       }

    }

    private static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}