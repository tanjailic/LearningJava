package PredavanjeIV.Trgovina;

import java.util.Date;

public class Meso extends Proizvod{
    String porekloMesa;

    Meso(String imeProizvoda, double cenaProizvoda, Date rokTrajanja, String porekloMesa){
        super(imeProizvoda, cenaProizvoda, rokTrajanja);
        this.porekloMesa = porekloMesa;
    }

    @Override
    protected double pdv() {
        return 0.08;
    }

    public String toString(){
        return "Proizvod " + imeProizvoda + " kosta " + cenaSaPdvom() + " i rok trajanja mu je " + rokTrajanja + ". " + "Poreklo meso je " + porekloMesa;
    }
}
