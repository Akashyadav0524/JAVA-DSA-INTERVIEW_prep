package hashing;
import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(11, "Akash");
        map.put(12, "Adesh");
        map.put(13, "Sneha");
        map.put(14, "Drishti");
        map.put(15, "Haimanti");
        map.put(16, "Noman");

        map.remove(12);  

        System.out.println(map.size());
        System.out.println(map.containsKey(13));
        System.out.println(map.get(12));
        System.out.println(map);

        if(map.containsKey(14)){
            System.out.println("Present in the map");
        }
        else
        {
            System.out.println("Not present");
        }

        System.out.println(map.get(11));
        System.out.println(map.get(18));

        for (Map.Entry<Integer,String> e : map.entrySet()) {
            System.out.println(e.getValue());
            System.out.println(e.getValue());
        }
        Set<Integer> keys =map.keySet();
        for (Integer integer : keys) {
            System.out.println(integer+"  "+map.get(integer));
        }

        
    }
    
}
