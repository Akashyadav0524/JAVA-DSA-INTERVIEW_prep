package accenture;

import java.util.Scanner;

public class NthPrimeno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N =in.nextInt();
        int ans = PrimeIndex(N);
        System.out.println(ans);
        in.close();
    }

    private static int PrimeIndex(int n) {
        int[] prime = new int[n];
        int num =2;
        int index=0;
          while(index<n){
            if(isPrime(num)){
                prime[index] = num;
                index+=1;
            }
            num+=1;
          }
          return prime[n-1];
    }

    static boolean isPrime(int n){
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
