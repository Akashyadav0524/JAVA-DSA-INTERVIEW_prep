package accenture;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean check = isPalindrome(str);
        System.out.println(check);
        in.close();
        
    }

    private static boolean isPalindrome(String str) {
        if(str.isEmpty()){
            return true;
        }
        char[] ch = str.toCharArray();

        char right=ch[0];
        char left =ch[ch.length-1];
        if(right==left){
            right++;
            left--;
        }
        if(right>left){
            return true;
        }
        return false;
    }


}
