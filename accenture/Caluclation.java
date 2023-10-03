package accenture;

import java.util.Scanner;

public class Caluclation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m,n;
        m= in.nextInt();
        n= in.nextInt();

        int ans = calculate(m,n);
        System.out.println(ans);
        in.close();
         
    }

    public static int calculate(int m, int n){
        if(m<0 || n<0){
            return -1;
        }

        int sum=0;

        for (int i = m; i <=n; i++) {
            if(i%3==0 && i%5==0){
                sum = sum+i;
            }
            
        }
        return sum;
    }
}
