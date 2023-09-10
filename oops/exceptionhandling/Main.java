package oops.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a= 5;
        int b=0; 
        System.out.println(a+""+b);
        try {
            // int c =a/b;
            divde(a, b);
            throw new Exception("just for fun");
        } catch(MyException e){
            System.out.println(e.getMessage());
        }
        
        catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Allways Run");//whatever excepton throws or not it allways run
        }
    }

    static int divde(int a  ,  int b) throws ArithmeticException  {
        if(b==0){
            // throw new ArithmeticException("Please d' not divide by Zero");
        }
        return a/b;
    }
}
