// a string is called a merry string if the frequency of each letter in the string one you are provided with a string 1
// you are provided with String S of length N finf and printthe number of merry string of length 4 that can formed

package accenture;

import java.util.Scanner;

public class MerryString {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n;
    n=in.nextInt();
    in.nextLine();
    String str = in.nextLine();
    int ans = CntPossibility(str,n);
    System.out.println(ans);
   }

   private static int CntPossibility(String str, int n) {
      if(str.length()<4){
         return 0;
      }
      char ch[] = str.toCharArray();

      int count=0;
      for (int i = 1; i <ch.length-4; i++) {
        
         for (int j = i+4; j < ch.length; j++) {
            count++;
            if(j==ch.length-1){
               return count;
            }
         }
      }
      return count;
   } 
}
