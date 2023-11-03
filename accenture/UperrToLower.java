package accenture;

import java.util.Scanner;

public class UperrToLower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        Convert(str);
        in.close();
    }

    private static void Convert(String s) {
       
        String[] words = s.split("(?=[A-Z])|(?<=[a-z])(?=[A-Z])");

        for (String word : words) {
            StringBuilder result = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    result.append(Character.toLowerCase(c));
                } else {
                    result.append(Character.toUpperCase(c));
                }
            }
            System.out.println(result.toString());
        }
    }

    }

