package accenture;

import java.util.Scanner;

public class EducatedPeople {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        String S=in.nextLine();
        int ans=MinTravelByZero(N,S);
        System.out.println(ans);
        in.close();
    }

    private static int MinTravelByZero(int n, String s) {
        return 0;
    }

  
}
