package hashing;

import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
       HashSet<Integer> set =new HashSet<>();
        Iterator<Integer> it = set.iterator();
       //hashNext; next;
       
    //insret
     set.add(1);
     set.add(2);
     set.add(3);
     set.add(14);
     set.add(45);
     set.add(22);
     set.add(44);
     set.add(35);
     set.add(66);

    //  System.out.println(set.toString());

    //  //serch
    //  if(set.contains(1)){
    //     System.out.println("Set contains 1");
    //  }
    //  if(!set.contains(8)){
    //     System.out.println("Nahi be 8 pabe na");
    //  }

    //  //Remove
    //  set.remove(2);
    //  if(!set.contains(2)){
    //     System.out.println("Deleted 2");
    //  }
    //  System.out.println(set.toString());
    //  System.out.println(set.clone());
    //  System.out.println(set.hashCode());
    //  System.out.println(set.getClass());
    //  System.out.println(set.isEmpty());
    //  System.out.println(set.size());
    //  System.out.println(set.stream());

    //  System.out.println(set);

    //  System.out.println(it.next());

    //  ITERATOR
    while(it.hasNext()){
        System.out.println(it.next() + ", ");
    }
    System.out.println(" ");

  
    // if(!set.isEmpty()) {
    //     System.out.print("set is not empty");
    // }
    }
}
