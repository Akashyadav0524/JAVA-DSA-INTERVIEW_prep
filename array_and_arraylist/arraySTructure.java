package array_and_arraylist;

public class arraySTructure {
    public static void main(String[] args) {
        
        // Q.Store the roll no in array

        // Syntax :

        // datatypr[] varname =new datatype[size];
        // or
        // datatype[] var_name={.....};
        int[] rollno;    //->declaration - of array.rollno is getting defined in stack
        rollno=new int[5];//->Insilization - actually here object is being created in the memorey(heap)
        System.out.println(rollno[1]);
    }
}
