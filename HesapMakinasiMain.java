import java.util.Scanner;


public class HesapMakinasiMain {
    public static void main(String[] args) {

            //Değişkenlerin oluşturulması

            int a,b,sonuc,secim;
            Scanner input = new Scanner(System.in);

            //Veri alımı

            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz => 1-Toplama 2-Çıkartma 3-Çarpma 4-Bölme  =>");
            secim = input.nextInt();

            //İşlemlerin belirlenmesi

            switch (secim){
                case 1:
                    System.out.println("İlk sayıyı giriniz : ");
                    a = input.nextInt();
                    System.out.println("İkinci sayıyı giriniz : ");
                    b = input.nextInt();
                    sonuc = a+b;
                    System.out.println("Girmiş olduğunuz sayıların toplamı : " + sonuc);
                    break;

                case 2:
                    System.out.println("İlk sayıyı giriniz : ");
                    a = input.nextInt();
                    System.out.println("İkinci sayıyı giriniz : ");
                    b = input.nextInt();
                    sonuc = a-b;
                    System.out.println("Girmiş olduğunuz sayıların farkı : " + sonuc);
                    break;

                case 3:
                    System.out.println("İlk sayıyı giriniz : ");
                    a = input.nextInt();
                    System.out.println("İkinci sayıyı giriniz : ");
                    b = input.nextInt();
                    sonuc = a*b;
                    System.out.println("Girmiş olduğunuz sayıların çarpımı : " + sonuc);
                    break;

                case 4:
                    System.out.println("İlk sayıyı giriniz : ");
                    a = input.nextInt();
                    System.out.println("İkinci sayıyı giriniz : ");
                    b = input.nextInt();
                    sonuc = a/b;
                    System.out.println("Girmiş olduğunuz sayıların bölümü : " + sonuc);
                    break;
            }


        }
    }
