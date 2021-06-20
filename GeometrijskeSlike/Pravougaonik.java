package PredavanjeIII.GeometrijskeSlike;

public class Pravougaonik extends Kvadrat {

    double b;

    Pravougaonik(){
        b = 2;
    }

    Pravougaonik(double a, double b) {
        super(a);
        this.b = b;
    }

    public double area(){
        return a*b;
    }
    public double circumfence(){
        return 2*a + 2*b;
    }

    @Override
    public String toString() {
        return "Povrsina pravougaonika je: " + format(area()) + ". A obim pravougaonika je: " + format(circumfence()) + ".";
    }
}
