//This function accepts the integers sum and arr. It is used to find the arr(j) and arr(k), where k ! = j. arr(j) and arr(k) should be the smallest elements in the array.
// Input
// Sum: 9
// Arr: 5 4 2 3 9 1 7

// Output:
// 2

// Explanation

// From the array of integers, we have to select the two smallest numbers, i.e 2 and 1. Sum of these two (2 + 1) = 3. This is less than 9 (3 < 9). The product of these two is 2 (2 x 1 = 2) Hence the output is integer 2.

package accenture;

import java.util.Arrays;
import java.util.Scanner;

public class ProductSmllPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] arr = new int[n];
        int sum;
        sum=in.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int result = prdctPairSum(arr,sum);
        System.out.println(result);
        in.close();
    }

    public static int prdctPairSum(int arr[] , int sum){
      
        if(arr.length<2){
            return -1;
        }

        Arrays.sort(arr);
        
            int smallest1=arr[0];
            int smallest2=arr[1];

            if (smallest1 != smallest2) {
                return smallest1 * smallest2;
            } else {
                return 0;
            }
            
    }
}
