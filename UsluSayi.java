import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        int n,k,total =1;
        Scanner input = new Scanner(System.in);

        System.out.println("Üssünü almak istediğiniz sayıyı giriniz : ");
        n = input.nextInt();
        System.out.println("Üs olacak sayıyı giriniz : ");
        k = input.nextInt();

        for (int i = 1; i <= k; ++i){
            total *= n;
        }
        System.out.println("Sonuç : " + total);


    }
}