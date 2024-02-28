import java.util.Scanner;
public class Desen {

    public static void desen(int sayı){


        if(sayı <= 0){
            System.out.print(" " + sayı);
            return;
        }
        System.out.print(" " + sayı);
        desen(sayı - 5);
        System.out.print(" " + sayı);
    }




    public static void main(String[] args) {
        System.out.println("Bir sayı giriniz : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        desen(num);
    }
}