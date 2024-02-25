import java.util.Scanner;
import java.util.SortedMap;

public class Sati_Ortalamasi {
    public static void main(String[] args) {

        double sayi,toplam;
        int UcToplam=0,DortToplam=0,ortalama=0;
        Scanner input = new Scanner(System.in);
        System.out.println("0 dan büyük herhangi bir sayı giriniz : ");
        sayi  = input.nextInt();

        for (int i = 0 ; i <= sayi; i++){
            if( i % 3 == 0 ){
                UcToplam = i;

            } else if (i % 4 == 0) {
                DortToplam = i;
            }
            toplam = UcToplam + DortToplam;
            ortalama =(int) toplam /2;

        }
        System.out.println("Girmiş olduğunz sayının 3 ve 4 e bölenlerin ortalaması : " + ortalama);

        }
    }
