import java.util.Arrays;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.SortedMap;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        int [] sayilar = new int[3];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<3; i++){
            System.out.println("üç adet sayı giriniz : ");
            sayilar[i] = scan.nextInt();
        }

        for (int a : sayilar) {
            System.out.println("Girmiş olduğunuz sayılar : \n" + a);
        }





     

    }
}