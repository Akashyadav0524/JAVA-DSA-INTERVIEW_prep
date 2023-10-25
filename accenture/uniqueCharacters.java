package accenture;

import java.util.Scanner;
import java.util.*;

public class uniqueCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        int ans = countUnq(str);
        System.out.println(ans);
        in.close();
    }

    private static int countUnq(String str) {
        if(str.isEmpty()){
            return -1;
        }

        Set<Character> charSet = new HashSet<>();
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            charSet.add(ch[i]);
        }

        return charSet.size();
    }
}
