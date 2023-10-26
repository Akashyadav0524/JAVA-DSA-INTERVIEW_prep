package accenture;

import java.util.Scanner;

public class Count_Zeros_Ones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        str=in.nextLine();
        int ans =CountPairs(str);
        System.out.println(ans);
        in.close();
    }

    public static int CountPairs(String str){
        if(str.length()==0){
            return 0;
        }
        int count =0, i=1,prev =0,curr =1;
        while(i<str.length()){
            if(str.charAt(i-1) != str.charAt(i)){
                count+=Math.min(prev, curr);
                prev=curr;
                curr =1;
            }
            else{
                curr++;
            }
            i++;
        }

        return count+=Math.min(prev, curr);
        
       
    }
}
