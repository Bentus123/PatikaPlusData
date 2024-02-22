import java.util.Scanner;

public class DersNotlariMain {
            public static void main(String[] args) {


                String[] dersler = {"matematik", "kimya", "muzik", "turkce", "fizik"};
                int[] notlar = new int[dersler.length];
                int ortalama=0;

                Scanner input = new Scanner(System.in);
                for (int i = 0; i < dersler.length; i++)
                {
                    System.out.println(dersler[i] + " notunuzu giriniz : ");
                    notlar[i] = input.nextInt();
                    if(notlar[i] < 0 || notlar[i] > 100){
                        System.out.println("Ortalamanın alınabilmesi için  0 ile 100 arasında değer girmeniz gerekmektedir.");
                        continue;
                    }
                    ortalama += notlar[i];
                }
                System.out.println("Girmiş olduğunuz ders notlarının ortalaması = :" + ortalama);


            }
        }