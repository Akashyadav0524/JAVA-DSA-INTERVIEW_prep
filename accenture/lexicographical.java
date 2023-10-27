package accenture;

import java.util.Arrays;
import java.util.Scanner;

public class lexicographical {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        in.nextLine();
        String[] str= new String[n];
        for (int i = 0; i<n; i++) {
            System.out.println("Enter the " +i+ "name " );
            str[i] = in.nextLine();
        }
        convert(str);
        in.close();
    }

    public static void convert(String[] s){
        if(s.equals(null)){
            System.out.println("array is empty");
        }
       Arrays.sort(s);
       String lexico = Arrays.toString(s);
       System.out.println(lexico);
   

    }
}
