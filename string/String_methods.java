

import java.util.Arrays;

public class String_methods {
    public static void main(String[] args) {
        String name ="Akash Yadav, kaise hai aaplog";
        System.out.println(Arrays.toString(name.toCharArray() ));
        System.out.println(name.toLowerCase());
        System.out.println(name.contains(name));
        System.out.println(name.hashCode());
        System.out.println(name.startsWith(name));
        System.out.println(Arrays.toString(name.split(" ") ));
    }
}
