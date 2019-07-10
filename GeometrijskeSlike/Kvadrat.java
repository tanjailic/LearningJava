package PredavanjeIII.GeometrijskeSlike;

public class Kvadrat extends GeometrijskaSlika{

    double a;

    Kvadrat(){
        a = 1;
    }
    Kvadrat(double a){
        this.a = a;
    }

    public double area(){
        return Math.pow(a,2);
    }
    public double circumfence(){
        return 2*a;
    }

    @Override
    public String toString() {
        return "Povrsina kvadrata je: " + format(area()) + ". A obim kvadrata je: " + format(circumfence()) + ".";
    }
}
