package accenture;

import java.util.Scanner;



public class appendPalindrome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String pali;
        System.out.println("Enter String to check");
        pali = in.nextLine();

        StringBuilder str = new StringBuilder();
        str.append(pali);

        int result = countChartoPali(str);
        System.out.println(result);
        in.close();
    }

    public static int countChartoPali(StringBuilder str) {
        if (checkPalindrome(str.toString())) {
            return 0; // Already a palindrome, no characters needed to be appended.
        }

        int count = 0;
        while (!checkPalindrome(str.toString())) {
            str.deleteCharAt(0);
            count++;
        }

        return count;
    }

    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}