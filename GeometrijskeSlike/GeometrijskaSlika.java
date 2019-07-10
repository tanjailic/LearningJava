package PredavanjeIII.GeometrijskeSlike;

//Projekat Geometrijske slike
//•	Apstraktna klasa Geometrijska Slika
//•	Tri osnovne klase Krug, Kvadrat, Trougao
//•	Izvedene klase Elipsa, Pravougaonik i Nejednakostranicni Trougao
//•	Klase imaju preklopnjenu metodu toString() u kojoj se ispisuju obim i povrsina
//•	Svaka klasa treba da sadrži po 3 konstruktora
//•	Klasa Trougao definiše jednakostranicni Trougao
//•	Obim elipse se racuna ap(9-v35)/2 , a povrsina abp
//Napraviti Main klasu i u njoj kreirati instance klase Geometrijska slika i napraviti objekte svih osnovnih i izvedenih klasa sa proizvoljnim argumentima.
// Ispisati String reprezentaciju objekata – toString()

import java.text.DecimalFormat;

public abstract class GeometrijskaSlika {
    public abstract double area();
    public abstract double circumfence();

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    protected String format(double value){
        return df2.format(value);
    }
}
