package serch.liner;
import java.util.*;
public class SerchIn2Darray {
    public static void main(String[] args) {
        int[][] arr ={
            {23,4,7},
            {20,6,45},
            {12,4,23}
        };
int target= 45;
        int[] ans = serch(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] serch(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
