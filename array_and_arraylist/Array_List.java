package array_and_arraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class Array_List {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        // Syntax  

        ArrayList<Integer> list =new ArrayList<>(10);

        // list.add(541);
        // list.add(1);
        // list.add(41);
        // list.add(51);
        // list.add(561);
        // list.add(541);
        // list.add(6);
    
        // System.out.println(list.get(4));
        // System.out.println(list);
        // System.out.println(list.set(0, 99));
        // System.out.println(list);

        for (int i = 0; i <5; i++) {

           list.add(in.nextInt()); 
        }
        System.out.println(list);
        in.close();
    }
}
