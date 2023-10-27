package accenture;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique2DMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[4][4];
        for(int row=0; row<arr.length;row++){
            for(int col =0; col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }

        boolean ans =checkUnique(arr);
        if(ans==true){
            System.out.println("isUnique");
        }else{
            System.out.println("NotUnique");
        }
        in.close();
    }

    private static boolean checkUnique(int[][] arr) {
        int n = arr.length;
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        for (int i = 0; i < n; i++) {
            row.clear();
            col.clear();

            for (int j = 0; j < arr.length; j++) {
                row.add(arr[i][j]);
                col.add(arr[j][i]);
            }

            if(row.size() != n || col.size()!=n){
                return false;
            }
        }
        return true;
    }
}
