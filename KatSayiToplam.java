
import java.util.Scanner;

public class KatSayiToplam {
    public static void main(String[] args) {

        int sayi,toplam=0;
        Scanner n = new Scanner(System.in);

        do {
            System.out.println("Lütfen tek sayı giriniz : ");
            sayi = n.nextInt();
            if(sayi %2 == 0)
                toplam += sayi;

        }while (sayi %2 != 1);
        System.out.println(toplam);



    }
}