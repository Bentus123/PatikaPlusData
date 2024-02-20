import java.util.Scanner;

public class ManavKasaMain {
    public static <string> void main(String[] args) {

       //Değişkenler
        double armut,elma,domates,muz,patlican;
        Scanner input = new Scanner(System.in);

       //Alışveriş
        System.out.print("Lütfen kaç kilo armut almak istediğinizi belirtiniz : ");
        double kgarmut = input.nextInt();
        System.out.print("Lütfen kaç kilo elma almak istediğinizi belirtiniz : ");
        double kgelma = input.nextInt();
        System.out.print("Lütfen kaç kilo domates almak istediğinizi belirtiniz : ");
        double kgdomates = input.nextInt();
        System.out.print("Lütfen kaç kilo muz almak istediğinizi belirtiniz : ");
        double kgmuz = input.nextInt();
        System.out.print("Lütfen kaç kilo patlıcan almak istediğinizi belirtiniz : ");
        double kgpatlican = input.nextInt();

        //Hesaplama ve sonuç
        armut = kgarmut * 2.17;
        elma = kgelma * 3.67;
        domates = kgdomates * 1.11;
        muz = kgmuz * 0.95;
        patlican = kgpatlican * 5;

        //Ekrana Toplamı Yazdırma
        System.out.println("Armut KG : " +kgarmut + " Tutar : " + armut + " TL");
        System.out.println("Elma KG : " +kgelma + " Tutar : " + elma + " TL");
        System.out.println("Domates KG : " +kgdomates + " Tutar : " + domates + " TL");
        System.out.println("Muz KG : " +kgmuz + " Tutar : " + muz + " TL");
        System.out.println("Patlıcan KG : " +kgpatlican + " Tutar : " + patlican + " TL");
        System.out.println("Toplam Tutar : " +(armut+elma+domates+muz+patlican) + " TL");



    }
}