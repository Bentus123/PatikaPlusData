import java.util.Iterator;

import java.util.TreeSet;

public class BrandManagement {
    private TreeSet<Brand> brands = new TreeSet<>();

    public BrandManagement() {
        brands.add(new Brand("Samsung"));
        brands.add(new Brand("Nokia"));
        brands.add(new Brand("Xiaomi"));
        brands.add(new Brand("Huawei"));
        brands.add(new Brand("Casper"));
        brands.add(new Brand("Asus"));
        brands.add(new Brand("HP"));
        brands.add(new Brand("Alien"));
    }

    public void printBrands() {
        System.out.println("Markalarımız\\n--------------\\n");
        for(Brand b : brands) {
            System.out.println("-" + b.getName());
        }
    }

    public void add(Brand brand) {
        this.brands.add(brand);
    }

    public Brand getBrand(String brandName) {
        Iterator<Brand> itr = brands.iterator();
        Brand currentBrand;
        while(itr.hasNext()) {
            currentBrand = itr.next();
            if(currentBrand.getName().equalsIgnoreCase(brandName))
                return currentBrand;
        }
        return null;
    }

}