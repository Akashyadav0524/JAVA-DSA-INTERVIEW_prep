package oops.inhertitance;

public class Box {
    double l;
    double h;
    double w;


     Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    

    Box(double side){
        this.w=side;
        this.h=side;
        this.l=side;
    }

    Box(Box old){
        this.w=old.h;
        this.w=old.l;
        this.w=old.w;
        
    }



}
