package accenture;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Print the Butterfly Pattern
        printButterflyPattern(rows);

        scanner.close();
    }

    private static void printButterflyPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Print spaces
            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // Print right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line
        }
    }
}
