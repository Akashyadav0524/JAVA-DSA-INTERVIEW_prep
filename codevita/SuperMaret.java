package codevita;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SuperMaret {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        int noOFcust = in.nextInt();
        int numBags = in.nextInt();

    
        int[][] custmr = new int[noOFcust][2];
        for (int i = 0; i < noOFcust; i++) {
            custmr[i][0] = in.nextInt(); 
            custmr[i][1] = in.nextInt(); 
        }

       
        int[][] RicBag = new int[numBags][2];
        for (int i = 0; i < numBags; i++) {
            RicBag[i][0] = in.nextInt(); 
            RicBag[i][1] = in.nextInt(); 
        }

       
        int maxBagsSold = getMaxBagsSold(custmr, RicBag);

    
        System.out.println(maxBagsSold);
        in.close();
    }

    private static int getMaxBagsSold(int[][] customers, int[][] riceBags) {
    
        return (int) IntStream.range(0, customers.length)
                .filter(customer -> IntStream.range(0, riceBags.length)
                        .anyMatch(bag -> riceBags[bag][1] <= customers[customer][1] && riceBags[bag][0] > customers[customer][0]))
                .count();
    }
}
