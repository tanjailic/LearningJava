package PredavanjeIII.GeometrijskeSlike;

import static java.lang.Math.PI;

public class Krug extends GeometrijskaSlika{
    double r;

    Krug(){
        r = 1;
    }

    Krug(double r){
        this.r = r;
    }

    public double area(){return Math.pow(r,2)*PI;}
    public double circumfence(){
        return 2*r*PI;
    }


    @Override
    public String toString() {
        return "Povrsina kruga je: " + format(area()) + ". A obim kruga je: " + format(circumfence()) + ".";
    }
}
