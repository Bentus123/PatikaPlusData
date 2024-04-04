import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BrandManagement bm = new BrandManagement();
        NotebookManagement notebookManagement = new NotebookManagement();
        MobilePhoneManagement mobilePhoneManagement = new MobilePhoneManagement();

        while (true) {
            System.out.println("Patika Market");
            System.out.println("1-Laptop\n2-Mobil\n3-Marka Listesi\n0-Çıkış ");
            System.out.println("Seçiminiz : ");
            int secim;
            try {
                secim = scanner.nextInt();
                System.out.println();
            } catch (Exception e) {
                System.out.println("Sayı Giriniz");
                scanner.nextLine();
                continue;
            }

            if (secim == 0) {
                System.out.println("Yeniden Görüşmek Üzere");
                break;
            } else if (secim == 1) {
                while (true) {
                    System.out.println("Laptop\n0-Geri\n1-Yeni Laptop Ekle\n2-Lapton Sil\n3-Marka Bazında Liste\n4-Laptop Tüm Döküm");
                    System.out.println("Seçiminiz");
                    secim = scanner.nextInt();
                    scanner.nextLine();

                    if (secim == 0) {
                        break;
                    } else if (secim == 1) {
                        System.out.println("\nEklemek İstediğiniz Adı Giriniz :");
                        String name = scanner.nextLine();
                        System.out.println("Eklemek İstediğiniz Markayı Giriniz : ");
                        String brandName = scanner.nextLine();
                        System.out.println("Fiyat Giriniz : ");
                        double price = scanner.nextDouble();
                        scanner.nextLine();
                        Brand brand = bm.getBrand(brandName);

                        if (brand == null) {
                            brand = new Brand(brandName);
                            bm.add(brand);
                        }

                        if (notebookManagement.add(new Notebook(price, 0, 1, name, brand, -1, -1, -1))) ;
                        System.out.println("Ürün Eklendi");
                    } else if (secim == 2) {
                        System.out.println("\nSilmek İstediğiniz ID Numarasını Giriniz ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        if (notebookManagement.delete(id)) {
                            System.out.println("Ürün Silindi");
                        } else {
                            System.out.println("Yeniden Deneyin");
                        }
                    } else if (secim == 3) {
                        System.out.println("\n Marka Giriniz :");
                        String brand = scanner.nextLine();
                        notebookManagement.listByBrand(brand);
                    } else if (secim == 4) {
                        notebookManagement.listAll();
                    } else {
                        System.out.println("\nYanlış Seçim");
                        continue;
                    }
                }
            } else if (secim == 2) {
                while (true) {
                    System.out.println("Mobil\n0-Geri\n1-Telefon Ekleme\n2-Telefon Silme\n3-Marka Bazında Liste\n4-Telefon Tüm Döküm");
                    System.out.println("Seçiminiz : ");
                    secim = scanner.nextInt();
                    scanner.nextLine();

                    if (secim == 0) {
                        break;
                    } else if (secim == 1) {
                        System.out.println("\nEklemek İstediğiniz Adı Giriniz : ");
                        String name = scanner.nextLine();
                        System.out.println("Eklemek İstediğiniz Markayı Giriniz : ");
                        String brandName = scanner.nextLine();
                        System.out.println("Fiyat Giriniz : ");
                        double price = scanner.nextDouble();
                        scanner.nextLine();
                        Brand brand = bm.getBrand(brandName);

                        if (brand == null) {
                            brand = new Brand(brandName);
                            bm.add(brand);
                        }

                        if (mobilePhoneManagement.add(new MobilePhone(price, 0, 1, name, brand, -1, -1, -1, -1, -1, "White")))
                            ;
                        System.out.println("Ürün Eklendi");
                    } else if (secim == 2) {
                        System.out.print("\nSilmek İstediğiniz ID Numarasını Giriniz :");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        if (mobilePhoneManagement.delete(id)) {
                            System.out.println("Ürün Silindi :");
                        } else {
                            System.out.println("Yeniden Deneyin : ");
                        }
                    } else if (secim == 3) {
                        System.out.println("\nMarka Giriniz : ");
                        String brand = scanner.nextLine();
                        mobilePhoneManagement.listByBrand(brand);
                    } else if (secim == 4) {
                        mobilePhoneManagement.listAll();
                    } else {
                        System.out.println("\nYanlış Seçim : ");
                        continue;
                    }
                }
            } else if (secim == 3) {
                bm.printBrands();
            } else {
                System.err.println("Yanlış Seçim");
                continue;
            }
        }
    }
}