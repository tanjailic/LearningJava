package PredavanjeIII.Nekretnine;

public class Main {

    public static void main(String srgs[]) {

        Vlasnik vlasnikKuce = new Vlasnik("Tanja", "Ilic", 123456, 525);
        Kuca kuca = new Kuca("Miljakovacke staze", 3, 55, vlasnikKuce, 10);
        System.out.println(kuca);

        Vlasnik vlasnikStana = new Vlasnik("Pera", "Peric", 98342, 323);
        Stan stan = new Stan("Vidikovacki venac", 2, 85, vlasnikStana, 10, 15);
        System.out.println(stan);
    }
}
