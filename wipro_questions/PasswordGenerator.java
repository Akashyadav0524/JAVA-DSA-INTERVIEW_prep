package wipro_questions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PasswordGenerator {
    public static int generatePassword(int input1, int input2, int input3, int input4, int input5) {
        List<Integer> stableNumbers = new ArrayList<>();
        List<Integer> unstableNumbers = new ArrayList<>();

        // Check stability for each input number
        checkStability(input1, stableNumbers, unstableNumbers);
        checkStability(input2, stableNumbers, unstableNumbers);
        checkStability(input3, stableNumbers, unstableNumbers);
        checkStability(input4, stableNumbers, unstableNumbers);
        checkStability(input5, stableNumbers, unstableNumbers);

        // Find the maximum of stable numbers
        int maxStableNumber = Collections.max(stableNumbers);

        // Find the minimum of unstable numbers
        int minUnstableNumber = Collections.min(unstableNumbers);

        // Calculate and return the password
        return maxStableNumber + minUnstableNumber;
    }

    private static void checkStability(int number, List<Integer> stableNumbers, List<Integer> unstableNumbers) {
        // Count the frequency of each digit in the number
        int[] digitFrequency = new int[10];
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            digitFrequency[digit]++;
            temp /= 10;
        }

        // Check if the number is stable or unstable
        boolean isStable = true;
        for (int i = 0; i < 10; i++) {
            if (digitFrequency[i] > 0 && digitFrequency[i] != digitFrequency[number % 10]) {
                isStable = false;
                break;
            }
        }

        // Add the number to the respective list
        if (isStable) {
            stableNumbers.add(number);
        } else {
            unstableNumbers.add(number);
        }
    }

    public static void main(String[] args) {
        int input1 = 12;
        int input2 = 1313;
        int input3 = 122;
        int input4 = 678;
        int input5 = 898;

        int password = generatePassword(input1, input2, input3, input4, input5);
        System.out.println("Password: " + password);
    }
}
