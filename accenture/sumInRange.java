package accenture;

import java.util.Scanner;

public class sumInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        Sum(a,b);
    }

    private static void Sum(int a, int b) {
        if((a>= -1000 && a<=1000) && (b>= -1000 && b<=1000)){
            System.out.println(a+b);
        }
        else{
        System.out.println(-1);
        }
    }
}
