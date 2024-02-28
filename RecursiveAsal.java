import java.util.Scanner;

public class RecursiveAsal {
    public static boolean Asal(int sayı, int bolum){

    if (sayı <= 2) {
        return (sayı == 2) ? true : false;
    } else if (sayı % bolum == 0) {
        return false;
    } else if (bolum * bolum > sayı) {
        return true;
    }
        return Asal(sayı, bolum + 1);

        }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int number = input.nextInt();

        if (Asal(number, 2)) {
            System.out.println(number + " Asal Sayıdır");
        } else {
            System.out.println(number + " Asal Değildir.");
            input.close();
        }



    }

}
