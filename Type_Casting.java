import java.util.Scanner;
public class Type_Casting {
    public static void main(String[] args) {

        //Scanner Class
        Scanner input = new Scanner(System.in);
        //Veri Girişi
        System.out.println("İlk sayıyı giriniz : ");
        int sayi1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        double sayi2 = input.nextDouble();
        //Type Casting
        int toplam = (int) ( sayi1 + sayi2);
        double toplam2 = (double) (sayi1 + sayi2);
        //Sonuç
        System.out.println("Tam Sayı Olarak Toplam => " + toplam);
        System.out.println("Ondalıklı Sayı Olarak Toplam => " + toplam2);


    }
}