package accenture;

import java.util.Scanner;

public class operatinChoice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        int c;
        c= in.nextInt();

        int result = OperChoic(c,a,b);
        System.out.println(result);
        in.close();
    }

    public static int OperChoic(int c,int a, int b){
        int ans=0;
        if(c>4){
            return 0;
        }

        if(c==1){
            ans=a+b;
        }
        if(c==2){
            ans=a-b;
        }
        if(c==3){
            ans=a*b;
        }
        if(c==4){
            ans=a*b;
        }

        return ans;
    }
}
