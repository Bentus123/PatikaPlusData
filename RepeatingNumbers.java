import java.util.Arrays;

public class RepeatingNumbers {
    public static void main(String[] args) {
        int[] SayilarDizisi = {5, 10, 5, 20, 30, 20, 40, 55, 65, 7, 8, 9, 17, 7, 19, 55, 65, 40, 20, 5, 10};

        int[] sayac = new int[70];

        for (int i : SayilarDizisi) {
            sayac[i]++;
        }
        System.out.println("Dizi: " + Arrays.toString(SayilarDizisi));
        System.out.println("Yinelenen Sayılar");
        for (int i = 0; i < sayac.length; i++) {
            if (sayac[i] > 0) {
                System.out.println(i + " sayısı " + sayac[i] + " kere tekrar edildi.");
            }
        }



        int [][] matris = { {1,2,3},            // çok boyutlu bir dizi oluştu
                {4,5,6} };
        System.out.println("=====Öncesi=====");
        yazArray(matris);                     //öncesi için, bu metot çağrırılarak
        System.out.println("====Sonrası====");
        cevir(matris);






        int [][] matris = { {1,2,3},            // çok boyutlu bir dizi oluştu
                {4,5,6} };
        System.out.println("=====Öncesi=====");
        yazArray(matris);                     //öncesi için, bu metot çağrırılarak
        System.out.println("====Sonrası====");
        cevir(matris);
    }
}