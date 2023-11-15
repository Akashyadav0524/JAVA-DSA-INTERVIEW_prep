package accenture;

import java.util.*;

public class ClassTopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array separated by space: ");
        String input = sc.nextLine();
        String[] strArr = input.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int ans = RemoveToppers(arr);
        System.out.println(ans);

    }

    private static int RemoveToppers(int[] arr) {

        int count = 0;
        HashSet<Integer> e = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (e.contains(arr[i])) {
                count++;
            }
            e.add(arr[i]);
        }
        return count;

    }
}
