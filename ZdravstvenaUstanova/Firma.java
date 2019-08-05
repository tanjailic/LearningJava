package PredavanjeIV.ZdravstvenaUstanova;

import java.util.ArrayList;

public class Firma {

    ArrayList<Bolnica> bolnice;
    String imeFirme;
    Bolnica bolnica;

    Firma(String imeFirme, ArrayList<Bolnica> bolnice){
        this.imeFirme = imeFirme;
        this.bolnice = bolnice;
    }

    int brojBolnica(){
        return bolnice.size();
    }

    void getStaff(){
        bolnice.forEach(bolnica -> {
            System.out.println(bolnica);
        });
    }


    public String toString(){
        return "Firma " + imeFirme + " poseduje " + brojBolnica() + " bolnice." + "\nBolnice koje poseduje su: ";
    }


}
