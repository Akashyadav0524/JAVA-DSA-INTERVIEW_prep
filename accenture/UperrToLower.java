package accenture;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UperrToLower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        Convert(str);
        in.close();
    }

    private static void Convert(String str) {
        if(str.length()==0){
            System.out.println("-1");
        }
        Pattern pattern = Pattern.compile("(?<=\\p{Lower})(?=\\p{Upper})|(?<=\\p{Upper})(?=\\p{Lower})");

        String[] parts = pattern.split(str);
        for (String s : parts) {
            System.out.println(s);
        }

    }
}
