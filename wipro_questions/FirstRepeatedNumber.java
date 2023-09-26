

public class FirstRepeatedNumber {
    public static int findFirstRepeatedNumber(int[] arr, int size) {
        boolean[] seen = new boolean[100000]; // Assuming the range of numbers is up to 99999

        for (int i = 0; i < size; i++) {
            int num = arr[i];
            // Ignore negative numbers and zeros
            if (num <= 0) {
                continue;
            }
            // Check if the number is already seen
            if (seen[num]) {
                return num;
            }
            seen[num] = true;
        }

        // If all elements are negative or zeros, return 0
        if (isEmptyArray(seen)) {
            return 0;
        }

        // If no number is repeated, return the first element of the array
        return arr[0];
    }

    private static boolean isEmptyArray(boolean[] arr) {
        for (boolean value : arr) {
            if (value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 2, 8};
        int size = 6;

        int firstRepeatedNumber = findFirstRepeatedNumber(arr, size);
        System.out.println("First Repeated Number: " + firstRepeatedNumber);
    }
}
