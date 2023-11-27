package accenture;

import java.util.Scanner;

public class LCMHCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a ,b;
        a=in.nextInt();
        b=in.nextInt();
        System.out.println(Hcf(a,b));
        System.out.println(lcm(a,b));
        in.close();
    }

    private static int lcm(int a, int b) {
        
        int ans = a*b/Hcf(a,b);
        return ans;
    }

    private static int Hcf(int a, int b) {
        if(a==0){
            return b;
        }
        return Hcf(b%a, a);
    }
}
