//The function takes an integral arr which is of the size or length of its arguments. Return the sum of the second smallest element at odd position ‘arr’ and the second largest element at the even position.


package accenture;


import java.util.Scanner;

public class array_evnOddDif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

      
        int[] arr = new int[size];

      
        for (int i = 1; i < size-1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int result = difOddEven(arr);
        System.out.println("Output: " + result);

        scanner.close();
       
    }

    public static int difOddEven(int arr[]){
        if (arr.length < 4) {
            return 0; // Return 0 for arrays with less than 4 elements or odd-sized arrays
        }
    
        int secondSmallestOdd = Integer.MAX_VALUE;
        int secondLargestEven = Integer.MIN_VALUE;
    
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) { // Odd position
                if (arr[i] < secondSmallestOdd) {
                    secondSmallestOdd = arr[i];
                }
            } else { // Even position
                if (arr[i] > secondLargestEven) {
                    secondLargestEven = arr[i];
                }
            }
        }
    
        if (secondSmallestOdd == Integer.MAX_VALUE || secondLargestEven == Integer.MIN_VALUE) {
            return 0; // If second smallest odd or second largest even is not found, return 0
        }
    
        return secondSmallestOdd + secondLargestEven;
    }
}
