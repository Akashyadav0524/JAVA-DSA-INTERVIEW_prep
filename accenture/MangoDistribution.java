package accenture;

import java.math.BigInteger;
import java.util.Scanner;

public class MangoDistribution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt(); // Number of mangoes
        int P = in.nextInt(); // Number of persons
        BigInteger ans = NoWaysDist(M, P); // Call the function to calculate the number of ways
        System.out.println(ans);
        in.close();
    }

    // Function to calculate the number of ways to distribute mangoes among persons
    private static BigInteger NoWaysDist(int m, int p) {
        BigInteger result = binomialCoefficient(m, p);
        return result;
    }

    // Function to calculate the factorial of a number
    private static BigInteger factorial(int num) {
        if (num == 0 || num == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(num).multiply(factorial(num - 1));
        }
    }

    // Function to calculate the binomial coefficient
    private static BigInteger binomialCoefficient(int m, int p) {
        BigInteger numerator = factorial(m + p - 1);
        BigInteger denominator = factorial(m).multiply(factorial(p - 1));

        return numerator.divide(denominator);
    }
}

 private static BigInteger binomialCoefficient(int m, int p) {
    BigInteger n = factorial(m+p-1);
    BigInteger d = factorial(m).multiply(factorial(p-1));
    return n.divide(d);
 }

 private static BigInteger factorial(int num){
    if(n==0 || n==1){
        return BigInteger.ONE;
    }
    else{
        return BigInteger.value(num).multiply(factorial(num-1));
    }
 }