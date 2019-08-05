package PredavanjeIV.ZdravstvenaUstanova;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Osoblje direktor = new Osoblje("Branko", "Kostic", "Pere Velimirovica 23", 84736, new Date(1971, 8, 8));
        Osoblje cistac = new Osoblje("Zika", "Peric", "Stanoje Vlahica 3", 55555, new Date(1988,5,5));
        Lekar pedijatar = new Lekar("Mihajlo", "Fruktic", "Borska", 12345, new Date(1968,9,8), "Medicinski");
        Lekar fizijatar = new Lekar("Slavko", "Tosic", "Vidikovacki venac", 16665, new Date(1968,9,8), "Medicinski");
        MedicinskaSestra tehnicar = new MedicinskaSestra("Petar", "Peric", "Svetogorska 8", 13555, new Date(1977,10,3), "nocna");
        MedicinskaSestra sestra = new MedicinskaSestra("Marica", "Ilic", "Kneza Milosa 33", 44445, new Date(1991,10,18), "dnevna");
        ArrayList<MedicinskaSestra> sestreIzEuromedike = new ArrayList<MedicinskaSestra>();

        Osoblje cistac1 = new Osoblje("Vlaja", "Skrbic", "Filmski grad 67", 11155, new Date(1964,9,7));
        Lekar ginekolog = new Lekar("Draza", "Brkic", "Vareska 25", 54321, new Date(1958,2,27), "Medicinski");
        MedicinskaSestra sestra1 = new MedicinskaSestra("Visnja", "Stanic", "Takovska 83", 44222, new Date(1978,1,30), "dnevna");

        Osoblje dobavljac = new Osoblje("Mika", "Stajic", "Stanoje Vlahica 25", 55555, new Date(1981,6,3));
        Osoblje popravljac = new Osoblje("Velja", "Petrovic", "SMarije Gregorijane 90", 55555, new Date(1948,4,23));
        Lekar kardiolog = new Lekar("Zivka", "Karadzic", "Patrijarha Pavla 125", 12345, new Date(1978,9,6), "Medicinski");
        Lekar internista = new Lekar("Perica", "Ivanovic", "Vidikovacki venac 47", 16665, new Date(1972,5,20), "Medicinski");
        Lekar gastroenterolog = new Lekar("Svetozar", "Zizic", "Lipe 89", 16665, new Date(1969,11,27), "Medicinski");
        MedicinskaSestra tehnicar1 = new MedicinskaSestra("Bigi", "Sreckovic", "Svetogorska 55", 13555, new Date(1979,12,3), "nocna");
        MedicinskaSestra sestra2 = new MedicinskaSestra("Nalah", "Lalic", "Kneza Milosa 97", 44445, new Date(1992,12,18), "dnevna");

        Bolnica bolnica1 = new Bolnica("Euromedika", direktor,new ArrayList<MedicinskaSestra>(Arrays.asList(tehnicar, sestra)),new ArrayList<Lekar>(Arrays.asList(pedijatar, fizijatar)),new ArrayList<Osoblje>(Arrays.asList(cistac)));
        Bolnica bolnica2 = new Bolnica("BelMedik", ginekolog,new ArrayList<MedicinskaSestra>(Arrays.asList(sestra1)),new ArrayList<Lekar>(Arrays.asList(ginekolog)),new ArrayList<Osoblje>(Arrays.asList(cistac1)));
        Bolnica bolnica3 = new Bolnica("Jedro", internista,new ArrayList<MedicinskaSestra>(Arrays.asList(tehnicar1, sestra2)),new ArrayList<Lekar>(Arrays.asList(kardiolog, internista, gastroenterolog)),new ArrayList<Osoblje>(Arrays.asList(dobavljac, popravljac)));

        ArrayList<Bolnica> bolnice = new ArrayList<Bolnica>(Arrays.asList(bolnica1, bolnica2, bolnica3));
        Firma firma = new Firma("Zdravi.co", bolnice);



        System.out.println(firma);
        firma.getStaff();


    }
}