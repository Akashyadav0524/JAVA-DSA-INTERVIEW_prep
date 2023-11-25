package codevita;
import java.util.Scanner;



public class ZeroCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();

        if (second == 0) {
            System.out.println(first);
        } else {
            int ans = first - second;
            int result = ans / (second + 1);

            if (ans % (second + 1) != 0) {
                result++;
            }

            System.out.println(result);
        }

        sc.close();
    }
}

