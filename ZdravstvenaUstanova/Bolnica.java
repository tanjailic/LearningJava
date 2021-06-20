package PredavanjeIV.ZdravstvenaUstanova;

import java.util.ArrayList;

public class Bolnica {
    String imeBolnice;
    Osoblje imeDirektora;
    ArrayList<MedicinskaSestra> medicinskihSestare;
    ArrayList<Lekar> lekari;
    ArrayList<Osoblje> osoblja;

    Bolnica(String imeBolnice, Osoblje imeDirektora){
        this.imeBolnice = imeBolnice;
        this.imeDirektora = imeDirektora;
    }

    Bolnica(String imeBolnice, Osoblje imeDirektora, ArrayList medicinskihSestare, ArrayList lekari, ArrayList osoblja){
        this(imeBolnice, imeDirektora);
        this.medicinskihSestare = medicinskihSestare;
        this.lekari = lekari;
        this.osoblja = osoblja;
    }

    int brojZaposlenih(){
        return medicinskihSestare.size() + lekari.size() + osoblja.size();
    }


    public String toString(){
        return "Ime bolnice je " + imeBolnice + " i njen direktor je " + imeDirektora + ". Broj zaposlenih u bolnici je " + brojZaposlenih() + ". \n" +
                "Od njih broj medicinskih sestara je " + medicinskihSestare.size() + " broj lekara je " + lekari.size() + " i broj osoblja je " + osoblja.size() + ".";
    }
}
