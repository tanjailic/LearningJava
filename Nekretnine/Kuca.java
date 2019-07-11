package PredavanjeIII.Nekretnine;

public class Kuca extends Nekretnina {

    double povrsinaOkucnice;

    Kuca(String adresa, int zona, double kvadratura, Vlasnik vlasnik, int povrsinaOkucnice) {
        super(adresa, zona, kvadratura, vlasnik);
        this.povrsinaOkucnice = povrsinaOkucnice;
    }


    @Override
    public double cenaDodatka() {
        double povrsina =  povrsinaOkucnice * 0.15;
        return cenaPoZoni(povrsina);
    }

    public String toString() {
        return "Kuca je na adresi " + adresa + ", koja je u " + zona + " zoni i ima " + kvadratura + " kvadrata.\n"
                + "Vlasnik kuce je " + /*vlasnik()*/  " I cena kuce je: " + cenaNekretnine();
    }
}
