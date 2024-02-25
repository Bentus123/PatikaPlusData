import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {

        int sayi1, sayi2,sayi3,sayi4;
        Scanner input = new Scanner(System.in);

        System.out.println("Ebob Bulmak İçin 1. Sayıyı Giriniz : ");
        sayi1 = input.nextInt();
        System.out.println("2. Sayıyı Giriniz : ");
        sayi2 = input.nextInt();
        System.out.println("Ekok Bulmak İçin 1. Sayıyı Giriniz : ");
        sayi3 = input.nextInt();
        System.out.println("2. Sayıyı Giriniz : ");
        sayi4 = input.nextInt();
        int OrjSayi1 = sayi1, OrjSayi2 = sayi2,OrjSayi3 = sayi3, OrjSayi4 = sayi4;

        sayi1 = (sayi1<0) ? -sayi1 :sayi1;
        sayi2 = (sayi2<0) ? -sayi2 :sayi2;
        sayi3 = (sayi3<0) ? -sayi3 :sayi3;
        sayi4 = (sayi4<0) ? -sayi4 :sayi4;

        while (sayi1 != sayi2){
            if(sayi1 > sayi2){
                sayi1 -= sayi2;
            }else {
                sayi2 -= sayi1;
            }

        }

        while(sayi3 != sayi4){
            if(sayi3 < sayi4){
                sayi3 *= sayi4;
            }else {
                sayi3 *= sayi4;
            }
            break;
        }
        System.out.println("EBOB : " + OrjSayi1 + " || " + OrjSayi2 + " => " +sayi1);
        System.out.println("EKOK : " + OrjSayi3 + " || " + OrjSayi4 + " => " +sayi3);



    }
}