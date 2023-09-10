package recursion;

public class rotateBinarySerch {
    public static void main(String[] args) {
        int[]  arr ={5,6,7,8,9,1,2,3};
        int target =1;
        int start=0;
        int end=arr.length-1;
        System.out.println(RotateBserch(arr, target, start, end));
       }

    private static int RotateBserch(int[] arr, int target, int start, int end) {
       if(start>end){
        return -1;
       }

       int m = start+(end-start)/2;

       if(arr[m]==target){
        return m;
       }

       if(arr[start] <= arr[m]){

            if(target >= arr[start] && target <=arr[m]){
                RotateBserch(arr, target, start, m-1);
            }
            else{
                return RotateBserch(arr, target, m+1, end);
            }
       }

       if(target >= arr[m] && target <=arr[end]){
        return RotateBserch(arr, target, m+1, end);
       }
       return RotateBserch(arr, target, start, m-1);
       
    }
}
