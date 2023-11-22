package accenture;

import java.util.Scanner;

public class GoodInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        int ans = goodinteger(s);
        System.out.println(ans);
        in.close();
    }

    private static int goodinteger(String s) {
        String[] a =s.split(" ");
       
        int first=Integer.parseInt(a[0]);
        int second=Integer.parseInt(a[1]);
       char[] arrFirts = Integer.toString(first).toCharArray();
       char[] arrSecond = Integer.toString(second).toCharArray();

       for (int i = 0; i < arrFirts.length; i++) {
            for (int j = 0; j < arrSecond.length; j++) {
                if(arrFirts[i]==arrSecond[j]){
                    
                }
            }
        
       }
    
       return second;
    }
}
