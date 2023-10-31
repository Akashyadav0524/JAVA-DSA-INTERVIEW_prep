package accenture;

import java.util.Scanner;


public class MinimumNoOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int ans = CountOperation(n);
        System.out.println(ans);
        in.close();
    }

    private static int CountOperation(int n) {
        if(n==1){
            return 0;
        }
        if(n%2==0){
            return 1+CountOperation(n/2);
        }
        
           return 1+Math.min(CountOperation(n-1),CountOperation(n+1));
           
        
      
    }

 
}
