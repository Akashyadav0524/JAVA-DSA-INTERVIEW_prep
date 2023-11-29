package accenture;
import java.util.Scanner;

public class SpecialString {

    public static void main(String[] args) {
        // Scanner ka use input lene ke liye
        Scanner scanner = new Scanner(System.in);

        // Kitne test cases hain, yeh input le raha hai
        System.out.print("Enter the number of test cases (T): ");
        int T = scanner.nextInt();

        // Special strings ko count karne ke liye ek variable
        int specialStringsCount = 0;

        // Har test case ke liye loop chalayenge
        for (int i = 0; i < T; i++) {
            // Har test case mein string input le raha hai
            System.out.print("Enter string for test case " + (i + 1) + ": ");
            String s = scanner.next();

            // isSpecialString function ko use karke check karega ki yeh string special hai ya nahi
            if (isSpecialString(s)) {
                // Agar special hai to count badhaye
                specialStringsCount++;
            }
        }

        // Final count ko print karega
        System.out.println("Number of special strings: " + specialStringsCount);

        // Scanner ko band karega
        scanner.close();
    }

    // Function jo check karega ki string special hai ya nahi
    private static boolean isSpecialString(String s) {
        // 'a' aur 'b' ke count ke liye variables
        int countA = 0;
        int countB = 0;

        // Har character ke liye loop
        for (char c : s.toCharArray()) {
            // 'a' ko count karega
            if (c == 'a') {
                countA++;
            } 
            // 'b' ko count karega
            else if (c == 'b') {
                countB++;
            }
        }

        // Dono counts greater than zero hone chahiye aur equal bhi hone chahiye
        return countA > 0 && countB > 0 && countA == countB;
    }
}
