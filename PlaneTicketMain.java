import java.util.Scanner;

public class PlaneTicketMain {
    public static void main(String[] args) {

        //Değişkenler
        int km, yas,yon;
        double normalBilet,indirimliBilet,ciftYon = 0;
        Scanner input = new Scanner(System.in);

        //Veri Alımı

        System.out.println("Yolcu yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.println("Gideceğiniz mesafeyi giriniz : ");
        km = input.nextInt();
        System.out.println("Tek yön için 1, çift yön için 2 ye basınız : ");
        yon = input.nextInt();

        normalBilet = (int) (0.10 * km);
        if(yas <= 0 || km <= 0 || yon <= 0)
        {
             System.out.println("Yanlış işlem yaptınız");
        }
        else{
        while(yon == 1)
        {
            if(yas <= 11){
                indirimliBilet = (normalBilet - (normalBilet * 0.5));

            }
            else if (yas >= 12 && yas <= 25) {
                indirimliBilet =  (normalBilet - (normalBilet*0.1));

            }
            else if (yas > 65)
            {
                indirimliBilet =  (normalBilet - (normalBilet*0.3));
            }
            else
            {
                indirimliBilet = normalBilet;

            }
            System.out.println("Bilet Ücreti : " +indirimliBilet);
            break;
            }
        }

        while(yon == 2)
        {
            if(yas <= 11){
                indirimliBilet = (int) (normalBilet - (normalBilet * 0.5));
                ciftYon = (indirimliBilet*2) -(indirimliBilet *0.20) ;
            } else if (yas >= 12 && yas <= 25) {
                indirimliBilet = (int) (normalBilet - (normalBilet*0.1));
                ciftYon = (indirimliBilet*2) -(indirimliBilet *0.20) ;
            }
            else if (yas > 65)
            {
               indirimliBilet =  (normalBilet - (normalBilet*0.3));
               ciftYon = (indirimliBilet*2) -(indirimliBilet *0.20) ;
            }
            else
            {
               indirimliBilet = normalBilet;
               ciftYon = (indirimliBilet*2) -(indirimliBilet *0.20) ;
            }
            System.out.println("Bilet Ücreti : " + ciftYon);
            break;
        }
    }




}
