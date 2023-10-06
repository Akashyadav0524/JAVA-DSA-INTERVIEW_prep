package accenture;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] mat = new int[n];
        for (int i = 0; i <= mat.length; i++) {
            mat[i] = in.nextInt();
        }

        int ans = oddEvensumMat(mat,n);
        System.out.println(ans);

        in.close();
    }

    public static int oddEvensumMat(int[] mat,int n){
        if(mat.length <=0){
            return 0;
        }
        int[] even = new int[n];
        int[] odd = new int[n];

        for (int i = 0; i <= mat.length; i++) {

            if(mat[i] % 2 ==0){
                mat[i] = even.add;
            }
            
        }
    }
}
