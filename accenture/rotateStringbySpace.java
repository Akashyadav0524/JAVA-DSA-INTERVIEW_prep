package accenture;

import java.util.Scanner;

//rotating string one step means each word of the string is shifted by one position left and the leftmost word will go to the right most position you are given a string STR and Integer k you are required to rotate the string STR as mentioned above by k steps and print rotated String
public class rotateStringbySpace 
  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int strLength = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String str = scanner.nextLine();
        int k = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Check for special cases
        if (str.isEmpty()) {
            System.out.println("NULL");
            return;
        }
        if (k == 0) {
            System.out.println(str);
            return;
        }

        // Split the input string into words
        String[] words = str.split(" ");

        // Rotate the words
        String rotatedStr = rotateWords(words, k);

        // Print the rotated string
        System.out.println(rotatedStr);
    }

    public static String rotateWords(String[] words, int k) {
        int n = words.length;
        String[] rotatedWords = new String[n];
        for (int i = 0; i < n; i++) {
            int newPosition = (i - k + n) % n; // Calculate the new position after rotation
            rotatedWords[newPosition] = words[i];
        }
        return String.join(" ", rotatedWords);
    }
}
