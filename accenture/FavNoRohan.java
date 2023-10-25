//Rohan enjoys mathematics and has a few fav number therefore Rohan prefers positive integer whose sole lucky digits in the decimal notation are 4 and 7 for instnce lucky numnber are  47 , 744, 4, where unlucky number are 5 , 17 ,467. if a number can be divided evenly by a lucky number Rohan considers it to be almost lucky he has to check wheather no is lucky or not 



package accenture;

import java.util.Scanner;

public class FavNoRohan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int ans =is_lucky(n);
        if(ans==1){
            System.out.println("Nearly Lucky");
        }
        else{
            System.out.println("Unlucky");
        }
        in.close();
    }

    public static int is_lucky(int n){
    
        
        
           if(n%4==0 || n%7==0){
             return 1;
           }
           int count=0;
           while(n>0){
           int second_digit = n%10;
           count++;
           if((count==2) && (second_digit==4 || second_digit==7)){
             return 1;
           }
           n/=10;
        }
        return 0;
        
    }
}
