import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.*/
        //Değişken yaratımım
        double kmtutar,toplamucret;
        int km;
        Scanner input = new Scanner(System.in);
        //Kullanıcı veri girişi
        System.out.print("Gideceğiniz yol uzaklığını km olarak giriniz : ");
        km = input.nextInt();
        kmtutar = km * 2.20;
        toplamucret = kmtutar + 10;
        if(kmtutar <= 20){
            System.out.println("Toplam Ücret : 20TL");
        }
        else{
            System.out.println("Toplam Ücret : " + toplamucret + "TL");
        }

        }
    }
