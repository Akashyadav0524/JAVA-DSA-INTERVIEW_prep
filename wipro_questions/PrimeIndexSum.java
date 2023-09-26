
public class PrimeIndexSum {
    public static int sumOfPrimeIndexValues(int[] arr, int size) {
        int sum = 0;

        for (int i = 2; i < size; i++) {
            if (isPrime(i)) {
                sum += arr[i];
            }
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

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int size1 = 10;

        int sum1 = sumOfPrimeIndexValues(arr1, size1);
        System.out.println("Sum of Prime Index Values (arr1): " + sum1);

        int[] arr2 = {-1, -2, -3, 3, 4, -7};
        int size2 = 6;

        int sum2 = sumOfPrimeIndexValues(arr2, size2);
        System.out.println("Sum of Prime Index Values (arr2): " + sum2);

        int[] arr3 = {-4, 5};
        int size3 = 2;

        int sum3 = sumOfPrimeIndexValues(arr3, size3);
        System.out.println("Sum of Prime Index Values (arr3): " + sum3);
    }
}
