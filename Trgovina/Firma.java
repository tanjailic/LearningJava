package PredavanjeIV.Trgovina;

import java.util.ArrayList;

public class Firma {
    double kapital;
    ArrayList<Proizvod> magacin;

    Firma(double kapital){

        this.kapital = kapital;
        magacin = new ArrayList<Proizvod>();
    }

     public boolean porudzbina(ArrayList<Proizvod> listaProizvoda){
         ArrayList<Proizvod> kolica = new ArrayList<>();
         for (Proizvod proizvod:listaProizvoda) {


             for(int i = 0; i <= magacin.size(); i++){
                 Proizvod tempProizvod = magacin.get(i);
                 if(tempProizvod.imeProizvoda == proizvod.imeProizvoda ){
                     kolica.add(tempProizvod);
                     magacin.remove(tempProizvod);
                     break;
                 }
             }

         }
         if (kolica.size() == listaProizvoda.size()){
             double ukupnaCena = 0;
             for (Proizvod proizvod: kolica) {
                 ukupnaCena += proizvod.cenaSaPdvom();
             }
             kapital += ukupnaCena;
             return true;
         }else{
             magacin.addAll(kolica);
             return false;
         }


    }

    public boolean nabavka(ArrayList<Proizvod> listaProizvoda){
        double ukupnaCena = 0;
        for (Proizvod proizvod: listaProizvoda) {
            ukupnaCena += proizvod.cenaProizvoda;
        }
        if(kapital >= ukupnaCena){
            kapital -= ukupnaCena;
            magacin.addAll(listaProizvoda);
            return true;
        }
        return false;
    }

    public String toString(){
        return "Firma ima kapital od " + kapital + " dinara. \n U magacinu su: \n" + magacin;
    }

}
