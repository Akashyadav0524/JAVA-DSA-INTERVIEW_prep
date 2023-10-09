package accenture;

import java.util.Scanner;

public class NoofCards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n= in.nextInt();
        int result = countCardAp(n);
        System.out.println(result);
        in.close();
    }

    public static int countCardAp(int n){
        int ans= n*(3*n+1)/2;
        return ans%100007;
    }
}

// Given a number N, the task is to find the number of cards needed to make a House of Cards of N levels.

//             /\
//            /\/\
// If we observe carefully, then a series will be formed as shown below in which i-th item denotes the number of triangular cards needed to make a pyramid of i levels: 
            
// The above series is a method of difference series where differences are in AP as 5, 8, 11, 14……. and so on. 
 
// Therefore nth term of the series will be: 
 
// nth term = 2 + {5 + 8 + 11 +14 +.....(n-1) terms}
//          = 2 + (n-1)*(2*5+(n-1-1)*3)/2
//          = 2 + (n-1)*(10+(n-2)*3)/2
//          = 2 + (n-1)*(10+3n-6)/2
//          = 2 + (n-1)*(3n+4)/2
//          = n*(3*n+1)/2;

//          Formula===[n*(3*n+1)/2]