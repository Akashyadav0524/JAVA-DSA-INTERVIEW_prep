package wipro_questions;
public class pin_PrimeOdd {
    public static int findPin(int input1, int input2, int input3, int input4) {
        int pin = 0;

        // Calculate the sum of even/odd positioned digits for input1, input2, and input3
        int evenSum = 0;
        int oddSum = 0;

        // Get the individual digits of input1, input2, and input3
        int[] digits1 = getDigits(input1);
        int[] digits2 = getDigits(input2);
        int[] digits3 = getDigits(input3);

        // Calculate the sum of even/odd positioned digits
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) { // Even positioned digit
                evenSum += digits1[i] + digits2[i] + digits3[i];
            } else { // Odd positioned digit
                oddSum += digits1[i] + digits2[i] + digits3[i];
            }
        }

        // Determine the PIN based on the value of input4
        if (input4 % 2 == 0) { // Even input4
            pin = evenSum - oddSum;
        } else { // Odd input4
            pin = oddSum - evenSum;
        }

        return pin;
    }

    // Helper method to get individual digits of a number
    private static int[] getDigits(int number) {
        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        // Example usage
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        int input4 = 38;

        int pin = findPin(input1, input2, input3, input4);
        System.out.println("PIN: " + pin);
    }
}
