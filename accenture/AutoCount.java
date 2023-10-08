package accenture;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AutoCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str;
        str = in.nextLine();
        int result =checkAutobiographica(str);
        System.out.println(result);
        in.close();
    }

    public static int checkAutobiographica(String s){
       Set<Integer> set = new HashSet<>();// Use a set to store distinct digits.
       int count=0;// Initialize a count variable to keep track of occurrences.
       for (int i = 0; i < s.length(); i++)
        {

            for (int j = 0; j < s.length(); j++)
             {
                if(Character.getNumericValue(s.charAt(j))==i){
                    count++;//Count how many times digit i appears in the string.
                }  
             }
             if(!(Character.getNumericValue(s.charAt(i))==count)){
                return 0;// If the count doesn't match the digit at position i, it's not autobiographical.
             }
             count =0;// Reset the count for the next digit.
             set.add(Character.getNumericValue(s.charAt(i)));// Add the digit to the set.
        }
        return set.size();// Return the size of the set, which represents the distinct numbers in the autobiographical number.
    }
}

// An autobiographical number is a term used in recreational mathematics to describe a special kind of number. An autobiographical number is a number that can describe itself in a specific way based on its digits.

// Here's how it works:

// 1. Start from the leftmost digit of the number and count how many times each digit appears in the entire number.
// 2. Then, write down these counts in the order of the digits themselves.

// For example, consider the number 6210001000:

// - It has one '0,' two '1's, zero '2's, one '3,' zero '4's, zero '5's, and zero '6's.
// - So, you write down the counts in order: 12010000.

// Now, if you look at the resulting sequence, 12010000, it describes the original number, 6210001000.

// In summary, an autobiographical number is a self-descriptive number where the digits of the number describe how many times each digit appears in the number itself. These numbers are rare and often used as a fun and puzzling mathematical concept.


// Here's a summary of the code:

// It imports necessary Java libraries (Scanner, Set, HashSet) for input and data storage.

// It uses a Set<Integer> called set to store distinct digits found in the input string.
// It initializes a count variable to keep track of the number of times a digit appears.
// It iterates through each character in the input string using two nested loops.
// In the inner loop, it counts how many times the digit i appears in the string by comparing it to the numeric value of each character.
// It checks if the count matches the digit at the current position. If not, it returns 0, indicating that it's not an autobiographical number.
// It resets the count for the next digit.
// It adds the digit to the set to keep track of distinct digits.
// Finally, it returns the size of the set, which represents the number of distinct digits in the autobiographical number.
// The code essentially checks if the input string is an autobiographical number and returns the count of distinct digits if it is.
