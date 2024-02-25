import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double n, r, FakTorN=1, FaktorR=1, FaktorP=1;

        System.out.print("İlk Faktöriyel Sayısını Giriniz : ");
        n = input.nextDouble();
        System.out.print("İkinci Faktöriyel Sayısını Giriniz: ");
        r = input.nextDouble();

        for(int i=1; i<=n; i++){
            FakTorN *=i;
        }
        for(int i=1; i<=r; i++){
            FaktorR *=i;
        }
        for(int i=1; i<=(n-r); i++){
            FaktorP *=i;
        }

        System.out.println("Sonuç: " + FakTorN/(FaktorR*FaktorP));
    }
}