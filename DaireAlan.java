import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız. Formül : (𝜋 * (r*r) * 𝛼) / 360*/
        //Değişken tanımlaması

        double alan;
        double pi = 3.14;
        int r,a;
        Scanner input = new Scanner(System.in);
        //Kullanıcı veri girişi

        System.out.print("Yarıçap değerini giriniz : ");
        r = input.nextInt();
        System.out.print("Merkez açı ölçüsünü giriniz : ");
        a = input.nextInt();

        //Sonucun Ekrana Yazdırılması

        alan = ( pi * ( r * r) * a ) / 360;
        System.out.print("Daire Dilim Alanı : " + alan);

        }
    }
