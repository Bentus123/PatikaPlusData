import java.util.Scanner;

public class Recursive {

      static int powerFunction(int base, int exponent) {
          Scanner scan = new Scanner(System.in);
          System.out.println("Taban Değerini Giriniz : ");
          base = scan.nextInt();
          System.out.println("Üs Değerini Giriniz : ");
          exponent = scan.nextInt();

            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result = base * result;
            }
          System.out.println("Sonuç : " + result);
            return powerFunction(1,2);

    }

    public static void main(String[] args) {
       powerFunction(1,2);
    }
}