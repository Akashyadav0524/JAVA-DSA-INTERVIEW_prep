package oops.inhertitance;

public class BoxWeight extends Box {
    double weight;

     /**
     * 
     */
    // BoxWeight()
    // {
    //      this.weight = -1;
         
    // }

    public BoxWeight(double l,double h,double w,double weight){
        super(l,h,w);//calling parent class COnstructor

        this.weight=weight;

    }
}
