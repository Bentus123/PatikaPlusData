import java.util.Arrays;

public class FrequencyOfNumbers {
    public static void main(String[] args) {
        int[] Sayilar = {65,65,77,77,101,102,101,102,3002,3002,65,98,98,87,87,65};


        for (int i = 0; i < Sayilar.length; i++) {
            int sayac = 1;
            if (Sayilar[i] == -1)
                continue;
            for (int j = i + 1; j < Sayilar.length; j++) {
                if (Sayilar[i] == Sayilar[j]) {
                    sayac++;
                    Sayilar[j] = -1;
                }
            }

            if (sayac > 0) {
                System.out.println(Sayilar[i] + " Sayısı " + sayac + " defa tekrar etmiştir.");
            }
        }
    }
}