
// Rashid dislikes being idle. Because of this, he creates games anytime he gets bored. He came up with a game and decided to play it one dreary winter evening.
// Given is a list of n numbers in sequence a. The player has multiple step options. He can select an element from the sequence (let's call it ak) and delete it in a single step, at which point all elements equal to ak + 1 and ak- 1 must likewise be eliminated from the series. The player receives ak points after that action Being a perfectionist, Rashid made the decision to score as many points as he could Aid him.
// Input:
// 3
// 1 2 3
// Output:
// 4
package accenture;

import java.util.Scanner;

public class Dp_max_min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of elements in the list
        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            int current = sequence[i];
            int points = 0;

            // Check if current - 1 is in the sequence
            for (int j = 0; j < n; j++) {
                if (sequence[j] == current - 1) {
                    points += sequence[j];
                }
            }

            // Check if current + 1 is in the sequence
            for (int j = 0; j < n; j++) {
                if (sequence[j] == current + 1) {
                    points += sequence[j];
                }
            }

            // Update the maximum points for this element
            dp[i] = points;
        }

        int maxPoints = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] > maxPoints) {
                maxPoints = dp[i];
            }
        }

        System.out.println(maxPoints);
        scanner.close();

    }
}
