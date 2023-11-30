package accenture;

import java.util.Scanner;

public class perfectString {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: length of the string N
        int N = scanner.nextInt();

        // Input: binary string S
        String S = scanner.next();

        // Perform operations and get the result
        int operations = getOperations(S);
        int operations2 = getOperations2(S);

        // Output: Print the minimum number of operations
        System.out.println(operations);
        System.out.println(operations2);

        scanner.close();
    }

    private static int getOperations2(String s) {
    int count=0;
    for (int i = 0; i < s.length(); i++) {

        if(s.charAt(i)=='1'){
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(j)=='0'){
                    count++;
                    s = s.substring(0, j) + s.substring(j + 1);
                    break;
                }
            }
        }
    }
    return count;
}

    private static int getOperations(String S) {
        int countOnes = 0;
        int countZerosAfterFirstOne = 0;
        boolean firstOneEncountered = false;

        // Count the number of '1's and '0's
        for (char ch : S.toCharArray()) {
            if (ch == '1') {
                countOnes++;
                firstOneEncountered = true;
            } else if (firstOneEncountered) {
                // Count '0's after the first '1'
                countZerosAfterFirstOne++;
            }
        }

        // Return the count of '0's after the first '1'
        return countZerosAfterFirstOne;
    }
}