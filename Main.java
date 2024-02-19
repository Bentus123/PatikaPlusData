import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler
        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;

        //input icin scanner sınıfı
        Scanner input = new Scanner(System.in);

        //Kullanıcı veri girisi
        System.out.println("Matematik notunuzu giriniz : ");
        Matematik = input.nextInt();

        System.out.println("Fizik notunuzu giriniz : ");
        Fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz : ");
        Kimya = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz : ");
        Turkce = input.nextInt();

        System.out.println("Tarih notunuzu giriniz : ");
        Tarih = input.nextInt();

        System.out.println("Müzik notunuzu giriniz : ");
        Muzik = input.nextInt();

        //Ortalama Degisken Olusumu
        int ortalama = (Matematik + Fizik + Kimya + Turkce + Tarih + Muzik) / 6;

        //Sonuc Yazdırma
        if (ortalama < 60) {
            System.out.println("Ortalama Değeriniz : " + ortalama + " Sınıfta Kaldı");
        } else {
            System.out.println("Ortalama Değeriniz : " + ortalama + " Sınıfı Geçti");
        }

    }
}