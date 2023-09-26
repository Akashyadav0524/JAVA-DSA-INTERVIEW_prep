

public class PrimeSumCalculator {

   

    public static void main(String[] args) {
        int[] input1 = {1, 2, 4, 1, 2, 8};
        int input2 = 6;

        int result = findFirstRepeatedElement(input1, input2);
        System.out.println("First repeated element from the tail: " + result);
    }

    public static int findFirstRepeatedElement(int[] array, int size) {
        boolean[] seen = new boolean[1001]; // Assuming values are between 0 and 1000
        int firstRepeated = 0;

        for (int i = size - 1; i >= 0; i--) {
            if (array[i] > 0 && !seen[array[i]]) {
                seen[array[i]] = true;
            } else if (array[i] > 0 && seen[array[i]]) {
                firstRepeated = array[i];
                break; // Stop searching after finding the first repeated element
            }
        }

        return firstRepeated;
    }
    }
    

