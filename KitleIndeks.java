import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının
     "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
     */

     //Değişkenlerin Tanımlanması
        int kilo;
        double boy,kitleIndeks;
        Scanner input = new Scanner(System.in);
     //Kullanıcı veri girişi
        System.out.print("Lütfen boyunuzu (metre olarak) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextInt();
        kitleIndeks = kilo / (boy * boy);
     //Sonucun ekrana yazdırılması
        System.out.print("Kitle indeksiniz : " + kitleIndeks);


    }
}