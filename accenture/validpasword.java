// 12. Perform the function Checkpassword (char str[], int n)
// Execute the function which happens to be 1 if the str is a valid password or it remains 0.

// Conditions for a valid password: 

// The password should have at least 4 characters.
// It should have at least 1 digit.
// It should have one capital letter.
// It should not have any spaces or obliques (/).
// The first character should not be a number.
 
// Assumption
// The input is not empty.

// Example

// Input:
// aA1_67

// Output:
// 1

package accenture;
import java .util.*;
public class validpasword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        str= in.nextLine();
        int check = isValidPassword(str);
        System.out.println(check);
        in.close();
    }

    public static int isValidPassword(String password) {
        // Check if the password length is at least 4 characters
        if (password.length() < 4) {
            return 0;
        }
    
        // Check if the first character is not a number
        if (Character.isDigit(password.charAt(0))) {
            return 0;
        }
    
        // Initialize variables to keep track of conditions
        boolean hasDigit = false;
        boolean hasCapitalLetter = false;
    
        // Iterate through the characters of the password
        for (char c : password.toCharArray()) {
            // Check if the character is a space or oblique
            if (c == ' ' || c == '/') {
                return 0;
            }
    
            // Check if the character is a digit
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
    
            // Check if the character is an uppercase letter
            if (Character.isUpperCase(c)) {
                hasCapitalLetter = true;
            }
        }
    
        // Check if all conditions are met
        if (hasDigit && hasCapitalLetter) {
            return 1;
        } else {
            return 0;
        }
    }
    
  
    
  
         
           
}
