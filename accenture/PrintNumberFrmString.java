package accenture;

import java.util.Scanner;

public class PrintNumberFrmString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        PrintNo(str);
    }

    private static void PrintNo(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(Character.isDigit(ch[i]) && ch[i] >= '1' && ch[i] <= '9'){
                int n = Character.getNumericValue(ch[i]);
                System.out.print(n + " ");
            }
        }
    }
}
