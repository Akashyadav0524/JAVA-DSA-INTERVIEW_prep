
public class pin_Small_LARGE {
    

    public static int FindPIN(int input1, int input2, int input3, int input4) {
        int smallestDigit = findSmallestDigit(input1);
        int largestDigit = findLargestDigit(input2);
        int largestDigit2 = findLargestDigit(input3);

        int PIN = (smallestDigit * largestDigit * largestDigit2) + input4;
        return PIN;
    }

    private static int findSmallestDigit(int number) {
        int smallest = 9;

        while (number > 0) {
            int digit = number % 10;
            smallest = Math.min(smallest, digit);
            number /= 10;
        }

        return smallest;
    }

    private static int findLargestDigit(int number) {
        int largest = 0;

        while (number > 0) {
            int digit = number % 10;
            largest = Math.max(largest, digit);
            number /= 10;
        }

        return largest;
    }

    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        int input4 = 38;

        int pin = FindPIN(input1, input2, input3, input4);
        System.out.println("PIN: " + pin);
    }
}
