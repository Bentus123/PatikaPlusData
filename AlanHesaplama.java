import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //Değişkenlerin yaratılması
            int a,b,c;
            int cevre;
            double alan;
            Scanner input = new Scanner(System.in);
            //Kullanıcı veri girişi
            System.out.print("1. Kenarı giriniz : ");
            a = input.nextInt();
            System.out.print("2. Kenarı giriniz : ");
            b = input.nextInt();
            System.out.print("3. Kenarı giriniz : ");
            c = input.nextInt();

            cevre = (a+b+c) / 2;
            alan = Math.sqrt(cevre * (cevre - a)* (cevre - b) * (cevre - c));

            //Sonucu Ekrana Yazdırma
            System.out.println("Üçgenin Alanı : " + alan);

        }
    }
