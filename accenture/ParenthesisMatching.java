package accenture;

import java.util.Scanner;

public class ParenthesisMatching{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int ans = CheckValidParenthesis(str);
        System.out.println(ans);
        in.close();
    }

    private static int CheckValidParenthesis(String str) {
        if(str.length()<=1){
            return 1;
        }
        char[] ch = str.toCharArray();
        int right=0;
        int left=0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='('){
                left++;
            }
            if(ch[i]==')'){
                right++;
            }
        }
        if(left==right){
            return 0;
        }
        return 1;
    }

    
}
