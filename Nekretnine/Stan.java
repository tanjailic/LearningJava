package PredavanjeIII.Nekretnine;

public class Stan extends Nekretnina {

    double povrsinaPodruma;
    double povrsinaTerase;

    Stan(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaPodruma, double povrsinaTerase) {
        super(adresa, zona, kvadratura, vlasnik);
        this.povrsinaPodruma = povrsinaPodruma;
        this.povrsinaTerase = povrsinaTerase;
    }

    @Override
    double cenaDodatka() {
        double povrsina = (povrsinaPodruma + povrsinaTerase) * 0.33;
        return cenaPoZoni(povrsina);
    }

    public String toString() {
        return "Stan je na adresi " + adresa + ", koja je u " + zona + " zoni i ima " + kvadratura + " kvadrata.\n"
                + "Vlasnik stana je " + /*vlasnik()*/  " I cena stana je: " + cenaNekretnine();
    }
}
