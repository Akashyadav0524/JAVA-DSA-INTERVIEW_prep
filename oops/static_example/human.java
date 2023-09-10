package oops.static_example;

public class human {
   
    int age;
    String name;
    int salary;
    static long population;
    
    public human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        human.population +=1;
    }

    
}
