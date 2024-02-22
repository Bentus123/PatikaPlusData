import java.util.Scanner;

public class Aktivite {
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık derecesini giriniz : ");
        heat = input.nextInt();

        if(heat != 5 && heat < 10){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if(heat > 9 && heat <= 14){
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if (heat >= 15 && heat < 25) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }


    }
}