package wipro_questions;
public class pin_MAXMIN {
    public static int findPin(int input1, int input2, int input3, int input4) {
        int maxDigitInput1 = findMaxDigit(input1);  // Find the maximum digit in input1
        int minDigitInput1 = findMinDigit(input1);  // Find the minimum digit in input1
        int maxDigitInput2 = findMaxDigit(input2);  // Find the maximum digit in input2
        int minDigitInput2 = findMinDigit(input2);  // Find the minimum digit in input2
        int maxDigitInput3 = findMaxDigit(input3);  // Find the maximum digit in input3
        int minDigitInput3 = findMinDigit(input3);  // Find the minimum digit in input3

        int pin = ((maxDigitInput1 * minDigitInput1) * (maxDigitInput2 * minDigitInput2) * (maxDigitInput3 * minDigitInput3)) - input4;
        return pin;
    }

    private static int findMaxDigit(int number) {
        int maxDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number /= 10;
        }
        return maxDigit;
    }

    private static int findMinDigit(int number) {
        int minDigit = 9;
        while (number > 0) {
            int digit = number % 10;
            if (digit < minDigit) {
                minDigit = digit;
            }
            number /= 10;
        }
        return minDigit;
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
