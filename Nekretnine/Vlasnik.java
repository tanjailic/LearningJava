package PredavanjeIII.Nekretnine;

public class Vlasnik {
    String firstName;
    String lastName;
    long jmbg;
    int licnaKarta;

    Vlasnik(String firstName, String lastName, long jmbg, int licnaKarta) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jmbg = jmbg;
        this.licnaKarta = licnaKarta;

    }

    public String toString() {
        return firstName + " " + lastName + " , jmbg vlasnika je " + jmbg + " i broj licne karte je " + licnaKarta + ".";
    }
}
