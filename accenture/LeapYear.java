package accenture;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int UpRange=in.nextInt();
        int LowRange=in.nextInt();
        PrintLeap(UpRange,LowRange);
        in.close();
    }

    private static void PrintLeap(int upRange, int lowRange) {
        for (int i = upRange; i <= lowRange; i++) {
            if(isLeapYear(i)==true){
                System.out.print(i+" ");
            }
        }
    }

    private static boolean isLeapYear(int year) {
        if(year%4==0){
            return true;
        }
        return false;
    }
}
