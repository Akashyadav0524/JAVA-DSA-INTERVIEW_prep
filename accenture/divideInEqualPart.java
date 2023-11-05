package accenture;

import java.util.Scanner;

public class divideInEqualPart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        boolean ans =checkEvenDivedend(N);
        System.out.println(ans);
        in.close();
    }

    private static boolean checkEvenDivedend(int n) {
       if(n<=0){
        return false;
       }
       int d = n/2;
       if(d%2==0){
        return true;
       }
       return false;
    }
}
