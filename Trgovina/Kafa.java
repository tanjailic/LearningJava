package PredavanjeIV.Trgovina;

import java.util.Date;

public class Kafa extends Proizvod {
    boolean kafaUzrnu;

    Kafa(String imeProizvoda, double cenaProizvoda, Date rokTrajanja, boolean kafaUzrnu){
        super(imeProizvoda, cenaProizvoda, rokTrajanja);
        this.kafaUzrnu = kafaUzrnu;
    }

    @Override
    protected double pdv(){return 0.08;}

    public String toString(){
        return "Proizvod " + imeProizvoda + " kosta " + cenaSaPdvom() + " i rok trajanja mu je " + rokTrajanja + ". ";
    }
}
