
public class HarmonicArray {

    public static void main(String[] args) {
        int[] NumList = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        float HarmonicToplam = 1, HarmonicOrtalama;
        int ListUzunluk = NumList.length;


        for (int i = 1; i <= ListUzunluk; i++) {

            HarmonicToplam += HarmonicToplam + (float) (1/i);

        }

        HarmonicOrtalama = (ListUzunluk / HarmonicToplam);
        System.out.println("Ortalama => " + HarmonicOrtalama);
    }
}