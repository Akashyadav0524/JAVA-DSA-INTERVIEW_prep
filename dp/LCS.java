package dp;

public class LCS {
    public static void main(String[] args) {
        String a="ABCDEFHDGK";
        String b="ABCK";
        int[][] dp = new int[a + 1][n + 1];
    for(int i=0;i<m + 1;i++){
        
      for(int j=0;j<n + 1;j++){
        dp[i][j] = -1;
      }
    }
        System.out.println(lcsMemo(a, b));

    }

    public static int lcs(String S1, String S2,int a,int b,int dp[][]){
         
        if(a==S1.length()){
            return 0;
        }
        if(b==S2.length()){
            return 0;
        }
        if(dp[a][b]!=-1){
            return dp[a][b];
        }

        int ans=0;
        if(S1.charAt(a)==S2.charAt(b)){
            dp[a][b]=1+lcs(S1, S2, a-1, b-1,dp);
        }
        else
        {
             dp[a][b]= Math.max(lcs(S1, S2, a+1, b,dp),lcs(S1, S2, a, b+1,dp));
        }

        return dp[a][b]= ans;

    }

    public static int lcsMemo(String S1, String S2){
       int dp[][]=new int[S1.length()][S2.length()-1];
        return lcs(S1, S2, 0, 0,dp);
         
    }
}
