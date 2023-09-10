package recursion;
//F(N) = F(N/10) + F(N%10)
public class Sum_of_Digit {
    public static void main(String[] args) {
        int n= 1342;
        int ans =sumOfD(n);
        System.out.println(ans);

        int ans2 = prodOfD(n);
        System.out.println(ans2);
    }

    private static int sumOfD(int n) {
        if(n==0){
            return 0;
        }

        return (n%10) + sumOfD(n/10);
    }

     private static int prodOfD(int n) {
        if(n%10 == n){
            return n;
        }

        return (n%10) * prodOfD(n/10);
    }
}
