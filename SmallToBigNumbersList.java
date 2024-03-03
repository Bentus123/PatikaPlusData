
import java.util.Scanner;
import java.util.Arrays;

public class SmallToBigNumbersList {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Diziye kaç tane sayı girmek istersiniz ? ");
        int DiziUzunluk;
        DiziUzunluk = input.nextInt();
        int [] Sayilar = new int[DiziUzunluk];
        System.out.print("İstediğiniz Sayıları Giriniz : ");
        for (int i = 0; i < DiziUzunluk; i++){
            System.out.println((i+1) + ". Sayı => ");
            Sayilar[i] = input.nextInt();
        }

       Arrays.sort(Sayilar);
       System.out.println(Arrays.toString(Sayilar));




    }
}