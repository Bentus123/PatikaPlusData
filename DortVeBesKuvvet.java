import java.util.Scanner;
public class DortVeBesKuvvet {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i*=4) {

            System.out.println("i/Dörtlü Katlar = " + i);
        }

        for (int i = 1; i <= n; i*=5) {

            System.out.println("i/Beşli Katlar = " + i);
        }
    }
}