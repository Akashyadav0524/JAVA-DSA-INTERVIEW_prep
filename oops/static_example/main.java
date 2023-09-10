package oops.static_example;

public class main {
    // public static void main(String[] args) 
    {
        human akash=new human(22, "Akash YAdav", 5451);
        human sneha=new human(22, "Sneha YAdav", 5451);
        new human(22, "satyam", 5451); //A static method can be accessed directly by the class name and doesn’t need any object
        System.out.println(akash.age);
        System.out.println(sneha.age);
        System.out.println(human.population);
        System.out.println(human.population);
        System.out.println(human.population);
        System.out.println(human.population);
    }
}
