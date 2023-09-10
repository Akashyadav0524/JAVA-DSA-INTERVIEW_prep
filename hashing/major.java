package hashing;

public class major {
    public static void main(String[] args) {
        int nums[]={1,3,2,5,1,3,3,3,3,1,5,1};
        int Maxcount=0;
        int index=-1;

        for (int i = 0; i < nums.length-1; i++) {
            int count=0;
            for (int j = 0; j < nums.length-1; j++) {
                 if(nums[i]==nums[j]){
                    count ++;
                    
                 }
                if(count > Maxcount){
                    Maxcount =count;
                    index=i;
                }
            }
        }
        System.out.println(nums[index]);
    }
    
}
