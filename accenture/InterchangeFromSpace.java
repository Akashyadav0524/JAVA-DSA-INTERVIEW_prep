package accenture;

import java.util.Scanner;
public class InterchangeFromSpace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        InterChange(s);
        in.close();
    }
    public static void InterChange(String s){
        if(s.length()==0){
            System.out.println(-1);
        }
         String[] sentence = s.split(" ");
         if(sentence.length>=2){
            String swap = sentence[1] + " " + sentence[0];
            System.out.println(swap);                                                     
         }                           
    }
}
