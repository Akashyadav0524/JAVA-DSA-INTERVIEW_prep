package question;

public class str_palindrome {
    public static void main(String[] args) {
        String str = "dad";
        StringBuilder bd =new StringBuilder(str);
        bd.reverse();
        String rev;
        rev = bd.toString();
        System.out.println(bd.toString());

        if(str.equals(rev)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        // System.out.println(isPalindrome(str));


    }
    // public static boolean isPalindrome(String str) {
    //     str =str.toLowerCase();
    //     for (int i = 0; i < str.length()/2; i++) 
    //     {
    //         char start =str.charAt(i);
    //         char end =str.charAt(str.length()-1-i);

    //         if(start !=end){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

}


