package recursion;

public class revNumberCount {
    public static void main(String[] args) {
        int n =6;
        RevCount(n);
    }

    public static void RevCount(int n){
        if(n==1){
            return;
        }
      
        n--;
        RevCount(n);
        System.out.println(n);
    }
}
