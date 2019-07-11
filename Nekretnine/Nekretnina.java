package PredavanjeIII.Nekretnine;

public abstract class Nekretnina {
    String adresa;
    int zona;
    double kvadratura;

    Vlasnik vlasnik;

    Nekretnina(String adresa, int zona, double kvadratura, Vlasnik vlasnik) {
        this.adresa = adresa;
        this.zona = zona;
        this.kvadratura = kvadratura;
        this.vlasnik = vlasnik;
    }

    abstract double cenaDodatka();

    double cenaPoZoni(double kvadratura) {
        double cena = 0;
        switch (zona) {
            case 1:
                cena = 3000 * kvadratura;
                break;
            case 2:
                cena = 2000 * kvadratura;
                break;
            case 3:
                cena = 1000 * kvadratura;
                break;
            case 4:
                cena = 500 * kvadratura;
                break;
            default:
                System.out.println("Trazena zona ne postoji!");

        }
        return cena;

    }

    double cenaOsnovice(){
        return cenaPoZoni(kvadratura);
    }

    public double cenaNekretnine(){ return cenaOsnovice() + cenaDodatka();}
}
