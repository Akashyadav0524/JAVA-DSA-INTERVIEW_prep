package accenture;

import java.util.Scanner;

public class AliceStairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        int ans=MinimumStrais(s);
        int ans2=MinimumStrais2(s);
        System.out.println(ans);
        System.out.println(ans2);
        in.close();
    }

    private static int MinimumStrais2(String s) {
        String[] str = s.split(" ");
        int N= Integer.parseInt(str[0]);
        int M= Integer.parseInt(str[1]);
        int R ;
        if(N%M==0){
            return N;
        }else{
          R = (N%M)+(N/M);
        }
        return R;
    }

    private static int MinimumStrais(String s) {
        String[] str = s.split(" ");
        int N= Integer.parseInt(str[0]);
        int M= Integer.parseInt(str[1]);
        
        int count=0;
        while (N!=0) {
            if(N>=M){
                N=N-M;
                count++;
            }else{
                N-=1;
                count++;
            }
        }
        return count;
    }
}
