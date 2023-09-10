package array_and_arraylist;
import java.util.Arrays;

public class meth_in_arr {
    public static void main(String[] args) {
        int[] nums={3,7,6,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
    arr[0]=99;    //  -->array in java are mutable(can be changed) string cant
    }
}
