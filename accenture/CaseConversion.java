package accenture;
import java.util.*;

public class CaseConversion{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String str = in.nextLine();
       
        String Ans = Convert(str);
        System.out.println(Ans);
        in.close();
    }

    private static String Convert(String str) {
        int UCcount=0;
        int LCcount=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
               UCcount++;
            }
            else{
                LCcount++;
            }
        }
        String s;
  
        if(UCcount>LCcount){
           s=str.toUpperCase();
           return s;
           
        }
        if(LCcount>UCcount){
           s=str.toLowerCase();
           return s;
    
        }
        return str;
    }
}