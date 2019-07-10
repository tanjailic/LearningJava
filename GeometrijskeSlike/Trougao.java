package PredavanjeIII.GeometrijskeSlike;

public class Trougao extends GeometrijskaSlika{
    double a;

    Trougao(){
        a = 1;
    }

    Trougao(double a){
        this.a = a;
    }

    public double area(){
        return (Math.pow(a,2)*Math.sqrt(3))/4;
    }
    public double circumfence(){
        return 3*a;
    }

    @Override
    public String toString() {
        return "Povrsina jednakostranicnog trougla je: " + format(area()) + ". A obim jednakostranicnog trougla je: " + format(circumfence()) + ".";
    }
}
