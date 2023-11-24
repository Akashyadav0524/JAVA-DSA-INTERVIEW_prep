package codevita;


import java.util.Scanner;

public class StringFromRank {
    static String getStringFromRank(int rank, int length) {
        // Helper function to calculate factorial
        // Helper function to get character at a specific index

        StringBuilder result = new StringBuilder();
        rank--; // Rank ko 0-based index mein adjust karo

        for (int i = length - 1; i >= 0; i--) {
            long totalPermutations = calculateFactorial(i);
            int index = (int) (rank / totalPermutations);
            char character = getCharacterAtIndex(index);

            result.append(character);

            rank %= totalPermutations;
        }

        return result.toString();
    }

    // Factorial nikalne ka helper function (iterative approach)
    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Index par character nikalne ka helper function
    static char getCharacterAtIndex(int index) {
        String aksharMala = "abcdefghijklmnopqrstuvwxyz";
        return aksharMala.charAt(index);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input padhne ka
        int rank = scanner.nextInt();
        int length = scanner.nextInt();

        // Output
        System.out.println(getStringFromRank(rank, length));
        scanner.close();
    }
}


