package PredavanjeIV.ZdravstvenaUstanova;

import java.util.Date;

public class Osoblje {

    String ime;
    String prezime;
    String adresa;
    int brojTelefona;
    Date datumRodjenja;

    Osoblje(String ime, String prezime, String adresa, int brojTelefona, Date datumRodjenja){
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
        this.brojTelefona = brojTelefona;
        this.datumRodjenja = datumRodjenja;
    }

    public String toString(){
        return "Zaposleni se zove " + ime + " " + prezime + " i zivi na adresi " + adresa + ". \n Broj telefona mu je " + brojTelefona + " i rodjen je " + datumRodjenja + ".";
    }
}
