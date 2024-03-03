import java.util.Arrays;
import java.util.Scanner;

public class BuyukKucukArray {
    public static void main(String[] args) {
        int[] SayiDizi = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int num = input.nextInt();

        Arrays.sort(SayiDizi);
        int i = Arrays.binarySearch(SayiDizi, num);
        if (i < 0) {
            i = -i - 1;
        }

            int Min = 0;
            int Max = 0;
            if(i > 0){
                Min = SayiDizi[i -1];
            }
            else if(i < SayiDizi.length){
                Max = SayiDizi[i];
            }


            System.out.println("Listede girdiğiniz sayıya en küçük yakın sayı => " + Min);
            System.out.println("Listede girdiğiniz sayıya en büyük yakın sayı => " + Max);
        }
    }



