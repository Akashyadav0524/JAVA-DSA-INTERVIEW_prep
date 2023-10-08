// The function to execute is
// ChatFrequentcharacter(Char str, char x)

// This function has a string and a character. This function requires replacing the most used character in the str with the ‘x’ character.

// Note: If two characters have the same frequency, then we will have to consider the frequency which has the lower ASCII value.

// Example

// Input:
// str: bbadbbababb
// char x: t

// Output:
// ttadttatatt

// Explanation
// The maximum character repeated is ‘b’ that is replaced with ‘t’.

package accenture;

import java.util.Scanner;

public class FrequentChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str;
        char ch;
        str=in.nextLine();
        ch= in.next().charAt(0);
        ChangeFrequentChra(str,ch);
        in.close();
    }

    public static void ChangeFrequentChra(String str, char ch){
        // if(str.length()<=0){
        //     System.out.println(str);
        // }
        // int[] countFreq = new int[256];
        // for (int i = 0; i < str.length(); i++) {
        //     countFreq[str.charAt(i)]++;
        // }
        // char mostfreq = str.charAt(0);

    }
}
