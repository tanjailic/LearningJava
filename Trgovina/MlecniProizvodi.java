package PredavanjeIV.Trgovina;

import java.util.Date;

public class MlecniProizvodi extends Proizvod{
    String poreklo;

    MlecniProizvodi(String imeProizvoda, double cenaProizvoda, Date rokTrajanja, String poreklo){
        super(imeProizvoda, cenaProizvoda, rokTrajanja);
        this.poreklo = poreklo;
    }
    public String toString(){
        return "Proizvod " + imeProizvoda + " kosta " + cenaSaPdvom() + " i rok trajanja mu je " + rokTrajanja + ". " + "Poreklo je " + poreklo + ".";
    }


}
