package maths;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <=n;  i++) {
            System.out.println(i +  "" + isPrime(i));

        }
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

