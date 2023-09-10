package recursion;

import java.util.ArrayList;

//return a list but dont take in it argument 
public class ReturnList_with_no_Agug {
    public static void main(String[] args) {
        int[]  arr ={1,2,3,4,5,6,7,8,9};
        int target = 5;
        int index = 0;

        System.out.println(find(arr,target,index));
    }

    private static ArrayList<Integer> find(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

         if(index== arr.length-1){
            return list;
         }
         //this will contains answer for that function call only;
         if(arr[index]== target){
            list.add(index);
         }
        ArrayList<Integer> ansFromBellow = find(arr, target, index+1);
        list.addAll(ansFromBellow);
        return list;
    }
}
