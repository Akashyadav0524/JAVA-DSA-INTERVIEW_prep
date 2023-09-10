package wipro_questions;
public class PrimeSumExceptLargest {
    public static int sumOfPrimesExceptLargest(int[] arr, int size) {
        int largestPrime = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            int num = arr[i];
            if (isPrime(num)) {
                sum += num;
                if (num > largestPrime) {
                    largestPrime = num;
                }
            }
        }

        if (largestPrime != Integer.MIN_VALUE) {
            sum -= largestPrime;
        } else {
            sum -= findLargestNumber(arr, size);
        }

        return sum;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int findLargestNumber(int[] arr, int size) {
        int largestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }

        return largestNumber;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 41, 18, 50, 43, 31, 29, 25, 59, 96, 67};
        int size1 = 11;

        int sum1 = sumOfPrimesExceptLargest(arr1, size1);
        System.out.println("Sum of Primes Except Largest (arr1): " + sum1);

        int[] arr2 = {10, 20, 30, 40};
        int size2 = 4;

        int sum2 = sumOfPrimesExceptLargest(arr2, size2);
        System.out.println("Sum of Primes Except Largest (arr2): " + sum2);
    }
}
