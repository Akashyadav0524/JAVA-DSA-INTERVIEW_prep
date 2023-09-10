package recursion;

public class reverseDigit {
    public static void main(String[] args) {
        int n =121;
        int ans = rev(n);
        System.out.println(ans);
        rev2(n);
        System.out.println(sum);
        System.out.println(Palindrom(n));

    }
     static int sum =0;

    static int rev(int n){
        
        int digits = (int)(Math.log10(n)) +1;
        return helper(n,digits);
        
    }

    
    private static int helper(int n, int digits) {
       if(n%10 == n){
        return n;
       }

       int rem = n%10;
       return rem*(int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);
    }

    static boolean Palindrom(int n){
        return n == rev(n);
    }


    static void rev2(int n){
        if(n == 0){
            return ;
        }

        int rem = n%10;
        sum = sum * 10 +rem;
        rev2(n/10);
    }
}
