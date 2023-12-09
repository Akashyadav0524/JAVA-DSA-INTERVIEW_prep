package accenture;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if(isArmstrong(input)==true){
            System.out.println("it's an Armstrong Number");
        }
        if(isArmstrong(input)==false){
            System.out.println("Not a an Armstrong Number");
        }
        in.close();
        
    }

    private static boolean isArmstrong(int input) {
        int sum =0;
        int orignalno=input;
        int numberOfDigits = (int)(Math.log10(input))+1;
       
        while(input!=0){
            int digit= input%10;
            sum += Math.pow (digit, numberOfDigits);
            input/=10;
        }
        if(sum==orignalno){
            return true;
        }
        return false;
    }
}
