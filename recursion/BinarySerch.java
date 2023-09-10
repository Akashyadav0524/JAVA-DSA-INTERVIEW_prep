package recursion;

public class BinarySerch {
       public static void main(String[] args) {
        int[]  arr ={2,3,4,5,6,7,9,34,5};
        int target =6;
        int start=0;
        int end=arr.length-1;
        System.out.println(Bserch(arr, target, start, end));
       }

       static int Bserch(int[] arr, int target, int start, int end){
            if(start>end){
                return -1;
            }

            int middle = start  +(end-start)/2;

            if(arr[middle]== target){
                return middle;
            }

            if(target <arr[middle]){
               return Bserch(arr, target, start, middle-1);
            }

        
               return Bserch(arr, target, middle+1, end);
            
        }
}
