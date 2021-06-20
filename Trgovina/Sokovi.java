package PredavanjeIV.Trgovina;

import java.util.Date;

public class Sokovi extends Proizvod{
    String vrstaSoka;

    Sokovi(String imeProizvoda, double cenaProizvoda, Date rokTrajanja, String vrstaSoka){
        super(imeProizvoda, cenaProizvoda, rokTrajanja);
        this.vrstaSoka = vrstaSoka;
    }

    public String toString(){
        return "Proizvod " + imeProizvoda + " kosta " + cenaSaPdvom() + " i rok trajanja mu je " + rokTrajanja + ". " + "Vrsta soka je " + vrstaSoka;
    }


}
