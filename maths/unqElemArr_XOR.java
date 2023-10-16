public class unqElemArr_XOR {
    public static void main(String[] args) {
        int[]  arr ={1,2,3,4,5,6,1,2,3,4,5};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        
        int unique=0;
        for (int i : arr) {
            unique ^=i;
        }
        
        return unique;
    }
}
