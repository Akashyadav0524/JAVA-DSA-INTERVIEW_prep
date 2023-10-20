package accenture;

import java.util.Arrays;
import java.util.Scanner;

public class SmallLargeSum {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int result = SmallLargeSum1(array);
        System.out.println("Output: " + result);
        scanner.close();
    }

    public static int SmallLargeSum1(int[] array) {
        if (array.length <= 3) {
            return 0;
        }

        if (array.length == 0) {
            return 0;
        }

        int evenCount = (array.length + 1) / 2;
        int oddCount = array.length / 2;
        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];

        // Separate even and odd position elements into two different arrays
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenArray[i / 2] = array[i];
            } else {
                oddArray[i / 2] = array[i];
            }
        }

        // Sort the arrays in descending order
        Arrays.sort(evenArray);
        Arrays.sort(oddArray);

        int secondLargestEven = evenArray[evenCount - 2];
        int secondLargestOdd = oddArray[oddCount - 2];

        return secondLargestEven + secondLargestOdd;
    }
}
