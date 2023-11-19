package accenture;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter the elements of the array separated by space: ");
        String input = sc.nextLine();
        String[] strArr = input.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println("Array elements are: " + Arrays.toString(arr));
        sc.close();
    }
}
