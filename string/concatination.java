

import java.util.ArrayList;

public class concatination {
    public static void main(String[] args) {
       System.out.println('a'+ 'b');//--->convertred to ASCII value
       System.out.println("a"+"b");//--->concated gives ab
       System.out.println((char)('a'+3));//--->d 
       System.out.println("a"+1);   //   ** When a integer is concated with String integer is converted to Interger which calll toString
    //

      System.out.println("Akash "+ new ArrayList<>());
      // System.out.println("Akash "+ new Integer(54));
      // String ans = new ArrayList<>()+"" + new Integer(54);
      // System.out.println(ans);
 }
}
