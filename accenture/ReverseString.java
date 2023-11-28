package accenture;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        reverse(str);
        
        in.close();
    }

    private static void reverse(String str) {
        String[] strArr = str.split(" ");
        for (int i = strArr.length-1; i>=0; i--) {
            System.out.print(strArr[i]);
            if(i==0){
                break;
            }
            System.out.print(" ");
        }
    }

   
}
