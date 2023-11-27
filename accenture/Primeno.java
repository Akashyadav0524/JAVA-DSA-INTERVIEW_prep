package accenture;

import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        // if(n<=1){
        //     System.out.println(+n +" is not prime");
        // }
        int count=0;
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
              count++;
            }
        }
        if(count==2){
            System.out.println(+n +" is  prime"); 
        }
        else
         System.out.println(+n +" is not prime");
    }
}
