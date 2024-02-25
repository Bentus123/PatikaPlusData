import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int sayi = input.nextInt();
        double sonuc = 0.0;
        for(double i = 1; i <= sayi; i++){
            sonuc += (1/i);
        }
        System.out.println("Sonuç : " + sonuc);

    }
}