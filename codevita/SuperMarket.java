package codevita;

import java.util.Arrays;
import java.util.Scanner;

public class SuperMarket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of customers and rice bags
        int numCustomers = scanner.nextInt();
        int numBags = scanner.nextInt();

        // Read customer preferences
        Customer[] customers = new Customer[numCustomers];
        for (int i = 0; i < numCustomers; i++) {
            int quantity = scanner.nextInt();
            int cost = scanner.nextInt();
            customers[i] = new Customer(quantity, cost);
        }

        // Read details of each rice bag
        RiceBag[] riceBags = new RiceBag[numBags];
        for (int i = 0; i < numBags; i++) {
            int quantity = scanner.nextInt();
            int cost = scanner.nextInt();
            riceBags[i] = new RiceBag(quantity, cost);
        }

        // Sort customers and rice bags based on cost and quantity
        Arrays.sort(customers);
        Arrays.sort(riceBags);

        // Calculate the maximum number of bags that can be sold
        int maxBagsSold = getMaxBagsSold(customers, riceBags);

        // Print the result
        System.out.println(maxBagsSold);
    }

    private static int getMaxBagsSold(Customer[] customers, RiceBag[] riceBags) {
        int maxBagsSold = 0;
        boolean[] bagUsed = new boolean[riceBags.length];

        for (Customer customer : customers) {
            for (int i = 0; i < riceBags.length; i++) {
                if (!bagUsed[i] && riceBags[i].cost <= customer.cost && riceBags[i].quantity >= customer.quantity) {
                    maxBagsSold++;
                    bagUsed[i] = true;
                    break;
                }
            }
        }

        return maxBagsSold;
    }

    static class Customer implements Comparable<Customer> {
        int quantity;
        int cost;

        Customer(int quantity, int cost) {
            this.quantity = quantity;
            this.cost = cost;
        }

        @Override
        public int compareTo(Customer other) {
            return Integer.compare(other.cost, this.cost); // Sort in descending order of cost
        }
    }

    static class RiceBag implements Comparable<RiceBag> {
        int quantity;
        int cost;

        RiceBag(int quantity, int cost) {
            this.quantity = quantity;
            this.cost = cost;
        }

        @Override
        public int compareTo(RiceBag other) {
            return Integer.compare(other.quantity, this.quantity); // Sort in descending order of quantity
        }
    }
}
