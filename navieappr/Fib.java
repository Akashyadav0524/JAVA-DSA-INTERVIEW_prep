package navieappr;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            double fibonacciNumber = calculateFibonacci(i);
            System.out.printf("F(%d) = %.0f%n", i, fibonacciNumber);
        }

        scanner.close();
    }

    public static double calculateFibonacci(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;

        return (Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5);
    }
}
