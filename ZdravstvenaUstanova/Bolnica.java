package PredavanjeIV.ZdravstvenaUstanova;

public class Bolnica {
    String imeBolnice;
    String imeDirektora;
    int brojZaposlenih;
    int brojMedicinskihSestara;
    int brojLekara;
    int brojOsoblja;

    Bolnica(String imeBolnice, String imeDirektora, int brojZaposlenih){
        this.imeBolnice = imeBolnice;
        this.imeDirektora = imeDirektora;
        this.brojZaposlenih = brojZaposlenih;
    }

    Bolnica(String imeBolnice, String imeDirektora, int brojZaposlenih, int brojMedicinskihSestara){
        this.imeBolnice = imeBolnice;
        this.imeDirektora = imeDirektora;
        this.brojZaposlenih = brojZaposlenih;
        this.brojMedicinskihSestara = brojMedicinskihSestara;
    }

    Bolnica(String imeBolnice, String imeDirektora, int brojZaposlenih, int brojMedicinskihSestara, int brojLekara){
        this.imeBolnice = imeBolnice;
        this.imeDirektora = imeDirektora;
        this.brojZaposlenih = brojZaposlenih;
        this.brojMedicinskihSestara = brojMedicinskihSestara;
        this.brojLekara = brojLekara;
    }

    Bolnica(String imeBolnice, String imeDirektora, int brojZaposlenih, int brojMedicinskihSestara, int brojLekara, int brojOsoblja){
        this.imeBolnice = imeBolnice;
        this.imeDirektora = imeDirektora;
        this.brojZaposlenih = brojZaposlenih;
        this.brojMedicinskihSestara = brojMedicinskihSestara;
        this.brojLekara = brojLekara;
        this.brojOsoblja = brojOsoblja;
    }


    public String toString(){
        return "Ime bolnice je " + imeBolnice + ", direktor bolnice je " + imeDirektora + " i u njoj radi " + brojZaposlenih + " ljudi." + "\nOd toga je " + brojMedicinskihSestara + " medicinkih sestara, "
                + brojLekara + " lekara i " + brojOsoblja + " osoblja.";
    }
}
