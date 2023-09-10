package recursion;

public class LinearSerch {

    public static void main(String[] args) {
        
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int target =12;
    
        int start=0;
        System.out.println(isLiner(arr,target,start));
        System.out.println("at index no -"+isLinerReturn(arr, target, start));
    }

    private static boolean isLiner(int[] arr, int target, int start) {
        if(start== arr.length-1){
            return false;
        }

        return arr[start] == target || isLiner(arr, target, start+1);
    }


 private static int isLinerReturn(int[] arr, int target, int start) {
        if(start== arr.length-1){
            return -1;
        }
        if(arr[start] == target){
                return start;
        }else{
             return isLinerReturn(arr, target, start+1);
        }
    }
}
