package PredavanjeIV.ZdravstvenaUstanova;

import java.util.Date;

public class MedicinskaSestra extends Osoblje {
    String smena;

    MedicinskaSestra(String ime, String prezime, String adresa, int brojTelefona, Date datumRodjenja, String smena){
        super(ime, prezime, adresa, brojTelefona, datumRodjenja);
        this.smena = smena;
    }

    public String toString(){
        return ime + " " + prezime + ". Po struci je medicinska sestra. " + "Zivi na adresi " + adresa + ". \n Broj telefona mu je " + brojTelefona + " i rodjen je " + datumRodjenja + ".";
    }
}
