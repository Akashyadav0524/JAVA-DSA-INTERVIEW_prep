package accenture;
//The given function has a string (str) and two characters, ch1 and ch2. Execute the function in such a way that str returns to its original string, and all the events in ch1 are replaced by ch2, and vice versa.

import java.util.Scanner;

public class ReplaceChinStr {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
    
        String str1;
        str1=in.nextLine();
        char c1,c2;
        c1=in.next().charAt(0);
        c2=in.next().charAt(0);
      
        
        String ans = Replacement(str1,c1,c2);
        System.out.println(ans);
        in.close();

    }

    private static String Replacement(String str1, char c1, char c2) {
        if(c1==c2){
            return str1;
        }

        char check[] = str1.toCharArray();
        for (int i = 0; i < check.length; i++) {
            if(check[i] == c1  ){
                check[i] = c2;
            }
            else if(check[i] == c2){
                check[i]=c1;
            }
        }

        String result = new String(check);
        return result;
    }
    

}
