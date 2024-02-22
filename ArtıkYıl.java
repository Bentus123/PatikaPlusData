import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Scanner Sınıfı & Değişken Tanımlanması
        Scanner input = new Scanner(System.in);
        int yıl;

        //Veri Girişi

        System.out.print("Yıl Giriniz => ");
        yıl = input.nextInt();

        if((yıl %4 == 0 && yıl %100 != 0) || (yıl %400 == 0)){
            System.out.println("Girmiş olduğunuz yıl artık yıldır => " + yıl);
        }
        else
            System.out.println("Girmiş olduğunuz yıl artık değildir => " + yıl);



    }
}