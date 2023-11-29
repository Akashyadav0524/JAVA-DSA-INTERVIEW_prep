package accenture;

import java.util.Arrays;
import java.util.Scanner;

public class SumofSquares {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int[] dp = new int[n+1];
       Arrays.fill(dp, -1);
       System.out.println(MinSquare(n,dp));
       in.close();
    }

    private static int MinSquare(int n,int[] dp) {
       if(n==0){
        return 0;
       }
       
       if(dp[n] !=-1){
        return dp[n];
       }

       int res= Integer.MAX_VALUE;

       for (int i = 1; i <=Math.sqrt(n); i++) {
             res=Math.min(res,MinSquare(n-i*i,dp)+1);
       }
       return dp[n]=res;
    }
}
