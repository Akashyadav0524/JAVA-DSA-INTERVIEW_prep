package oops.polymrphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape =new Shapes();
        Circles circle =new Circles();
        Shapes square =new Square();

       square.area();
       circle.area();
       shape.area();
        
    }
}
