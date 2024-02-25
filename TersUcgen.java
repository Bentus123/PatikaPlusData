import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz : ");
        sayi = input.nextInt();
        for (int i = 1; i <= sayi; i++){
            for (int j = 1; j <= sayi-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}