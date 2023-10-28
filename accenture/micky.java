package accenture;

import java.util.Scanner;

public class micky {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in .nextInt();
        countNumber(N);
        in.close();
    }

    private static void countNumber(int n) {
        if(n==0){
            return;
        }
        String no = Integer.toString(n);
        int[] arr = new int[no.length()];
        for (int i = 0; i < no.length(); i++) {
            char digitChar = no.charAt(i);
            arr[i] = Character.getNumericValue(digitChar);
        }

        int marry=0,mickey=0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                marry++;
            }else{
                mickey++;
            }
        }
        System.out.println(mickey);
        System.out.println(marry);
    }
}
