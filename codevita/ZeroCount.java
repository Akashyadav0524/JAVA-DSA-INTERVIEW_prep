package codevita;
import java.util.Scanner;

public class ZeroCount {

    public static void main(String[] args) {
        // Scanner se input lete hain
        Scanner sc = new Scanner(System.in);

        // L aur K ko scan karte hain
        int L = sc.nextInt();
        int K = sc.nextInt();

        // calculateLongestZeros method ko call karte hain
        int ans = calculateLongestZeros(L, K);

        // Ans ko print karte hain
        System.out.println(ans);

        // Scanner ko band karte hain
        sc.close();
    }

    private static int calculateLongestZeros(int L, int K) {
        // Agar sab 1s hain, toh koi zero nahi hai
        if (K == L) {
            return 0;
        }

        // Baki ke cases mein, sabse lamba consecutive zero ek hi hoga
        return 1;
    }
}
