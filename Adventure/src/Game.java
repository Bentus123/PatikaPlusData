import java.util.Scanner;

public class Game {
    public Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Ölüm oyununa hoş geldin !");
        System.out.print("Adınzı Giriniz: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Sayın " + player.getName() + " buraya ölmek için geldiniz.");
        System.out.println("Karakter sınıfınızı seçiniz...");
        System.out.println("--------------------------------------------------------------------------------");
        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println("********** BÖLGELER **********");
            System.out.println();
            System.out.println("1-Güvenli Ev ----> Burada paçayı kurtarabilirsin");
            System.out.println("2-Eşya Dükkanı ----> Silah veya Zırh satın alabilirsin.");
            System.out.println("3-Mağara ----> Ödül <Yemek>, Zombiler dolaşıyor buralarda.");
            System.out.println("4-Orman ----> Ödül <Odun>, Kan emicileri seni bekliyor.");
            System.out.println("5-Nehir ----> Ödül <Su>, Yılanlar seni bekliyor.");
            System.out.println("6-Maden ----> Ödül <Weapon, Armor, Money >, Taş düşebilir ayı çıkabilir.");
            System.out.println("0-Çıkış Yap ----> Oyunu Sonlandır.");

            System.out.println("Nerede Ölmek İstersin: ");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);
                    break;
                default:
                    System.out.println("Geçersiz yer");

            }
            if (location == null) {
                System.out.println("Her akıllı canlı gibi sende postununun güvenliğine önem veriyorsun, aferim.");
                break;

            }
            if (!location.onLocation()) {
                System.out.println("hehehehhe, oyun bitti!!!");
                break;
            }
        }
    }
}