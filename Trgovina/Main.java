package PredavanjeIV.Trgovina;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String args[]) {


        Date rok = new Date(2021, 05, 12);
        Kafa kafa = new Kafa("bonito", 80, rok, true);
        Kafa kafa1 = new Kafa("grand", 70, rok, true);
        Kafa kafa2 = new Kafa("cafe factory", 70, rok, false);

        MlecniProizvodi mleko = new MlecniProizvodi("kravica", 90, rok, "krava");
        MlecniProizvodi sir = new MlecniProizvodi("dore blue", 150, rok, "koza");

        Meso meso = new Meso("biftek", 1000, rok, "beef");

        ArrayList<Proizvod> nabavka = new ArrayList<Proizvod>(Arrays.asList(kafa, kafa2, sir, meso));
        //ArrayList<Proizvod> nabavka = new ArrayList<Proizvod>();

        ArrayList<Proizvod> kupovina = new ArrayList<Proizvod>(Arrays.asList(kafa2, sir));

        Firma endava = new Firma(1500);

        if ((endava.nabavka(nabavka))) {
            System.out.println(endava);
        } else {
            System.out.println("Nemate dovoljno para za porudzbinu!");
        }


        if (endava.porudzbina(kupovina)) {
            System.out.println(endava);
        } else {
            System.out.println("Nema trazenih proizvoda!");
        }
    }


}