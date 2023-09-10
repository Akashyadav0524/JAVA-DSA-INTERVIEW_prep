package wipro_questions;

import java.util.HashMap;
import java.util.Map;

public class PasswordGeneratoree {

    public static void main(String[] args) {
        int[] input1 = {12, 2, 36, 10, 217, 36, 5, 36, 15, 10};
        int input2 = 10;

        String password = generatePassword(input1, input2);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int[] input1, int input2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : input1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int leastFrequency = Integer.MAX_VALUE;
        int secondHighestFrequency = Integer.MIN_VALUE;
        int highestFrequency = Integer.MIN_VALUE;
        int leastNum = Integer.MAX_VALUE;
        int secondHighestNum = Integer.MIN_VALUE;
        int highestNum = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            if (frequency < leastFrequency || (frequency == leastFrequency && num < leastNum)) {
                leastFrequency = frequency;
                leastNum = num;
            }

            if (frequency > secondHighestFrequency && frequency < highestFrequency) {
                secondHighestFrequency = frequency;
                secondHighestNum = num;
            }

            if (frequency >= highestFrequency) {
                highestFrequency = frequency;
                highestNum = num;
            }
        }

        return leastNum + "" + secondHighestNum + "" + highestNum;
    }
}
