package accenture;

import java.util.Arrays;
import java.util.Scanner;

public class smallestArrmissing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]=new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int ans=findMissing(arr);
        System.out.println(ans);
        in.close();
    }

 
        private static int findMissing(int[] arr) {
            if (arr.length == 0) {
                return 1; // If the array is empty, the smallest missing positive integer is 1.
            }
    
            Arrays.sort(arr); // Sort the array in ascending order.
    
            int smallestMissing = 1; // Initialize the smallest missing positive integer to 1.
    
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= 0) {
                    continue; // Skip non-positive numbers.
                }
    
                // If the current element matches the expected smallestMissing, increment it.
                if (arr[i] == smallestMissing) {
                    smallestMissing++;
                } else {
                    // If the current element is greater than smallestMissing, we found the missing integer.
                    return smallestMissing;
                }
            }
    
            // If we have iterated through the entire array, all positive integers from 1 to n are present.
            // In this case, the smallest missing positive integer is n + 1.
            return smallestMissing;
        }
}
