
// Given a number n and a value k. From the right, set the kth bit in the binary representation of n. The position of LSB(or last bit) is 0, second last bit is 1 and so on. Also, 0 <= k < x, where x is the number of bits in the binary representation of n.

import java.util.Scanner;

public class ithBitofno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,k;
        n=in.nextInt();
        k=in.nextInt();

        System.out.println(ans(n,k));
        in.close();
    }

    private static int ans(int n, int k) {
        return((1 << k)|n);
    }
}
