//The function takes two integrals m and n as arguments. You are required to obtain the total of all integers ranging between 1 to n (both inclusive) which are not divisible by m. You must also return the distinction between the sum of integers not divisible by m with the sum of integers divisible by m
package accenture;

import java.util.Scanner;

public class diffoftwono {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m,n;
        m= in.nextInt();
        n= in.nextInt();
        
      int result =isdivisible(m,n);
     System.out.println(result);
 
        in.close();
    }

    private static int isdivisible(int m, int n) {
        int sum1=0;
        int sum2=0;
        for (int i = 1; i <=n; i++) {
            if(i%m == 0){
              sum1 = sum1+i;  
            }
            else{
                sum2=i+sum2;
            }
        }
        return sum2-sum1;
        
    }
}
