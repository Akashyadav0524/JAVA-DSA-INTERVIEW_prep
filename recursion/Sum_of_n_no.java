package recursion;

public class Sum_of_n_no {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);
    }

    public static int sum(int n){
        if(n <= 1){
            return 1;
        }

        return n + sum(n-1);
    }
}
