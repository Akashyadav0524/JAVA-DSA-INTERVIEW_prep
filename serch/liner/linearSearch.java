package serch.liner;

public class linearSearch {
   
        public static void main(String[] args) {
            int [] nums= {23,45,6,3,45,6};
            int target =6;
            int ans= serch(nums,target);
            System.out.println("Element found at index-"+ans);
            
    }

        public static int serch(int[] arr, int target) {
            if(arr.length == 0){
                return -1;
            }
            for(int i =0; i<arr.length;i++){
                if(arr[i]==target){
                    return i;
                }
            }
            return -1;
            
        }
}
    
