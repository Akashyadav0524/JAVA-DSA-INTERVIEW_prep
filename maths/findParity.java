public class findParity {
    static boolean getParity(int n)
    {
        boolean parity = false;
        while(n != 0)
        {
            parity = !parity;
            n = n & (n-1);
        }
        return parity;
         
    }
     
    /* Driver program to test getParity() */
    public static void main (String[] args)
    {
        int n = 7;
        System.out.println("Parity of no " + n + " = " +
                         (getParity(n)? "odd": "even")); 
    }
}
