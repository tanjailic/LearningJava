package PredavanjeIII.GeometrijskeSlike;

import static java.lang.Math.PI;

public class Elipsa extends Krug {

    double r1;

    Elipsa(){
       r1 = 2;
    }

    Elipsa(double r, double r1){
        super(r);
        this.r1 = r1;
    }

    public double area(){
        return r*r1*PI;
    }
    public double circumfence(){
        return (PI*r*(9-Math.sqrt(35)))/2;
    }

    @Override
    public String toString() {
        return "Povrsina elipse je: " + format(area()) + ". A obim elipse je: " + format(circumfence()) + ".";
    }
}
