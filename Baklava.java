import java.util.Scanner;
public class Baklava {
    public static void main(String[] args) {

        int bosluk, yildiz, satir;
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç satır baklava dilimi yazdırmak istiyorsunuz ? ");
        satir = input.nextByte();
        bosluk = satir / 2;
        yildiz = 1;

        for(int i = 0; i < satir; i++){
            for (int j = 0; j < bosluk; j++){
                System.out.print(" ");
            }
            for (int z = 0; z < yildiz; z++){
                System.out.print("*");
            }

            if(i < satir /2){
                bosluk--;
                yildiz += 2;
            }
            else{
                bosluk++;
                yildiz -= 2;
            }
            System.out.println();
        }



    }
}