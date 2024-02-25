import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int num, f= 1,s=1,t;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        num = input.nextInt();

        for(int i = 3; i <= num; i++){
            t = f + s;
            System.out.println(t);
            f = s;
            s = t;
        }



    }
}