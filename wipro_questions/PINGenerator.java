
import java.util.*;

public class PINGenerator{
  
    public static void main(String[] args) {
        int input1 = 1274;
        int input2 = 5283;
        int input3 = 1937;

        int pin = createPIN(input1, input2, input3);
        System.out.println("PIN: " + pin);
    }

    public static int createPIN(int input1, int input2, int input3) {
        int arr[] = { input1, input2, input3 };
        int max = 0, min;
        double sum = 0.0;
        double place = 0.1; // Change 1.0 to 0.1
        int num;
        for (int i = 0; i < 3; i++) {
            num = arr[i];
            while (num != 0) {
                int r = num % 10;
                if (r > max)
                    max = r;
                num = num / 10;
            }
        }
        for (int i = 0; i < 3; i++) {
            min = 9; // Change 99 to 9
            for (int j = 0; j < 3; j++) {
                int rem = arr[j] % 10;
                if (rem < min)
                    min = rem;
                arr[j] /= 10;
            }
            sum = (min + (sum * place)); // Change sum / place to sum * place
            place *= 10;
        }
        return (int) (max * 1000 + sum);
    }
}
