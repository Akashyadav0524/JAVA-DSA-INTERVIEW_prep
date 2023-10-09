package accenture;

import java.util.Scanner;

public class Adam {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int result = countCharity(n);
        System.out.println(result);
    }

    private static int countCharity(int n) {
        
        // int flag=0;
        // while(n!=0){
        //     int ans = n*n;
        //     flag+=ans;
        //     n--;
        //     countCharity(n);
           
        // }
        // return flag;
        return n * (n + 1) * (2 * n + 1) / 6;

    }
}
