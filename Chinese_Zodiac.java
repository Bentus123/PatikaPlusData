import java.util.Scanner;

public class Chinese_Zodiac {
    public static void main(String[] args) {


            //Değişken Tanımlaması
       int DogumYili;
       Scanner input = new Scanner(System.in);

            //Kullanıcı veri girişi

        System.out.println("Doğum yılınızı giriniz : ");
        DogumYili = input.nextInt();

        //Zodiac Tanımlamaları

        if (DogumYili % 12 == 0) {
            System.out.println("Maymun");
        }else if (DogumYili %12 == 1){
            System.out.println("Horoz");
        } else if (DogumYili %12 == 2) {
            System.out.println("Köpek");
        }else if (DogumYili %12 == 3){
            System.out.println("Domuz");
        }else if (DogumYili %12 == 4){
            System.out.println("Fare");
        }else if (DogumYili %12 == 5){
            System.out.println("Öküz");
        }else if (DogumYili %12 == 6){
            System.out.println("Kaplan");
        }else if (DogumYili %12 == 7){
            System.out.println("Tavşan");
        }else if (DogumYili %12 == 8){
            System.out.println("Ejderha");
        }else if (DogumYili %12 == 9){
            System.out.println("Yılan");
        }else if (DogumYili %12 == 10){
            System.out.println("At");
        }else if (DogumYili %12 == 11){
            System.out.println("Koyun");
        }


    }
}