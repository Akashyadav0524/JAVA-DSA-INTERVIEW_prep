package serch.liner;
public class minNo {
    public static void main(String[] args) {
        int[] arr ={2,3,4,3,7,9,-4,5,6};
        System.out.println(min(arr));


    }
    public static int min (int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    
}
}
