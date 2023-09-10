package oops.classess;
// import java.sql.Struct;
// import java.util.ArrayList;
// import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student akash =new Student();
        Student sneha =new Student();
        // akash.changeNmane("yadav");
        akash.gretting();

        // sneha.changeNmane("yaduwanshi");
        sneha.gretting();
        
        // System.out.println(akash.marks);
        // System.out.println(akash.rnno);
        // System.out.println(akash.name);
        // System.out.println(akash.marks);
    }
}

class Student{

    int rnno;
    String name;
    float marks;

    void gretting(){
        System.out.println("hello jee my name is "+name);
    }

//     void changeNmane(String newName){
//     name=newName;
// }

Student  (Student other) {
    this.name = other.name;
    this.rnno = other.rnno;
    this.marks = other.marks;
}
    Student(){
        this.rnno=13;
        this.name="akash yadav";
        this.marks=85.5f;

        
    }

}
