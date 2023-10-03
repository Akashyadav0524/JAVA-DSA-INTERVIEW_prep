package accenture;
import java. util.*;
public class countCarries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        num1=in.nextInt();
        num2=in.nextInt();

        int result= NumberOfcarry(num1,num2);
        System.out.println(result);
        in.close();
    }

    public static int NumberOfcarry(int num1, int num2){
        int carry=0;
        int carryCount=0;

        while(num1>0 || num2>0){
            int dig1= num1%10;
            int dig2= num2%10;

            int sum =dig1+dig2+carry;
            if(sum>=10){
                carry=1;
                carryCount++;
            }
            else{
                carry=0;
            }

            num1= num1/10;
            num2= num2/10;
        }

        return carryCount;
    }
}
