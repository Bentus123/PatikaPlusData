public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli Evdesin Sayın Pısırık...");
        System.out.println("Sağlığın Yenilendi...");
        return true;
    }
}