package oops.interfaces;

public class Car implements Engine,Brake {

    @Override
    public void brake() {
        System.out.println("Halke");
    }

    @Override
    public void start() {
       System.out.println(" GAddi Bhagao");
    }

    @Override
    public void stop() {
        System.out.println("Gaddi Rok");
    }

    @Override
    public void acc() {
        System.out.println("Khich k chal");
        
    }



}


