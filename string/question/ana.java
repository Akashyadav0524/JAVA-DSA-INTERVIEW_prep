package question;

public class ana {
    public static void main(String[] args) {
        String st1="akash";
        String st2 ="kasah";

        System.out.println(anagar(st1, st2));
    }

    private static boolean anagar(String st1, String st2) {

       int count[] = new int[256];

       for(int i=0 ; i<st1.length(); i++){
            count[st1.charAt(i)]++;
            count[st1.charAt(i)]--;
       }
       for (int i = 0; i < count.length; i++) {
        if(count[i]!=0){
            return false;
        }
    }
    return true;
    }
}
