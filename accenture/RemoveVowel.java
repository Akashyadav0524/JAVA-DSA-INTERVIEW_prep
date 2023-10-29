package accenture;

import java.util.Scanner;

public class RemoveVowel {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String ans = remove(str);
        System.out.println(ans);
        in.close();
        
    }

    private static String remove(String str) {
        if(str.isEmpty()){
            return null;
        }
       

       
        StringBuilder S = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
           
             if(!vowel(c)){

                 S.append(c);
             }
        }
        return S.toString();

    }

    private static boolean vowel(char c) {
        if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
               return true;   
             }
             return false;
    }
}
