// * * * *
// * * *
// * *
// *

package recursion;

public class pattern {
    public static void main(String[] args) {
        triangle(15, 0);
    }

    private static void triangle(int row , int col) {
        
        if(row==0){
            return;
        }

        if(col<row){
            System.out.print("\t*");
            triangle(row, col+1);
        }else{
            System.out.println();
            triangle(row-1, 0);
        }
    }
}
