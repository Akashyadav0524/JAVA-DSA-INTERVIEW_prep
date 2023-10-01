package accenture;
import java .util.*;

public class StringPremutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String Input1,Input2;
        Input1 =in.nextLine();
        Input2 =in.nextLine();

       boolean ans = isTrue(Input1, Input2);

       if(ans==true){
        System.out.println("Yes");
       }
       else{
        System.out.println("No");
       }

       in.close();

    }

     public static boolean isTrue(String Input1 ,String Input2){

        char Str1[] = Input1.toCharArray();
        char Str2[] = Input2.toCharArray();

        Arrays.sort(Str1);
        Arrays.sort(Str2);

        int n1= Str1.length;
        int n2= Str2.length;

        if(n1!=n2){
            return false;
        }

        for (int i = 0; i < Str1.length; i++) {
            if(Str1[i] != Str2[i]){
                return false;
            }
        }
        return true;
            
    }
}
