package PredavanjeIII.GeometrijskeSlike;

public class Main {

    public static void main(String args[]){


        Krug krug = new Krug(4);
        System.out.println(krug);

        Kvadrat kvadrat = new Kvadrat(3);
        System.out.println(kvadrat);

        Trougao trougao = new Trougao(5);
        System.out.println(trougao);

        Elipsa elipsa = new Elipsa(2,6);
        System.out.println(elipsa);

        Pravougaonik pravougaonik = new Pravougaonik(3,2);
        System.out.println(pravougaonik);

        NejednakostranicniTrougao nejednakostranicniTrougao = new NejednakostranicniTrougao(2,4,6);
        System.out.println(nejednakostranicniTrougao);
    }


}
