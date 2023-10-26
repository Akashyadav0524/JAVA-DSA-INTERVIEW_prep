package accenture;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class countTheNoVotes {

    public static int findElectionWinner(int[] persons, int[] voters_age) {
        if (persons.length != voters_age.length) {
            throw new IllegalArgumentException("Arrays must be of the same size.");
        }

        Map<Integer, Integer> voteCount = new HashMap<>(); // Create a HashMap to store vote counts for each person.

        int maxVotes = 0; // Initialize the maximum vote count to 0.
        int winner = -1; // Initialize the winner to -1 (no winner found).

        for (int i = 0; i < persons.length; i++) {
            int person = persons[i];
            int age = voters_age[i];

            if (age >= 18) { // Check if the voter's age is 18 or older.
                // Increment the vote count for the corresponding person in the HashMap.
                voteCount.put(person, voteCount.getOrDefault(person, 0) + 1);

                int currentVotes = voteCount.get(person);

                if (currentVotes > maxVotes) {
                    maxVotes = currentVotes; // Update the maximum vote count.
                    winner = person; // Update the winner to the current person.
                }
            }
        }

        return winner; // Return the winner's person number.
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of voters");
        n = in.nextInt();
        int[] candi = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the candi " + i + " ");
            candi[i] = in.nextInt();
        }

        int[] age = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the age " + i + " ");
            age[i] = in.nextInt();
        }

        int ans = findElectionWinner(candi, age);
        System.out.println(ans);
        in.close();
    }
}
