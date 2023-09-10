package wipro_questions;



public class GeneratePIN {
    public static void main(String[] args) {
        int input1 = 1274;
        int input2 = 5283;
        int input3 = 1937;

        int pin = createPIN(input1, input2, input3);
        System.out.println("PIN: " + pin);
    }

    public static int createPIN(int input1, int input2, int input3) {
        int arr[] = { input1, input2, input3 };
        int max = 0, min;
        double sum = 0.0;
        double place = 0.1;
        int num;
        for (int i = 0; i < 3; i++) {
            num = arr[i];
            while (num != 0) {
                int r = num % 10;
                if (r > max)
                    max = r;
                num = num / 10;
            }
        }
        for (int i = 0; i < 3; i++) {
            min = 9;
            for (int j = 0; j < 3; j++) {
                int rem = arr[j] % 10;
                if (rem < min)
                    min = rem;
                arr[j] /= 10;
            }
            sum = (min + (sum * place));
            place *= 10;
        }
        return (int) (max * 1000 + sum);
    }

    public static int large(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        if (b > a && b > c)
            return b;
        else
            return c;
    }

    public static int small(int a, int b, int c) {
        if (a < b && a < c)
            return a;
        if (b < a && b < c)
            return b;
        else
            return c;
    }

    public static int largest(int n) {
        int c = -1;

        while (n > 0) {
            int d = n % 10;
            if (d > c) {
                c = d;
            }
            n = n / 10;
        }
        return c;
    }

    public static int smallest(int n) {
        int c = 10;

        while (n > 0) {
            int d = n % 10;
            if (d < c) {
                c = d;
            }
            n = n / 10;
        }
        return c;
    }

    public static char findMostOccurringChar(String str) {
        int[] frequency = new int[256]; // Assuming ASCII characters

        // Count the frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        char mostOccurringChar = 0; // Initialize with the null character (ASCII value 0)
        int maxFrequency = 0;

        // Find the most occurring character with the largest frequency
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostOccurringChar = (char) i;
            } else if (frequency[i] == maxFrequency && i > mostOccurringChar) {
                // If two characters have the same frequency, pick the larger one
                mostOccurringChar = (char) i;
            }
        }

        return mostOccurringChar;
    }

    public static char findLeastOccurringChar(String str) {
        int[] frequency = new int[256]; // Assuming ASCII characters

        // Count the frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        char leastOccurringChar = 0; // Initialize with the null character (ASCII value 0)
        int minFrequency = Integer.MAX_VALUE;

        // Find the least occurring character with the smallest frequency
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0 && frequency[i] < minFrequency) {
                minFrequency = frequency[i];
                leastOccurringChar = (char) i;
            } else if (frequency[i] == minFrequency && i < leastOccurringChar) {
                // If two characters have the same frequency, pick the smaller one
                leastOccurringChar = (char) i;
            }
        }

        return leastOccurringChar;
    }
}

	