import java.util.*;

public class hcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        a= in.nextInt();
        b= in.nextInt();
        System.out.println(a%b);

        int result = ComputeHCF(a,b);
        System.out.println(result);
        in.close();
        int result2 =recursionHCF(a,b);
        System.out.println(result2);
    }

    private static int recursionHCF(int a, int b) {

        if(a==0){
            return b;
        }

        return recursionHCF(b%a, a);
        
    }

    public static int ComputeHCF(int a, int b){
        
        int l;
        if(a>b){
            l=a;
        }else{
            l=b;
        }
        int max=0;
        //  = Integer.MAX_VALUE;
        for (int i = 1; i < l; i++) {
            if(a%i==0 && b%i==0){
                max=i;
            }
        }
        return max;
    }
}
