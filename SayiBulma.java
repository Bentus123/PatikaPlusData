
import java.util.Scanner;
public class SayiBulma {
    public static void main(String[] args) {

        int n, sayi,min=0,max=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Girmek istediğiniz sayı adedini belirtiniz : ");
        n = input.nextInt();
        for (int i =1; i <= n; i++){
            System.out.println(i + ". Sayıyı Giriniz : ");
            sayi = input.nextInt();
            if(i == 1){
                min = sayi;
                max = sayi;
            }
            else{
                if(sayi > max)
                    max = sayi;
                if(sayi < min)
                    min = sayi;
            }

        }
        System.out.println("Girdiğiniz en büyük sayı : " + max);
        System.out.println("Girdiğiniz en küçük sayı : " + min);
    }
}