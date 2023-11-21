package accenture;

import java.util.Scanner;

public class SumOfCircularPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        int ans = CheckCircularPrime(N,M);
        System.out.println(ans);
        in.close();
    }
    public static int CheckCircularPrime(int minRange , int maxRange){
        int sum =0;
        for (int i = minRange; i <= maxRange; i++) {
            if(isPrime(i)==true){

                int rev = reverse(i);
                if(isPrime(rev)==true){
                    sum+=i;
                }

             }
        }
        return sum;
    }
    private static int reverse(int num) {
        int reversedNumber = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return reversedNumber;
    }
    private static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }

        int c=2;
        while(c*c <=n){ //for square root both side muttiply ,jabtak number is less than sqrt of number
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
      
}
