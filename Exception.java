import java.util.Scanner;


public class Exception extends Throwable {
    public static void IndeksKontrol(int index, Object[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Veri Giriniz : ");
        index = input.nextInt();


        try {
            System.out.println("Girdiğiniz Veri : " + arr[index]);
        } catch (java.lang.Exception e) {
            System.out.println("Hata : " + e.getMessage());
        }
    }
    public static void main(String[] args) {

        Object[] list = {30, 53, 87, 74, 22, "MUZ", "DOMATES", "BUGATTİ", 87, 30, 305, 22};

        IndeksKontrol(4, list);


    }
}