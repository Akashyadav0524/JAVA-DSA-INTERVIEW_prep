package accenture;
//Given a string, convert the characters of the string into the opposite case,i.e. if a character is the lower case then convert it into upper case and vice-versa. 
import java.util.Scanner;

public class camelCase {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String str;
        str=in.nextLine();
        convesion(str);
        in.close();
    }

    private static void convesion(String str) {
        String x ="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                x=x+Character.toLowerCase(ch);
            }
            else{
                x += Character.toUpperCase(ch);
            }
        }
        char[]arr =x.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(x.charAt(i));
            
        }
        
    }
}
