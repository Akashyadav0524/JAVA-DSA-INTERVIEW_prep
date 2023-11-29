package accenture;

import java.util.Scanner;

public class SubDivEqual {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer N: ");
        int N = scanner.nextInt();

        // Output
        int result = minOperationsToOne(N);
        System.out.println("The minimum number of operations to make " + N + " equal to 1 is: " + result);
    }

    public static int minOperationsToOne(int N) {
        int count = 0;

        while (N > 1) {
            // Find the smallest factor of N
            int factor = 2;
            while (factor <= N && N % factor != 0) {
                factor++;
            }

            // Perform the operation: divide by factor or subtract by 1
            if (factor <= N) {
                N /= factor;
            } else {
                N -= 1;
            }

            count++;
        }

        return count;
    }
}