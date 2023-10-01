package accenture;
import java.util.*;
public class StrgMatch {
   
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String a,b;
       
        a=in.nextLine();

        
        b=in.nextLine();
        int count =0;

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if(a.charAt(i) == b .charAt(j) && i==j){ // agr charAt i aur charat j aur i and j bbi same then do ++2
                    count=count+2;
                
                }
                else if(a.charAt(i)==b.charAt(j)){ // agr charat i wala charat j me hai to bhi ++
                    count++;
                }
            }
        }

        System.out.println(count);
        in.close();

    }

}

      

    