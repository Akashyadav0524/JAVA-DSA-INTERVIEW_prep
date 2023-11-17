package accenture;

import java.util.Scanner;

public class ConvertTOPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        String str=in.nextLine();
        String ans=Convert(str);
        System.out.println(ans);
        in.close();
    }

    private static String Convert(String str) {
        StringBuilder bd =new StringBuilder(str);

      if(isPalindrome(str)==true){
        return str;
      }
        for (int i = bd.length() - 2; i >= 0; i--) {
            bd.append(bd.charAt(i));
        }
        return bd.toString();
        
    }

    public static boolean isPalindrome(String str) {
            str =str.toLowerCase();
            for (int i = 0; i < str.length()/2; i++) 
            {
                char start =str.charAt(i);
                char end =str.charAt(str.length()-1-i);
    
                if(start !=end){
                    return false;
                }
            }
            return true;
        }
}
