package PredavanjeIV.ZdravstvenaUstanova;

import java.util.Date;

public class Lekar extends Osoblje {
    String fakultet;

    Lekar(String ime, String prezime, String adresa, int brojTelefona, Date datumRodjenja, String fakultet){
        super(ime, prezime, adresa, brojTelefona, datumRodjenja);
        this.fakultet = fakultet;
    }

    public String toString(){
        return "Zaposleni se zove " + ime + " " + prezime + ". Po struci je lekar. " + "Zivi na adresi " + adresa + ". \n Broj telefona mu je " + brojTelefona + " i rodjen je " + datumRodjenja + ".";
    }
}
