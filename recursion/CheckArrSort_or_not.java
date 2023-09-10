package recursion;

public class CheckArrSort_or_not {
    public static void main(String[] args) {
        int arr[] ={1,2,3,6,5,6,7}; 
        int s=0;;
        System.out.println(sorted(arr,s)); 
    }

    private static boolean sorted(int[] arr, int s) {
      if(s== arr.length-1)
      {
        return true;
      }

      return arr[s] < arr[s+1] && sorted(arr, s+1);
    }
}
