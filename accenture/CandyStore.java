package accenture;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class CandyStore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        in.nextLine();
        String[] candyPricesStr = in.nextLine().split(" ");
        ArrayList<Integer> candyPrices = new ArrayList<>();//How to take ArrayList input and How to iterarte overver it using for loop

        for (String price : candyPricesStr) {
            candyPrices.add(Integer.parseInt(price));
        }
        int ans = MaxofCandies(n,candyPrices);
        System.out.println(ans);
        in.close();

    }

    private static int MaxofCandies(int n, ArrayList<Integer> candyPrices) {
       Collections.sort(candyPrices);
       int budget = n;
       int count =0;
       for (int i = 0; i < candyPrices.size(); i++) {
           if(candyPrices.get(i)<=budget){
            count++;
            budget-=candyPrices.get(i);
           }
       }
       return count;
    }
}
