

import java.util.ArrayList;
public class find_t_value {


    public static void main(String[] args) {
        int input1 = 1;
        int input2 = 2;
        int input3 = 1;
        int result = find_tvalue(input1, input2, input3);
        System.out.println(result);
    }

    public static int find_tvalue(int input1, int input2, int input3) {
        ArrayList<Integer> primes = generatePrimes(input1 + input2 + input3);
        int t;

        if (isPrime(input2)) {
            if (input2 % 2 == 0) {
                t = input1 * input1 * sumOfFirstNPrimes(primes, input2);
            } else {
                t = input2 * input2 * sumOfFirstNPrimes(primes, input3);
            }
        } else {
            if (input2 % 2 == 0) {
                t = input3 * input3 * sumOfFirstNPrimes(primes, input2 + input3);
            } else {
                t = sumOfFirstNPrimes(primes, input1 + input2 + input3);
            }
        }

        if (isPrime(t)) {
            return t + input3;
        } else {
            return t - input3;
        }
    }

    public static ArrayList<Integer> generatePrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        int num = 3;

        while (primes.size() < n) {
            boolean isPrime = true;
            int sqrt = (int) Math.sqrt(num);

            for (int prime : primes) {
                if (prime > sqrt) {
                    break;
                }

                if (num % prime == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(num);
            }

            num += 2; // Skipping even numbers
        }

        return primes;
    }

    public static int sumOfFirstNPrimes(ArrayList<Integer> primes, int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += primes.get(i);
        }

        return sum;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}


