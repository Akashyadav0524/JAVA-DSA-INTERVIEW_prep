package accenture;

import java.util.Scanner;

public class ThreeCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
       int count =0;
       for (int i = 1; i <= n; i++) {
        if(!itsContains(i)){
            count++;
        }
       }
       System.out.println(count);
       in.close();
    }

    public static boolean itsContains(int n){
        int lastDig;
            while(n!=0){
                    lastDig = n%10;
                    if(lastDig==3){
                        return true;
                    }
                n/=10;
            }
    return false;

  } 
}