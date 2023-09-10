package wipro_questions;
public class pin_Largest {
    public static int findPin(int input1, int input2, int input3, int input4) {
        int largestDigitInput1 = findLargestDigit(input1);  // Find the largest digit in input1
        int largestDigitInput2 = findLargestDigit(input2);  // Find the largest digit in input2
        int largestDigitInput3 = findLargestDigit(input3);  // Find the largest digit in input3

        int pin = (largestDigitInput1 * largestDigitInput2 * largestDigitInput3) + input4;
        return pin;
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

    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        int input4 = 38;

        int pin = findPin(input1, input2, input3, input4);
        System.out.println("PIN: " + pin);
    }
}
