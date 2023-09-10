package oops.cloning;

public class Mian {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Akash = new Human(11,"Akash Yadav");
        // Human twin = new Human(Akash);

        Human twin =(Human)Akash.clone();
        System.out.println(twin.age);
        System.out.println(twin.name);
    }
}
