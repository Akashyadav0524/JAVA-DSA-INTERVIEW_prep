package accenture;
// You a given a number n your task is to calculate Perfecct Sum  int the range N-1
// A number is called perfcet sum it can be expressed as sum of perfect square and the perfect cube 
// For n=9 , 2^3+1^2=9

import java.util.Scanner;

// input 
// n=5

// outpu
// 2

// 1^2+1^3=2;
// 1^3+2^2=5

public class PerfectSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int ans = CalCulatePS(N);
        int ans2 = calculatePS(N);
        System.out.println(ans);
        System.out.println(ans2);
        in.close();
    }
    public static int CalCulatePS(int n){
        if(n==0){
            return 0;
        }
        int count=0;
       ;
        for (int i = 1; i*i <= n; i++) {
             int square=i*i;
            for (int j = 1; j*j*j <=n ; j++) {
               int cube =j*j*j;
               int sum = square+cube;
   
               if(sum<=n){
                   count++;
               }
            }
        }
        return count;
    }

    // Function to calculate the number of perfect sums for a given N
    public static int calculatePS(int n) {
        int count = 0;

        // Find the maximum square root and cube root values within N
        int maxSquare = (int) Math.sqrt(n);
        int maxCube = (int) Math.cbrt(n);

        int square = 1;

        // Loop through squares and cubes to find perfect sums
        while (square <= maxSquare) {
            int cube = 1;

            while (cube <= maxCube) {
                // Calculate the sum of squares and cubes
                int sum = square * square + cube * cube * cube;

                // If the sum is less than or equal to N, increment the count
                if (sum <= n) {
                    count++;
                }

                cube++;
            }

            square++;
        }

        return count;
    }
}
