
public class KeyFinder {
    public static int findKey(int input1, int input2, int input3) {
        int largestSum = 0;
        int smallestSum = 0;

        // Find the sum of largest and smallest digits for each number
        largestSum += findLargestDigit(input1);
        largestSum += findLargestDigit(input2);
        largestSum += findLargestDigit(input3);

        smallestSum += findSmallestDigit(input1);
        smallestSum += findSmallestDigit(input2);
        smallestSum += findSmallestDigit(input3);

        // Calculate and return the Key
        return largestSum - smallestSum;
    }

    private static int findLargestDigit(int number) {
        int largestDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            number /= 10;
        }
        return largestDigit;
    }

    private static int findSmallestDigit(int number) {
        int smallestDigit = 9;
        while (number > 0) {
            int digit = number % 10;
            if (digit < smallestDigit) {
                smallestDigit = digit;
            }
            number /= 10;
        }
        return smallestDigit;
    }

    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;

        int key = findKey(input1, input2, input3);
        System.out.println("Key: " + key);
    }
}
