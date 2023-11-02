import java.util.*;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        a= in.nextInt();
        b= in.nextInt();
        

        // int result = ComputeHCF(a,b);
        // System.out.println(result);
        in.close();
        int result2 =recursionHCF(a,b);
        System.out.println("HCF of no's is "+result2);
        int lcmResult = Lcm(a,b);
        System.out.println("LCM of no is "+lcmResult);
    }

    private static int Lcm(int a, int b) {
         int ans=a*b/recursionHCF(a, b);
        return ans;
    }

    private static int recursionHCF(int a, int b) {

        if(a==0){
            return b;
        }

        return recursionHCF(b%a, a);
      
        
    }

    // public static int ComputeHCF(int a, int b){
        
    //     int l;
    //     if(a>b){
    //         l=a;
    //     }else{
    //         l=b;
    //     }
    //     int max=0;
    //     //  = Integer.MAX_VALUE;
    //     for (int i = 1; i < l; i++) {
    //         if(a%i==0 && b%i==0){
    //             max=i;
    //         }
    //     }
    //     return max;
    // }
}
