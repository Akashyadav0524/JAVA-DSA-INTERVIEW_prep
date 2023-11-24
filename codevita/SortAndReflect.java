package codevita;

import java.util.Scanner;

public class SortAndReflect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         // input  A and B
         String[] arrayA = in.nextLine().split(" ");
         String[] arrayB = in.nextLine().split(" ");
         int n = Integer.parseInt(in.nextLine());
 
         // Perform selection sort 
         selectionSortAndReflect(arrayA, arrayB, n);
 
         // print the  array B
         for (String i : arrayB) {
             System.out.print(i + " ");
         }
         in.close();
    }

    private static void selectionSortAndReflect(String[] arrayA, String[] arrayB, int n) {
        for (int i = 0; i < n; i++) {
            // find the minnimum element in the unsorted part of arr A
            int minIndx = i;
            for (int j = i + 1; j < arrayA.length; j++) {
                if (Integer.parseInt(arrayA[j]) < Integer.parseInt(arrayA[minIndx])) {
                    minIndx = j;
                }
            }

            // Swap the found minimum element with thefirst element of the unsorted part in array A
            String tempA = arrayA[minIndx];
            arrayA[minIndx] = arrayA[i];
            arrayA[i] = tempA;

            // copy the swap in array B
            String tempB = arrayB[minIndx];
            arrayB[minIndx] = arrayB[i];
            arrayB[i] = tempB;
        }
    }
}

