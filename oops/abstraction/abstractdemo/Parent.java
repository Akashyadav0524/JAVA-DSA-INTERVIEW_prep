package oops.abstraction.abstractdemo;

public abstract class Parent {//you cant have final abstract class beacuse we want abstract class shiould be inhertired

    int age;
    final int VALUE; //can have final variable

    public Parent(int age) {
        this.age = age;
        VALUE = 32456789;
    }

    static void hello(){
        System.out.println("hey");
    }

    void normal() {//they can have normal method we can overdidee them also
        System.out.println("this is a normal method");
    }

    abstract void career();
    abstract void partner();
}