public class Product {
    private int Id;
    private double Price;
    private double Discount;
    private int Stock;
    private String Name;
    private Brand Brand;
    private static int Counter = 0;

    public Product(double price,double discount,int stock,String name, Brand brand) {
        this.Id = ++Counter;
        this.Price = price;
        this.Discount = discount;
        this.Stock = stock;
        this.Name = name;
        this.Brand = brand;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double discount) {
        this.Discount = discount;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        this.Stock = stock;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Brand getBrand() {
        return Brand;
    }

    public void setBrand(Brand brand) {
        this.Brand = brand;
    }

    public static int getCounter() {
        return Counter;
    }

    public static void setCounter(int counter) {
        Product.Counter = counter;
    }
}