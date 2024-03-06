import java.util.Scanner;
import java.util.Random;

public class NumbersGame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int guess, selection;
        selection = rand.nextInt(1, 101);
        System.out.println("Bir Sayı Giriniz : ");
        guess = input.nextInt();

        while (true) {

            if (guess == selection) {
                System.out.println("Aferin Sana.");
            } else if (guess <= 0 || guess > 100) {
                System.out.println("100 ile 0 arası giriniz");
                guess = input.nextInt();
            } else {
                System.out.println("Yanlış Yanıt...");
                guess = input.nextInt();
            }

        }
    }
}