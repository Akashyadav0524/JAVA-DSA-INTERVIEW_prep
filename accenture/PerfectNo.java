package accenture;
//A number said to be perfect when its sum of is divisior is equal to number itself excluding the number writ a function to check a no is perfect or not

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n;
        n= in.nextInt();
        int result= checkPerfect(n);
        System.out.println(result);
        in.close();
    }
    
    public static int checkPerfect(int n){
        if(n==0){
            return 0;

        }
        int sum=0;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            return 1;
        }

        return sum;
        
    }
}
