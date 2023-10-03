//This function accepts the integers sum and arr. It is used to find the arr(j) and arr(k), where k ! = j. arr(j) and arr(k) should be the smallest elements in the array.

// Keep this in mind:

// If n<2 or empty, return –1.
// If these pairs are not found, then return to zero.
// Make sure all the values are within the integer range.
 
// Example

// Input:
// Sum: 9
// Arr: 5 4 2 3 9 1 7

// Output:
// 2

// Explanation

// From the array of integers, we have to select the two smallest numbers, i.e 2 and 1. Sum of these two (2 + 1) = 3. This is less than 9 (3 < 9). The product of these two is 2 (2 x 1 = 2) Hence the output is integer 2.

// Sample input:
// Sum: 4
// Arr: 9 8 –7 3 9 3

// Sample output:
// –21
 

package accenture;

import java.util.Scanner;

public class DetectNbased {
 public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    int n , num;
    n=in.nextInt();
    num=in.nextInt();
    System.out.println(ChatsDectoNbase(n,num));
    in.close();

 }

private static String ChatsDectoNbase(int n, int num) {
    if(n<2 || n> 36){
        return "invalid";
    }

    if(num == 0){
        return "0";
    }

    String symbol ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String result ="";
    System.out.println(symbol.charAt(16));

    while(num>0){
        int rem = num%n;
        result = symbol.charAt(rem)+result;
        num =num/n;
    }
    return result;
}   
}
