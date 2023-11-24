package accenture;

import java.math.BigInteger;
import java.util.Scanner;

public class MangoDistribution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M=in.nextInt();
        int P =in.nextInt();
        BigInteger ans = NoWaysDist(M,P);
        System.out.println(ans);
        in.close();

    }

    private static BigInteger NoWaysDist(int m, int p) {
        
        BigInteger result = binomialCoefficient(m, p);
        return result;
        
        
    }
    private static BigInteger factorial(int num) {
        if (num == 0 || num == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(num).multiply(factorial(num - 1));
        }
    }

    private static BigInteger binomialCoefficient(int n, int k) {
        BigInteger numerator = factorial(n + k - 1);
        BigInteger denominator = factorial(n).multiply(factorial(k - 1));
        
        return numerator.divide(denominator);
    }
}
