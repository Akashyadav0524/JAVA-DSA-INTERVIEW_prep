// you have a total n choclates tat you want to distribute betewwn two individuals A nd B there specfic conditions for the distribuion 
// Person A myst recive more choclates than person betewwnPerson B ust recive atleast one choclates
package accenture;

import java.util.Scanner;

public class ChoclatesDistribution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int result = CountWays(n);
        System.out.println(result);
        in.close();
    }

    public static int CountWays(int n) {
        if (n < 0) {
            return -1;
        }
        int count = 0;
        if (n > 1) {
            int A = n - 1;
            int B = 1;

            while (A > B) {
                count++;
                A--;
                B++;
            }
        }
        return count;

    }
}
