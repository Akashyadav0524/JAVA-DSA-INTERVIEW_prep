package accenture;

import java.util.Scanner;

public class MetaNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int result =countMeta(n);
        System.out.println(result);
        in.close();
    
    }

    public static int countMeta(int n){
        if(n==0){
            return -1;
        }

        int count=0;
        for (int i = 0; i <=n; i++) {
            if(i%1==0 && i%2==0 && i%4==0 && i%8==0 && i%10!=0){
                count++;
            }
        }
        return count;
    }
}
