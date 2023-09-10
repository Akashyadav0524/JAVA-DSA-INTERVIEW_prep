package wipro_questions;

import java.util.ArrayList;
import java.util.List;

public class TransformCodes {
    public static String[] transformCodes(int[] input1) {
        List<String> result = new ArrayList<>();
        
        for (int num : input1) {
            StringBuilder answer = new StringBuilder();
            
            // Step A1
            if (String.valueOf(num).length() == 6) {
                answer.append("C");
            } else {
                answer.append("W");
            }
            
            // Step A2
            if (num == 0) {
                answer.append("Z");
            } else if (num == 1) {
                answer.append("O");
            } else if (isPrime(num)) {
                answer.append("P");
            } else {
                answer.append("N");
            }
            
            // Step A3
            int sum = digitSum(num);
            while (sum >= 10) {
                sum = digitSum(sum);
            }
            answer.append(sum);
            
            // Step A4
            if (num % 2 == 0) {
                answer.append(num / 2);
            } else {
                answer.append(num - 112);
            }
            
            result.add(answer.toString());
        }
        
        return result.toArray(new String[0]);
    }
    
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    private static int digitSum(int num) {
        int sum = 0;
        
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        int[] input1 = {12};
        String[] output = transformCodes(input1);
        
        System.out.println("Output: " + String.join(", ", output));
    }
}

