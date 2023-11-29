package accenture;

import java.util.Scanner;

public class TwoFortyEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = FindNumber248(n);
        System.out.println(ans);
        in.close();
    }

    private static int FindNumber248(int n) {
      int count=0;
      for (int i = 0; i < n; i++) {
        if(CountOccurence(i)>0){
            count++;
        }
      }
      return count%1000000007;

    }

    private static int CountOccurence(int i) {
        int count2=0;
        int count4=0;
        int count8=0;

        while(i>0){
            int digit = i % 10;

            // Check the current digit and update the respective count
            if (digit == 2) {
                count2++;
            } else if (digit == 4) {
                count4++;
            } else if (digit == 8) {
                count8++;
            }
    
            // Move to the next digit
            i /= 10;
        }
        return Math.min(count2, Math.min(count4, count8));
   

    }
}
