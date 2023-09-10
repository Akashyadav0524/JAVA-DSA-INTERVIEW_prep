package serch.binary;

public class binarySerch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 8, 34, 56, 78, 100 };
        int target = 56;
        int ans = Bserch(arr, target);
        System.out.println(ans);
    }

    private static int Bserch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            // mid= (start+end)/2; this may exceed the range of INt so , wehave a better
            // way;
             int mid = start + (end - start) / 2;

    

             if(target < arr[mid]){
                end = mid -1;
             } else if( target > arr[mid]){
                start =mid+1;
             }
             else{
                return mid;
             }
        }

        return -1  ;
    }
}
