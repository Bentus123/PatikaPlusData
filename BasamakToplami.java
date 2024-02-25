
import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {

        int a;
        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        a = input.nextInt();

        while (a > 0) {
            int temp = a % 10;
            total += temp;
            a = a/10;
        }
        System.out.println(total);
    }
}