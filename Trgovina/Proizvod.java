package PredavanjeIV.Trgovina;

//Zadatak 1:
//        Firma se bavi preprodajom prehrambenih proizvoda. Proizvode razlikujemo po sledecim kategorijama proizvoda:
//        •	Mlecni proizvodi
//        •	Kafe, Sokovi
//        •	Meso
//        O svim proizvodima cuvamo informacije: ime proizvoda, cena proizvoda i rok trajanja
//        Kod mlecnih proizvoda cuvamo i poreklo mleka
//        Kod kafe da li je u zrnu ili je samlevena
//        O Sokovima cuvamo od cega je sok
//        Kod mesa cuvamo od koje životinje je meso
//        Kod cene mlecnih proizvoda i sokova PDV je 20%, dok je za meso i kafu PDV na cenu 8%
//        Firma ima polje kapital ,listu proizvoda i metodu porudzbina() koja izracuna, proverava da li ima dovoljno sredstava za porudzbinu na osnovu liste proizvoda. Nakon uspesne porudzbine lista ostaje prazna.

import java.util.Date;

public abstract class Proizvod {
    String imeProizvoda;
    double cenaProizvoda;
    Date rokTrajanja;

    Proizvod(String imeProizvoda, double cenaProizvoda, Date rokTrajanja) {
        this.imeProizvoda = imeProizvoda;
        this.cenaProizvoda = cenaProizvoda;
        this.rokTrajanja = rokTrajanja;

    }

    public double cenaSaPdvom() {
        return cenaProizvoda + cenaProizvoda * pdv();
    }

    protected double pdv() {
        return 0.2;
    }

    public String toString(){
        return "Proizvod " + imeProizvoda + " kosta " + cenaProizvoda + " i rok trajanja mu je " + rokTrajanja;
    }

}
