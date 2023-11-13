package accenture;

import java.util.Scanner;

public class minNoofOperTomakeSimliar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m;
        n=in.nextInt();
        m=in.nextInt();

        int ans = MinNoOfOperationToEqualNo(n,m);
        System.out.println(ans);
        in.close();
    }
    public static int MinNoOfOperationToEqualNo(int n,int m){
        if(n==m){
            return 0;
        }
      int min = Math.min(n, m);
      int max = Math.max(n, m);
      int count =0;
      
       while(min!=max){
        min=min+2;
        if(min>max){
            min-=2;
            min+=1;
            count++;
            break;
        }
        count++;
       }
        return count;
    }
}
