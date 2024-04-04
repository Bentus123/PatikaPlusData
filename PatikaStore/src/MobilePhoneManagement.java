import java.util.ArrayList;
import java.util.List;

public class MobilePhoneManagement implements ProductManagement {
    private List<MobilePhone> mobilePhones;

    public MobilePhoneManagement() {
        this.mobilePhones = new ArrayList<>();
        this.mobilePhones.add(new MobilePhone(5500, 0, 355, "Samsung Galaxy", new Brand("Samsung"), 256, 8, 4000, 16, 32, "Siyah"));
        this.mobilePhones.add(new MobilePhone(7500, 0, 355, "Lumia", new Brand("Nokia"), 256, 8 ,5500, 32, 50, "Kırmızı"));
        this.mobilePhones.add(new MobilePhone(9500, 0, 355, "Xiaomi Redmi Note ", new Brand("Xiaomi"), 512, 7, 5000, 42, 64, "Mor"));
    }
    @Override
    public void listAll() {
        System.out.println("\nTelefon Listesi\n");
        String leftAlignFormat = "| %-2d | %-25s | %-11s | %-9s | %-10d | %-9s | %-9s | %-9s | %-5d | %-8s |%n";
        System.out.format("=====================================================================================%n");
        System.out.format("| ID | Ürün Adı                 | Fiyat       | Marka     | Saklama Alanı   | Kamera    | Ekran     | Batarya       | RAM   | Renk     |%n");
        System.out.format("=====================================================================================%n");
        for (MobilePhone mobilephone : this.mobilePhones) {
            System.out.format(leftAlignFormat, mobilephone.getId(), mobilephone.getName(), mobilephone.getPrice() + " " + "Usd" +
                    mobilephone.getBrand(), mobilephone.getBrand().getName(), mobilephone.getStorage(), mobilephone.getCamera(), mobilephone.getScreenSize(), mobilephone.getBattery(), mobilephone.getRam(), mobilephone.getColor());
        }
        System.out.format("=====================================================================================%n");
    }
    @Override
    public boolean delete(int id) {
        return this.mobilePhones.removeIf(mobilePhone -> mobilePhone.getId() == id);
    }
    @Override
    public boolean add(Product product) {
        return this.mobilePhones.add((MobilePhone) product);
    }
    @Override
    public void listByBrand(String brandName) {
        System.out.println("\nTelefon Listesi\n");
        String leftAlignFormat = "| %-2d | %-25s | %-11s | %-9s | %-10d | %-9s | %-9s | %-9s | %-5d | %-8s |%n";
        System.out.format("=====================================================================================%n");
        System.out.format("| ID | Ürün Adı                 | Fiyat       | Marka     | Saklama Alanı   | Kamera    | Ekran     | Batarya       | RAM   | Renk     |%n");
        System.out.format("=====================================================================================%n");
        for (MobilePhone mobilephone : this.mobilePhones) {
            System.out.format(leftAlignFormat, mobilephone.getId(), mobilephone.getName(), mobilephone.getPrice() + " " + "Usd" +
                    mobilephone.getBrand(), mobilephone.getBrand().getName(), mobilephone.getStorage(), mobilephone.getCamera(), mobilephone.getScreenSize(), mobilephone.getBattery(), mobilephone.getRam(), mobilephone.getColor());
        }
        System.out.format("=====================================================================================%n");
        System.out.println();
    }

}