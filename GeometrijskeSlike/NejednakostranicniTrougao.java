package PredavanjeIII.GeometrijskeSlike;

public class NejednakostranicniTrougao extends Trougao {
    double b;
    double c;

    NejednakostranicniTrougao(){
        this.b = 2;
        this.c = 3;
    }

    NejednakostranicniTrougao(double a, double b, double c){
        super(a);
        this.b = b;
        this.c = c;
    }

    public double area(){
        return (Math.pow(a,2)*Math.sqrt(3))/4;
    }
    public double circumfence(){
        return (a*b)/2;
    }

    @Override
    public String toString() {
        return "Povrsina nejednakostranicnog trougla je: " + format(area()) + ". A obim nejednakostranicnog trougla je: " + format(circumfence()) + ".";
    }
}
